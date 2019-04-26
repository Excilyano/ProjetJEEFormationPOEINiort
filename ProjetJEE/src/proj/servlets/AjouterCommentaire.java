package proj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import proj.bo.Commentaire;
import proj.dll.CommentaireDAOMockImpl;

/**
 * Servlet implementation class AjouterCommentaire
 */
@WebServlet("/AjouterCommentaire")
public class AjouterCommentaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterCommentaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = CommentaireDAOMockImpl.getIndex();
		Commentaire com = new Commentaire();
		com.setId(id);
		com.setNote(Double.parseDouble(request.getParameter("rating")));
		com.setCom(request.getParameter("new_comment"));
		com.setMenu_id(Integer.parseInt(request.getParameter("menu_id")));
		
		CommentaireDAOMockImpl.insert(com);
		
		request.getRequestDispatcher("DetailPlat?id_plat=" + request.getParameter("menu_id")).forward(request, response);
	}

}
