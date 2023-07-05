<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Insert Record</h1>
<%
List l = (List)request.getAttribute("arr");
if(l!=null){
	for(Iterator it = l.iterator();it.hasNext();){
		String error =(String) it.next();
		%>
		<font color = "blue"> 
		<li><%=error %></li>
		</font>
		<% 
	}
}
%>
<form action="Insert" method="post">
<table>
<tr><td>Enter Name  : </td><td><input type= "text" name = "name"/></td></tr>
<tr><td>Enter Email : </td><td> <input type= "text" name = "email"/></td></tr>
<tr><td>Enter Phone : </td><td><input type= "text" name = "phone"/></td></tr>
</table>
<input type ="submit" value="submit"/><br>
<a href="Retrieve">view records</a>
</form>
</body>
</html>