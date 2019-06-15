package com.bridgelabz.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {
	
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
			String query="UPDATE Registration  SET password = ? WHERE emailId = ?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, password);
			ps.setString(2, emailId);
			
			int k=ps.executeUpdate();
			System.out.println("data updated successfully");
			 if(k>0) {
			  pw.println("successfuly inserted");// execute it on test database
			  RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			   rd.forward(request, response);
			   //pw.println("successfuly inserted");
		  }
		  ps.close();
		}catch(Exception e) {
			pw.println("Invalid EmailId and Password");
			RequestDispatcher rd=request.getRequestDispatcher("changePword.jsp");
			rd.include(request, response);
		}
	}

}
