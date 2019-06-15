package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcMsqlConnection {
	public static void main(String []args) {
		try {
			
		//load and register the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//Establish the connection between java Application and Database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz","root","Nbd@43");
		if(con!=null) {
			System.out.println("database connection established");
		}else {
			System.out.println("database connection not establised");
		}
		}
		catch(Exception e) {
			System.out.println("class not loaded and register");
		}
	}

}
