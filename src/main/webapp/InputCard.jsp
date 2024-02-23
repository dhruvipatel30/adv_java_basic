<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Card Game</h1>
	<form action="CardServlet">
		Enter number A : <input type="text" name="a" value= "${aValue}"> 
		<font color="red"> ${aError} </font> <br><br>
		Enter number B : <input type="text" name="b" value= "${bValue}">
		 <font color="red">  ${bError} </font> <br><br>
		<input type="submit" value="Battle">
	</form>
</body>
</html>