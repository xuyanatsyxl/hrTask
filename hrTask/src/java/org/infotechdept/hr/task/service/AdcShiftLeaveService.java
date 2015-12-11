/**
 * 
 */
package org.infotechdept.hr.task.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.infotechdept.hr.system.HrUtils;
import org.infotechdept.hr.task.dao.AdcAttendTypeMapper;
import org.infotechdept.hr.task.dao.AdcDinnerRoomUnitMapper;
import org.infotechdept.hr.task.dao.AdcShiftBasicMapper;
import org.infotechdept.hr.task.dao.AdcShiftExceptionMapper;
import org.infotechdept.hr.task.dao.AdcShiftGroupEmplMapper;
import org.infotechdept.hr.task.dao.AdcShiftGroupMapper;
import org.infotechdept.hr.task.dao.AdcShiftLeaveMapper;
import org.infotechdept.hr.task.dao.AdcShiftMealsMapper;
import org.infotechdept.hr.task.dao.AdcShiftSchedulingMapper;
import org.infotechdept.hr.task.dao.DeptemplMapper;
import org.infotechdept.hr.task.dao.EmployeeMapper;
import org.infotechdept.hr.task.dao.OaIntfMapper;
import org.infotechdept.hr.task.model.AdcAttendType;
import org.infotechdept.hr.task.model.AdcAttendTypeExample;
import org.infotechdept.hr.task.model.AdcDinnerRoomUnit;
import org.infotechdept.hr.task.model.AdcDinnerRoomUnitExample;
import org.infotechdept.hr.task.model.AdcShiftBasic;
import org.infotechdept.hr.task.model.AdcShiftBasicExample;
import org.infotechdept.hr.task.model.AdcShiftException;
import org.infotechdept.hr.task.model.AdcShiftExceptionExample;
import org.infotechdept.hr.task.model.AdcShiftGroupEmpl;
import org.infotechdept.hr.task.model.AdcShiftGroupEmplExample;
import org.infotechdept.hr.task.model.AdcShiftLeave;
import org.infotechdept.hr.task.model.AdcShiftMeals;
import org.infotechdept.hr.task.model.AdcShiftMealsExample;
import org.infotechdept.hr.task.model.AdcShiftScheduling;
import org.infotechdept.hr.task.model.AdcShiftSchedulingExample;
import org.infotechdept.hr.task.model.Deptempl;
import org.infotechdept.hr.task.model.DeptemplExample;
import org.infotechdept.hr.task.model.Employee;
import org.infotechdept.hr.task.model.EmployeeExample;
import org.infotechdept.hr.task.model.OaIntf;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 徐岩 since 2015年4月16日
 * 
 */
@Service
public class AdcShiftLeaveService {

	@Autowired
	private OaIntfMapper oaIntfMapper;

	@Autowired
	private AdcAttendTypeMapper adcAttendTypeMapper;

	@Autowired
	private DeptemplMapper deptemplMapper;

	@Autowired
	private EmployeeMapper employeeMapper;

	@Autowired
	private AdcShiftLeaveMapper adcShiftLeaveMapper;

	@Autowired
	private AdcShiftSchedulingMapper adcShiftSchedulingMapper;

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Autowired
	private AdcShiftExceptionMapper adcShiftExceptionMappper;

	@Autowired
	private AdcShiftMealsMapper adcShiftMealsMapper;
	
	@Autowired
	private AdcDinnerRoomUnitMapper adcDinnerRoomUnitMapper;
	
	@Autowired
	private AdcShiftGroupMapper adcShiftGroupMapper;
	
	@Autowired
	private AdcShiftGroupEmplMapper adcShiftGroupEmplMapper;
	
	@Autowired
	private AdcShiftBasicMapper adcShiftBasicMapper;
	
	@Autowired
	private AdcShiftUtils adcShiftUtils;
	
