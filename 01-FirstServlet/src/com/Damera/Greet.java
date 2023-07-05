package com.Damera;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Greet")
public class Greet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalTime localTime = LocalTime.now();
		
		String s = String.valueOf(localTime);
		String substring = s.substring(0, 2);
		int i = Integer.parseInt(substring);
		PrintWriter pw = response.getWriter();
		if(i >= 6 && i <= 11) {
			pw.append("<h1>Good Morning</h1>");
		}
		else if(i <= 16) {
			pw.append("<h1>Good Aftermoom</h1>");
		}
		else if(i <= 20) {
			pw.append("<h1>Good Evening<h1>");
		}
		else {
			pw.append("<h1>Good Night</h1>");
		}
	}

}
