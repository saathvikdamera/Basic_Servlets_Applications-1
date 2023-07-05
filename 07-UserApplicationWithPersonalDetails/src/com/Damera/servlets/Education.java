package com.Damera.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.DAO.UserEduDAO;
import com.Damera.DTO.UserEduDTO;

@WebServlet("/Education")
public class Education extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String email = request.getParameter("email");
			String highestQualification = request.getParameter("highestQualification");
			String passout = request.getParameter("passoutYear");
			String percentage = request.getParameter("percentage");
			UserEduDAO dao = new UserEduDAO();

			if(highestQualification == null && passout == null && percentage == null) {

				boolean exists = dao.checkEmail(email);
				if(exists) {
					PrintWriter pw = response.getWriter();
					pw.append("<h1>Education Details Exists</h1>");

				}else {

					request.setAttribute("email",email);
					request.getRequestDispatcher("Education.jsp").forward(request, response);
				}

			}else {
				int i = Integer.parseInt(passout);
				int j = Integer.parseInt(percentage);

				UserEduDTO dto = new UserEduDTO(email,highestQualification,i,j);

				boolean status = dao.saveEdu(dto);

				String msg = null;

				if(status) {
					msg = "Education details saved";
				}else {
					msg = "Failed to save";
				}

				request.setAttribute("msg", msg);
				request.getRequestDispatcher("Education.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
