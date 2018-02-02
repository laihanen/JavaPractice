package projekti.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projekti.model.Kayttaja;

@WebServlet("/site")
public class SiteServlet extends HttpServlet {

	public static final String FRONT_PAGE = "/index.jsp";
	private static final String INSIDE_PAGE = "/view/inside.jsp";

	public static final String SESSION_ATTR_WEBUSER = "kayttajatiedot";

	private static final long serialVersionUID = 1L;

	
	public SiteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Kayttaja user = (Kayttaja) request.getSession().getAttribute(SESSION_ATTR_WEBUSER);

		if (user == null) 
			request.getRequestDispatcher(FRONT_PAGE).forward(request, response);
		else 
			request.getRequestDispatcher(INSIDE_PAGE).forward(request, response);

	}
}
