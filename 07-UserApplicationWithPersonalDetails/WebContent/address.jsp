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
		String s = (String) request.getAttribute("addressinfo");
		if (s != null) {
	%>
	<font color="blue">
		<li><%=s%></li>
	</font>
	<%
		}
	%>
	<% 
	String email = (String)request.getAttribute("email");
	%>
	<form action="Address" method="get">
		<table>
			<tr>
				<td>Enter email :</td>
				<td><input type="text" name="email" value=<%=email%> readonly/></td>
			</tr>
			<tr>
				<td>Enter city :</td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td>Enter state :</td>
				<td><input type="text" name="state" /></td>
			</tr>
			<tr>
				<td>Enter country :</td>
				<td><input type="text" name="country" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>