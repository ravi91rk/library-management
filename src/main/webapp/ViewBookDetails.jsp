<%@page import="java.util.Iterator"%>
<%@page import="com.hotal.AdminBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hotal.BookBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<Table>
<tr>
<th>Book Id</th>
<th>Book Name</th>
<th>Book Type</th>
<th>Book Rack </th>

</tr>
<%

AdminBean ab=(AdminBean)session.getAttribute("abean");
ArrayList<BookBean> al =(ArrayList<BookBean>)session.getAttribute("viewallbook");
out.println("Welcome to "+ab.getName());
if(al.size()==0){
	out.println("Product is not availeble...!");
}
else {
	Iterator <BookBean> itr=al.iterator();
	
	while(itr.hasNext()){
		BookBean bb=(BookBean)itr.next();
		%>
		<tr>
		<td><%=bb.getBookId() %></td><td><%=bb.getBookName() %></td>
		<td><%= bb.getTypeOfBook()%></td><td><%= bb.getRack()%></td>
		<td><a href="Edit.jsp" name ="bookId" value=<%=bb.getBookId() %>>Edit</a></td>
		<td><a href="Delete?bookId='<%=bb.getBookId() %>'">Delete</a></td>
		</tr>
        <% 		


	}
}


%>
</Table>
</body>
</html>