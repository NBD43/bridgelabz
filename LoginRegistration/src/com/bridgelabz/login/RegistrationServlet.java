package com.bridgelabz.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistrationServlet extends HttpServlet{
public Connection connection;
public Registration register;
       
    
	@Override
    public void init()throws ServletException{
	   connection=DBConnection.getConnection();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		int phoneNo = Integer.parseInt(request.getParameter("phoneNo"));
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		try {
			String query="insert into Registration values(?,?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(query);
			 
			 ps.setString(1, firstName);
			 ps.setString(2, lastName);
			 ps.setString(3, address);
			 ps.setInt(4, phoneNo);
			 ps.setString(5, emailId);
			 ps.setString(6, password);
			  int k=ps.executeUpdate();
			  if(k>0) {
				  System.out.println("successfuly inserted");// execute it on test database
				  RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				   rd.forward(request, response);
				   
			  }
			  ps.close();
			  
				
			
			
		}catch(Exception e) { 
			//e.printStackTrace();
			
		}
		
		
	}

}
