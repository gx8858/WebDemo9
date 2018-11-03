package cn.itcast.vo;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * session域对象中的JavaBean的监听器HttpSessionActivationListener
 */
public class Dept implements HttpSessionActivationListener,Serializable{
	
	private int dno;
	private String dname;
	
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("钝化");
	}
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("活化");
	}
	
}
