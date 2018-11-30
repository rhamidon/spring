<%@page import="com.riyaz.spring.springmvc.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
	<h1>Employee List</h1>
	<ul>
	<c:forEach var="emp" items="${employees }">
		<li>${emp }</li>
	</c:forEach>
	</ul>
</body>
</html>