/**
 * 
 */
package org.infotechdept.hr.task.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.infotechdept.hr.system.HrUtils;
import org.infotechdept.hr.task.dao.AdcHolidayDetailMapper;
import org.infotechdept.hr.task.dao.AdcShiftApplyMapper;
import org.infotechdept.hr.task.dao.AdcShiftBasicMapper;
import org.infotechdept.hr.task.dao.AdcShiftGroupEmplMapper;
import org.infotechdept.hr.task.dao.AdcShiftLeaveMapper;
import org.infotechdept.hr.task.dao.AdcShiftPatternDetailMapper;
import org.infotechdept.hr.task.dao.AdcShiftPatternMapper;
import org.infotechdept.hr.task.dao.AdcShiftRecordMapper;
import org.infotechdept.hr.task.dao.AdcShiftSchedulingMapper;
import org.infotechdept.hr.task.dao.DeptemplMapper;
import org.infotechdept.hr.task.model.AdcHolidayDetail;
import org.infotechdept.hr.task.model.AdcHolidayDetailExample;
import org.infotechdept.hr.task.model.AdcShiftApply;
import org.infotechdept.hr.task.model.AdcShiftApplyExample;
import org.infotechdept.hr.task.model.AdcShiftBasic;
import org.infotechdept.hr.task.model.AdcShiftGroupEmpl;
import org.infotechdept.hr.task.model.AdcShiftGroupEmplExample;
import org.infotechdept.hr.task.model.AdcShiftLeave;
import org.infotechdept.hr.task.model.AdcShiftLeaveExample;
import org.infotechdept.hr.task.model.AdcShiftPattern;
import org.infotechdept.hr.task.model.AdcShiftPatternDetail;
import org.infotechdept.hr.task.model.AdcShiftPatternDetailExample;
import org.infotechdept.hr.task.model.AdcShiftRecord;
import org.infotechdept.hr.task.model.AdcShiftScheduling;
import org.infotechdept.hr.task.model.AdcShiftSchedulingExample;
import org.infotechdept.hr.task.model.Deptempl;
import org.infotechdept.hr.task.model.DeptemplExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 徐岩 since 2015年4月17日
 * 
 */
@Service
public class AdcShiftSchedulingService {

	@Autowired
	private AdcShiftSchedulingMapper adcShiftSchedulingMapper;

	@Autowired
	private AdcShiftRecordMapper adcShiftRecordMapper;

	@Autowired
	private AdcShiftApplyMapper adcShiftApplyMapper;

	@Autowired
	private AdcShiftPatternMapper adcShiftPatternMapper;

	@Autowired
	private AdcShiftPatternDetailMapper adcShiftPatternDetailMapper;

	@Autowired
	private AdcShiftBasicMapper adcShiftBasicMapper;

	@Autowired
	private DeptemplMapper deptemplMapper;

	@Autowired
	private AdcShiftGroupEmplMapper adcShiftGroupEmplMapper;

	@Autowired
	private AdcHolidayDetailMapper adcHolidayDetailMapper;

	@Autowired
	private AdcShiftLeaveMapper adcShiftLeaveMapper;
	
	@Autowired
	private AdcShiftUtils adcShiftUtils;
	@Autowired
	private SqlSession sqlSession;

	/**
	 * 根据条件查询是否有请假记录
	 * 
	 * @param empid
	 * @param deptid
	 * @param pDate
	 * @param dateMap
	 * @return
	 */
	private AdcShiftLeave getAdcShiftLeaveByInfo(Long empid, Long deptid, Date pDate) {
		Map resultMap = new HashMap();
		AdcShiftLeaveExample leaveExp = new AdcShiftLeaveExample();
		leaveExp.createCriteria().andAdcDateEqualTo(pDate).andDeptidEqualTo(deptid).andEmpidEqualTo(empid);
		List<AdcShiftLeave> items = adcShiftLeaveMapper.selectByExample(leaveExp);
		if (items.size() == 0) {
			return null;
		}
		return items.get(0);
	}

