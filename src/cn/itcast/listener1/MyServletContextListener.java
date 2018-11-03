package cn.itcast.listener1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener{
	
	/**
	 * ServletContext创建一个事件对象，传递给MyServletContextListener
	 * 通过事件对象ServletContext
	 */
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext已经被创建了...");
		/**
		 * 初始化的工作
		 */
		ServletContext c = sce.getServletContext();
		// 获取到项目名，保存到ServletContext域对象中
		
		// 获取初始化参数
		String value = c.getInitParameter("project");
		
		c.setAttribute("project", value);
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext已经被销毁了...");
	}

}
