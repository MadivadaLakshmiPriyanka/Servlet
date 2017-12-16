package com.day4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextObjectCreated
 */
@WebServlet("/ContextObjectCreated")
public class ContextObjectCreated extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx=getServletContext();
		String data=(String)ctx.getAttribute("admin");
		PrintWriter out=response.getWriter();
		out.println(data);
	}

	

}
