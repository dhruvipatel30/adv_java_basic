<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="DataServlet" method="post">
	First Name : <input type="text" name="firstName"> <br><br>
	DOB : <input type="date" name="dob"> <br><br>
	Gender : 
		Male : <input type="radio" name="gender" value="male">
		Female : <input type="radio" name="gender" value="female"> <br><br>
	<input type="submit" value="Sign Up">
</form>

</body>
</html>