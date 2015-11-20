package org.infotechdept.hr.task.test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.infotechdept.hr.system.HrUtils;
import org.infotechdept.hr.task.dao.AdcShiftExceptionMapper;
import org.infotechdept.hr.task.dao.AdcShiftMealsMapper;
import org.infotechdept.hr.task.dao.AdcShiftRecordLogsMapper;
import org.infotechdept.hr.task.dao.AdcShiftRecordMapper;
import org.infotechdept.hr.task.dao.OaIntfMapper;
import org.infotechdept.hr.task.model.AdcShiftApply;
import org.infotechdept.hr.task.model.AdcShiftRecord;
import org.infotechdept.hr.task.model.AdcShiftRecordExample;
import org.infotechdept.hr.task.model.OaIntf;
import org.infotechdept.hr.task.model.OaIntfExample;
import org.infotechdept.hr.task.scheduler.Engineer;
import org.infotechdept.hr.task.service.AdcShiftLeaveService;
import org.infotechdept.hr.task.service.AdcShiftSchedulingService;
import org.infotechdept.hr.task.service.AdcShiftStafferService;
import org.infotechdept.hr.task.service.AdcShiftUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/applicationContext.xml" })
public class TestService {

	@Autowired
	private AdcShiftLeaveService adcShiftLeaveService;

	@Autowired
	private OaIntfMapper oaIntfMapper;

	@Autowired
	private AdcShiftRecordMapper adcShiftRecordMapper;

	@Autowired
	private AdcShiftSchedulingService adcShiftSchedulingService;

	@Autowired
	private AdcShiftExceptionMapper adcShiftExceptionMapper;

	@Autowired
	private AdcShiftMealsMapper adcShiftMealsMapper;

	@Autowired
	private Engineer engineer;
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Resource(name = "sqlSession.hr")
	private SqlSessionTemplate sqlSessionHr; 
	
	@Autowired
	private AdcShiftRecordLogsMapper adcShiftRecordLogsMapper;
	
	@Autowired
	private AdcShiftStafferService adcShiftStafferService;
	
	@Autowired
	private AdcShiftUtils adcShiftUtils;

	public void test() throws ParseException {
		OaIntfExample oaIntfExample = new OaIntfExample();
		oaIntfExample.createCriteria().andRequestidEqualTo(Long.valueOf("234"));
		List<OaIntf> items = oaIntfMapper.selectByExample(oaIntfExample);
		for (OaIntf rec : items) {
			adcShiftLeaveService.transOaIntfRecord(rec);
		}

	}

	public void test2() throws ParseException {
		boolean isRight = HrUtils.isFloat(Double.valueOf(1.1555).floatValue());
		System.out.println(isRight);
	}

	public void testMakeException() {
		engineer.makeKqReport();
	}

	public void procOaData() throws ParseException {
		OaIntfExample example = new OaIntfExample();
		example.createCriteria().andClbzNotEqualTo(new String("2"));
		List<OaIntf> items = oaIntfMapper.selectByExample(example);
		for (OaIntf rec : items) {
				int i = adcShiftLeaveService.transOaIntfRecord(rec);
				if (i > 0) {
					rec.setClbz(new String("2"));
				}
				oaIntfMapper.updateByPrimaryKey(rec);

		}
	}
	

	public void testStroeProcedure(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		String tmpDateStr = HrUtils.date2String(calendar.getTime(), "yyyyMMdd");
		tmpDateStr += "000000";
		sqlSession.update("AdcSysProc.hr_make_kq_report", Long.valueOf(tmpDateStr));
	}
	
	public void testMakeScheduling(){
		Calendar cal = Calendar.getInstance();
		//Date tmpDate = cal.getTime();
		
		Date tmpDate = HrUtils.stringToDate("2015-10-28", "yyyy-MM-dd", "yyyy-MM-dd");

		AdcShiftRecordExample example = new AdcShiftRecordExample();
		//example.createCriteria().andApplyIdEqualTo(Long.valueOf("134"));
		List<AdcShiftRecord> items = adcShiftRecordMapper.selectByExample(example);
		for (AdcShiftRecord record : items) {
			try {
				adcShiftSchedulingService.makeShiftByRecordForInvoke(record, tmpDate, tmpDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void testMakeNextDayScheduling(){
		engineer.makeNextDayScheduling();
	}
	
	
	public void testHr(){
		Map paramMap = new HashMap();
		paramMap.put("date", HrUtils.getCurDate("yyyy-MM-dd"));
		List<Map> items = sqlSessionHr.selectList("HR.queryTbPerStafferrcordForTrans", paramMap);
		if (items.size() > 0){
			for(Map dataMap : items){
				try{
					adcShiftStafferService.invokeBeanMethod(dataMap);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	

	public void testUtils(){
		Map resultMap = adcShiftUtils.getMetaSchedulingData("001007010005003", Long.valueOf("15218830"), new Date());
		AdcShiftApply applyItem = (AdcShiftApply) resultMap.get("apply");
		AdcShiftRecord recordItem = (AdcShiftRecord) resultMap.get("record");
		System.out.println(applyItem.getApplyId());	
	}
	
	public void testAdcShiftLeave(){
		engineer.procAdcShiftLeave();
	}
	
	/**
	 * 就餐数据测试
	 */
	@Test
	public void testAdcShiftMeals(){
		engineer.pushExceptionToOA();
	}
}
