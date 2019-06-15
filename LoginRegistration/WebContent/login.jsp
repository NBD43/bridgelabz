<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
                                <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>Login Page</title>
	</head>

	<body><center>
		<form action="log" method="post">
		<fieldset>
 		 <legend><h1>Log-In</h1></legend>
		

			userName:<input type="text"	name="emailId" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"><br>
			passWord:<input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
									title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"><br>
			
			<input type="submit" value="Log in"><a href="forgetPword.jsp">forgetPassword</a>| 
			<a href="registration.jsp">NewUser</a> 
		
		</form></center>
		</fieldset>
	</body>
</html>