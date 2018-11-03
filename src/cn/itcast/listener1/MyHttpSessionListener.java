package cn.itcast.listener1;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 域对象的创建和销毁的监听器ServletContextListener
 */
public class MyHttpSessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("session被创建了...");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("session被销毁了...");
	}

}
