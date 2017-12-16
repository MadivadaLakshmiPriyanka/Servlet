package com.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpReg
 */
@WebServlet("/EmpReg")
public class EmpReg extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=(String)request.getAttribute("empname");
		PrintWriter out=response.getWriter();
		out.println("Welcome"+name);
		String password=(String)request.getAttribute("password");
		out.println("password"+password);
		
	}

}
