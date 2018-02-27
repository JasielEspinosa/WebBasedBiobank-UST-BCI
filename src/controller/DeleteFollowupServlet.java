package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.database.SQLOperations;

/**
 * Servlet implementation class DeleteFollowupServlet
 */
@WebServlet("/DeleteFollowupServlet")
public class DeleteFollowupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private Connection connection;
	
	public void init()
			throws ServletException {
		connection = SQLOperations.getConnection();

		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}
	
    public DeleteFollowupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		
		int followupId = Integer.parseInt(request.getParameter("followupId"));
		
		if (connection != null) {
			if (SQLOperations.deleteFollowup(followupId, connection)) {
				System.out.println("Successful delete followup");
				response.getWriter().write("Success");
			} else {
				System.out.println("delete followup");
			}
		} else {
			System.out.println("Invalid connection delete followup");
		}

	}

}
