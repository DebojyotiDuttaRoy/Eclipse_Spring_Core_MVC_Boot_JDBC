<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
	<style>
		#box{
				background:#497f98;
			    margin: 50px auto;
			    width: 40%;		
			    text-align: center;
			    border-radius:10px;
		}
		#formTitle{
			    color: #fff;
			    font-weight: bold;
			    font-size: 20pt;
			    background:#00adff91;
			    padding: 6px;
			    border-radius:10px;
		}
		.inputBox{
			border-radius: 2px;
		    border: none;
		    width: 45%;
		    height: 25px;
		}
	</style>
</head>
<body>
	<div id="box">
	<div style="font-family:sans-serif" id="formTitle">Registration Form</div><br/>
		<!-- <form action="userDetail"> -->
		<form action="userDetails">
			User Name : <input id="UName" name="UName"class="inputBox"/><br><br>
			Email ID : <input id="EmailId" name="EmailId"class="inputBox"/><br><br>
			Password : <input type="password" id="Password" name="Password"class="inputBox"/><br><br>
			Gender : <input type="radio" name="Gender" value="Male" checked="checked"/>Male<input type="radio" name="Gender" value="Female"/>Female<br>
			Hobby : <input type="checkbox" name="Hobby" value="Dancing"/>Dancing<input type="checkbox" name="Hobby" value="Singing"/>Singing<br><br>
			<input type="submit" value="Register Now"/><br><br>
			<p>. . .</p>
		</form>
	</div>
</body>
</html>