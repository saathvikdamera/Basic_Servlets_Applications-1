<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Details</h1>
	<%
		String s = (String) request.getAttribute("error");
		if (s != null) {
	%>
	<font color="blue">
		<li><%=s%></li>
	</font>
	<%
		}
	%>
	<form action="Login" method="post">
		<table>
			<tr>
				<td>Enter email :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Enter password :</td>
				<td><input type="text" name="pwd" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="login" /></td>
			</tr>
			<tr>
				<td><a href="forgotpwd.jsp">Forget password?</a></td>
				<td><a href="register.jsp">Register</a></td>
			</tr>
		</table>
	</form>

</body>
</html>