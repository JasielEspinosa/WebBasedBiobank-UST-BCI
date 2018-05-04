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
		String roleString;
		AuditBean auditBean;
		if (action.equals("add")) {
			if (connection != null) {
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				String lastName = request.getParameter("lastName").trim().toUpperCase();
				String firstName = request.getParameter("firstName").trim().toUpperCase();
				String middleName = request.getParameter("middleName").trim().toUpperCase();
				int role = Integer.parseInt(request.getParameter("role"));
				AccountBean ab = BeanFactory.getAccountBean(username, password, lastName, middleName, firstName, role);
				roleString = null;
				if (role == 1) {
					roleString = "Admin";
				} else if (role == 2) {
					roleString = "Encoder";
				}
				System.out.println("Role: " + roleString);
				if (SQLOperations.addUser(ab, connection)) {
					auditBean = new AuditBean("User Management - New " + roleString + " added",
							(String) lastName + ", " + firstName + " " + middleName, (String) session.getAttribute("name"),
							Integer.parseInt((String) session.getAttribute("accountID")));
					SQLOperations.addAudit(auditBean, connection);
					response.getWriter().write("Success");
					System.out.println("Success");
				} else {
					auditBean = new AuditBean("User Management - Adding new user failed",
							(String) lastName + ", " + firstName + " " + middleName, (String) session.getAttribute("name"),
							Integer.parseInt((String) session.getAttribute("accountID")));
					SQLOperations.addAudit(auditBean, connection);
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
			if (connection != null) {
				try {
					ResultSet usersRS = SQLOperations.getUsers(connection);
					while (usersRS.next()) {
						int accountID = usersRS.getInt("AccountID");
						String username = usersRS.getString("Username");
						String lastName = usersRS.getString("LastName").trim().toUpperCase();
						String firstName = usersRS.getString("FirstName").trim().toUpperCase();
						String middleName = usersRS.getString("MiddleName").trim().toUpperCase();
						int roleID = usersRS.getInt("RoleID");
						int active = usersRS.getInt("Active");
						System.out.println(username);
						AccountBean ab = new AccountBean(accountID, username, lastName, middleName, firstName, roleID, active);
						accountList.add(ab);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			auditBean = new AuditBean("User Management accessed", (String) session.getAttribute("name"),
					(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
			SQLOperations.addAudit(auditBean, connection);
			String json = new Gson().toJson(accountList);
			response.getWriter().write(json);
		}
		if (action.equals("delete")) {
			try {
				ResultSet usersRS = SQLOperations.getProfile(Integer.parseInt((String) request.getParameter("accountID")), connection);
				while (usersRS.next()) {
					String username = usersRS.getString("Username");
					String lastName = usersRS.getString("LastName").trim().toUpperCase();
					String firstName = usersRS.getString("FirstName").trim().toUpperCase();
					String middleName = usersRS.getString("MiddleName").trim().toUpperCase();
					int roleID = usersRS.getInt("RoleID");
					System.out.println(username);
					roleString = null;
					if (roleID == 1) {
						roleString = "Admin";
					} else if (roleID == 2) {
						roleString = "Encoder";
					}
					String[] accountID = request.getParameterValues("accountID");
					String responseText = "";
					if (connection != null) {
						for (int pointer = 0; pointer < accountID.length; pointer++) {
							if (SQLOperations.deleteUser(1, Integer.parseInt(accountID[pointer]), connection)) {
								auditBean = new AuditBean("User Management - " + roleString + " user deleted",
										(String) lastName + ", " + firstName + " " + middleName + " (" + roleString + ")",
										(String) session.getAttribute("name"),
										Integer.parseInt((String) session.getAttribute("accountID")));
								SQLOperations.addAudit(auditBean, connection);
								responseText = "Success";
								System.out.println("Success delete");
							} else {
								auditBean = new AuditBean("User Management - " + roleString + " user deletion failed",
										(String) lastName + ", " + firstName + " " + middleName, (String) session.getAttribute("name"),
										Integer.parseInt((String) session.getAttribute("accountID")));
								SQLOperations.addAudit(auditBean, connection);
								responseText = "Failed";
								System.out.println("Failed");
							}
						}
						response.getWriter().write(responseText);
					} else {
						System.out.println("Invalid connection");
					}
				}
			} catch (NumberFormatException | SQLException e) {
				e.printStackTrace();
			}
		}
		if (action.equals("restore")) {
			try {
				ResultSet usersRS = SQLOperations.getProfile(Integer.parseInt((String) request.getParameter("accountID")), connection);
				while (usersRS.next()) {
					String username = usersRS.getString("Username");
					String lastName = usersRS.getString("LastName").trim().toUpperCase();
					String firstName = usersRS.getString("FirstName").trim().toUpperCase();
					String middleName = usersRS.getString("MiddleName").trim().toUpperCase();
					int roleID = usersRS.getInt("RoleID");
					System.out.println(username);
					roleString = null;
					if (roleID == 1) {
						roleString = "Admin";
					} else if (roleID == 2) {
						roleString = "Encoder";
					}
					String[] accountID = request.getParameterValues("accountID");
					String responseText = "";
					if (connection != null) {
						for (int pointer = 0; pointer < accountID.length; pointer++) {
							if (SQLOperations.deleteUser(1, Integer.parseInt(accountID[pointer]), connection)) {
								auditBean = new AuditBean("User Management - " + roleString + " user restored",
										(String) lastName + ", " + firstName + " " + middleName + " (" + roleString + ")",
										(String) session.getAttribute("name"),
										Integer.parseInt((String) session.getAttribute("accountID")));
								SQLOperations.addAudit(auditBean, connection);
								responseText = "Success";
								System.out.println("Success delete");
							} else {
								auditBean = new AuditBean("User Management - " + roleString + " user restoration failed",
										(String) lastName + ", " + firstName + " " + middleName, (String) session.getAttribute("name"),
										Integer.parseInt((String) session.getAttribute("accountID")));
								SQLOperations.addAudit(auditBean, connection);
								responseText = "Failed";
								System.out.println("Failed");
							}
						}
						response.getWriter().write(responseText);
					} else {
						System.out.println("Invalid connection");
					}
				}
			} catch (NumberFormatException | SQLException e) {
				e.printStackTrace();
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
			try {
				if (connection != null) {
					ResultSet usersRS = SQLOperations.getProfile(Integer.parseInt((String) request.getParameter("accountID")), connection);
					while (usersRS.next()) {
						String usernameOld = usersRS.getString("Username");
						String passwordOld = usersRS.getString("Password");
						String lastNameOld = usersRS.getString("LastName").trim().toUpperCase();
						String firstNameOld = usersRS.getString("FirstName").trim().toUpperCase();
						String middleNameOld = usersRS.getString("MiddleName").trim().toUpperCase();
						int roleOld = usersRS.getInt("RoleID");
						String username = request.getParameter("username");
						String password = request.getParameter("password");
						String confirmPassword = request.getParameter("confirmPassword");
						String lastName = request.getParameter("lastName").trim().toUpperCase();
						String firstName = request.getParameter("firstName").trim().toUpperCase();
						String middleName = request.getParameter("middleName").trim().toUpperCase();
						int role = Integer.parseInt(request.getParameter("role"));
						roleString = null;
						String roleStringOld = null;
						if (roleOld == 1) {
							roleStringOld = "Admin";
						} else if (roleOld == 2) {
							roleStringOld = "Encoder";
						}
						if (role == 1) {
							roleString = "Admin";
						} else if (role == 2) {
							roleString = "Encoder";
						}
						if (password == "") {
							password = passwordOld;
						}
						String text1 = "";
						String text2 = "";
						String text3 = "";
						String text4 = "";
						String text5 = "";
						String text6 = "";
						if (!username.equals(usernameOld)) {
							text1 = "Username";
							if (!password.equals(passwordOld) || !lastName.equals(lastNameOld) || !firstName
									.equals(firstNameOld) || !middleName.equals(middleNameOld) || roleString != roleStringOld) {
								text1 = "Username, ";
							}
						}
						if (!password.equals(passwordOld)) {
							text2 = "Password";
							if (!lastName.equals(lastNameOld) || !firstName.equals(firstNameOld) || !middleName
									.equals(middleNameOld) || roleString != roleStringOld) {
								text2 = "Password, ";
							}
						}
						if (!lastName.equals(lastNameOld)) {
							text3 = "Last Name";
							if (!firstName.equals(firstNameOld) || !middleName.equals(middleNameOld) || roleString != roleStringOld) {
								text3 = "Last Name, ";
							}
						}
						if (!firstName.equals(firstNameOld)) {
							text4 = "First Name";
							if (!middleName.equals(middleNameOld) || roleString != roleStringOld) {
								text4 = "First Name, ";
							}
						}
						if (!middleName.equals(middleNameOld)) {
							text5 = "Middle Name";
							if (roleString != roleStringOld) {
								text5 = "Middle Name, ";
							}
						}
						if (roleString != roleStringOld) {
							text6 = "Role changed to " + roleString;
						}
						
						if (!password.equals(confirmPassword)) {
							auditBean = new AuditBean("User Management - Attempt change password failed",
									(String) lastName + ", " + firstName + " " + middleName, (String) session.getAttribute("name"),
									Integer.parseInt((String) session.getAttribute("accountID")));
							SQLOperations.addAudit(auditBean, connection);
							response.getWriter().write("New Password and confirm password does not match.");
							System.out.println("Failed New Password and confirm password does not match.");
						} else {
							AccountBean ab = BeanFactory.getAccountBean(username, password, lastName, middleName, firstName, role);
							if (SQLOperations.updateProfile(ab, Integer.parseInt((String) request.getParameter("accountID")), connection)) {
								System.out.println(username);
								System.out.println(usernameOld);
								auditBean = new AuditBean(
										"User Management - User edited " + "(" + text1 + text2 + text3 + text4 + text5 + text6 + ")",
										(String) lastName + ", " + firstName + " " + middleName, (String) session.getAttribute("name"),
										Integer.parseInt((String) session.getAttribute("accountID")));
								SQLOperations.addAudit(auditBean, connection);
								response.getWriter().write("Success");
								System.out.println("Success Edit profile");
							} else {
								auditBean = new AuditBean("User Management - Attempt user edit failed",
										(String) lastName + ", " + firstName + " " + middleName + " (" + roleString + ")",
										(String) session.getAttribute("name"),
										Integer.parseInt((String) session.getAttribute("accountID")));
								SQLOperations.addAudit(auditBean, connection);
								response.getWriter().write("Failed");
								System.out.println("Failed");
							}
						}
						
					}
				} else {
					System.out.println("Invalid connection");
				}
			} catch (NumberFormatException | SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
