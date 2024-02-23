package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		String a = request.getParameter("num1");
		String b = request.getParameter("num2");
		int check = 0, counter = 0;
		
		if(a == null || a.trim().length() == 0 || a == "") {
			check = 1;
			counter++;
		}
		if(b == null || b.trim().length() == 0 || b == "") {
			check = -1;
			counter++;
		}
		
		if(check == 0) {
			int n1 = Integer.parseInt(request.getParameter("num1").trim());
			int n2 = Integer.parseInt(request.getParameter("num2").trim());
			String operator = request.getParameter("operator");
			System.out.println(operator);
			
			try {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				if("add".equals(operator)){
					int ans = n1 + n2;
					out.write("<p style='color:green'>Addition of "+n1+" and "+n2+" = "+ans+"</p>");
				}else if("sub".equals(operator)) {
					int ans = n1 - n2;
					out.write("<p style='color:green'>Suntraction of "+n1+" and "+n2+" = "+ans+"</p>");
				}else if("mul".equals(operator)) {
					int ans = n1 * n2;
					out.write("<p style='color:green'>Multiplication of "+n1+" and "+n2+" = "+ans+"</p>");
				}else if("div".equals(operator)) {
					float ans =(float) n1 / n2;
					out.write("<p style='color:green'>Division of "+n1+" and "+n2+" = "+ans+"</p>");
				}else if("mod".equals(operator)) {
					int ans = n1 % n2;
					out.write("<p style='color:green'>Modulo of "+n1+" and "+n2+" = "+ans+"</p>");
				}
				}catch(Exception e) {
					e.printStackTrace();
			}
		}
		/*
		else if(check == 1){
			try {
				PrintWriter out = response.getWriter();
				out.print("<p style='color:red'>Please enter num 1</p>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(check == -1){
			try {
				PrintWriter out = response.getWriter();
				out.print("<p style='color:red'>Please enter num 2</p>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			try {
//				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
//				out.write("Please add proper operand");
				out.print("<p style='color:red'>Please enter proper operand</p>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		else if(counter == 1 && check == 1){
			try {
				PrintWriter out = response.getWriter();
				out.print("<p style='color:red'>Please enter num 1</p>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(counter == 1 && check == -1){
			try {
				PrintWriter out = response.getWriter();
				out.print("<p style='color:red'>Please enter num 2</p>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(counter == 2){
			try {
				PrintWriter out = response.getWriter();
				out.print("<p style='color:red'>Please enter num 1 and num 2</p>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}