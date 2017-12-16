package com.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=(String)request.getAttribute("name");
		PrintWriter out=response.getWriter();
		out.println("Welcome"+name);
		int empId=Integer.parseInt(getServletContext().getInitParameter("Id"));
		String empName=getServletContext().getInitParameter("name");
		//PrintWriter out=response.getWriter();
		out.println("Context of object data"+empId+" "+empName);
	}
	}

	

