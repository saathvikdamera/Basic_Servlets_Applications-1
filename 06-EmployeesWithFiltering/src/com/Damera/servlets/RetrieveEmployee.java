package com.Damera.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.DAO.EmployeeDAO;
import com.Damera.DTO.EmployeeDTO;

@WebServlet("/Retrieve")
public class RetrieveEmployee extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String dept = request.getParameter("dept");
			String gender = request.getParameter("gender");
			String exp = request.getParameter("exp");

			EmployeeDTO dto = new EmployeeDTO();
			dto.setDept(dept);
			dto.setGender(gender);

			if(exp != null && !exp.equals("")) {
				dto.setExp(Integer.parseInt(exp));
			}

			EmployeeDAO dao = new EmployeeDAO();
			List<EmployeeDTO> lstOfEmployees = dao.retrieveEmployee(dto);;

			request.setAttribute("employees", lstOfEmployees );
			RequestDispatcher rd = request.getRequestDispatcher("employee.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
