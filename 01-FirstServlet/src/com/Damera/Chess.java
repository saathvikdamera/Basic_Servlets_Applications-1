package com.Damera;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Chess")
public class Chess extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.append("<table border=1 width=600 height=600 align=\"center\" cellspacing=0>\r\n" + 
				"<tr>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"<td bgcolor=\"black\">&nbsp</td>\r\n" + 
				"<td>&nbsp</td>\r\n" + 
				"</tr>\r\n" + 
				"\r\n" + 
				"</table>");
	}

}
