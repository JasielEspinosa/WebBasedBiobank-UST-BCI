package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.database.SQLOperations;

@WebServlet("/ArchivePatientServlet")
public class ArchivePatientServlet extends HttpServlet {
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

	public ArchivePatientServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");

		int patientID = Integer.parseInt(request.getParameter("patientID"));

		if (connection != null) {
			if (SQLOperations.archivePatient(patientID, connection)) {
				System.out.println("Successful delete");
				response.getWriter().write("Success");
			} else {
				System.out.println("Failed delete");
			}
		} else {
			System.out.println("Invalid connection delete followup");
		}

	}

}
