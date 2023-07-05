<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.Damera.Dto.RecordsDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Record</h1>
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
		RecordsDTO dto = (RecordsDTO) request.getAttribute("record");
		String name = dto.getName();
		String email = dto.getEmail();
		long phone = dto.getPhone();
		int id = dto.getId();
	%>
	<form action="Update" method="get">
		<table>
			<tr>
				<td>Enter Name :</td>
				<td><input type="text" name="name" value=<%=name%>></td>
			</tr>
			<tr>
				<td>Enter Email :</td>
				<td><input type="text" name="email" value=<%=email%>></td>
			</tr>
			<tr>
				<td>Enter Phone :</td>
				<td><input type="text" name="phone" value=<%=phone%>></td>
			</tr>
			<tr>
				<td>Id :</td>
				<td><input type="text" name="id" value=<%=id%>
					readonly="readonly"></td>
			</tr>
		</table>
		<input type="submit" value="submit" /><br> <a href="Retrieve">view
			records</a>
	</form>

</body>
</html>