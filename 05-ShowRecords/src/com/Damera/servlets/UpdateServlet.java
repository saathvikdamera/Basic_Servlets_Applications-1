package com.Damera.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.Dao.RecordsDAO;
import com.Damera.Dto.RecordsDTO;

@WebServlet("/Update")
public class UpdateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String id = request.getParameter("id");

			RecordsDTO dto = new RecordsDTO();
			dto.setName(name);
			dto.setEmail(email);
			dto.setPhone(Long.parseLong(phone));
			dto.setId(Integer.parseInt(id));

			RecordsDAO dao = new RecordsDAO();
			boolean status = dao.updateRecord(dto);
			
			String msg ;
			PrintWriter pw = response.getWriter();
			if(status) {
				pw.append("<h1>Record Updated....</h1>");
				pw.append("<a href=index.jsp><<<Back</a>");
			}else {
				pw.append("<h1>Record Updation failed</h1>");
				pw.append("<a href=index.jsp><<<Back</a>");
			}
			
			
			/*
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("edit.jsp").forward(request, response);
			*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
