package org.infotechdept.hr.system;

import java.math.BigDecimal;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 常见的辅助类
 * 
 * @author xuyan
 * @since 2015-01-19
 */
public class HrUtils {

	private static Log log = LogFactory.getLog(HrUtils.class);

	/**
	 * 返回当前字符串型日期
	 * 
	 * @param format
	 *            格式规则
	 * 
	 * @return String 返回的字符串型日期
	 */
	public static String getCurDate(String format) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpledateformat = new SimpleDateFormat(format);
		String strDate = simpledateformat.format(calendar.getTime());
		return strDate;
	}

	/**
	 * 返回指定格式的字符型日期
	 * 
	 * @param date
	 * @param formatString
	 * @return
	 */
	public static String date2String(Date date, String formatString) {
		if (isEmpty(date)) {
			return null;
		}
		SimpleDateFormat simpledateformat = new SimpleDateFormat(formatString);
		String strDate = simpledateformat.format(date);
		return strDate;
	}

	/**
	 * 判断对象是否Empty(null或元素为0)<br>
	 * 实用于对如下对象做判断:String Collection及其子类 Map及其子类
	 * 
	 * @param pObj
	 *            待检查对象
	 * @return boolean 返回的布尔值
	 */
	public static boolean isEmpty(Object pObj) {
		if (pObj == null)
			return true;
		if (pObj == "")
			return true;
		if (pObj instanceof String) {
			if (((String) pObj).length() == 0) {
				return true;
			}
		} else if (pObj instanceof Collection) {
			if (((Collection) pObj).size() == 0) {
				return true;
			}
		} else if (pObj instanceof Map) {
			if (((Map) pObj).size() == 0) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 判断对象是否为NotEmpty(!null或元素>0)<br>
	 * 实用于对如下对象做判断:String Collection及其子类 Map及其子类
	 * 
	 * @param pObj
	 *            待检查对象
	 * @return boolean 返回的布尔值
	 */
	public static boolean isNotEmpty(Object pObj) {
		if (pObj == null)
			return false;
		if (pObj == "")
			return false;
		if (pObj instanceof String) {
			if (((String) pObj).length() == 0) {
				return false;
			}
		} else if (pObj instanceof Collection) {
			if (((Collection) pObj).size() == 0) {
				return false;
			}
		} else if (pObj instanceof Map) {
			if (((Map) pObj).size() == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 将字符串型日期转换为日期型
	 * 
	 * @param strDate
	 *            字符串型日期
	 * @param srcDateFormat
	 *            源日期格式
	 * @param dstDateFormat
	 *            目标日期格式
	 * @return Date 返回的util.Date型日期
	 */
	public static Date stringToDate(String strDate, String srcDateFormat, String dstDateFormat) {
		Date rtDate = null;
		Date tmpDate = (new SimpleDateFormat(srcDateFormat)).parse(strDate, new ParsePosition(0));
		String tmpString = null;
		if (tmpDate != null)
			tmpString = (new SimpleDateFormat(dstDateFormat)).format(tmpDate);
		if (tmpString != null)
			rtDate = (new SimpleDateFormat(dstDateFormat)).parse(tmpString, new ParsePosition(0));
		return rtDate;
	}

	public static Long stringDateToLong(String strDate) {
		Date tmpDate = stringToDate(strDate, "yyyy-MM-dd", "yyyy-MM-dd");
		String str = date2String(tmpDate, "yyyyMMdd");
		return new Long(str + "000000");

	}

	public static Long stringDateTimeToLong(String strDate) {
		System.out.println(strDate);
		Date tmpDate = stringToDate(strDate, "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
		String str = date2String(tmpDate, "yyyyMMddHHmmss");
		return new Long(str);

	}

	/**
	 * 返回当前日期时间字符串<br>
	 * 默认格式:yyyymmddhhmmss
	 * 
	 * @return String 返回当前字符串型日期时间
	 */
	public static Long getCurrentTimeAsLong() {
		String returnStr = null;
		SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		returnStr = f.format(date);
		return new Long(returnStr);
	}

	public static Long getCurrentDateAsLong() {
		String returnStr = null;
		SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		returnStr = f.format(date);
		return new Long(returnStr);
	}

	/**
	 * 根据所给的起止时间来计算间隔的小时数
	 * 
	 * @param startDate
	 *            起始时间
	 * @param endDate
	 *            结束时间
	 * @return int 返回间隔小时数
	 */
	public static float getIntervalHours(Date startDate, Date endDate) {
		long startdate = startDate.getTime();
		long enddate = endDate.getTime();
		long interval = enddate - startdate;
		float intervalhour = (float) (interval / (1000 * 60 * 60));
		return intervalhour;
	}

	/**
	 * 根据所给的起止时间来计算间隔的天数
	 * 
	 * @param startDate
	 *            起始时间
	 * @param endDate
	 *            结束时间
	 * @return int 返回间隔天数
	 */
	public static float getIntervalDays(Date startDate, Date endDate) {
		long startdate = startDate.getTime();
		long enddate = endDate.getTime();
		long interval = enddate - startdate;
		float intervalday = (float) (interval / (1000 * 60 * 60 * 24));
		return intervalday;
	}

	/**
	 * 根据所给的起止时间来计算间隔的月数
	 * 
	 * @param startDate
	 *            起始时间
	 * @param endDate
	 *            结束时间
	 * @return int 返回间隔月数
	 */
	public static int getIntervalMonths(Date startDate, Date endDate) {
		Calendar startCal = Calendar.getInstance();
		startCal.setTime(startDate);
		Calendar endCal = Calendar.getInstance();
		endCal.setTime(endDate);
		int startDateM = startCal.MONTH;
		int startDateY = startCal.YEAR;
		int enddatem = endCal.MONTH;
		int enddatey = endCal.YEAR;
		int interval = (enddatey * 12 + enddatem) - (startDateY * 12 + startDateM);
		return interval;
	}
	
	public static Date getDateTime(){
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	
	/**
	 * 合并日期和时间字符串
	 * @param dateStr
	 * @param timeStr
	 * @return
	 */
	public static Date mergeDate(Date tmpDate, String timeStr){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(tmpDate);
		String[] times = timeStr.split(":");
		calendar.set(Calendar.HOUR, Integer.valueOf(times[0]));
		calendar.set(Calendar.MINUTE, Integer.valueOf(times[1]));
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	/**
	 * 合并日期字符串和时间字符串
	 * @param pDate
	 * @param pTime
	 * @return
	 */
	public static Date mergeDate(String pDate, String pTime){
		String dateStr = pDate + " " + pTime + ":00";
		return HrUtils.stringToDate(dateStr, "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 获得指定日期相差指定数量的日期
	 * @param tmpDate
	 * @param interval
	 * @return
	 */
	public static Date getIntevalDay(Date tmpDate, int interval){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(tmpDate);
		calendar.add(Calendar.DAY_OF_MONTH, interval);
		return calendar.getTime();		
	}
	
	/**
	 * 判断一个浮点型是否带有小数
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isFloat(float num) {
		int fint = (int) num;
		BigDecimal b1 = new BigDecimal(Float.toString(num));
		BigDecimal b2 = new BigDecimal(Integer.toString(fint));
		b1 = b1.setScale(1, BigDecimal.ROUND_HALF_UP);
		float fPoint = b1.subtract(b2).floatValue();
		return (fPoint > 0);
	}
	
	/**
	 * 返回指定日期所在月份的开始日期和结束日期
	 * @param pDate
	 * @return
	 */
	public static Map getInMonthDate(Date pDate){
		Map<String, Date> dateMap = new HashMap<String, Date>();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH)); 
		dateMap.put("start_date", calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		dateMap.put("end_date", calendar.getTime());
		return dateMap;
	}
	
	/**
	 * Java对象之间属性值拷贝(Map、JavaBean)
	 * 
	 * @param pFromObj
	 *            Bean源对象
	 * @param pToObj
	 *            Bean目标对象
	 * @throws XLDException 
	 */
	public static void copyProperties(Object pFromObj, Object pToObj) throws Exception {
		if (pToObj != null) {
			try {
				// 支持属性空值复制
				BeanUtilsBean.getInstance().getConvertUtils().register(false, true, 0);
				// 日期类型复制
				BeanUtilsDateConverter converter = new BeanUtilsDateConverter();
				ConvertUtils.register(converter, java.util.Date.class);
				ConvertUtils.register(converter, java.sql.Date.class);
				BeanUtils.copyProperties(pToObj, pFromObj);
			} catch (Exception e) {
				throw new Exception("JavaBean之间的属性值拷贝发生错误", e);
			}
		}
	}

}
