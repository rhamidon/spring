<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Result</title>
</head>
<body>
	User registered succesfully!!
	<br/>
	Data:
	 <ul>
	 	<li>Id: ${user.id }</li>
	 	<li>Name: ${user.name }</li>
	 	<li>Email: ${user.email }</li>
	 </ul>
</body>
</html>