package com.Damera.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.Dao.RecordsDAO;

@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String id = request.getParameter("id");
			int i = Integer.parseInt(id);

			RecordsDAO dao = new RecordsDAO();
			boolean status = dao.deleteRecord(i);
			
			String msg = null;
			
			if(status) {
				msg = "Record Deleted !";
			}else {
				msg = "Deletion Failed :( ";
			}
			
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("records.jsp").forward(request, response);
			
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}
	}
}
