package cn.itcast.listener2;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * ��������Ե�״̬�ı�ļ�����HttpSessionAttributeListener
 */
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("session���д���������...");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("session�����Ƴ�������...");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("session�����滻������...");
	}

}
