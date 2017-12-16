package com.day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.day1.Employee;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String userName = request.getParameter("name");
		String empPassword = request.getParameter("password");
		//Employee emp = new Employee(userName,empPassword);
		PrintWriter out = response.getWriter();
		 if(userName.equals("admin")) 
		 {
			 
			 RequestDispatcher dispatcher = request.getRequestDispatcher("/Success");
				dispatcher.forward(request, response);
		 }
			else
			 {
				 response.sendRedirect(response.encodeURL("Error"));
				 
			 }
		 /*out.println("<html>");
			out.println("<head><title>HomePage</title></head>");
			out.println("<body bgcolor='aqua'>");
			out.println("<h2 style='color:red'>PRODUCTS</h2>");
			out.println("<a href='Mobiles.java'>Mobiles</a>");
			out.println("<a href='Laptops.java'>Laptops</a>");
			out.println("<a href='Watches.java'>Watches</a>");
			out.println("</body></html>");
			out.println("<a href='SuccessCookie'>Success Page</a>");*/
			
	}


}