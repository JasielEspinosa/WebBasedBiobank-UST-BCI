package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import model.AccountBean;
import model.AuditBean;
import utility.database.SQLOperations;
import utility.factory.BeanFactory;

/** Servlet implementation class LoginServlet */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
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

	/** @see HttpServlet#HttpServlet() */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response) */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/** @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response) */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		response.setCharacterEncoding("UTF-8");

		AccountBean ab = BeanFactory.getAccountBean(username, password, "", "", "", 0);
		ResultSet rs = SQLOperations.login(ab, connection);
		if (connection != null) {
			try {
				if (rs.next()) {

					String middleName = rs.getString("MiddleName");

					if (middleName == null) {
						middleName = "";
					}

					session.setAttribute("accountID", rs.getString("AccountID"));
					session.setAttribute("name", rs.getString("LastName") + ", " + rs.getString("FirstName") + " " + middleName);

					session.setAttribute("lastName", rs.getString("LastName"));
					session.setAttribute("firstName", rs.getString("FirstName"));
					session.setAttribute("middleName", middleName);

					session.setAttribute("role", rs.getInt("RoleID"));

					String redirectURL = "dashboard-main.jsp";

					Map<String, String> data = new HashMap<>();
					data.put("redirect", redirectURL);
					String json = new Gson().toJson(data);

					response.setContentType("application/json");
					response.getWriter().write(json);
					System.out.println("Successful login");

					AuditBean auditBean = new AuditBean("Login", (String) session.getAttribute("name"),
							(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
					SQLOperations.addAudit(auditBean, connection);

				} else {
					response.setContentType("text/plain");
					response.getWriter().write("Failed");
					System.out.println("Failed login");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Invalid connection login");
		}

	}

}
