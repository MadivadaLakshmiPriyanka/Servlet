package com.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String empName=request.getParameter("empName");
		String password=request.getParameter("emppassword");
		request.setAttribute("name",empName);
		if(empName.equals("admin")&&password.equals("admin123"))
		{
			  RequestDispatcher red = request.getRequestDispatcher("/Home");
			  red.forward(request, response);
		}
		else
		{
			response.sendRedirect("LoginForm.html");
			
		}
	}

}
