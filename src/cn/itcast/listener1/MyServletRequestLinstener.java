package cn.itcast.listener1;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * 域对象的创建和销毁的监听器ServletRequestListener
 */
public class MyServletRequestLinstener implements ServletRequestListener{
	
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("requet被创建了...");
	}

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request被销毁...");
	}

	

}
