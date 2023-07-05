package com.Damera.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.UserDao.UserDao;
import com.Damera.dto.UserDto;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {
	String firstname = request.getParameter("firstname");
	String lastname = request.getParameter("lastname");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String gender = request.getParameter("gender");
	String role = request.getParameter("role");
	
	UserDto dto = new UserDto(firstname,lastname,email,password,gender,role);
	
	UserDao dao = new UserDao();
	boolean status = dao.saveUser(dto);
	
	PrintWriter pw = response.getWriter();
	if(status) {
		pw.append("<h1>Registraion Successful...</h1>");
		 pw.append("<a href=\"index.html\">Back to loginpage</a>");
	}else {
		pw.append("<h1>Failed to register!!!</h1>");
	}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

}
