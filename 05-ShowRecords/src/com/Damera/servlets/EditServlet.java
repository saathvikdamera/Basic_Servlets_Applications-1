package com.Damera.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.Dao.RecordsDAO;
import com.Damera.Dto.RecordsDTO;

@WebServlet("/Edit")
public class EditServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			String id = request.getParameter("id");
			RecordsDTO dto = new RecordsDTO();
			RecordsDAO dao = new RecordsDAO();
			int i = Integer.parseInt(id);

			RecordsDTO record = dao.getRecordById(i);
			/*
			String name = record.getName();
			String email = record.getEmail();
			long phone = record.getPhone();
			*/
			request.setAttribute("record", record);
			request.getRequestDispatcher("edit.jsp").forward(request, response);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