	/**
	 * 根据规律班次ID取得该规律班次的主细表
	 * 
	 * @param patternId
	 * @return
	 */
	private Map getAdcShiftPatternByApplyId(Long applyId) {
		AdcShiftApply entity = adcShiftApplyMapper.selectByPrimaryKey(applyId);
		System.out.println(applyId);
		Map patternDto = new HashMap();

		AdcShiftPattern items = adcShiftPatternMapper.selectByPrimaryKey(entity
				.getPatternId());
		patternDto.put("AdcShiftPattern", items);

		AdcShiftPatternDetailExample example = new AdcShiftPatternDetailExample();
		example.createCriteria().andPatternIdEqualTo(entity.getPatternId());
		example.setOrderByClause("position_id");
		List<AdcShiftPatternDetail> list = adcShiftPatternDetailMapper
				.selectByExample(example);

		patternDto.put("AdcShiftPatternDetail", list);
		return patternDto;
	}

	/**
	 * 根据基本班次id和日期，返回上下班时间
	 * 改成公有方法，因为要给别人调用了。
	 * @param shiftId
	 * @param pDate
	 * @return
	 * @throws ParseException
	 */
	public Map getWorkAndOffTimeByShiftId(String shiftId, Date pDate)
			throws ParseException {
		Map resultMap = new HashMap();
		// 节日最大
		AdcHolidayDetailExample exp = new AdcHolidayDetailExample();
		exp.createCriteria().andHDateEqualTo(pDate);
		List<AdcHolidayDetail> items = adcHolidayDetailMapper
				.selectByExample(exp);
		if (items.size() > 0) {
			resultMap.put("dateWork", null);
			resultMap.put("dateOff", null);
			resultMap.put("adc_id", items.get(0).getAdcId());
			resultMap.put("shift_id", null);
			System.out.println(resultMap);
			return resultMap;
		}

		if (HrUtils.isEmpty(shiftId) || (shiftId.equalsIgnoreCase("null"))) {
			resultMap.put("dateWork", null);
			resultMap.put("dateOff", null);
			resultMap.put("adc_id", "0201");
		} else {
			AdcShiftBasic item = adcShiftBasicMapper
					.selectByPrimaryKey(shiftId);
			String work_time = HrUtils.date2String(pDate, "yyyy-MM-dd") + " "
					+ item.getWorkTime() + ":00";
			String off_time = HrUtils.date2String(pDate, "yyyy-MM-dd") + " "
					+ item.getOffTime() + ":00";

			Calendar cale_worktime = Calendar.getInstance();
			Calendar cale_offtime = Calendar.getInstance();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			cale_worktime.setTime(sdf.parse(work_time));
			cale_offtime.setTime(sdf.parse(off_time));

			resultMap.put("dateWork", cale_worktime.getTime());
			resultMap.put("shift_type", item.getShiftType());
			if (item.getShiftType().equalsIgnoreCase("2")) {
				cale_offtime.add(Calendar.DAY_OF_MONTH, 1);
			}
			resultMap.put("dateOff", cale_offtime.getTime());
			resultMap.put("adc_id", item.getAdcId());
		}
		resultMap.put("shift_id", shiftId);
		return resultMap;
	}

