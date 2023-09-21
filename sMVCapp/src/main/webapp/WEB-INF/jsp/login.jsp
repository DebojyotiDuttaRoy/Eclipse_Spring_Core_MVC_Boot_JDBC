<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet"/>
<link href='<spring:url value="/resources/css/bootstrap.min.css"/>' rel="stylesheet"/>
</head>
<body>
	<!-- Hello Login Page !!
		<form action="Login-panel">
			<div>
			<h1 align="center">Login Here . . .</h1>
				<div align="center">
					<input type="text" name="userName" class="txt"/><br>
					<input type="password" name="userPassword" class="txt"/><br>
					<input type="submit" value="Login"/>
				</div>
			</div>
		</form>		 -->
<div style="margin: 150px auto">
	<form:form action="Login-panel" modelAttribute="objUser">
			<h1 align="center">Login Here . . .</h1>
			<div id="box"  align="center">
				<form:input path="userName" class="form-control"/><br>
				<form:input type="password" path="userPassword" class="form-control"/><br>
				<input type="submit" value="Login" name="action" class="btn btn-info login"/>
				<input type="submit" value="Register Now" name="action" class="btn btn-info login"/>
			</div>
	</form:form>
	<h2>${msg}</h2>
</div>
</body>
</html>