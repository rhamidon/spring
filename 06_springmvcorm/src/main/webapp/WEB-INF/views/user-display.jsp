<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Users</title>
</head>
<body>
	<h2>All Users</h2>
	<table border="1">
	<tr>
		<td>ID</td>
		<td>Name</td>
		<td>Email</td>
	</tr>
	<c:forEach var="u" items="${users }">
		<tr>
			<td>${u.id }</td>
			<td>${u.name }</td>
			<td>${u.email }</td>
		</tr>
	</c:forEach>
	</table>
	
	<br/>
	<a href="./../">Home</a>
</body>
</html>