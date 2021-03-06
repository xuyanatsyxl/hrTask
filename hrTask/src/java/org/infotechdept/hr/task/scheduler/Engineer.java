/**
 * 
 */
package org.infotechdept.hr.task.scheduler;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.infotechdept.hr.kq.rpc.webservice.AdcShiftSchedulingServiceProxy;
import org.infotechdept.hr.system.HrUtils;
import org.infotechdept.hr.task.dao.AdcShiftExceptionMapper;
import org.infotechdept.hr.task.dao.AdcShiftLeaveMapper;
import org.infotechdept.hr.task.dao.AdcShiftMealsMapper;
import org.infotechdept.hr.task.dao.AdcShiftRecordLogsMapper;
import org.infotechdept.hr.task.dao.AdcShiftRecordMapper;
import org.infotechdept.hr.task.dao.OaIntfMapper;
import org.infotechdept.hr.task.model.AdcShiftException;
import org.infotechdept.hr.task.model.AdcShiftExceptionExample;
import org.infotechdept.hr.task.model.AdcShiftLeave;
import org.infotechdept.hr.task.model.AdcShiftLeaveExample;
import org.infotechdept.hr.task.model.AdcShiftRecord;
import org.infotechdept.hr.task.model.AdcShiftRecordExample;
import org.infotechdept.hr.task.model.AdcShiftRecordLogs;
import org.infotechdept.hr.task.model.OaIntf;
import org.infotechdept.hr.task.model.OaIntfExample;
import org.infotechdept.hr.task.service.AdcShiftLeaveService;
import org.infotechdept.hr.task.service.AdcShiftMealsService;
import org.infotechdept.hr.task.service.AdcShiftSchedulingService;
import org.infotechdept.hr.task.service.AdcShiftStafferService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author 徐岩 since 2015年1月20日
 * 
 */
@Component("engineer")
public class Engineer {

	@Autowired
	private AdcShiftSchedulingService adcShiftSchedulingService;

	@Autowired
	private AdcShiftRecordMapper adcShiftRecordMapper;

	@Autowired
	private AdcShiftExceptionMapper adcShiftExceptionMapper;

	@Autowired
	private AdcShiftMealsMapper adcShiftMealsMapper;

	@Autowired
	private AdcShiftLeaveMapper adcShiftLeaveMapper;

	@Autowired
	private AdcShiftLeaveService adcShiftLeaveService;

	@Autowired
	private OaIntfMapper oaIntfMapper;

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Resource(name = "sqlSession.hr")
	private SqlSessionTemplate sqlSessionHr;

	@Autowired
	private AdcShiftRecordLogsMapper adcShiftRecordLogsMapper;

	@Autowired
	private AdcShiftStafferService adcShiftStafferService;
	@Autowired
	private AdcShiftMealsService adcShiftMealsService;

