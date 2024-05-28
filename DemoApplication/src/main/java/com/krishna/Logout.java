package com.krishna;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Logout")
public class Logout extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		HttpSession session=req.getSession();
		session.removeAttribute("Username");
		session.invalidate();
		res.sendRedirect("Login.jsp");
	}

}
