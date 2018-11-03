package cn.itcast.vo;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

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
		System.out.println("ถÛปฏ");
	}
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("ป๎ปฏ");
	}
	
}
