package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegiServlet")
public class RegiServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String fname = request.getParameter("fname");
		String email = request.getParameter("email"); 
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String abtself = request.getParameter("abtself");
		
		String alphaRegEx = "[a-zA-Z]+";
		String emailREgEx = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,5}";
		String passwordRegEx = "[[a-z]+[A-Z]+[0-9]+[#$%^&*?_+]+]{8,}";
		
		boolean isError= false;
		
		if(fname == null || fname.trim().length() == 0) {
			request.setAttribute("firstNameError", "Please Enter first name");
			isError = true;
		}else if(fname.matches(alphaRegEx) == false) {
			isError = true;
			request.setAttribute("firstNameError", "Please enter valid firstname");
			request.setAttribute("firstNameValue", fname);
		}else {
			request.setAttribute("firstNameValue", fname);
		}
		
		if(email == null || email.trim().length() == 0) {
			request.setAttribute("emailError", "Please Enter email");
			isError = true;
		}else if(!email.matches(emailREgEx)) {
			isError = true;
			request.setAttribute("emailError", "Please Enter valid email");
			request.setAttribute("emailValue", email);
		}else {
			request.setAttribute("emailValue", email);
		}
		
		if(password == null || password.trim().length() == 0) {
			request.setAttribute("passwordError", "Please Enter password");
			isError = true;
		}else if(!password.matches(passwordRegEx)) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter min 1 upper, lower, digit, special character and min length is 8");
		}
		
		if(gender == null) {
			request.setAttribute("genderError", "Please Enter gender");
			isError = true;
		}else {
			request.setAttribute("genderValue", gender);
		}
		
		if(city == null || city.equals("-1")) {
			request.setAttribute("cityError", "Please Enter city");
			isError = true;
		}else {
			request.setAttribute("cityValue", city);
		}
		
		if(abtself == null || abtself.trim().length() == 0) {
			request.setAttribute("abtSelfError", "Please Enter about yourself");
			isError = true;
		}else {
			request.setAttribute("abtSelfValue", abtself);
		}
		
		RequestDispatcher rd = null;
		if(isError) {
			rd = request.getRequestDispatcher("Registration.jsp");	
		}else {
			request.setAttribute("firstNameValue", fname);
			request.setAttribute("emailValue", email);
			request.setAttribute("passwordValue", password);
			request.setAttribute("genderValue", gender);
			request.setAttribute("cityValue", city);
			request.setAttribute("abtSelfValue", abtself);
			rd = request.getRequestDispatcher("Home.jsp");
		}
		
		rd.forward(request, response);
	}
}