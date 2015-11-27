package org.infotechdept.hr.task.service;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.infotechdept.hr.system.HrUtils;
import org.infotechdept.hr.task.dao.AdcShiftApplyMapper;
import org.infotechdept.hr.task.dao.AdcShiftBasicMapper;
import org.infotechdept.hr.task.dao.AdcShiftGroupEmplMapper;
import org.infotechdept.hr.task.dao.AdcShiftRecordMapper;
import org.infotechdept.hr.task.dao.EadeptMapper;
import org.infotechdept.hr.task.model.AdcShiftApply;
import org.infotechdept.hr.task.model.AdcShiftApplyExample;
import org.infotechdept.hr.task.model.AdcShiftBasic;
import org.infotechdept.hr.task.model.AdcShiftBasicExample;
import org.infotechdept.hr.task.model.AdcShiftGroupEmpl;
import org.infotechdept.hr.task.model.AdcShiftGroupEmplExample;
import org.infotechdept.hr.task.model.AdcShiftPatternDetail;
import org.infotechdept.hr.task.model.AdcShiftRecord;
import org.infotechdept.hr.task.model.AdcShiftRecordExample;
import org.infotechdept.hr.task.model.Eadept;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdcShiftUtils {
	
	private static Log log = LogFactory.getLog(AdcShiftUtils.class);
	
	//全天
	public final static String FULL_DAY = "0";
	//上午半天
	public final static String HALF_DAY_UP = "2";
	//下午半天
	public final static String HALF_DAY_DOWN = "1";

	@Autowired
	private AdcShiftBasicMapper adcShiftBasicMapper;
	@Autowired
	private AdcShiftApplyMapper adcShiftApplyMapper;
	@Autowired
	private AdcShiftRecordMapper adcShiftRecordMapper;
	@Autowired
	private AdcShiftGroupEmplMapper adcShiftGroupEmplMapper;
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Autowired
	private EadeptMapper eadeptMapper;

	/**
	 * 根据基本班次ID和日期，返回该天应该上下班的时间
	 * 
	 * @param shiftId
	 * @param tmpDate
	 * @return Map中有四项内容：shift_id, dateWork, dateOff, AdcId
	 */
	public Map getWorkAndOffTime(String shiftId, Date tmpDate) {
		Map resultMap = new HashMap<String, Object>();
		if (HrUtils.isEmpty(shiftId)) {
			resultMap.put("dateWork", null);
			resultMap.put("dateOff", null);
			resultMap.put("shift_id", null);
			return resultMap;
		}
		AdcShiftBasic item = adcShiftBasicMapper.selectByPrimaryKey(shiftId);
		if (HrUtils.isEmpty(item)) {
			return null;
		} else {
			resultMap.put("shift_id", shiftId);
			resultMap.put("adc_id", item.getAdcId());
			resultMap.put("dateWork", HrUtils.mergeDate(tmpDate, item.getWorkTime()));
			//判断连夜班情况
			if (item.getShiftType().equalsIgnoreCase("2")){
				Date dateOff = HrUtils.getIntevalDay(HrUtils.mergeDate(tmpDate, item.getWorkTime()), 1);
				resultMap.put("dateOff", dateOff);
			}
			resultMap.put("dateOff", HrUtils.mergeDate(tmpDate, item.getOffTime()));
			return resultMap;
		}
	}
	
	/**
	 * 判断请假是否有半天的效果
	 * @param pDate 起始日期
	 * @param pAffDays 影响天数
	 * @return
	 */
	public String isFullDayOrHalfDay(Date pDate, String shiftId){
		return null;
	}

	
	/**
	 * 根据班次应用ID获得排班记录
	 * 多条记录要考虑有效期问题
	 * @param applyId
	 * @return
	 */
	private AdcShiftRecord getAdcShiftRecordByApplyId(Long applyId, Date pDate){
		AdcShiftRecordExample recordExmaple = new AdcShiftRecordExample();
		recordExmaple.createCriteria().andApplyIdEqualTo(applyId);
		recordExmaple.setOrderByClause("VALID_START_DATE DESC");
		List<AdcShiftRecord> items = adcShiftRecordMapper.selectByExample(recordExmaple);
		for(AdcShiftRecord entity : items){
			float days = HrUtils.getIntervalDays(pDate, entity.getValidStartDate());
			if (days < 0){
				return entity;
			}
		}
		return null;		
	}

	
	/**
	 * 根据HR的UNITNAME字段取得DEPTID
	 * 分割HR系统人员的UNITNAME字段，逐个查找部门
	 * 如果没有就创建
	 */
	public Long getDeptidByUnitName(String unitName){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		Long deptidStr = null;
		String cascadeId = null;
		String[] units = unitName.split("-");
		int i = 0;
		for (String unit : units){
			paramMap.clear();
			paramMap.put("deptname", unit);
			paramMap.put("level", (i + 2) * 3);
			if (i >0){
				paramMap.put("cascadeid", cascadeId + "%");
			}
			Map resultMap = sqlSession.selectOne("Dept.queryDeptidByParam", paramMap);
			Long tmpDeptid = null;
			if (HrUtils.isNotEmpty(resultMap)){
			    tmpDeptid = (Long)resultMap.get("deptid");
			    deptidStr = tmpDeptid;
				cascadeId = (String)resultMap.get("cascadeid");
			}else{				
				paramMap.clear();
				paramMap.put("deptname", unit);
				if (i == 0){
					paramMap.put("parentid", Long.valueOf("1"));
				}else{
					paramMap.put("parentid", deptidStr);
				}
				cascadeId = getCascadeIdGenerator((Long)paramMap.get("parentid"));
				paramMap.put("deptid", null);
				paramMap.put("cascadeid", cascadeId);
				paramMap.put("enabled", "1");
				paramMap.put("leaf", "0");
				sqlSession.insert("Dept.saveDeptItem", paramMap);
				deptidStr = (Long)paramMap.get("deptid");
			}
			i++;
		}
		return deptidStr;
	}
	
    /**
     * 部门编号ID生成器(自定义)
     * @param pParentid 菜单编号的参考编号
     * @return
     */
	private String getCascadeIdGenerator(Long pParentid){
		String parentCascadeid = (String)sqlSession.selectOne("Dept.queryCascadeidByDeptid", pParentid);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("parentid", pParentid);
		paramMap.put("cascadeid", parentCascadeid + "%");
		String maxSubDeptId = (String)sqlSession.selectOne("Dept.getMaxSubDeptIdNew", paramMap);
		
		String cascadeid = null;
		if(maxSubDeptId == null){
			cascadeid = "001";
		}else{
			int length = maxSubDeptId.length();
			String temp = maxSubDeptId.substring(length-3, length);
			int intDeptId = Integer.valueOf(temp).intValue() + 1;
			if(intDeptId > 0 && intDeptId < 10){
				cascadeid = "00" + String.valueOf(intDeptId);
			}else if(10 <= intDeptId && intDeptId <= 99){
				cascadeid = "0" + String.valueOf(intDeptId);
			}else if (100 <= intDeptId && intDeptId <= 999) {
				cascadeid = String.valueOf(intDeptId);
			}else if(intDeptId >999){
				log.error("生成部门编号越界了.同级兄弟节点编号为[001-999]\n请和您的系统管理员联系!");
			}else{
				log.error("生成部门编号发生未知错误,请和开发人员联系!");
			}
		}
		return parentCascadeid + cascadeid;
	}
	
	/**
	 * 根据总部职务名称查找对应总部职务ID
	 * @param zwname
	 * @return
	 */
	public int getZbzwid(String zwname){
		Integer temp = sqlSession.selectOne("User.queryZbzwid", zwname);
		if (temp == null){
			return 1;
		}else{
			return temp.intValue();
		}
	}
	
	/**
	 * 
	 * @param deptid
	 * @return
	 */
	public String getCascadeidByDeptid(Long deptid){
		Eadept entity = eadeptMapper.selectByPrimaryKey(deptid);
		if (HrUtils.isNotEmpty(entity)){
			return entity.getCascadeid();
		}else{
			return null;
		}
	}
	
}
