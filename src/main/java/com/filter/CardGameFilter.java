package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/CardServlet")
public class CardGameFilter implements Filter{

	public void destroy() {
		System.out.println("destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String check = "[0-9]+";
		boolean isError = false;
		
		if(a==null || a.trim().length() == 0) {
			request.setAttribute("aError", "Please enter value of a");
			request.setAttribute("bValue", b);
			isError = true;
		}else if(a.matches(check) == false) {
			request.setAttribute("aError", "Please enter numeric value of a");
			request.setAttribute("aValue", a);
			request.setAttribute("bValue", b);
			isError = true;
		}
		if(b==null || b.trim().length() == 0) {
			request.setAttribute("bError", "Please enter value of b");
			request.setAttribute("aValue", a);
			isError = true;
		}else if(b.matches(check) == false) {
			request.setAttribute("bError", "Please enter numeric value of b");
			request.setAttribute("bValue", b);
			request.setAttribute("aValue", a);
			isError = true;
		}
		
		if(isError) {
			RequestDispatcher rd = request.getRequestDispatcher("InputCard.jsp");
			rd.forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init");
	}

}
