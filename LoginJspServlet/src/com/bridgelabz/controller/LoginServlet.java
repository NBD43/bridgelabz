package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bridgelabz.DAO.DBConnection;



/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	public Connection con;
       
    
	@Override
    public void init()throws ServletException{
	   con=DBConnection.getConnection();
		
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		try {
			String query="select * from Registration where emailId=? and password=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, emailId);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				HttpSession hs=request.getSession();
				hs.setAttribute("firstName", rs.getString(1));
				//pw.println("welcome :"+rs.getString(1));
				RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}else {
				pw.println("Invalid EmailId and Password");
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		}catch(Exception e) {}
	}

}