	/**
	 * 供外部调用的方法，已经标记为异步执行
	 * 
	 * @param record
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception 
	 */
	@Transactional(rollbackFor = Exception.class)
	public int makeShiftByRecordForInvoke(AdcShiftRecord record,
			Date startDate, Date endDate) throws Exception {
		Date tmpDate = startDate;
		while (tmpDate.getTime() <= endDate.getTime()) {
			makeAdcShiftSchedulingOne(record, tmpDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(tmpDate);
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			tmpDate = calendar.getTime();
		}

		return 0;
	}

	/**
	 * 生成值班表中最重要的一步
	 * 
	 * @param record
	 * @param dateStart
	 * @return
	 * @throws Exception 
	 */
	public int makeAdcShiftSchedulingOne(AdcShiftRecord record, Date dateStart)
			throws Exception {

		Date tmpDate = dateStart;
		Map adcShiftPatternMap = getAdcShiftPatternByApplyId(record
				.getApplyId());

		AdcShiftPattern adcShiftPattern = (AdcShiftPattern) adcShiftPatternMap
				.get("AdcShiftPattern");
		int loopDays = Integer.valueOf(adcShiftPattern.getRegularCycle())
				.intValue();

		// 获得人员列表
		Map<String, Object> empMap = new HashMap<String, Object>();
		
		AdcShiftApply adcShiftApply = adcShiftApplyMapper
				.selectByPrimaryKey(record.getApplyId());
		String cascadeId = adcShiftUtils.getCascadeidByDeptid(adcShiftApply.getDeptid());
		if (adcShiftApply.getRecordType().equalsIgnoreCase("1")) {
			
			empMap.put("cascadeid", cascadeId + "%");
		} else if (adcShiftApply.getRecordType().equalsIgnoreCase("2")) {
			AdcShiftGroupEmplExample exp = new AdcShiftGroupEmplExample();
			exp.createCriteria().andGroupIdEqualTo(adcShiftApply.getGroupId());
			List<AdcShiftGroupEmpl> listGroupEmpl = adcShiftGroupEmplMapper
					.selectByExample(exp);
			/**
			 * 居然还有分组里没有人的情况
			 */
			if (listGroupEmpl.size() == 0) {
				return 0;
			}
			List idList = new ArrayList<Integer>();
			for (AdcShiftGroupEmpl ent : listGroupEmpl) {
				idList.add(ent.getEmpid());
			}
			empMap.put("idList", idList);
		} else if (adcShiftApply.getRecordType().equalsIgnoreCase("3")) {
			empMap.put("empid", adcShiftApply.getEmpid());
		}

		List<HashMap> empList = sqlSession.selectList("Dept.queryDeptEmplForManage", empMap); 
		/**
		 * 如果该记录允许节休，需要计算当天是否替换掉
		 */
		if (record.getHoliable().equalsIgnoreCase("1")) {
			// 计算该天是否已经被串换
			AdcHolidayDetailExample ex = new AdcHolidayDetailExample();
			ex.createCriteria().andStringDateEqualTo(dateStart);
			List<AdcHolidayDetail> its = adcHolidayDetailMapper
					.selectByExample(ex);
			if (its.size() > 0) {
				dateStart = its.get(0).gethDate();
			}
		}

		// 开始计算起始班次
		Date dateInit = record.getInitDate();
		int initPosition = record.getInitPosition().intValue();
		int intervalDays = (int) HrUtils.getIntervalDays(dateInit, dateStart);
		int tmp = intervalDays % loopDays;
		int iPosition = tmp + record.getInitPosition().intValue();
		if (iPosition > loopDays) {
			iPosition = iPosition - loopDays;
		}
		List<AdcShiftPatternDetail> list = (List<AdcShiftPatternDetail>) adcShiftPatternMap
				.get("AdcShiftPatternDetail");
		AdcShiftPatternDetail adcShiftPatternDetail = list.get(iPosition - 1);

		Map dateMap = getWorkAndOffTimeByShiftId(adcShiftPatternDetail.getShiftId(), tmpDate);

		Deptempl emp = new Deptempl();
		
		/**
		 * 试试批量插入
		 */
		List<AdcShiftScheduling> schList = new ArrayList<AdcShiftScheduling>();
		for (Map empMap1 : empList) {
			AdcShiftScheduling adcShiftScheduling = new AdcShiftScheduling();		
			HrUtils.copyProperties(empMap1, emp);
			int i = getPriorityFromScheduling(emp.getDeptid(), emp.getEmpid(),
					dateStart);
			if (Integer.valueOf(adcShiftApply.getPriority()).intValue() > i) {
				AdcShiftSchedulingExample e = new AdcShiftSchedulingExample();
				e.createCriteria().andEmpidEqualTo(emp.getEmpid().longValue())
						.andSchDateEqualTo(dateStart)
						.andDeptidEqualTo(emp.getDeptid());
				adcShiftSchedulingMapper.deleteByExample(e);
			} else {
				continue;
			}
			adcShiftScheduling.setDeptid(emp.getDeptid());
			adcShiftScheduling.setEmpid(Long.valueOf(String.valueOf(emp.getEmpid())));
			adcShiftScheduling.setWorkTime((Date)dateMap.get("dateWork"));
			adcShiftScheduling.setOffTime((Date)dateMap.get("dateOff"));
			adcShiftScheduling.setShiftId((String)dateMap.get("shift_id"));
			adcShiftScheduling.setAdcId((String)dateMap.get("adc_id"));
						
			// 从请假列表里取出当天是否有请假记录
			AdcShiftLeave resultMap = getAdcShiftLeaveByInfo(emp.getEmpid(), emp.getDeptid(), tmpDate);
			if (HrUtils.isNotEmpty(resultMap)) {
				if (HrUtils.isNotEmpty(resultMap.getShiftId())){
					adcShiftScheduling.setShiftId(resultMap.getShiftId());
					Map shiftMap = adcShiftUtils.getWorkAndOffTime(resultMap.getShiftId(), tmpDate);
					adcShiftScheduling.setWorkTime((Date)shiftMap.get("dateWork"));
					adcShiftScheduling.setOffTime((Date)shiftMap.get("dateOff"));
					adcShiftScheduling.setAdcId((String)shiftMap.get("adc_id"));
					adcShiftScheduling.setCount(Double.valueOf("1"));
				}else{
					adcShiftScheduling.setAdcId(resultMap.getAdcId());
					/**
					 * 处理半天效果： 判断影响天数字段的值 1:无0.5天效果 －0.5:上午半天 0.5:下午半天
					 */
					if (resultMap.getAffDays().floatValue() == 1) {
						adcShiftScheduling.setOffTime(null);
						adcShiftScheduling.setWorkTime(null);
						adcShiftScheduling.setShiftId(null);
					} else if (resultMap.getAffDays().floatValue() == -0.5) {
						adcShiftScheduling.setWorkTime(null);
					} else if (resultMap.getAffDays().floatValue() == 0.5) {
						adcShiftScheduling.setOffTime(null);
					}	
					adcShiftScheduling.setCount(resultMap.getAffDays());
				}
			} else {
				adcShiftScheduling.setCount(Double.valueOf("1"));
			}

			adcShiftScheduling.setSchDate(tmpDate);
			adcShiftScheduling.setRecId(record.getRecId());

			adcShiftScheduling.setPriority(adcShiftApply.getPriority());
			adcShiftScheduling.setRecordType(adcShiftApply.getRecordType());
			
			schList.add(adcShiftScheduling);
			//adcShiftSchedulingMapper.insert(adcShiftScheduling);
		}
		int i = sqlSession.insert("AdcShiftSchedulingOper.insertAdcShiftSechdulingBatch", schList);
		System.out.println(i);
		return 0;
	}

	/**
	 * 查找排班表中的现存记录，并返回优先级数值
	 * 
	 * @param deptid
	 * @param empid
	 * @param date
	 * @return
	 */
	private int getPriorityFromScheduling(Long deptid, Long empid, Date date) {
		AdcShiftSchedulingExample example = new AdcShiftSchedulingExample();
		example.createCriteria().andEmpidEqualTo(Long.valueOf(empid))
				.andSchDateEqualTo(date).andDeptidEqualTo(deptid);
		List<AdcShiftScheduling> lists = adcShiftSchedulingMapper
				.selectByExample(example);
		if (lists.size() == 0) {
			return 0;
		} else {
			return Integer.valueOf(lists.get(0).getPriority());
		}
	}

	/**
	 * 根据日期和员工ID返回该员的当日的排班，如果没有就返回空
	 * 
	 * @param date
	 * @param empid
	 * @return
	 */
	public AdcShiftScheduling getAdcShiftSchedulingByDateAndEmpId(Date date,
			Long empid, Long deptid) {
		AdcShiftSchedulingExample example = new AdcShiftSchedulingExample();
		example.createCriteria().andEmpidEqualTo(empid).andSchDateEqualTo(date)
				.andDeptidEqualTo(deptid);
		List<AdcShiftScheduling> items = adcShiftSchedulingMapper
				.selectByExample(example);
		if (items.size() > 0) {
			return items.get(0);
		} else {
			return null;
		}
	}

}
