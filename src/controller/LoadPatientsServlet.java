package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.SearchBean;
import utility.database.SQLOperations;
import utility.database.Security;

@WebServlet("/LoadPatientsServlet")
public class LoadPatientsServlet extends HttpServlet {
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

	public LoadPatientsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");

		List<SearchBean> list = new ArrayList<>();

		String action = request.getParameter("action");
		String search = request.getParameter("search");

		if (connection != null) {
			ResultSet patientListRS = SQLOperations.getPatientList(action, search, connection);
			try {
				while (patientListRS.next()) {

					SearchBean sb = new SearchBean(patientListRS.getInt("PatientTable.PatientID"),
							Security.decrypt(patientListRS.getString("GeneralDataTable.LastName")),
							Security.decrypt(patientListRS.getString("GeneralDataTable.FirstName")),
							Security.decrypt(patientListRS.getString("GeneralDataTable.MiddleName")));

					list.add(sb);
				}
				String json = new Gson().toJson(list);
				response.getWriter().write(json);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Invalid connection");
		}

	}

}
