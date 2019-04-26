package proj.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import proj.bo.Utilisateur;
import proj.dll.UtilisateurDAOMockImpl;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int nb_tentative;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		nb_tentative = 0;
		request.setAttribute("role", null);
		request.getRequestDispatcher("connexion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mail = request.getParameter("mail");
		Utilisateur user = UtilisateurDAOMockImpl.selectByMail(mail);
		
		String password = request.getParameter("password");
		if(user != null && user.getPassword().equals(password)) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(10 * 60);
			session.setAttribute("current_user", user);
			getServletContext().setAttribute("session_log", session);
			
			request.getRequestDispatcher("Accueil").forward(request, response);
		} else {
			nb_tentative++;
			if (nb_tentative >= 3) {
				request.getRequestDispatcher("inscription.jsp").forward(request, response);
			} else {
				request.setAttribute("erreur", "err");
				request.getRequestDispatcher("connexion.jsp").forward(request, response);
			}
		}
	}

}
