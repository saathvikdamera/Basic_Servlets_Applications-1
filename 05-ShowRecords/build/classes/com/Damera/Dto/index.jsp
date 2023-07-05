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
	String s = (String)request.getAttribute("message");
	if(s != null){
	%>
	<font color="blue">
		<li><%=s %></li>
	</font>
	<%
	}
    %>
    <form action="Insert" method="post">
    <table>
    <tr><td>Emp name :</td><td><input type= "text" name = "name"/></td></tr>
    <tr><td>Emp email :</td><td><input type= "text" name = "email"/></td></tr>
    <tr><td>Gender :</td><td><input type="radio" name = "gender" value="male">male</td><td><input type="radio" name = "gender" value="female">female</td></tr>
    <tr>
    <td>Department :</td>
    <td><select name="dept" multiple>
    <option value="Software Developer">Software Developer</option>
    <option value="Senior Software Developer">Senior Software Developer</option>
    <option value="Project Manager">Project Manager</option>
    <option value="Architect">Architect</option>
    </select></td>
    </tr>
    <tr>
    <td>Experience :</td>
    <td><select name="exp" multiple>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    </select></td>
    </tr>
    <tr><td><input type ="submit" value="submit"/></td></tr>
    <tr><td><a href="employee.jsp">view Employee Records</a></td></tr>
    </table>
    </form>

</body>
</html>