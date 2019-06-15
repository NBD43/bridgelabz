package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTableDemo {

	public static void main(String[] args) throws Exception {
		try {
			//load and register  the driver class
			Class.forName("com.mysql.jdbc.Driver");
			//Establish the connection  between java Application and database.
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz","root","Nbd@43");
			//create the statement object
			Statement st=con.createStatement();
			//send and execute sql query
			st.execute("drop table Student1");
			System.out.println("Table has been deleted");
			//close the connection
			con.close();
		}catch(Exception e) {
			System.out.println("Table is not present in database");
		}

	}

}
