<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="AddStudent" method="post">
        <table>
            <caption>Add Student</caption>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>UserName</td>
                <td><input type="text" name="uname" ></td>
            </tr>
            <tr>
                <td>PassWord</td>
                <td><input type="text" name="pword"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="addr"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <td>Mobile</td>
                <td><input type="number" name="phon"></td>
            </tr>
            <tr>
                <td><input type="submit" name="Submit"></td>
            </tr>
        </table>
    </form>
</body>
</html>