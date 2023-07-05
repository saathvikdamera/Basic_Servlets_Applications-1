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
		String s = (String) request.getAttribute("msg");
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
	<form action="Details" method="get">
		<table>
			<tr>
				<td>Enter email :</td>
				<td><input type="text" name="email" value=<%=email%> readonly /></td>
			</tr>
			<tr>
				<td>Enter Father name :</td>
				<td><input type="text" name="fathername" /></td>
			</tr>
			<tr>
				<td>Enter Mother name :</td>
				<td><input type="text" name="mothername" /></td>
			</tr>
			<tr>
				<td>Enter No.of.siblings :</td>
				<td><input type="text" name="noofsiblings" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>