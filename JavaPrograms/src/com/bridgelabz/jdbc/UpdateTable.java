package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class UpdateTable {

	public static void main(String[] args) {
		try {
		//load and register the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//establish the connection between java application and database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz","root","Nbd@43");
		//create the statement object
		Statement st=con.createStatement();
		//send and execute the query
		st.execute("update Student set name='nilesh'where rollno=1");
		System.out.println("record is updated");
		//close the connection
		con.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
