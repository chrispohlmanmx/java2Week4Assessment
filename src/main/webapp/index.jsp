<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Enter Your numbers!</h1>
	<form action="addNumbersServlet" method="post">
	Enter your numbers:
	<input type="text" name="num1" size="4">
	<input type="text" name="num2" size="4">
	<input type="text" name="num3" size="4">
	<input type="submit" value="Add numbers"/>
	</form>
	
	<a href="multiplyForm.jsp">Multiply Numbers</a>
</body>
</html>