	/**
	 * 根据OA处理类型转换成考勤类型
	 * 
	 * @param busCode
	 * @return
	 */
	private AdcAttendType getAdcAttendTypeRecByBuscode(String busCode) {
		AdcAttendTypeExample example = new AdcAttendTypeExample();
		example.createCriteria().andBusCodeEqualTo(busCode);
		List recList = adcAttendTypeMapper.selectByExample(example);
		if (recList.size() == 0) {
			return null;
		} else {
			return (AdcAttendType) recList.get(0);
		}
	}

	/**
	 * 根据empid取得当前用所在的部门ID
	 * 
	 * @param empid
	 * @return
	 */
	private Long getDeptidByEmpid(Long empid) {
		DeptemplExample example = new DeptemplExample();
		example.createCriteria().andEmpidEqualTo(empid);
		List<Deptempl> records = deptemplMapper.selectByExample(example);
		if (records.size() > 0) {
			return records.get(0).getDeptid();
		} else {
			return null;
		}
	}

	/**
	 * 根据CODE取得人员ID
	 * 
	 * @param code
	 * @return
	 */
	private Employee getEmployeeByCode(String code) {
		EmployeeExample example = new EmployeeExample();
		example.createCriteria().andCodeEqualTo(code);
		List records = employeeMapper.selectByExample(example);
		if (records.size() > 0) {
			return (Employee) records.get(0);
		} else {
			return null;
		}
	}

	/**
	 * 处理一条adc_shift_leave的记录，看看能否应用到排班表中
	 * @throws ParseException 
	 */
	public int procAdcShiftLeaveOne(AdcShiftLeave record) throws ParseException {
		// 检查是否有排班记录
		AdcShiftSchedulingExample exp = new AdcShiftSchedulingExample();
		exp.createCriteria().andSchDateEqualTo(record.getAdcDate()).andEmpidEqualTo(record.getEmpid()).andDeptidEqualTo(record.getDeptid());
		List<AdcShiftScheduling> items = adcShiftSchedulingMapper.selectByExample(exp);
		if (items.size() == 0) {
			return 0;
		}
		AdcShiftScheduling adcShiftScheduling = items.get(0);

		AdcAttendType attendType = adcAttendTypeMapper.selectByPrimaryKey(record.getAdcId());
		if (HrUtils.isEmpty(attendType)) {
			return -1;
		}

		if (attendType.getTypeType().equalsIgnoreCase("1")) {
			adcShiftScheduling.setAdcId(record.getAdcId());
		}
		adcShiftScheduling.setCount(record.getAffDays());
		
		/**
		 * 徐岩加于2015.09.29
		 * 用于处理由值班表产生的adc_shift_leave记录
		 */
		String shiftId = record.getShiftId();
		if (!HrUtils.isEmpty(shiftId)){
			Map dateMap = adcShiftUtils.getWorkAndOffTime(shiftId, record.getAdcDate());
			adcShiftScheduling.setWorkTime((Date)dateMap.get("dateWork"));
			adcShiftScheduling.setOffTime((Date)dateMap.get("dateOff"));
			adcShiftScheduling.setShiftId(shiftId);
			adcShiftScheduling.setAdcId((String)dateMap.get("adc_id"));
		}

		/**
		 * 处理半天效果： 判断影响天数字段的值 1:无0.5天效果 －0.5:上午半天 0.5:下午半天
		 */
		if (record.getAffDays().floatValue() == 1) {
			adcShiftScheduling.setOffTime(null);
			adcShiftScheduling.setWorkTime(null);
			adcShiftScheduling.setShiftId(null);
		} else if (record.getAffDays().floatValue() == -0.5) {
			adcShiftScheduling.setWorkTime(null);
		} else if (record.getAffDays().floatValue() == 0.5) {
			adcShiftScheduling.setOffTime(null);
		}

		exp.clear();
		exp.createCriteria().andIdEqualTo(adcShiftScheduling.getId());
		adcShiftSchedulingMapper.updateByExample(adcShiftScheduling, exp);
		return 1;
	}

