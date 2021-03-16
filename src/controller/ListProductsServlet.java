package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.plants.*;
import utility.*;

public class ListProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ChiliPeppers[] products = new PlantFactory().getProducts(); // this fetches all the products from the factory class
		
		if (products != null) {
			//perform object data binding
			request.setAttribute("products", products);
			request.getRequestDispatcher("listproducts.jsp").forward(request, response);
		} else {
			//TODO
		}
	}

}
