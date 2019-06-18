<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"isErrorPage="true"%>
<%@ page import="com.bridgelabz.DAO.DBConnection,java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to registration Database</h1>
<%
    try
    {
    	Class.forName("com.mysql.jdbc.Driver");
		//establish the connection between java application and database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bridgelabz","root","Nbd@43");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from registration;");
    %><table border=1 align=center style="text-align: center">
        <%while(rs.next())
        {
            %>
            <tr>
                <td><%out.print(rs.getString(1));%></td>
                <td><%out.print(rs.getString(2));%></td>
                <td><%out.print(rs.getString(3));%></td>
                <td><%out.print(rs.getInt(4));%></td>
                <td><%out.print(rs.getString(5));%></td>
                <td><%out.print(rs.getString(6));%></td>
                
            </tr>
            <%
        }%>
        </table><br>
    <%}
    catch(SQLException e){
        out.print(e.getMessage());%><br><%
    }
    %>
</body>
</html>