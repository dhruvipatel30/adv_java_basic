package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String address = request.getParameter("address");
		String hobby[] = request.getParameterValues("hobby");
		
		//print
		PrintWriter out = response.getWriter();
		out.print("<html><body style='background-color: pink;'>");
		
		out.print("First name : "+firstName);
		out.print("<br><br>Email : "+email);
		out.print("<br><br>Password : "+password);
		out.print("<br><br>Gender : "+gender);
		out.print("<br><br>City : "+city);
		out.print("<br><br>Address : "+address);
		out.print("<br><br>Hobby :");
		for(int i=0; i<hobby.length; i++) {
			out.print("\t\t"+hobby[i]);
		}
		
		out.print("</body></html>");
	}
}