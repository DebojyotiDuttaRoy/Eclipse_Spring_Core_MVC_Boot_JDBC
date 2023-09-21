<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Panel</title>
</head>
<body>
	<div>
		<h1 align="center">This is a user home page</h1>
		<div align="center">
<!-- 	<br>User Name : ${uname}
			<br>User Password : ${upass}
			<br>User Name : ${user.userName}
			<br>User Password : ${user.userPassword}	 -->
			<br>User Name : ${objUser.userName}
			<br>User Password : ${objUser.userPassword}			
		</div>
	</div>
</body>
</html>