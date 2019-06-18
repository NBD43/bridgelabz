package com.bridgelabz.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bridgelabz.DAO.DBConnection;

@WebServlet("/MailSend")
public class MailSend extends HttpServlet {
	private static String Email;
	static Mailer mailer = new Mailer();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		 Email = request.getParameter("emailId");
		//String submitType = request.getParameter("submit");
		System.out.println(Email);
	
			
		//	request.setAttribute("Successmessage", "Registration done please continue with login");
		boolean check = checkEmail(Email);
		if(check == true)
		{
			System.out.println("Email verified");
			request.getRequestDispatcher("input.html").forward(request, response);
			System.out.println("reg successfully");
			
		}
		else
		{
			System.out.println("not verified");
			request.getRequestDispatcher("forgetPword.jsp").forward(request, response);
		}
//			request.getRequestDispatcher("input.html").forward(request, response);
//			System.out.println("reg successfully");
		
	}
	
	public static boolean checkEmail(String email) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement("select * from Registration  where emailId=?");
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				Mailer.send(email, "validation mail", "http://localhost:8080/LoginJspServlet/changePword.jsp");
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			
				//Mailer.send(email, "validation mail", "http://localhost:8080/LoginJspServlet/changePword.jsp");
				rs.close();
				ps.close();
				//conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public static String getUserMail() {
		return Email;
	}
	
	
}
