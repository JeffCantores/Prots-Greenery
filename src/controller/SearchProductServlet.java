package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.plants.*;
import model.soilandpot.PotsAndSoil;
import utility.PlantFactory;
import utility.SoilAndPotFactory;

public class SearchProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		
			String searchWord = request.getParameter("searchWord").toUpperCase();// this fetches the data entered from the search bar
			
			PotsAndSoil potAndSoil = new SoilAndPotFactory().getPotsAndSoil(searchWord.toUpperCase());
			ChiliPeppers chiliPlant = new PlantFactory().getPlant(searchWord.toUpperCase()); // this processes the searching algorithm located in the factory class

			chiliPlant.setPotsAndSoil(potAndSoil);
			
			if (chiliPlant != null) {
				request.setAttribute("product", chiliPlant);
				request.getRequestDispatcher("searchproduct.jsp").forward(request, response);
			}
		}catch(Exception e) {
			
			request.getRequestDispatcher("errorpage.jsp").forward(request, response); // this redirects to the error page if there was no matching item
		}
			
	}

}
