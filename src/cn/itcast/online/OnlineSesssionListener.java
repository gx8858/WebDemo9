package cn.itcast.online;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 统计现在在线的人数HttpSessionListener
 */
public class OnlineSesssionListener implements HttpSessionListener{

	/**
	 * 只要一访问demo1.jsp，默认给你创建一个session.只要session一创建，下面该方法就执行。
	 * 从servletContext中获取count值，count++，再存入进去
	 * @param se
	 */
	public void sessionCreated(HttpSessionEvent se) {
		// 获取ServletContext对象
		HttpSession session = se.getSession();
		ServletContext c = session.getServletContext();
		// 获取count值
		int count = (Integer) c.getAttribute("count");
		count++;
		c.setAttribute("count", count);
		System.out.println("有人来敲门...");
	}

	/**
	 * 只要session一销毁，该方法默认执行，从servletContext中获取count值，count--，再存入进去
	 * @param se
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		ServletContext c = session.getServletContext();
		// 获取count值
		int count = (Integer) c.getAttribute("count");
		count--;
		c.setAttribute("count", count);
		System.out.println("有人翻滚了...");
	}

}
