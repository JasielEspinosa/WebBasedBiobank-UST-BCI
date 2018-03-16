package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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

@WebServlet("/UserManagementServlet")
public class UserManagementServlet extends HttpServlet {
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

	public UserManagementServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		response.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		if (action.equals("add")) {

			if (connection != null) {
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				String lastName = request.getParameter("lastName");
				String firstName = request.getParameter("firstName");
				String middleName = request.getParameter("middleName");
				int role = Integer.parseInt(request.getParameter("role"));
				AccountBean ab = BeanFactory.getAccountBean(username, password, lastName, middleName, firstName, role);

				if (SQLOperations.addUser(ab, connection)) {

					AuditBean auditBean = new AuditBean("Audit", (String) lastName + ", " + firstName + " " + middleName,
							(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
					SQLOperations.addAudit(auditBean, connection);

					response.getWriter().write("Success");
					System.out.println("Success");

				} else {
					response.getWriter().write("Failed");
					System.out.println("Failed");
				}

			} else {
				System.out.println("Invalid connection");
			}
		}

		if (action.equals("load")) {
			response.setContentType("application/json");
			List<AccountBean> accountList = new ArrayList<AccountBean>();
			System.out.println("try1");
			if (connection != null) {
				try {
					System.out.println("try2");
					ResultSet usersRS = SQLOperations.getUsers(connection);
					while (usersRS.next()) {
						System.out.println("try3");
						int accountID = usersRS.getInt("AccountID");
						String username = usersRS.getString("Username");
						String lastName = usersRS.getString("LastName").trim().toUpperCase();
						String firstName = usersRS.getString("FirstName").trim().toUpperCase();
						String middleName = usersRS.getString("MiddleName").trim().toUpperCase();
						int roleID = usersRS.getInt("RoleID");
						System.out.println(username);

						AccountBean ab = new AccountBean(accountID, username, lastName, middleName, firstName, roleID);

						accountList.add(ab);

/*						AuditBean auditBean = new AuditBean("Load User Management",
								lastName + ", " + firstName + " " + middleName, (String) session.getAttribute("name"),
								Integer.parseInt((String) session.getAttribute("accountID")));
						SQLOperations.addAudit(auditBean, connection);*/

					}

					AuditBean auditBean = new AuditBean("Load User Management", (String) session.getAttribute("name"),
							(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
					SQLOperations.addAudit(auditBean, connection);

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			String json = new Gson().toJson(accountList);
			response.getWriter().write(json);
		}

		if (action.equals("delete")) {
			String[] accountID = request.getParameterValues("accountID");
			String responseText = "";
			if (connection != null) {
				for (int pointer = 0; pointer < accountID.length; pointer++) {
					if (SQLOperations.deleteUser(Integer.parseInt(accountID[pointer]), connection)) {
						responseText = "Success";
						System.out.println("Success delete");
					} else {
						responseText = "Failed";
						System.out.println("Failed");
					}

				}
				response.getWriter().write(responseText);
			} else {
				System.out.println("Invalid connection");
			}
		}

		if (action.equals("editLoad")) {
			response.setContentType("application/json");
			if (connection != null) {
				ResultSet profileInfoRs = SQLOperations.getProfile(Integer.parseInt((String) request.getParameter("accountID")),
						connection);
				try {
					if (profileInfoRs.next()) {
						Map<String, String> profile = new LinkedHashMap<>();
						profile.put("Username", profileInfoRs.getString("Username"));
						profile.put("Lastname", profileInfoRs.getString("Lastname"));
						profile.put("Firstname", profileInfoRs.getString("Firstname"));
						profile.put("MiddleName", profileInfoRs.getString("MiddleName"));
						profile.put("Role", Integer.toString(profileInfoRs.getInt("RoleID")));
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

		if (action.equals("edit")) {
			if (connection != null) {
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				String lastName = request.getParameter("lastName");
				String firstName = request.getParameter("firstName");
				String middleName = request.getParameter("middleName");
				int role = Integer.parseInt(request.getParameter("role"));

				AccountBean ab = BeanFactory.getAccountBean(username, password, lastName, middleName, firstName, role);

				if (SQLOperations.updateProfile(ab, Integer.parseInt((String) request.getParameter("accountID")), connection)) {
					response.getWriter().write("Success");
					System.out.println("Success Edit profile");

				} else {
					response.getWriter().write("Failed");
					System.out.println("Failed");
				}

			} else {
				System.out.println("Invalid connection");
			}
		}

	}

}
