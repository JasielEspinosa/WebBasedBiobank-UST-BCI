package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import model.AuditBean;
import utility.database.SQLOperations;

@WebServlet("/LoadProfileServlet")
public class LoadProfileServlet extends HttpServlet {
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
	
	public LoadProfileServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		if (connection != null) {
			ResultSet profileInfoRs = SQLOperations.getProfile(Integer.parseInt((String) session.getAttribute("accountID")), connection);
			try {
				if (profileInfoRs.next()) {
					Map<String, String> profile = new LinkedHashMap<>();
					profile.put("Username", profileInfoRs.getString("Username"));
					profile.put("Lastname", profileInfoRs.getString("Lastname"));
					profile.put("Firstname", profileInfoRs.getString("Firstname"));
					profile.put("MiddleName", profileInfoRs.getString("MiddleName"));
					AuditBean auditBean = new AuditBean("Load Profile", (String) session.getAttribute("name"),
							(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
					SQLOperations.addAudit(auditBean, connection);
					String json = new Gson().toJson(profile);
					response.getWriter().write(json);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Invalid connection");
		}
	}
}
