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

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		ArrayList<String> cart = (ArrayList<String>) session
				.getAttribute("mycart");
		if (cart == null) {
			cart = new ArrayList<String>();
		}

		String productName = request.getParameter("prodName");
		cart.add(productName);
		session.setAttribute("mycart", cart);

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String addUrl = response.encodeURL("addProduct.html");
		String displayUrl = response.encodeURL("DisplayCart");
		writer.println(productName + " added to cart");
	
		writer.println("<br/><a href="+addUrl+">Add More Products</a>");
		writer.println(" <a href="+displayUrl+">Display Cart</a>");

	}

}
