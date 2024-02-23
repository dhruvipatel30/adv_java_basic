<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Hi....
	
	<br>
	
	<!-- scriptlet -->
	<% 
		String str = "Hello , how are you";
		Date d = new Date();
	%>

	<!-- expression -->
	<%= str %>
	<br>
	<%= d %>
	<br>
</body>
</html>