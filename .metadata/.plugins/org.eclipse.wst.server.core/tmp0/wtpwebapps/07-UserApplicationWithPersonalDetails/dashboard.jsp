<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User dashboard</title>
<style>
* {
	margin: 0;
	padding: 0;
	list-style: none;
	text-decoration: none;
}

.sidebar {
	position: fixed;
	left: 0;
	width: 250px;
	height: 100%;
	background: #003366;
}

.sidebar header {
	font-size: 25px;
	color: white;
	text-align: center;
	line-height: 70px;
	background: #00264d;
	user-select: none;
}

.sidebar ul a {
	display: block;
	height: 100%;
	width: 100%;
	line-height: 65px;
	font-size: 20px;
	color: white;
	padding-left: 40px;
	box-sizing: border-box;
	border-top: 1px solid rgba(255, 255, 255, .1);
	border-bottom: 1px solid black;
	transition: .4s;
}

ul li:hover a {
	padding-left: 50px;
}

.sidebar ul a i {
	margin-right: 16px;
}

.resultbar {
	left: 10%;
	text-align: center;
}
 .resultbar{
            padding-left: 40%;
        }
</style>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
</head>
<body>
<%String email = (String)request.getAttribute("email");%>
   <div class="sidebar">
        <header>User Info</header>
        <ul>
            <li><a href='Address?email=<%=email %>' target="resultbar"><i class="fas fa-home"></i>Address</a></li>
            <li><a href='Education?email=<%=email %>' target="resultbar"><i class="fas fa-school"></i>Education</a></li>
            <li><a href='Details?email=<%=email %>' target="resultbar"><i class="fas fa-users"></i>Personal details</a></li>
        </ul>
    </div>
     <div class="resultbar">
        <iframe name="resultbar" width="800px" height="600px"></iframe>
    </div>

</body>
</html>