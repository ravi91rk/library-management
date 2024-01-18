<%@page import="com.hotal.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
StudentBean sb=(StudentBean)session.getAttribute("SBean");
out.print("Welcome to "+sb.getName());

%>
</body>
</html>