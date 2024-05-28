package com.krishna;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void service (HttpServletRequest req,HttpServletResponse res) throws IOException {
		int a = (int)req.getAttribute("c");
		int b=a*a;
		PrintWriter writer = res.getWriter();
		writer.print("hello sq"+" "+b);
	}

}
