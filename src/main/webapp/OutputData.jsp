<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Output Data</h2>
	<%
		String firstName = (String)request.getAttribute("fn");
		String dob = (String)request.getAttribute("db");
		String gender= (String)request.getAttribute("gn");
	%>
	
	First Name : <%= firstName %><br>
	DOB : <%= dob %><br>
	Gender : <%= gender %><br>
</body>
</html>