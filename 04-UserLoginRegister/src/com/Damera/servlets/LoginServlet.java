package com.Damera.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.UserDao.UserDao;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			List li = new LinkedList();

			if(email.length()== 0) {
				li.add("Please enter name !! ");
			}
			
			if(password.length()== 0) {
				li.add("Please enter password");
			}

			UserDao dao = new UserDao();
			String role = dao.retriveUser(email, password);

			//PrintWriter pw = response.getWriter();

			RequestDispatcher rd = null;


			if(role.equals("student")) {
				rd = request.getRequestDispatcher("Student");
				rd.forward(request, response);
			}
			else if(role.equals("faculty")){
				rd = request.getRequestDispatcher("Faculty");
				rd.forward(request, response);
			}
			else if(role.equals("User not found!!!!")) {
				li.add("Invalid credentials");
			}
			
			if(!li.isEmpty()) {
				request.setAttribute("errlist", li);
				rd= request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}


			/*
		  else {
			   pw.append(role + "<br>");
			   pw.append("<a href=\"index.html\">Retry login</a>");
		   }
			 */
		} catch (Exception e){
			e.printStackTrace();
		}

	}

}
