<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="MailSend" method="post">
		<center><fieldset>
 		 <legend><h1>ForgetPassword </h1></legend>
 		 emailId:<input type="text"	name="emailId" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"><br>
 		 <input type="submit" value="Submit">|
 		 </fieldset></center>

</body>
</html>