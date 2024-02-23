<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="InputCookieServlet" method="post">
		Cookie Name  : <input type="text" name="cName"> <br><br>
		Cookie Value : <input type="text" name="cValue"> <br><br>
		
		<input type="submit" value="Add cookie">
	</form>
	<br><br>
	<a href="PrintAllCookie.jsp">All Cookie</a>
</body>
</html>