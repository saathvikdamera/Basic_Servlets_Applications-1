<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import=" com.Damera.Dto.RecordsDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=1px  height=300px width=300px>
	<%
	String s = (String)request.getAttribute("msg");
	if(s != null){
	%>
	<font color="red">
		<li><%=s %></li>
	</font>
	<%
	}
    %>
		<thead>
			<tr>
				<td>S.no</td>
				<td>Name</td>
				<td>Email</td>
				<td>Phone</td>
				<td>Action</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${records}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td>${user.phone}</td>
				<td><a href='Edit?id=${user.id}'>Edit</a>&nbsp;&nbsp;
			    <a href='Delete?id=${user.id}'>Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="index.jsp">Add New User</a>
</body>
</html>