<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ForgotPassword" method="post">
		<center><fieldset>
 		 <legend><h1>ChangePassword </h1></legend>
 		
 		 New Password:<input type="password" name="password"pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
									title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"><br>
 		 Re-Password:<input type="password"	name="passwords"pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
									title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"><br>
 		 <input type="submit" value="Submit">|
 		 </fieldset></center>

</body>
</html>