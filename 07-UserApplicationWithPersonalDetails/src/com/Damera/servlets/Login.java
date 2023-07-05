package com.Damera.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.DAO.UserAppDAO;

@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");

			UserAppDAO dao = new UserAppDAO();
			boolean status = dao.retrieveUser(email, pwd);
			
			if(status) {
				request.setAttribute("email",email);
				request.getRequestDispatcher("dashboard.jsp").forward(request, response);
			}else {
				String error = "Invalid credentials";
				request.setAttribute("error", error);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
