<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
	<h2>User Registration</h2>
	<form action="processRegister" method="post">
		Id: <input type="text" name="id">
		<br/>
		Name: <input type="text" name="name">
		<br/>
		Email: <input type="email" name="email">
		<br/>
		<input type="submit" value="Register">
	</form>
	
	<br/> ${result }
</body>
</html>