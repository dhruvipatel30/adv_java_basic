package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataServlet")
public class DataServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read
		String firstName = request.getParameter("firstName");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		
		request.setAttribute("fn", firstName);
		request.setAttribute("db", dob);
		request.setAttribute("gn", gender);
				
		RequestDispatcher rd = request.getRequestDispatcher("OutputData.jsp");
		rd.forward(request, response);
	}
}