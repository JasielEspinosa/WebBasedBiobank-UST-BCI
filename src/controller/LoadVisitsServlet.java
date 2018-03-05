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

@WebServlet("/LoadVisitsServlet")
public class LoadVisitsServlet extends HttpServlet {
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

	public LoadVisitsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");

		List<SearchBean> list = new ArrayList<>();

		int patientID = Integer.parseInt(request.getParameter("patientID"));

		if (connection != null) {
			ResultSet visitsRs = SQLOperations.getVisits(patientID, connection);
			try {
				while (visitsRs.next()) {

					SearchBean sb = new SearchBean(visitsRs.getInt("followupID"), visitsRs.getString("DateOfVisit"));
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
