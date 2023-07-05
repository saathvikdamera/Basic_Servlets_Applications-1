package com.Damera.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.DAO.UserDetailsDAO;
import com.Damera.DTO.UserDetailsDTO;

@WebServlet("/Details")
public class Details extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String email = request.getParameter("email");
			String fatherName = request.getParameter("fathername");
			String motherName = request.getParameter("mothername");
			String noOfSiblings = request.getParameter("noofsiblings");


			UserDetailsDAO dao = new UserDetailsDAO();
			if(fatherName == null && motherName == null && noOfSiblings == null) {
				boolean exists = dao.checkEmail(email);

				if(exists) {
					PrintWriter pw = response.getWriter();
					pw.append("<h1>Details Exists</h1>");

				}else {

					request.setAttribute("email",email);
					request.getRequestDispatcher("Details.jsp").forward(request, response);
				}

			}else {

				int siblings = Integer.parseInt(noOfSiblings);
				UserDetailsDTO dto = new UserDetailsDTO(email,fatherName,motherName,siblings);

				boolean status = dao.saveDetails(dto);

				String msg = null;

				if(status) {
					msg = " Details saved";
				}else {
					msg = "Failed to save";
				}

				request.setAttribute("msg", msg);
				request.getRequestDispatcher("Details.jsp").forward(request, response);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