	/**
	 * 专门处理饭假的OA请求
	 * @param rec
	 * @return
	 */
	public int procMealsOaIntf(OaIntf rec) {
		/**
		 * 饭假，还是单独先处理吧。业务类型是0312 原来想简单了，如果是连续请饭假，怎么办？
		 */
		/*
		if (attendType.getTypeId().equalsIgnoreCase("0312")) {
			// 比较tmpDate和curDate,如果小于curDate就跳出
			Long vTmp = Long.valueOf(HrUtils.date2String(tmpDate, "yyyyMMdd"));
			Long vCur = Long.valueOf(HrUtils.date2String(curDate, "yyyyMMdd"));

			Long lTmp = Long.valueOf(HrUtils.date2String(tmpDate, "HHmmss"));
			
			//如果小于当前时间，就跳过 等于的话就写入等于时间 小于的话就代表请未发生日期就假。
			if (vTmp.longValue() < vCur.longValue()) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(tmpDate);
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				;
				tmpDate = calendar.getTime();
				continue;
			}
			AdcShiftMeals adcShiftMeals = new AdcShiftMeals();
			adcShiftMeals.setMealsDate(tmpDate);
			adcShiftMeals.setMealsTimes(Integer.valueOf(1));
			if (vTmp.longValue() > vCur.longValue()) {
				adcShiftMeals.setMealsType(new String("4")); // 及时请假,10点之前
			}
			if (vTmp.longValue() == vCur.longValue()) {
				if (lTmp.longValue() <= Long.valueOf("103000")) {
					adcShiftMeals.setMealsType(new String("4"));
				} else {
					adcShiftMeals.setMealsType(new String("5"));
				}
			}
			for (Long empid : empList) {
				adcShiftMeals.setEmpid(empid);
				String deptidStr = this.getDeptidByEmpid(empid);
				adcShiftMeals.setDeptid(deptidStr);
				String roomId = getLeaveDinnerRoomIdByEmpid(empid, deptidStr);
				adcShiftMeals.setRoomId(roomId);

				AdcShiftMealsExample adcShiftMealsExample = new AdcShiftMealsExample();
				adcShiftMealsExample.createCriteria().andDeptidEqualTo(deptidStr).andEmpidEqualTo(empid).andMealsDateEqualTo(tmpDate);

				adcShiftMealsMapper.deleteByExample(adcShiftMealsExample);
				adcShiftMealsMapper.insert(adcShiftMeals);

			}
			return 1;
		}
		*/
		return 0;
	}

