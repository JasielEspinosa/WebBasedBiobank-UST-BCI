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
import utility.database.SQLOperations;

@WebServlet("/AuditServlet")
public class AuditServlet extends HttpServlet {
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

	public AuditServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		if (action.equals("load")) {
			System.out.println("test load");
			response.setContentType("application/json");
			List<AuditBean> auditList = new ArrayList<AuditBean>();
			if (connection != null) {
				try {

					ResultSet auditRS = SQLOperations.getAuditAll(connection);

					while (auditRS.next()) {

						String actionValue = auditRS.getString("action");
						String performedOn = auditRS.getString("performedOn");
						String performedBy = auditRS.getString("performedBy");
						String date = auditRS.getString("dateDec");
						String time = auditRS.getString("time");

						AuditBean ab = new AuditBean(actionValue, performedOn, performedBy, date, time);
						auditList.add(ab);
					}

					HttpSession session = request.getSession(true);

					AuditBean auditBean = new AuditBean("Audit", (String) session.getAttribute("name"),
							(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
					SQLOperations.addAudit(auditBean, connection);

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			String json = new Gson().toJson(auditList);
			response.getWriter().write(json);
		}
	}

}
