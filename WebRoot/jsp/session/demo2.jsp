<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试域对象属性的状态改变的监听器HttpSessionAttributeListener</title>
</head>
<body>

<%
	session.setAttribute("msg", "美美");
	
	session.setAttribute("msg", "小凤");
	
	session.removeAttribute("msg");
%>

</body>
</html>