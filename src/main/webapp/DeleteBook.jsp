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
String mg=(String)request.getAttribute("msg");
out.println(mg);
%>

<a href="ViewData.jsp">Back</a>
</body>
</html>