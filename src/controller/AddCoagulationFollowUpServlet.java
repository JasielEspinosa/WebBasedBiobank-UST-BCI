package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.database.SQLOperations;

@WebServlet("/AddCoagulationFollowUpServlet")
public class AddCoagulationFollowUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection connection;
	
	public void init() throws ServletException {
		connection = SQLOperations.getConnection();
		
		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//String dateOfEntry = request.getParameter("dateOfEntry");
		//String dateOfVisit = request.getParameter("dateOfVisit");
		
	}

}
