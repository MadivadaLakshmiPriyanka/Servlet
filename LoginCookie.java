package com.day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.day1.Employee;

@WebServlet("/LoginCookie")
public class LoginCookie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("empName");
		String empPassword = request.getParameter("empPassword");
		Employee emp = new Employee(userName,empPassword);
		PrintWriter out = response.getWriter();
		 if(userName.equals("admin")){
		/*Cookie c1 = new Cookie("name", userName);
		Cookie c2 = new Cookie("date","13/12/2017");
		c2.setMaxAge(1);
		response.addCookie(c1);
		response.addCookie(c2);*/
			 HttpSession session = request.getSession();
			 session.setAttribute("employee", emp);
			// session.setMaxInactiveInterval(30);
			 
			 
			 
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Success");
			dispatcher.forward(request, response);
		 }
		 else{
			 response.sendRedirect(response.encodeURL("Error"));
			 
		 }
		out.println("<a href='SuccessCookie'>Success Page</a>");
		
		
	}

}
