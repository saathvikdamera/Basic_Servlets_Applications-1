package com.Damera.servlet;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Damera.BookDto.BookDto;
import com.Damera.Dao.BookDao;

@WebServlet("/Book")
public class BookServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		try {
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		String bookName = request.getParameter("bookName");
		double bookPrice = Double.parseDouble(request.getParameter("bookPrice"));
		
		BookDto dto = new BookDto(bookId,bookName,bookPrice);
		
		BookDao dao = new BookDao();
		boolean status = dao.saveBook(dto);
		PrintWriter writer = response.getWriter();
			if(status) {
				writer.append("<h1>Record inserted...</h1>");
			}else {
				writer.append("<h1>Failed...</h1>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
