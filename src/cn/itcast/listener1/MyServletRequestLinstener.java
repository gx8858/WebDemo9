package cn.itcast.listener1;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestLinstener implements ServletRequestListener{
	
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("requet��������...");
	}

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request������...");
	}

	

}
