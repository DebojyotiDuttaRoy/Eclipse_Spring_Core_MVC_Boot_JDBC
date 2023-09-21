<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html>
  <html>
  <head>
  <meta charSet="ISO-8859-1">
  <title>Prepare Food Page</title>
  <style>
	table, th, td {
	  border: 3px solid orange;
	  border-collapse: collapse;
	  text-align: center;
	}
</style>
  </head>
  <body>
  		<!--	<h1>Your food (non-veg) is ready !!</h1>	-->
  		<h1>${message}</h1>
  		<br>
		<table>
  			<tr>
  				<th>Order Id</th>
  				<th>Customer Name</th>
  			</tr> 			
			<tr>
				<td>${id}</TD>
				<td>${name}</TD>
  			</tr> 	
  		</table>
  </body>
  </html>