package cn.itcast.vo;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * session域对象中的JavaBean的监听器HttpSessionBindingListener
 */
public class User implements HttpSessionBindingListener{
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("我被绑定了...");
	}
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("我被松绑了...");
	}
	
}
