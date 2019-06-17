<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="logout" method="post">
		<fieldset>
 		 <legend><h1>Log-In</h1></legend>
		
<% if (session.getAttribute("firstName")==null){
	response.sendRedirect("login.jsp");
	}
%>
welcome ${firstName}
<input type="submit" value="Logout">
</form></center>
		</fieldset>
</body>
</html>