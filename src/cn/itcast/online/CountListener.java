package cn.itcast.online;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 统计现在在线的人数ServletContextListener
 */
public class CountListener implements ServletContextListener{

	/**
	 * 初始化的操作   在ServletContext域中存入值
	 */
	public void contextInitialized(ServletContextEvent sce) {
		// 先获取ServletContext对象
		ServletContext c = sce.getServletContext();
		// 初始化
		c.setAttribute("count", 0);
		System.out.println("count初始化完成...");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
