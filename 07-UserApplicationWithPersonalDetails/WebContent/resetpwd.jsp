<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String s = (String) request.getAttribute("email");
	%>
	<%
	String error = (String) request.getAttribute("error");
	if (error != null) {
	%>
	<font color="blue">
		<li><%=s%></li>
	</font>
	<%
		}
	%>
	<form action="ResetPassword" method="post">
		<table>
			<tr>
				<td>Enter email :</td>
				<td><input type="text" name="email" value="<%=s%>"
					readonly="readonly" /></td>
			</tr>
			<tr>
				<td>Enter new password :</td>
				<td><input type="password" name="npwd" /></td>
			</tr>
			<tr>
				<td>Confirm password :</td>
				<td><input type="password" name="cpwd" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>