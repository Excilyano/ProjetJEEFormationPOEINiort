package test;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
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
		String uploadPath = getServletContext().getRealPath("") + File.separator + "img";
		File uploadDir = new File(uploadPath);
		
		if (!uploadDir.exists()) uploadDir.mkdir();
		
		for (Part part : request.getParts()) {
			String fileName = getFileName(part);
			if (! "Default".equals(fileName)) {
				part.write(uploadPath + File.separator + fileName);
				request.setAttribute("imgPath", "img/" + fileName);
			}
		}
		
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
	
	private String getFileName(final Part pPart) {
		  for (String lContent : pPart.getHeader("content-disposition")
		      .split(";")) {
		    if (lContent.trim().startsWith("filename")) {
		      return lContent.substring(lContent.indexOf('=') + 2, lContent.length() -1);
		    }
		  }
		  return "Default";
		}

}
