package com.krishna;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.krishna.dao.LoginCheck;
@WebServlet("/Login")
public class AddServlet extends HttpServlet {
    public void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String username = (req.getParameter("Username"));
        String password = (req.getParameter("Password"));
        LoginCheck lc=new LoginCheck();
      
		
				try {
					if(lc.check(username, password)){
						HttpSession session=req.getSession();
						session.setAttribute("Username", username);
						res.sendRedirect("Welcome.jsp");
						
					}
					else {
						res.sendRedirect("Login.jsp");
					
}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    }
}




