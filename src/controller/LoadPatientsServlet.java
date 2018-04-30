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
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import model.AuditBean;
import model.SearchBean;
import utility.database.SQLOperations;

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
		String search = request.getParameter("search").toUpperCase();
		if (connection != null) {
			ResultSet patientListRS = SQLOperations.getPatientList(action, "%" + search + "%", connection);
			try {
				while (patientListRS.next()) {
					SearchBean sb = new SearchBean(patientListRS.getInt("PatientTable.PatientID"), patientListRS.getString("LastNameDec"),
							patientListRS.getString("FirstNameDec"), patientListRS.getString("MiddleNameDec"));
					list.add(sb);
				}
				HttpSession session = request.getSession(true);
				AuditBean auditBean = new AuditBean("Load Patients", (String) session.getAttribute("name"),
						(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
				SQLOperations.addAudit(auditBean, connection);
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
