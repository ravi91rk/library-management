<%@page import="com.hotal.AdminBean"%>
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
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("Welcome to"+ab.getName());
%>
<a href="AddBook.jsp"><button>Add Book</button></a>
<a href="AddStudent.jsp"><button>Add Student</button></a>
<a href="ViewBookDetails"><button>ViewAllBook</button></a>
</body>
</html>