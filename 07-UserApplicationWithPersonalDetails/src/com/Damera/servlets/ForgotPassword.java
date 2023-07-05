package com.Damera.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.DAO.UserAppDAO;

@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String email = request.getParameter("email");

			UserAppDAO dao = new UserAppDAO();
			String s = dao.checkEmail(email);
			
			if(s.equals("Email doesn't exists")) {
				request.setAttribute("error", s);
				request.getRequestDispatcher("forgotpwd.jsp").forward(request, response);
			}else {
				request.setAttribute("email", s);
				request.getRequestDispatcher("resetpwd.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
