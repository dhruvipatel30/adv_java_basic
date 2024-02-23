<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String fname = (String)request.getAttribute("firstNameValue");
		String email = (String)request.getAttribute("emailValue");
		String password = (String)request.getAttribute("passwordValue");
		String gender = (String)request.getAttribute("genderValue");
		String city = (String)request.getAttribute("cityValue");
		String abtself = (String)request.getAttribute("abtSelfValue");
	%>
	
	First Name : <%= fname %><br><br>
	Email      : <%= email %><br><br>
	Password   : <%= password %><br><br>
	Gender 	   : <%= gender %><br><br>
	City	   : <%= city %><br><br>
	About Self : <%= abtself %><br><br>
</body>
</html>