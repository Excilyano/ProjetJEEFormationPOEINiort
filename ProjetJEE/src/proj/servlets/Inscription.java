package proj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import proj.bo.Utilisateur;
import proj.dll.UtilisateurDAOMockImpl;
import proj.enums.Role;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("inscription.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur user = new Utilisateur();
		user.setId(UtilisateurDAOMockImpl.getId());
		user.setMail(request.getParameter("mail"));
		user.setPassword(request.getParameter("pass"));
		user.setRole(Role.USER);
		
		UtilisateurDAOMockImpl.insert(user);
		
		request.getRequestDispatcher("Connexion?mail=" + user.getMail() + "&password=" + user.getPassword()).forward(request, response);
	}

}
