<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charSet="ISO-8859-1">
<title>Login</title>
	<style>
		#box{
				background:#497f98;
			    margin: 50px auto;
			    width: 40%;		
			    text-align: center;
			    border-radius:10px;
		}
		#heading{
			    color: #fff;
			    font-weight: bold;
			    font-size: 20pt;
			    background:#00adff91;
			    padding: 6px;
			    border-radius:10px;
		}		
	</style>
</head>
<body>
	<div id="box">
			<div style="font-family:sans-serif" id="heading">Login page</div><br/>
		<div>
			<h1>${name}, ${msg}</h1><br>
			<h2>${email}</h2><br>
			${password}
		</div>
	</div>
	<!-- <h1>Login page</h1> -->
	<br><a href="/insta/home">Home Link</a>
	<br><a href="/insta/registration">Registration Link</a>
</body>
</html>