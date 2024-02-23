package com.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class signupServlet extends HttpServlet{

	// public or protected
	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside signup servlet");
	}
	
}

/*
create servlet ->
1) class -> extends HttpServlet
2) service(request,response) -> Logic 
3) @WebServlet("/SignupServlet")

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet{

//override 
public void service(HttpServletRequest request,HttpServletResponse response) {
	//logic 

	System.out.println("hey I am inside Signup Servlet");
}


}
*/