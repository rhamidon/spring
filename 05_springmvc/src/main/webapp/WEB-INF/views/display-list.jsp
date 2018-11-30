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
	<%
		List<Employee> emplist = (List<Employee>) request.getAttribute("employee-list");
		out.println("<ul>");
		for (Employee e : emplist)
			out.println("<li>" + e + "</li>");
		out.println("</ul>");
	%>
</body>
</html>