<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<form action="reg" method="post">
		<fieldset>
 		 <legend><h1>Registration Form</h1></legend>
			firstName:<input type="text" name="firstName"><br>
			lastName:<input type="text"	name="lastName"><br>
			Address:<input type="text"	name="address"><br>
			phoneNo:<input type="number"	name="phoneNo" pattern="^\d{10}$" required><br>
			emailId:<input type="text"	name="emailId" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"><br>
			passWord:<input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
									title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"><br>
			Re-Password:<input type="password"	name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
									title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"><br>
			
			<input type="submit" value="Register">| 
			<a href="login.jsp">SignIn</a> 
		</fieldset>
		</form>

</body>
</html>