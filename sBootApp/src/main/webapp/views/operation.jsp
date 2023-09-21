<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Operations Form</title>
<style>
#box {
	background: #497f98;
	margin: 50px auto;
	width: 40%;
	text-align: center;
	border-radius: 10px;
}

#formTitle {
	color: #fff;
	font-weight: bold;
	font-size: 20pt;
	background: #00adff91;
	padding: 6px;
	border-radius: 10px;
}

.inputBox {
	border-radius: 2px;
	border: none;
	width: 45%;
	height: 25px;
}
</style>
<script src="jquery-3.3.1.min.js"></script>

<script>
var data;
	$(document).ready(function(){
		$('#btnClick').click(function(){
			$.ajax({
				url:"getUserById/"+$('#uid').val(),
				type:"POST",
				contentType:"application/json",
				datatype:"json",
				success:function(r){
					data=r;
					alert(r);
				}
			})
		})
	})
</script>
<!-- 
<script>
	$(document).ready(function(){
		//alert('Record is successfully inserted in the database');
		$('#btnClick').click(function(){
			alert('Operation is successfully performed on the database');
		})
	})
</script>
<script>
var data;
	$(document).ready(function(){
		$('#btnClick').click(function(){
			$.ajax({
				url:"getAllUserDetails",
				datatype:"json",
				success:function(r){
					data=r;
					alert(r);
				}
			})
		})
	})
</script> -->
</head>
<body>
	<div id="box">
		<div style="font-family: sans-serif" id="formTitle">Operations Form</div>
		<br />
<!-- <form action="operation">
			User by ID : <input id="uid" name="uid" class="inputBox" /><br><br>
			<select name="ddFlag">
				<option value="select">Select Records</option>
				<option value="delete">Delete Records</option>
				<option value="update">Update Records</option>
				<option value="custom">Custom Records</option>
			</select>
			<input type="submit" value="Click Now"/><br><br>
			<p>. . .</p>
		</form> -->
		<form>
			User by ID : <input id="uid" name="uid" class="inputBox" /><br><br>
			<select name="ddFlag">
				<option value="select">Select Records</option>
				<option value="delete">Delete Records</option>
				<option value="update">Update Records</option>
				<option value="custom">Custom Records</option>
			</select>
			<input id="btnClick" type="Button" value="Click Now"/><br><br>
			<p>. . .</p>
		</form>
	</div>
</body>
</html>