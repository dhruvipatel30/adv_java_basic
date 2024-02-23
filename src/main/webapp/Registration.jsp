<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  
	<%/*
	String x = " ";
	String y = " ";
	String z = " ";
	
	x = (String)request.getAttribute("fn");
	y = (String)request.getAttribute("em");
	z = (String)request.getAttribute("pd");*/
	%>
	
	<form action="RegiServlet" method="post">
		First Name : <input type="text" name="fname" value="${firstNameValue}">
		<font color="red"> ${ firstNameError }</font> 
		<br><br>
		Email : <input type="text" name="email" value="${emailValue}">
		<font color="red"> ${ emailError } </font>
		<br><br>
		Password : <input type="password" name="password">
		<font color="red">${ passwordError } </font>
		<br><br>
		
		Gender : 
			Male : <input type="radio" name="gender" value="male" ${genderValue == "male" ? 'checked' : ''}>
			Female : <input type="radio" name="gender" value="female" ${genderValue == "female" ? 'checked' : ''}> 
			<font color="red"> ${ genderError }</font>
			<br><br>
			
		City :
		<select name="city">
			<option value="-1"  ${cityValue.equals("-1") ? 'selected' : ''}>Select City</option>
			<option value="Surat" ${cityValue.equals("Surat") ? 'selected' : ''}>Surat</option>
			<option value="Bhuj" ${cityValue.equals("Bhuj") ? 'selected' : ''}>Bhuj</option>
			<option value="Delhi" ${cityValue.equals("Delhi") ? 'selected' : ''}>Delhi</option>
		</select>
		<font color="red"> ${ cityError }</font>
		<br><br>
		
		About Yourself :
		<textarea rows="4" cols="20" name="abtself"> ${abtSelfValue} </textarea>
		<font color="red"> ${ abtSelfError }</font> 
		<br><br>
		
		<input type="submit" value="Submit">
		
	</form>
</body>
</html>