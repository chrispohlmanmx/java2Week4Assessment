<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Number's Added</title>
</head>
<body>
	<p>Number 1 is: ${userSum.getNum1()} <br />
	Number 2 is: ${userSum.getNum2()} <br />
	Number 3 is: ${userSum.getNum3()} <br />
	And the sum is: ${userSum.getSum()} <br />
	</p>
	<a href="index.jsp">Home</a>
	<a href="multiplyForm.jsp">Multiply Numbers</a>
</body>
</html>