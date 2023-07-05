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
		String s = (String) request.getAttribute("registerStatus");
		if (s != null) {
	%>
	<font color="blue">
		<li><%=s%></li>
	</font>
	<%
		}
	%>
	<form action="Register" method="post">
		<table>
			<tr>
				<td>enter email :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Enter password :</td>
				<td><input type="text" name="pwd" /></td>
			</tr>
			<tr>
				<td>Enter firstname :</td>
				<td><input type="text" name="fname" /></td>
			</tr>
			<tr>
				<td>Enter lastname :</td>
				<td><input type="text" name="lname" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><input type="radio" name="gender" value="male">male</td>
				<td><input type="radio" name="gender" value="female">female</td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
			<tr>
				<td><a href="index.jsp">Back to login</a></td>
			</tr>
		</table>
	</form>

</body>
</html>