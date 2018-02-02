package projekti.control;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import projekti.model.Kayttaja;
import projekti.modelDAO.KayttajaDAO;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet()
	{
		super();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jsp = "/index.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String kayttajatunnus = request.getParameter("username");
			String salasana = request.getParameter("password");
			
			
			//haetaan kannasta käyttäjä tietokannasta
			KayttajaDAO dao = new KayttajaDAO();
			Kayttaja kayttaja= dao.findByName(kayttajatunnus);
			
			//Kayttaja kayttajakannasta = new Kayttaja();
			if (kayttaja == null)
			{
				kayttaja = new Kayttaja();
			}
			
			String kayttajadb=kayttaja.getKayttajatunnus();
			String salasanadb=kayttaja.getSalasana();
			
			if (kayttajatunnus.equals(kayttajadb) && salasana.equals(salasanadb)){
				request.getSession().setAttribute(SiteServlet.SESSION_ATTR_WEBUSER, kayttaja);
				response.sendRedirect("site");
			}else{
				request.setAttribute("error","Invalid Username or Password");
				request.getRequestDispatcher(SiteServlet.FRONT_PAGE).forward(request, response);
			}
				
			
		}
		
	}


