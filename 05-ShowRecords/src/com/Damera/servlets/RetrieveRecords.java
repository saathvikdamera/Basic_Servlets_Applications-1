package com.Damera.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.Dao.RecordsDAO;
import com.Damera.Dto.RecordsDTO;

@WebServlet("/Retrieve")
public class RetrieveRecords extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		RecordsDAO dao = new RecordsDAO();
			List<RecordsDTO> lstOfDto = dao.retrieveRecords();
			request.setAttribute("records", lstOfDto);
			RequestDispatcher rd = request.getRequestDispatcher("records.jsp");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
