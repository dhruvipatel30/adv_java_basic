package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CardServlet")
public class CardServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		
		
		if(a > b) {
			req.setAttribute("result", "A is Winner");
		}else if(b > a) {
			req.setAttribute("result", "B is Winner");
		}else {
			req.setAttribute("result", "Battle Draw");
		}
		
		req.setAttribute("aValue", a);
		req.setAttribute("bValue", b);
		
		RequestDispatcher rd = req.getRequestDispatcher("BattleResult.jsp");
		rd.forward(req, res);
	}
}
