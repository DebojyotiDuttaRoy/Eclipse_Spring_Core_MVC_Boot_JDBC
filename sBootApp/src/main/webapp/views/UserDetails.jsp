<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details Page</title>
</head>
<body>
	<h1>********** User Details **********</h1>
	<!-- <h1>${regObj}</h1> -->
	<br>User Name : ${regObj.name}<br>
	<br>Email ID : ${regObj.email}<br>
	<br>Password  : ${regObj.pass}<br>
	<br>Gender : ${regObj.gender}<br>
	<br>Hobby : ${regObj.hobby}<br>
</body>
</html>