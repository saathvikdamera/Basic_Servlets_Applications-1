package com.Damera.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.DAO.EmployeeDAO;
import com.Damera.DTO.EmployeeDTO;

@WebServlet("/Insert")
public class InsertEmployee extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String dept = request.getParameter("dept");
			int exp = Integer.parseInt(request.getParameter("exp"));

			EmployeeDTO dto = new EmployeeDTO(name,email,gender,dept,exp);

			EmployeeDAO dao = new EmployeeDAO();
			boolean status = dao.saveEmployee(dto);
			
			String msg = null;
			
			if(status) {
				msg = "Record Inserted :)";
			}else {
				msg = "Failed!!!!";
			}
			
			request.setAttribute("message", msg);
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
