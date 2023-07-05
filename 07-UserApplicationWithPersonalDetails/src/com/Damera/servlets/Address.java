package com.Damera.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.DAO.UserAddressDAO;
import com.Damera.DTO.UserAddressDTO;

@WebServlet("/Address")
public class Address extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String email = request.getParameter("email");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String country = request.getParameter("country");

			UserAddressDAO dao = new UserAddressDAO();

			if(city == null && state == null && country == null) {
				boolean exists = dao.checkEmail(email);
				if(exists) {
					PrintWriter pw = response.getWriter();
					pw.append("<h1>Address Exists</h1>");

				}else {
					request.setAttribute("email",email);
					request.getRequestDispatcher("address.jsp").forward(request, response);
				}

			}else {
	
				UserAddressDTO dto = new UserAddressDTO(email,city,state,country);

				boolean status = dao.saveAddress(dto);

				String msg=null;

				if(status) {
					msg = "Address saved";
				}else {
					msg = "Failed to save address";
				}

				request.setAttribute("addressinfo", msg);
				request.getRequestDispatcher("address.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
