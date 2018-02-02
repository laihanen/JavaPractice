package projekti.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projekti.model.Elokuva;
import projekti.modelDAO.ElokuvaDAO;


@WebServlet("/listaa-elokuvat")
public class ListaaElokuvatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ElokuvaDAO elokuvadao = new ElokuvaDAO();
		ArrayList<Elokuva> elokuvat = elokuvadao.findAll();

		request.setAttribute("elokuvat", elokuvat);
		String jsp = "/view/listaa-elokuvat.jsp"; 
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
	}

}
