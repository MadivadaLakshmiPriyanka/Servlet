package com.day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int sId = Integer.parseInt(request.getParameter("studentId"));
		String studentName = request.getParameter("studentName");
		String email = request.getParameter("email");
		Student student = new Student(sId,studentName,email);
		DAO dao = new DAO();
		try {
			int result = dao.insertStudentData(student);
			if(result!=0){
				out.println("Data inserted in the database");
			}
			else{
				out.println("Error");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
