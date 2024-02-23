<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2px solid black">
		<tr>
			<th>Key</th>
			<th>Value</th>
		</tr>
		
	<%
		Cookie c[] = request.getCookies();
	
		for(Cookie x : c){
	%>
			<tr><td> <%= x.getName()  %></td><td><%= x.getValue() %></td></tr>
	<%
		}
	%>
	
	</table>
	<br><br>
	
	<a href="InputCookieData.jsp">Add Cookie</a>
	
</body>
</html>