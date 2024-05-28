package com.krishna;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
@WebFilter("/Login")
public class FiltClass implements Filter{


	public void destroy() {
		// TODO Auto-generated method stub
		 
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		String ab=(request.getParameter("Password"));
		PrintWriter out=response.getWriter();
		
		if(ab.length()>1) {
			chain.doFilter(request, response);		
		}
		else {
			out.print("invalid Password");
		}
	}

	
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
