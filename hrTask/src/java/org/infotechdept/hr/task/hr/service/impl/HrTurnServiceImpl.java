package org.infotechdept.hr.task.hr.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.infotechdept.hr.system.HrUtils;
import org.infotechdept.hr.task.dao.AdcShiftExceptionMapper;
import org.infotechdept.hr.task.dao.AdcShiftSchedulingMapper;
import org.infotechdept.hr.task.dao.DeptemplMapper;
import org.infotechdept.hr.task.dao.EmployeeMapper;
import org.infotechdept.hr.task.hr.service.HrStafferService;
import org.infotechdept.hr.task.model.AdcShiftExceptionExample;
import org.infotechdept.hr.task.model.AdcShiftScheduling;
import org.infotechdept.hr.task.model.AdcShiftSchedulingExample;
import org.infotechdept.hr.task.model.Deptempl;
import org.infotechdept.hr.task.model.DeptemplExample;
import org.infotechdept.hr.task.model.Employee;
import org.infotechdept.hr.task.model.EmployeeExample;
import org.infotechdept.hr.task.service.AdcShiftUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 调转：企业人员调整叫调转
 * @author xuyan
 *
 */
@Service
public class HrTurnServiceImpl implements HrStafferService {
	
	@Autowired
	private AdcShiftSchedulingMapper adcShiftSchedulingMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private DeptemplMapper deptemplMapper;
	@Autowired
	private AdcShiftUtils adcShiftUtils;
	@Autowired
	private AdcShiftExceptionMapper adcShiftExceptionMapper;

	/**
	 * 调转的操作：
	 * 1、原部门的排班表调出月的标记调出（0313），之后的删除。
	 * 2、新部门排班表生成不了（不知道上哪个班次）
	 * 3、老部门异常删除。
	 * 4、对应部门改成新部门并更新职位职务。
	 */
	public Map procHrStaffer(Map stafferMap) {
		Map resultMap = new HashMap(); 
		BigDecimal bdEmpid = (BigDecimal) stafferMap.get("C_EMPOID");
		Integer empid = bdEmpid.intValue();
		String oldUnitName = adcShiftUtils.genFullDeptNameByUnitIdInHR((BigDecimal)stafferMap.get("C_OLDUNITID"));
		String newUnitName = adcShiftUtils.genFullDeptNameByUnitIdInHR((BigDecimal)stafferMap.get("C_NEWUNITID"));
		
		Long deptidOldStr = adcShiftUtils.getDeptidByUnitName(oldUnitName);
		Long deptidNewStr = adcShiftUtils.getDeptidByUnitName(newUnitName);

		try{
			if ((deptidOldStr == null) || (deptidNewStr == null)){
				throw new Exception("deptid is null!");
			}
			Date recordDate =  HrUtils.stringToDate((String)stafferMap.get("C_RECORDTIME"), "yyyy-MM-dd", "yyyy-MM-dd");
			
			//原部门的排班表调出月标记调出（0313）
			Date endDate = (Date) HrUtils.getInMonthDate(recordDate).get("end_date");
			AdcShiftSchedulingExample schExp = new AdcShiftSchedulingExample();
			schExp.createCriteria().andSchDateBetween(recordDate, endDate).andDeptidEqualTo(deptidOldStr).andEmpidEqualTo(Long.valueOf(String.valueOf(empid)));
			adcShiftSchedulingMapper.deleteByExample(schExp);
			
			//原部门生成的排班表调出月之后的删除
			schExp.clear();
			schExp.createCriteria().andSchDateGreaterThan(endDate).andDeptidEqualTo(deptidOldStr).andEmpidEqualTo(Long.valueOf(String.valueOf(empid)));
			adcShiftSchedulingMapper.deleteByExample(schExp);
			
			//调出之后原部门产生的异常删除
			AdcShiftExceptionExample exceptionExp = new AdcShiftExceptionExample();
			exceptionExp.createCriteria().andExceptionDateGreaterThanOrEqualTo(recordDate).andDeptidEqualTo(deptidOldStr).andEmpidEqualTo(Long.valueOf(String.valueOf(empid)));
			adcShiftExceptionMapper.deleteByExample(exceptionExp);
			
			//对应部门改成新部门，并更新职位，对应总部职位
			Deptempl deptempl = new Deptempl();
			deptempl.setDeptid(deptidNewStr);
			deptempl.setDeptname(newUnitName);
			deptempl.setJobname((String)stafferMap.get("C_NEWJOBNAME"));
			deptempl.setZbzwid(adcShiftUtils.getZbzwid((String)stafferMap.get("C_NEWDYZBZW")));
			DeptemplExample deptemplExp = new DeptemplExample();
			deptemplExp.createCriteria().andEmpidEqualTo(Long.valueOf(String.valueOf(empid)));
			deptemplMapper.updateByExampleSelective(deptempl, deptemplExp);
			
			resultMap.put("success", new Boolean(true));
			return resultMap;
		}catch(Exception e){
			resultMap.put("success", new Boolean(false));
			resultMap.put("message", e.getMessage());
			return resultMap;
		}
	}

}
