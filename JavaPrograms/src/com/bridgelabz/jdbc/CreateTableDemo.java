package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args) throws Exception {
		try {
		String sqlQuery="create table Student1(rollno int(5) primary key,name varchar(20),Address varchar(20),MobileNo int(10))";
		//load and register the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//Establish the connection between the java Application and Database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz","root","Nbd@43");
		
		
		//create the statement object
		Statement st=con.createStatement();
		//send and execute sql query
		st.executeUpdate(sqlQuery);
		System.out.println("Table created in database");
		
		//close Connection
		con.close();
		}catch(Exception e){ 
			System.out.println("table is already exits");
			
		}

	}

}