	/**
	 * 转换oa_intf记录为AdcShiftLeave记录
	 * 排除饭假处理
	 * @throws ParseException 
	 */
	public int transOaIntfRecord(OaIntf rec) throws ParseException {
		AdcAttendType attendType = getAdcAttendTypeRecByBuscode(rec.getCllx());
		if (attendType == null) {
			return 1;
		}

		// 这两个地方为空的记录用户确认的记录
		if ((rec.getKsrq() == null) && (rec.getJsrq() == null)) {
			return 2;
		}

		// 获得本记录所包含的人员id
		List<Long> empList = new ArrayList<Long>();
		String[] codes = (rec.getWorkcode() + "," + rec.getTxrcode()).split(",");
		for (String code : codes) {
			Employee emp = getEmployeeByCode(code);
			if (HrUtils.isEmpty(emp)) {
				continue;
			}
			empList.add(Long.valueOf(String.valueOf(emp.getEmpid())));
		}

		if (empList.size() == 0) {
			return 1;
		}

		// 准备好日期变量
		HrUtils.mergeDate(rec.getKsrq(), "00:00");
		Date dateStart = HrUtils.stringToDate(rec.getKsrq(), "yyyy-MM-dd", "yyyy-MM-dd");
		Date dateEnd = HrUtils.stringToDate(rec.getJsrq(), "yyyy-MM-dd", "yyyy-MM-dd");
		Date datetimeStart = HrUtils.mergeDate(rec.getKsrq(), rec.getKssj());
		Date datetimeEnd = HrUtils.mergeDate(rec.getJsrq(), rec.getJssj());

		/**
		 * 判断请的假是否有半天（0.5)天的效果 如果有，要判断是以这0.5天开始，还是以这0.5天结束 restType :
		 * 0是无半天效果，1是半天在前（下半天)，2是半天在后(上半天)。
		 * 1是下午半天假，2是上午半天假。
		 */
		String restType = "0";
		if (!HrUtils.isEmpty(rec.getDays())) {
			if (HrUtils.isFloat(rec.getDays())) {
				/*
				 * 先用一种简单的方法来判断，以中午12点为界， 起始日期在12点之前的就是后半天， 在12点之后的，就是前半天
				 * restType : 1
				 */
				Long startLong = Long.valueOf(HrUtils.date2String(datetimeStart, "HHmmss"));
				Long sLong = Long.valueOf("120000");
				if (startLong.longValue() >= sLong.longValue()) {
					restType = "1";
				} else {
					restType = "2";
				}
			}
		}	

		/*
		 * 遍历条件里的开始日期和结束日期，生成adc_shift_leave的数据
		 */
		Date tmpDate = dateStart;
		Date curDate = new Date();
		while (tmpDate.getTime() <= dateEnd.getTime()) {
			for (Long empid : empList) {
				Long deptid = getDeptidByEmpid(empid);
				
				AdcShiftLeave record = new AdcShiftLeave();
				String adcId = attendType.getTypeId();
				record.setAdcDate(tmpDate);
				record.setEmpid(empid);
				record.setDeptid(deptid);
				record.setAdcId(adcId);
				record.setAdditionInfo(rec.getRemark());
				record.setRequestid(rec.getRequestid());
				record.setOperator("10000000");
				record.setOperateTime(new Date());
				record.setSourceType("2");

				// 如果请假类型是点假
				if (attendType.getTypeId().equalsIgnoreCase("0303")) {
					if (!HrUtils.isEmpty(rec.getHours())) {
						record.setAffHours(Double.valueOf(rec.getHours()));
					}
				} else {
					record.setAffDays(Double.valueOf("1"));
				}
				record.setState(new String("1"));

				if (restType.equalsIgnoreCase("0")) {
					record.setAffDays(Double.valueOf("1"));
				} else if (restType.equalsIgnoreCase("1") && tmpDate.getTime() == dateStart.getTime()) {
					record.setAffDays(Double.valueOf("0.5"));
				} else if (restType.equalsIgnoreCase("2") && tmpDate.getTime() == dateEnd.getTime()) {
					record.setAffDays(Double.valueOf("-0.5"));
				}

				/**
				 * 调用过程处理生成的adc_shift_leave记录 将结果写在排班表中(adc_shift_scheduling)
				 * 如果返回值大于0表示处理成功，要回写标记
				 */
				int i = procAdcShiftLeaveOne(record);
				if (i > 0) {
					record.setState(new String("2"));
				}
				adcShiftLeaveMapper.insert(record);
			}
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(tmpDate);
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			tmpDate = calendar.getTime();
		}

		/**
		 * 处理异常
		 */
		AdcShiftExceptionExample expExample = new AdcShiftExceptionExample();
		expExample.createCriteria().andEmpidIn(empList).andCheckTimeBetween(datetimeStart, datetimeEnd)
					.andProcStateNotEqualTo(new String("3"));

		AdcShiftException expRec = new AdcShiftException();
		expRec.setAdcId(attendType.getTypeId());
		expRec.setProcMemo("OA自动处理,REQUESTID=" + String.valueOf(rec.getRequestid()));
		expRec.setProcState(new String("3"));
		expRec.setOperator("10000000");
		expRec.setOperateTime(new Date());

		adcShiftExceptionMappper.updateByExampleSelective(expRec, expExample);
	
		return 1;
	}
}