	/**
	 * 返回昨天的日期，格式yyyy-MM-dd
	 * 
	 * @return
	 */
	private Date getYesterday() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		return HrUtils.stringToDate(
				HrUtils.date2String(calendar.getTime(), "yyyy-MM-dd"),
				"yyyy-MM-dd", "yyyy-MM-dd");
	}

	/**
	 * 每天执行，处理当天请假表
	 */
	@Transactional(rollbackFor = Exception.class)
	public void procAdcShiftLeave() {
		Calendar calendar = Calendar.getInstance();
		Date pDate = HrUtils.stringToDate(
				HrUtils.date2String(calendar.getTime(), "yyyy-MM-dd"),
				"yyyy-MM-dd", "yyyy-MM-dd");
		AdcShiftLeaveExample exp = new AdcShiftLeaveExample();
		exp.createCriteria().andAdcDateEqualTo(pDate);
		List<AdcShiftLeave> items = adcShiftLeaveMapper.selectByExample(exp);
		for (AdcShiftLeave rec : items) {
			try {
				int i = adcShiftLeaveService.procAdcShiftLeaveOne(rec);
				System.out.println(i);
				if (i > 0) {
					rec.setState(new String("2"));
					adcShiftLeaveMapper.updateByPrimaryKeySelective(rec);
				}
			} catch (Exception e) {

			}
		}

	}

	/**
	 * 每天就餐数据汇总
	 */
	public void procAdcShiftMeals() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		Map paramMap = new HashMap();
		paramMap.put("p_rq",
				HrUtils.date2String(calendar.getTime(), "yyyy-MM-dd"));
		sqlSession.update("AdcSysProc.f_proc_meals", paramMap);
	}

	@Resource
	PlatformTransactionManager txManager;

	/**
	 * 每日执行任务，生成头一天的考勤异常记录
	 */
	@Transactional(rollbackFor = Exception.class)
	public void makeKqReport() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		String tmpDateStr = HrUtils.date2String(calendar.getTime(), "yyyyMMdd");
		tmpDateStr += "000000";
		System.out.println(tmpDateStr);
		sqlSession.update("AdcSysProc.hr_make_kq_report",
				Long.valueOf(tmpDateStr));
	}

	/**
	 * 处理oa数据，食堂请假专用
	 */
	@Transactional(rollbackFor = Exception.class)
	public void procOaMealsData() {
		OaIntfExample example = new OaIntfExample();
		example.createCriteria().andClbzNotEqualTo(new String("2"))
				.andCllxEqualTo("30");
		List<OaIntf> items = oaIntfMapper.selectByExample(example);
		for (OaIntf rec : items) {
			try {
				adcShiftMealsService.transOaMealsRecord(rec);
				rec.setClbz(new String("2"));
				oaIntfMapper.updateByPrimaryKey(rec);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	}

	/**
	 * 处理oa数据，排除食堂请假
	 */
	@Transactional(rollbackFor = Exception.class)
	public void procOaData() {
		OaIntfExample example = new OaIntfExample();
		// 所有未处理的记录，排除饭假
		example.createCriteria().andClbzNotEqualTo(new String("2"))
				.andCllxNotEqualTo("30");
		List<OaIntf> items = oaIntfMapper.selectByExample(example);
		for (OaIntf rec : items) {
			try {
				int i = adcShiftLeaveService.transOaIntfRecord(rec);
				if (i > 0) {
					rec.setClbz(new String("2"));
				}
				oaIntfMapper.updateByPrimaryKey(rec);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	}

	/**
	 * 每月的20号执行，生成下个月的排班表 异步执行，事务放在了每个异步方法里，这里不要加事务！！！
	 */
	public void makeNextMonthAdcScheduling() {
		// 先取出下个月的起始日期和结束日期
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.MONDAY, 1);
		cal.set(Calendar.DAY_OF_MONTH,
				cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		Date dateStart = cal.getTime();
		cal.set(Calendar.DAY_OF_MONTH,
				cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date dateEnd = cal.getTime();

		List<AdcShiftRecord> items = adcShiftRecordMapper
				.selectByExample(new AdcShiftRecordExample());
		for (AdcShiftRecord record : items) {
			try {
				adcShiftSchedulingService.makeShiftByRecordForInvoke(record,
						dateStart, dateEnd);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 每天执行，生成次日的排班表 放在每天晚9点执行
	 */
	public void makeNextDayScheduling() {
		// 先取出下一天的日期
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_MONTH, 1);
		Date tmpDate = HrUtils.stringToDate(
				HrUtils.date2String(cal.getTime(), "yyyy-MM-dd"), "yyyy-MM-dd",
				"yyyy-MM-dd");
		String dateStr = HrUtils.date2String(tmpDate, "yyyyMMdd");
		try {
			org.infotechdept.hr.kq.rpc.webservice.AdcShiftSchedulingService srv = new AdcShiftSchedulingServiceProxy();
			srv.makeAdcShiftSchedulingDay(dateStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 扫描每天HR系统产生的异动记录，应用到考勤系统中
	 */
	public void scanHrForStaffer() {
		Map paramMap = new HashMap();
		paramMap.put("date", HrUtils.getCurDate("yyyy-MM-dd"));
		List<Map> items = sqlSessionHr.selectList(
				"HR.queryTbPerStafferrcordForTrans", paramMap);
		if (items.size() > 0) {
			for (Map dataMap : items) {
				try {
					adcShiftStafferService.invokeBeanMethod(dataMap);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 生成异常消息推送OA记录
	 */
	public void pushExceptionToOA() {
		AdcShiftExceptionExample example = new AdcShiftExceptionExample();
		example.createCriteria().andExceptionDateEqualTo(getYesterday())
				.andProcStateEqualTo("2").andFtriggerflagIsNull();
		AdcShiftException exception = new AdcShiftException();
		exception.setFtriggerflag(0);
		adcShiftExceptionMapper.updateByExampleSelective(exception, example);
	}
}
