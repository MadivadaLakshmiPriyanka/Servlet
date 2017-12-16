package com.day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamDemo
 */
@WebServlet("/InitParamDemo")
public class InitParamDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Email=getServletConfig().getInitParameter("Email");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>MyWebPage</title></head>");
		out.println("<body bgcolor='aqua'>");
		out.println("<style='color:red'>");
		out.println(Email);
		out.println("</body></html>");
				
		
	}

}
