package com.controller;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response){
		//System.out.println("In the servlet");
		
		// user input -> request
		String firstName = request.getParameter("firstname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println("firstName : "+ firstName);
		System.out.println("email : "+ email);
		System.out.println("password : "+ password);
		
		try {
			PrintWriter out = response.getWriter();
			
			response.setContentType("text/html");// this will inform your client/ browser that i am sending an html page 
			
			// out.print("<html><body>hello");
			
			out.print("<br>firstname :"+firstName);
			out.print("<br>email :"+email);
			out.print("<br>password :"+password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


/*
Take two numbers from user 
Input.html

One user press submit perform addition and print addition on next page
*/