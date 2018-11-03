package cn.itcast.online;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ͳ���������ߵ�����ServletContextListener
 */
public class CountListener implements ServletContextListener{

	/**
	 * ��ʼ���Ĳ���   ��ServletContext���д���ֵ
	 */
	public void contextInitialized(ServletContextEvent sce) {
		// �Ȼ�ȡServletContext����
		ServletContext c = sce.getServletContext();
		// ��ʼ��
		c.setAttribute("count", 0);
		System.out.println("count��ʼ�����...");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
