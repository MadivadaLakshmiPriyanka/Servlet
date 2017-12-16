package com.day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/HomePage")
public class HomePage extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=(String)request.getAttribute("name");
		PrintWriter out=response.getWriter();
		out.println("Welcome"+name);
		
		out.println("<html>");
		out.println("<head><title>HomePage</title></head>");
		out.println("<body bgcolor='aqua'>");
		out.println("<h2 style='color:red'>PRODUCTS</h2>");
		out.println("<a href='Mobiles.java'>Mobiles</a>");
		out.println("<a href='Mobiles.java'>Laptops</a>");
		out.println("<a href='Mobiles.java'>Watches</a>");
		out.println("</body></html>");
				
	}

}
