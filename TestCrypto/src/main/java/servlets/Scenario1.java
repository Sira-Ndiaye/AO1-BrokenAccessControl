package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Stockage;
import db.DatabaseManager;

/**
 * Servlet implementation class Scenario1
 */
@WebServlet({"/Scenario1","/"})
public class Scenario1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_ADD = "/WEB-INF/add.jsp";
	private static final String VUE_LIST = "/WEB-INF/list.jsp";
   public Scenario1() {}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getParameter("champ") != null) {
			Stockage stock = new Stockage(req.getParameter("champ"));
			DatabaseManager.add(stock);
			//getServletContext().getRequestDispatcher(VUE_LIST).forward(req, resp);
			resp.sendRedirect("List");
		}else {
			getServletContext().getRequestDispatcher(VUE_ADD).forward(req, resp);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}

}
