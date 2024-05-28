package com.krishna.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;

public class LoginCheck {
	public boolean check(String uname,String pass) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","KrishnaMySQL@5317");
	String query="select * from login where uname=? and pass=?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,uname);
		ps.setString(2,pass);
		ResultSet eq = ps.executeQuery();
		if(eq.next()) {
			return true;
		}
	return false;
	}
	

}
