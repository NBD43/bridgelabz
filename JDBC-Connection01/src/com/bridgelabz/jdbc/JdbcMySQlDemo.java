package com.bridgelabz.jdbc;

import java.sql.*;
import java.sql.DriverManager;

public class JdbcMySQlDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz","root","Nbd@43");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Student");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"\t "+rs.getString(3)+"\t "+rs.getInt(4));
		}
		con.close();

	}

}
