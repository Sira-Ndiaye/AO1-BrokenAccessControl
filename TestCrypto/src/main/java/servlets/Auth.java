package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Auth
 */
@WebServlet({"/Auth","/Logout"})
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_CONN = "/WEB-INF/connect.jsp";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Auth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if(path.equals("/Logout")) {
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect("Auth");

//			getServletContext().getRequestDispatcher(VUE_CONN).forward(request, response);
		}
		if(path.equals("/Auth")) {
			if(request.getParameter("username")!=null) {
				String username = request.getParameter("username");
				if(username.equals("admin")) {
					HttpSession session = request.getSession();
					session.setAttribute("isConnected",true);
					response.sendRedirect("Scenario1?role=admin");
				}
			}else {
				getServletContext().getRequestDispatcher(VUE_CONN).forward(request, response);
			}
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			doGet(request,response);
		
	}

}
