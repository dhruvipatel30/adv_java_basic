package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecretCodeServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");		//read data
		
		HttpSession session =  request.getSession();		//get session
		
		session.setAttribute("secretCode", code);			//set session data
		
		response.sendRedirect("SHome.jsp");
	}

}
