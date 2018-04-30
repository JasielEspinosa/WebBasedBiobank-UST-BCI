package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;
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

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
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
	
	public LogoutServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		try {
			AuditBean auditBean = new AuditBean("Logout", (String) session.getAttribute("name"), (String) session.getAttribute("name"),
					Integer.parseInt((String) session.getAttribute("accountID")));
			SQLOperations.addAudit(auditBean, connection);
		} catch (Exception e) {
		}
		session.invalidate();
		String redirectURL = "login.jsp";
		Map<String, String> data = new HashMap<>();
		data.put("redirect", redirectURL);
		String json = new Gson().toJson(data);
		response.setContentType("application/json");
		response.getWriter().write(json);
	}
}
