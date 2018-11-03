package cn.itcast.listener1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener{
	
	/**
	 * ServletContext����һ���¼����󣬴��ݸ�MyServletContextListener
	 * ͨ���¼�����ServletContext
	 */
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext�Ѿ���������...");
		/**
		 * ��ʼ���Ĺ���
		 */
		ServletContext c = sce.getServletContext();
		// ��ȡ����Ŀ�������浽ServletContext�������
		
		// ��ȡ��ʼ������
		String value = c.getInitParameter("project");
		
		c.setAttribute("project", value);
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext�Ѿ���������...");
	}

}
