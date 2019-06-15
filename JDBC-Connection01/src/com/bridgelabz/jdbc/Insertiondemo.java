package com.bridgelabz.jdbc;
import java.sql.*;
import java.util.Scanner;
public class Insertiondemo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		try {
			System.out.println("Enter the rollno:");
			int roll=scn.nextInt();
			System.out.println("Enter the name:");
			String name=scn.next();
			System.out.println("Enter the address:");
			String addr=scn.next();
			System.out.println("Enter the Mobile No:");
			int mbno=scn.nextInt();
			//String query="insert into Student values(%d%s%s%d)";
			String query=String.format("insert into Student values(%d,'%s','%s',%d)",roll,name,addr,mbno);
			//load and register the driver class
			Class.forName("com.mysql.jdbc.Driver");
			//establish the connection between java Application and database.
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz","root","Nbd@43");
			//create statement object
			Statement st=con.createStatement();
			//send and execute query
			st.executeUpdate(query);
			System.out.println("Record is Inserted in Tables");
			//close the Connection
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
