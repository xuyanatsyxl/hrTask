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
import org.infotechdept.hr.task.model.Employee;
import org.infotechdept.hr.task.model.EmployeeExample;
import org.infotechdept.hr.task.service.AdcShiftUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 离职
 * @author xuyan
 *
 */
@Service
public class HrLeaveServiceImpl implements HrStafferService {
	
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


	public Map procHrStaffer(Map stafferMap) {
		/**
		 * 离职的操作：
		 * 1、人物标记为离职。
		 * 2、把已经生成的排班表都删除。（离职日期之后的）
		 * 3、异常删除
		 */
		Map resultMap = new HashMap(); 
		BigDecimal bdEmpid = (BigDecimal) stafferMap.get("C_EMPOID");
		Long empid = bdEmpid.longValue();
		String oldUnitName = (String)stafferMap.get("C_OLDUNITNAME");
		String deptidStr = adcShiftUtils.getDeptidByUnitName(oldUnitName);
	
		EmployeeExample emplExp = new EmployeeExample();
		emplExp.createCriteria().andEmpidEqualTo(empid);
		
		Employee empl = new Employee();
		empl.setDqzt("4");
		employeeMapper.updateByExampleSelective(empl, emplExp);

		try{
			if (deptidStr == null){
				throw new Exception("deptid is null!");
			}
			Date recordDate =  HrUtils.stringToDate((String)stafferMap.get("C_RECORDTIME"), "yyyy-MM-dd", "yyyy-MM-dd");
			
			//离职之后产生的排班表删除
			AdcShiftSchedulingExample schExp = new AdcShiftSchedulingExample();
			schExp.createCriteria().andSchDateGreaterThanOrEqualTo(recordDate).andDeptidEqualTo(deptidStr).andEmpidEqualTo(Long.valueOf(String.valueOf(empid)));
			adcShiftSchedulingMapper.deleteByExample(schExp);
			
			//离职之后产生的异常删除
			AdcShiftExceptionExample exceptionExp = new AdcShiftExceptionExample();
			exceptionExp.createCriteria().andExceptionDateGreaterThanOrEqualTo(recordDate).andDeptidEqualTo(deptidStr).andEmpidEqualTo(Long.valueOf(String.valueOf(empid)));
			adcShiftExceptionMapper.deleteByExample(exceptionExp);
			
			resultMap.put("success", new Boolean(true));
			return resultMap;
		}catch(Exception e){
			resultMap.put("success", new Boolean(false));
			resultMap.put("message", e.getMessage());
			return resultMap;
		}
	}

}
