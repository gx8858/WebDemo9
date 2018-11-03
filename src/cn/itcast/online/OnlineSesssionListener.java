package cn.itcast.online;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * ͳ���������ߵ�����HttpSessionListener
 */
public class OnlineSesssionListener implements HttpSessionListener{

	/**
	 * ֻҪһ����demo1.jsp��Ĭ�ϸ��㴴��һ��session.ֻҪsessionһ����������÷�����ִ�С�
	 * ��servletContext�л�ȡcountֵ��count++���ٴ����ȥ
	 * @param se
	 */
	public void sessionCreated(HttpSessionEvent se) {
		// ��ȡServletContext����
		HttpSession session = se.getSession();
		ServletContext c = session.getServletContext();
		// ��ȡcountֵ
		int count = (Integer) c.getAttribute("count");
		count++;
		c.setAttribute("count", count);
		System.out.println("����������...");
	}

	/**
	 * ֻҪsessionһ���٣��÷���Ĭ��ִ�У���servletContext�л�ȡcountֵ��count--���ٴ����ȥ
	 * @param se
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		ServletContext c = session.getServletContext();
		// ��ȡcountֵ
		int count = (Integer) c.getAttribute("count");
		count--;
		c.setAttribute("count", count);
		System.out.println("���˷�����...");
	}

}
