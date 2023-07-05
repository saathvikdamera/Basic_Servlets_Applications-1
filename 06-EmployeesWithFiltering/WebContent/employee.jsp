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
	<form action="Retrieve" method="post">
		<table>
			<tbody>
				<tr>
					<td>Dept :</td>
					<td><select name="dept">
							<option value="">Choose here</option>
							<option value="Software Developer">Software Developer</option>
							<option value="Senior Software Developer">Senior Software Developer</option>
							<option value="Project Manager">Project Manager</option>
							<option value="Architect">Architect</option>
					</select></td>
					<td>Gender :</td>
					<td><select name="gender">
							<option value="">Choose here</option>
							<option value="male">male</option>
							<option value="female">female</option>
					</select></td>
				</tr>
				<tr>
					<td>Exp :</td>
					<td><select name="exp">
							<option value="">Choose here</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
					</select></td>
					<td><input type="submit" value="search" /></td>
				</tr>
			</tbody>
		</table>
	</form>
	<table border=1px width=300px height300px>
		<thead>
			<tr>
				<td>S.no</td>
				<td>Name</td>
				<td>Email</td>
				<td>Gender</td>
				<td>Dept</td>
				<td>Exp</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="emp">
				<tr>
					<td>${emp.eid}</td>
					<td>${emp.ename}</td>
					<td>${emp.email}</td>
					<td>${emp.gender}</td>
					<td>${emp.dept}</td>
					<td>${emp.exp}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

</body>
</html>