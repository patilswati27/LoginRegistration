<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<form id="regForm" th:action="@{/registerProcess}" method="post">
	<table align="center">
		<table style="with: 50%">
			<tr>
				<td><label for="username">UserName :</label></td>
				<td><input type="text" placeholder="Enter username" name="username" required></td>
			</tr>
			<tr>
				<td><input type="text" placeholder="Enter password" name="password" required></td>
			</tr>
			<tr>
				<td><input type="text" placeholder="Enter first name" name="fname" required></td>
			</tr>
			<tr>
				<td> <input type="text" placeholder="Enter last name" name="lname" required></td>
			</tr>
			<tr>
				<td> <input type="text" placeholder="Enter Email" name="email" required></td>
			</tr>
			<tr>
				<td> <input type="text" placeholder="Enter address" name="address" required></td>
			</tr>

			<tr>
				<td> <input type="text" placeholder="Enter mobile no" name="mobile" required></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">Register</button></td>
			</tr>

			<tr></tr>
			<td></td>
			<td><a href="home.jsp">Home</a></td>
		</table>
		</table>
</form>
		</body>
		</html>