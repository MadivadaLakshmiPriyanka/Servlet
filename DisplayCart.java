package com.day3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayCart
 */
@WebServlet("/DisplayCart")
public class DisplayCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		ArrayList<String> cart = (ArrayList<String>) session
				.getAttribute("mycart");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h4>Products in Cart</h4>");
		for (String product : cart) {

			out.println("<br/>" + product);

		}

		session.invalidate();

	}

}
