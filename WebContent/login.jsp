<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-Type" content="text/html; charset="UTF-8">
<title>Login</title>
</head>
<body>
 <form:form id="LoginForm" modelAttribute="login" action="./loginProcess"
	method="post">
	<table align="center">
		<table style="with: 50%">
			<tr>
				<td><form:label path="username">UserName</form:label></td>
				<td><input type="text" placeholder="Enter Username" name="uname" required></td>
				<td><form:input path="username" name="username" id="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				 <td><input type="text" placeholder="Enter password" required></td>
				<td><form:input path="password" name="password" id="password" /></td>
			</tr>

			<tr>
				<td></td>
				<td align="left"><form:button id="submit" name="login">Login</form:button>
				<td> <button type="submit">Login</button></td>
				</td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</table>
</form:form>
<table align="center">
	<tr>
		<td style="font-style: italics: color: Red;">${message}</td>
	</tr>
</table>
</body>

</html> 