<%@page import="cn.itcast.vo.Dept"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试session域对象中的JavaBean的监听器HttpSessionActivationListener</title>
</head>
<body>

<%
	Dept d = new Dept();
	d.setDno(10);
	d.setDname("小凤");
	
	session.setAttribute("d", d);
%>

${ d.dname }

</body>
</html>