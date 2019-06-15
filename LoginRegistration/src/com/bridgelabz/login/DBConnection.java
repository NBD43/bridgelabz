package com.bridgelabz.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;




public class DBConnection {
	private static Connection con;
	
	private DBConnection(){
		
	}
	
	static {
		try {
			//load and register class driver
			Class.forName("com.mysql.jdbc.Driver");
			//establish the connection between java application and database
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz","root","Nbd@43");
			
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
			System.out.println("in getconnection");
		return con;
	}

}
