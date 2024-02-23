<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Number A : <%= request.getAttribute("aValue") %><br><br>
	Number B : <%= request.getAttribute("bValue") %><br><br>
	Result : <%= request.getAttribute("result") %>
</body>
</html>