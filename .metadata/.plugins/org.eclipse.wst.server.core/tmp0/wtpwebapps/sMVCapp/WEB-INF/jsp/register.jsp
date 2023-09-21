<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Registration Page</title>
		<link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
		<link href='<spring:url value="/resources/css/bootstrap.min.css"/>' rel="stylesheet" />
	</head>
	<body>
		<div class="row">
		<div class="col-sm-4"></div>		
			<div class="col-sm-4">
				<form:form action="RegPros" modelAttribute="objReg">
					<h1 align="center">User Registration</h1>
					<div class="form-group">
						<form:label path="name">Name</form:label>
						<form:input path="name"  class="form-control"/>
					</div>
					<div class="form-group">
						<form:label path="userName">User Name</form:label>					
						<form:input path="userName"  class="form-control"/>
					</div>					
					<div class="form-group">
						<form:label path="password">Password</form:label>
						<form:input  type="password" path="password"  class="form-control"/>
					</div>	
					<div class="form-group">
						<form:label path="countery">Countery</form:label>
						<form:select path="countery"  class="form-control">
							<form:option value="None" label="--Select--"/>
							<form:options items="${countryList}"/>
					<!--	<form:option value="US" label="USA"></form:option>
							<form:option value="IND" label="India"></form:option>
							<form:option value="CHN" label="China"></form:option>
							<form:option value="SIN" label="Singapore"></form:option>	-->
						</form:select>
					</div>		
					<br>		
					<div class="form-group">
						<form:label path="gender">Gender </form:label>
						<form:radiobutton path="gender" value="M" label="Male" />
						<form:radiobutton path="gender" value="F" label="Female" />
						<form:radiobutton path="gender" value="O" label="Others" />
					</div>							
					<br>
					<div class="form-group">
						<input type="submit" value="Register Now" class="form-control btn btn-info"/>
					</div>							
				</form:form>
				<h2>${objReg.msgReg}</h2>
			</div>
			<div class="col-sm-4"></div>
		</div>
	</body>
</html>