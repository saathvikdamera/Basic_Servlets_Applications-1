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
		String s = (String) request.getAttribute("error");
		if (s != null) {
	%>
	<font color="blue">
		<li><%=s%></li>
	</font>
	<%
		}
	%>
	<form action="ForgotPassword" method="post">
		<table>
			<tr>
				<td>Enter email :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>