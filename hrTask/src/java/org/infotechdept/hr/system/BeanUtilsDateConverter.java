package org.infotechdept.hr.system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.Converter;
import org.apache.commons.lang.time.DateUtils;

public class BeanUtilsDateConverter implements Converter {

	public Object convert(Class type, Object value) {
		if (value == null) {
			return null;
		}
		if (value instanceof Date) {
			return value;
		}
		if (value instanceof Long) {
			Long longValue = (Long) value;
			return new Date(longValue.longValue());
		}
		if (value instanceof String) {
			Date endTime = null;
			try {
				endTime = DateUtils.parseDate(value.toString(), new String[] {
						"yyyy-MM-dd HH:mm:ss.SSS", "yyyy-MM-dd HH:mm:ss",
						"yyyy-MM-dd HH:mm" });
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return endTime;
		}
		return null;
	}

}
