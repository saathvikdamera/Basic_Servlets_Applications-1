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
	<form action="Education" method="get">
		<table>
			<tr>
				<td>Enter email :</td>
				<td><input type="text" name="email" value=<%=email%> readonly /></td>
			</tr>
			<tr>
				<td>Enter HighestQualification :</td>
				<td><input type="text" name="highestQualification" /></td>
			</tr>
			<tr>
				<td>Enter Passout Year :</td>
				<td><input type="text" name="passoutYear" /></td>
			</tr>
			<tr>
				<td>Enter Percentage in Higher Education :</td>
				<td><input type="text" name="percentage" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>

</body>
</html>