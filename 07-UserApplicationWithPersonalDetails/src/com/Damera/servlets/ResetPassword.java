package com.Damera.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResetPassword")
public class ResetPassword extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String nPwd = request.getParameter("npwd");
		String cPwd = request.getParameter("cpwd");
		
		//String error = null;
		
		if(nPwd.equals(cPwd)) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			String error = "New password is not matching with confirm password";
			request.setAttribute("error",error);
			request.getRequestDispatcher("resetpwd.jsp").forward(request, response);
		}
	}

}
