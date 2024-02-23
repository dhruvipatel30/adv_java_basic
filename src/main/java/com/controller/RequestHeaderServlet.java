package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHeaderServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Enumeration<String> requestHeader = request.getHeaderNames();
		
		request.setAttribute("requestHeader", requestHeader);
		
		request.getRequestDispatcher("RequestHeader.jsp").forward(request, response);
	}

}
