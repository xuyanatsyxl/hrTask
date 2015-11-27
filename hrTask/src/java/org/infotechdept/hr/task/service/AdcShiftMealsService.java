package org.infotechdept.hr.task.service;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.infotechdept.hr.system.HrUtils;
import org.infotechdept.hr.task.dao.AdcShiftMealsMapper;
import org.infotechdept.hr.task.dao.DeptemplMapper;
import org.infotechdept.hr.task.dao.EmployeeMapper;
import org.infotechdept.hr.task.model.AdcShiftMeals;
import org.infotechdept.hr.task.model.Deptempl;
import org.infotechdept.hr.task.model.DeptemplExample;
import org.infotechdept.hr.task.model.Employee;
import org.infotechdept.hr.task.model.EmployeeExample;
import org.infotechdept.hr.task.model.OaIntf;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *	食堂就餐管理相关服务 
 * 	@author xuyan
 *
 */
@Service
public class AdcShiftMealsService {

	@Autowired
	private AdcShiftMealsMapper adcShiftMealsMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private DeptemplMapper deptemplMapper;
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	/**
	 * 根据写入时间判断当天请的饭假是否有效
	 * @param writeTime 格式HH:mm
	 * @return
	 */
	public String getMealsType(String writeTime){
		Date tmpDate = HrUtils.mergeDate(new Date(), writeTime);
		
		return null;
	}
	
	public int transOaMealsRecord(OaIntf rec){
		//我只处理饭假，谢谢！
		if (!rec.getCllx().equalsIgnoreCase("30")){
			
		}
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		Date startDate = HrUtils.stringToDate(rec.getKsrq(), "yyyy-MM-dd", "yyyy-MM-dd");
		Date endDate = HrUtils.stringToDate(rec.getJsrq(), "yyyy-MM-dd", "yyyy-MM-dd");
		
		String[] codes = (rec.getWorkcode() + "," + rec.getTxrcode()).split(",");
		if (codes.length == 0){
			return -1;
		}
		paramMap.put("codes", codes);
		List<Map> resultMap = sqlSession.selectList("DeptemplMapper.queryDeptempls", paramMap);
		
		if (resultMap.size() > 0){
			Date currentDate = HrUtils.stringToDate(HrUtils.getCurDate("yyyy-MM-dd"), "yyyy-MM-dd", "yyyy-MM-dd");
			Date tmpDate = null;
			if (currentDate.getTime() > startDate.getTime()){
				tmpDate = currentDate;
			}
			
			
			for (Map entity : resultMap){
				AdcShiftMeals adcShiftMeals = new AdcShiftMeals();
				adcShiftMeals.setEmpid(Long.valueOf((String) entity.get("empid")));
				adcShiftMeals.setDeptid((Long)entity.get("deptid"));
				
				while (tmpDate.getTime() <= endDate.getTime()){	
					adcShiftMeals.setMealsDate(tmpDate);

					adcShiftMealsMapper.insert(adcShiftMeals);
					
					
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(tmpDate);
					calendar.add(Calendar.DAY_OF_MONTH, 1);
					tmpDate = calendar.getTime();
				}
			}
			
		}
		return 0;
	}
}
