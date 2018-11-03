package cn.itcast.listener2;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * 域对象属性的状态改变的监听器HttpSessionAttributeListener
 */
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("session域中存入属性了...");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("session域中移除属性了...");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("session域中替换属性了...");
	}

}
