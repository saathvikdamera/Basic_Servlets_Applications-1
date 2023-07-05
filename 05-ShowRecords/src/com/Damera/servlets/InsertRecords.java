package com.Damera.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.Dao.RecordsDAO;
import com.Damera.Dto.RecordsDTO;

@WebServlet("/Insert")
public class InsertRecords extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			int phone = Integer.parseInt(request.getParameter("phone"));

			List li = new LinkedList();

			RecordsDTO dto = new RecordsDTO(name,email,phone);
			RecordsDAO dao = new RecordsDAO();
			boolean status = dao.saveRecord(dto);
			PrintWriter pw = response.getWriter();
			
			RequestDispatcher rd = null;

			if(status) {
				li.add("Record inserted !!!");
			}
			else {
				li.add("Failed!!!");
			}

			if(!li.isEmpty()) {
				request.setAttribute("arr",li);
				rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
