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

import model.ArchivedPatientBean;
import model.AuditBean;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;

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

		HttpSession session = request.getSession(true);
		response.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		if(action.equals("load")) {
			System.out.println("test load");
			response.setContentType("application/json");
			List<AuditBean> auditList = new ArrayList<AuditBean>();
			if(connection !=null){
				try {
					ResultSet auditRS = SQLOperations.getAudit(connection);
					while(auditRS.next()) {
						String actionValue = auditRS.getString("action");
						String performedOn = auditRS.getString("performedOn");
						String performedBy = auditRS.getString("performedBy");
						String timeStamp = auditRS.getString("timeStamp");
						
						AuditBean ab = new AuditBean(actionValue, performedOn, performedBy, timeStamp);
						auditList.add(ab);			
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}	
			}
			String json = new Gson().toJson(auditList);
			response.getWriter().write(json);
		}
	}

}
