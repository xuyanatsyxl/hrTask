package org.infotechdept.hr.system;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SPRING的BEAN装载器
 * @author xuyan
 *
 */
public class SpringBeanLoader {

	private static Log log = LogFactory.getLog(SpringBeanLoader.class);
	private static ApplicationContext applicationContext;
	
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static void setApplicationContext(ApplicationContext applicationContext) {
		SpringBeanLoader.applicationContext = applicationContext;
	}
	
	static {
		try {
			initApplicationContext();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 初始化ApplicationContext对象
	 * @throws Exception 
	 */
	private static void initApplicationContext() throws Exception {
		try {
			applicationContext = new ClassPathXmlApplicationContext(new String[] { "config\\applicationContext.xml" });
		} catch (Exception e) {
			log.error("Spring初始化失败.");
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 获取一个SpringBean服务
	 * 
	 * @param pBeanId
	 *            Spring配置文件名中配置的SpringID号
	 * @return Object 返回的SpringBean实例
	 */
	public static Object getBean(String beanName){
		Object springBean = null;
		try{
			springBean = applicationContext.getBean(beanName);
		}catch(NoSuchBeanDefinitionException e){
			
		}
		return springBean;
	}
}
