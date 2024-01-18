<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="AddBook" method="post">
        <table>
            <h1>Add Book In Libary</h1>
            <tr>
                <td><label >Book Name</label></td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td><label >BookId </label></td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td><label >TypeOfBook</label></td>
                <td><input type="text" name="type"></td>
            </tr>
            <tr>
                <td><label >RackNumber</label></td>
                <td><input type="number" name="rack"></td>
            </tr>
            <tr>
                <td><button>Submit</button></td>
            </tr>
        </table>
    </form>
    <a href="ViewData.jsp">Back</a>
   
</body>
</html>