package com.day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayStudentData
 */
@WebServlet("/DisplayStudentData")
public class DisplayStudentData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao =  new DAO();
		PrintWriter out = response.getWriter();
		try {
			List<Student> std = dao.getStudentDetails();
			for (Student student : std) {
				out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getEmail());
				out.println("</br>");
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
