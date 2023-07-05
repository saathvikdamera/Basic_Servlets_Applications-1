package com.Damera.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.DAO.UserAppDAO;
import com.Damera.DTO.UserAppDTO;

@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try { 
			String fName = request.getParameter("fname");
			String lName = request.getParameter("lname");
			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");
			String gender = request.getParameter("gender");

			UserAppDTO dto = new UserAppDTO(fName,lName,email,pwd,gender);

			UserAppDAO dao = new UserAppDAO();
			boolean status = dao.saveUser(dto);
			
			String msg = null;
			
			if(status) {
				msg="Registration successful";
			}else {
				msg="Failed to register";
			}
			
			request.setAttribute("registerStatus", msg);
			request.getRequestDispatcher("register.jsp").forward(request, response);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
