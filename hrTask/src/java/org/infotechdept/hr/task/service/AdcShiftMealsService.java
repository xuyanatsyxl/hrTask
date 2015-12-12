package org.infotechdept.hr.task.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.infotechdept.hr.system.HrUtils;
import org.infotechdept.hr.task.dao.AdcDinnerRoomUnitMapper;
import org.infotechdept.hr.task.dao.AdcShiftMealsMapper;
import org.infotechdept.hr.task.dao.DeptemplMapper;
import org.infotechdept.hr.task.dao.EadeptMapper;
import org.infotechdept.hr.task.dao.EmployeeMapper;
import org.infotechdept.hr.task.model.AdcDinnerRoomUnit;
import org.infotechdept.hr.task.model.AdcDinnerRoomUnitExample;
import org.infotechdept.hr.task.model.AdcShiftMeals;
import org.infotechdept.hr.task.model.AdcShiftMealsExample;
import org.infotechdept.hr.task.model.Deptempl;
import org.infotechdept.hr.task.model.DeptemplExample;
import org.infotechdept.hr.task.model.Eadept;
import org.infotechdept.hr.task.model.EadeptExample;
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
	@Autowired
	private AdcDinnerRoomUnitMapper adcDinnerRoomUnitMapper;
	@Autowired
	private AdcShiftUtils adcShiftUtils;
	@Autowired
	private EadeptMapper eadeptMapper;
	
	/**
	 * 根据人员查找该人员应该请假的食堂
	 * @param deptid
	 * @param empid
	 * @return
	 */
	public String getMealsLeaveRoom(Long deptid, Long empid){
		//先找人有没有指定
		AdcDinnerRoomUnitExample exp = new AdcDinnerRoomUnitExample();
		exp.createCriteria().andEmpidEqualTo(empid);
		List<AdcDinnerRoomUnit> items = adcDinnerRoomUnitMapper.selectByExample(exp);
		if (items.size() > 0){
			return items.get(0).getRoomId();
		}
		
		//没有人就找部门
		Long tmpDeptid = deptid;
		while (tmpDeptid.intValue() != 1){
			items.clear();
			exp.clear();
			exp.createCriteria().andDeptidEqualTo(tmpDeptid);
			items = adcDinnerRoomUnitMapper.selectByExample(exp);
			if (items.size() > 0){
				return items.get(0).getRoomId();
			}
			Eadept entity = eadeptMapper.selectByPrimaryKey(tmpDeptid);	
			tmpDeptid = Long.valueOf(entity.getParentid());
		}
		
		//能到这儿说明是啥也没找着了，就只能找他最近的就餐食堂
		Map resultMap = sqlSession.selectOne("AdcShiftSchedulingOper.queryRecentlyMeals", empid);
		if (HrUtils.isNotEmpty(resultMap)){
			return (String)resultMap.get("room_id");
		}
		return null;		
	}
	
	/**
	 * 根据写入时间判断当天请的饭假是否有效
	 * @param writeTime 格式HH:mm
	 * @return 4：及时饭假      
	 * 		   5：不及时饭假
	 */
	public String getMealsLeaveType(Date writeTime){
		Long vTime = Long.valueOf(HrUtils.date2String(writeTime, "HHmmss"));
		Long vOkTime = Long.valueOf("103000");
		Long vEndTime = Long.valueOf("130000");
		if (vTime <= vOkTime){
			return "4";
		}else if (vTime > vOkTime && vTime <= vEndTime){
			return "5";
		}else{
			return null;
		}
	}
	
	public int transOaMealsRecord(OaIntf rec) throws Exception{
		//我只处理饭假，谢谢！
		if (!rec.getCllx().equalsIgnoreCase("30")){
			return -1;
		}
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		Date startDate = HrUtils.stringToDate(rec.getKsrq(), "yyyy-MM-dd", "yyyy-MM-dd");
		Date endDate = HrUtils.stringToDate(rec.getJsrq(), "yyyy-MM-dd", "yyyy-MM-dd");
		
		/**
		 * 取得审请时间，比对审请的开始时间，
		 * 如果审请时间比开始时间大，则要取审请时间。
		 */
		Date writeDateTime = null;
		try{
			writeDateTime = HrUtils.mergeDate(rec.getWriteDate(), rec.getWriteTime());
		}catch(Exception e){
			throw e;
		}
		
		String[] codes = (rec.getWorkcode() + "," + rec.getTxrcode()).split(",");
		if (codes.length == 0){
			return -1;
		}
		
		List<String> codeList = new ArrayList<String>();
		for (String code : codes){
			codeList.add(code);
		}
		
		EmployeeExample emplExp = new EmployeeExample();
		emplExp.createCriteria().andCodeIn(codeList).andDqztEqualTo("2");
		List<Employee> emplEntitys = employeeMapper.selectByExample(emplExp);
		int i = HrUtils.compareDateDayOfMonth(writeDateTime, startDate);		
		if (emplEntitys.size() > 0)
			for (Employee entity : emplEntitys){
				Date tmpDate = null;
				if (i <= 0){
					//属于起点在当天饭假的
					tmpDate = writeDateTime;
				}
				AdcShiftMeals adcShiftMeals = new AdcShiftMeals();
				adcShiftMeals.setEmpid(entity.getEmpid());
				
				DeptemplExample deExp = new DeptemplExample();
				deExp.createCriteria().andEmpidEqualTo(entity.getEmpid());
				List<Deptempl> deItems = deptemplMapper.selectByExample(deExp);
				if (deItems.size() == 0){
					continue;
				}
				adcShiftMeals.setDeptid(deItems.get(0).getDeptid());
				String roomId = getMealsLeaveRoom(adcShiftMeals.getDeptid(), adcShiftMeals.getEmpid());
				adcShiftMeals.setRoomId(roomId);
				adcShiftMeals.setMealsTimes(Integer.valueOf(1));
				
				int j = 0;
				while (HrUtils.stringToDate(HrUtils.date2String(tmpDate, "yyyy-MM-dd"), "yyyy-MM-dd", "yyyy-MM-dd").getTime() <= endDate.getTime()){
					if ((i <= 0) && (j == 0)){
						String mealsType = getMealsLeaveType(tmpDate);
						if (HrUtils.isEmpty(mealsType)){
							Calendar calendar = Calendar.getInstance();
							calendar.setTime(tmpDate);
							calendar.add(Calendar.DAY_OF_MONTH, 1);
							tmpDate = calendar.getTime();
							j++;
							continue;
						}
						adcShiftMeals.setMealsType(mealsType);
					}else{
						adcShiftMeals.setMealsType("4");
					}
					adcShiftMeals.setMealsDate(tmpDate);
					AdcShiftMealsExample mealsExp = new AdcShiftMealsExample();
					
					/**
					 * 校验，防止重复请假时，会产生同时存在及时饭假和不及时饭假的情况。
					 */
					List<String> mealsLeaveTypes = new ArrayList<String>();
					mealsLeaveTypes.add("4");
					mealsLeaveTypes.add("5");
					mealsExp.createCriteria().andDeptidEqualTo(adcShiftMeals.getDeptid()).andEmpidEqualTo(adcShiftMeals.getEmpid()).andMealsDateEqualTo(adcShiftMeals.getMealsDate()).andMealsTypeIn(mealsLeaveTypes);
					int icount = adcShiftMealsMapper.countByExample(mealsExp);
					if (icount == 0){
						try{
							adcShiftMealsMapper.insert(adcShiftMeals);
						}catch(Exception e){
							Calendar calendar = Calendar.getInstance();
							calendar.setTime(tmpDate);
							calendar.add(Calendar.DAY_OF_MONTH, 1);
							tmpDate = calendar.getTime();
							j++;
							continue;
						}
					}
															
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(tmpDate);
					calendar.add(Calendar.DAY_OF_MONTH, 1);
					tmpDate = calendar.getTime();
					j++;
				}
			}
		return 0;
	}
}
