package projekti.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projekti.model.Elokuva;
import projekti.modelDAO.ElokuvaDAO;

@WebServlet("/lisaa-elokuva")
public class LisaaElokuvaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jsp = "/view/lisaa-elokuva.jsp";
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try{
		
		String idStr = request.getParameter("id");
		int id = new Integer(idStr);
		String starStr = request.getParameter("star");
		int star = new Integer(starStr);
		
		String nimi = request.getParameter("nimi");
		String genre = request.getParameter("genre");
		String ohjaaja = request.getParameter("ohjaaja");
		
		Elokuva elokuva = new Elokuva(id, nimi, star, genre, ohjaaja);
		
		ElokuvaDAO elokuvadao = new ElokuvaDAO();
		elokuvadao.addElokuva(elokuva);
		
	} catch (SQLException e) {
		
		System.out.println("Sovelluksessa tapahtui virhe "+ e.getMessage());
	}

		response.sendRedirect("listaa-elokuvat");
	}

}
