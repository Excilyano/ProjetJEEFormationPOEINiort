package proj.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import proj.bo.Restaurant;
import proj.bo.Restaurant.Coord;

/**
 * Servlet implementation class Accueil
 */
@WebServlet("/Accueil")
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static List<Restaurant> restaurants;
	
	static {
		restaurants = new ArrayList<Restaurant>();
		Restaurant restau1 = new Restaurant();
		restau1.setId(1);
		restau1.setNom("Nantes");
		restau1.setUri("./img/nantes.JPG");
		restau1.setCoord(new Coord(47.2,-1.55));
		
		Restaurant restau2 = new Restaurant();
		restau2.setId(2);
		restau2.setNom("Rennes");
		restau2.setUri("./img/rennes.jpg");
		restau2.setCoord(new Coord(48.1,-1.67));
		
		restaurants.add(restau1);
		restaurants.add(restau2);
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accueil() {
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("restaurants", restaurants);
		request.getRequestDispatcher("accueil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
