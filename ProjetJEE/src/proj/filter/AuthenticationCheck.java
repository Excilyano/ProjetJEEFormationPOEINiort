package proj.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import proj.bo.Utilisateur;

public class AuthenticationCheck implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationCheck() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;

		HttpSession session = (HttpSession) httpRequest.getServletContext().getAttribute("session_log");
		if (session != null) {
			try {
				Utilisateur user = (Utilisateur) session.getAttribute("current_user");
				httpRequest.setAttribute("role", user.getRole().toString());
				httpRequest.setAttribute("mail", user.getMail());
				httpRequest.setAttribute("pass", user.getPassword());
			} catch (IllegalStateException ise) {}
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
