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
				
				ResultSet checkExistingUserRS = SQLOperations.getUsernames(username, connection);
				
				try {
					if (checkExistingUserRS.next()) {
						
						String usernameStored = checkExistingUserRS.getString("Username");
						response.getWriter().write("userExists");
						
						if (!usernameStored.equals(username)) {
							auditBean = new AuditBean("User Management - attempt to add username " + username + " but already existed",
									(String) lastName + ", " + firstName + " " + middleName, (String) session.getAttribute("name"),
									Integer.parseInt((String) session.getAttribute("accountID")));
							SQLOperations.addAudit(auditBean, connection);
						}
						
					} else {
						
						if (SQLOperations.addUser(ab, connection)) {
							auditBean = new AuditBean("User Management - New user " + roleString + " added",
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
						
					}
				} catch (NumberFormatException | SQLException e) {
					e.printStackTrace();
				}
				
			} else {
				System.out.println("Invalid connection");
			}
		}
		
		if (action.equals("load")) {
			
			auditBean = new AuditBean("User Management accessed", (String) session.getAttribute("name"),
					(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
			SQLOperations.addAudit(auditBean, connection);
			
			response.setContentType("application/json");
			List<AccountBean> accountList = new ArrayList<AccountBean>();
			if (connection != null) {
				ResultSet usersRS = SQLOperations.getUsers(connection);
				try {
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
			String json = new Gson().toJson(accountList);
			response.getWriter().write(json);
		}
		
		if (action.equals("delete")) {
			ResultSet usersRS = SQLOperations.getProfile(Integer.parseInt((String) request.getParameter("accountID")), connection);
			try {
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
							if (SQLOperations.archiveUser(1, Integer.parseInt(accountID[pointer]), connection)) {
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (action.equals("restore")) {
			ResultSet usersRS = SQLOperations.getProfile(Integer.parseInt((String) request.getParameter("accountID")), connection);
			try {
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
							if (SQLOperations.unarchiveUser(1, Integer.parseInt(accountID[pointer]), connection)) {
								auditBean = new AuditBean("User Management - " + roleString + " user restored",
										(String) lastName + ", " + firstName + " " + middleName + " (" + roleString + ")",
										(String) session.getAttribute("name"),
										Integer.parseInt((String) session.getAttribute("accountID")));
								SQLOperations.addAudit(auditBean, connection);
								responseText = "Success";
								System.out.println("Success restore");
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
						profile.put("Password", profileInfoRs.getString("Password"));
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
				ResultSet usersRS = SQLOperations.getProfile(Integer.parseInt((String) request.getParameter("accountID")), connection);
				try {
					while (usersRS.next()) {
						
						String usernameStored = usersRS.getString("Username");
						String passwordStored = usersRS.getString("Password");
						String lastNameStored = usersRS.getString("LastName").trim().toUpperCase();
						String firstNameStored = usersRS.getString("FirstName").trim().toUpperCase();
						String middleNameStored = usersRS.getString("MiddleName").trim().toUpperCase();
						int roleStored = usersRS.getInt("RoleID");
						
						String username = request.getParameter("username");
						String newPassword = request.getParameter("password");
						//String confirmPassword = request.getParameter("confirmPassword");
						String lastName = request.getParameter("lastName").trim().toUpperCase();
						String firstName = request.getParameter("firstName").trim().toUpperCase();
						String middleName = request.getParameter("middleName").trim().toUpperCase();
						int role = Integer.parseInt(request.getParameter("role"));
						
						roleString = null;
						
						/*String roleStringOld = null;
						
						if (roleStored == 1) {
							roleStringOld = "Admin";
						} else if (roleStored == 2) {
							roleStringOld = "Encoder";
						}*/
						
						if (role == 1) {
							roleString = "Admin";
						} else if (role == 2) {
							roleString = "Encoder";
						}
						
						//No changes occured
						if (username.equals(usernameStored) && lastName.equals(lastNameStored) && firstName
								.equals(firstNameStored) && middleName
										.equals(middleNameStored) && newPassword.equals(passwordStored) && role == roleStored) {
							System.out.println("No changes occured");
							response.getWriter().write("noChange");
							
						} else {
							
							ResultSet checkExistingUserRS = SQLOperations.getUsernames(username, connection);
							if (checkExistingUserRS.next()) {
								
								response.getWriter().write("userExists");
								
								if (!usernameStored.equals(username)) {
									auditBean = new AuditBean(
											"User Management - username attempt change to " + username + " but already existed",
											(String) lastName + ", " + firstName + " " + middleName, (String) session.getAttribute("name"),
											Integer.parseInt((String) session.getAttribute("accountID")));
									SQLOperations.addAudit(auditBean, connection);
								}
								
							} else {
								
								AccountBean ab = BeanFactory.getAccountBean(username, newPassword, lastName, middleName, firstName, role);
								if (SQLOperations.updateUser(ab, Integer.parseInt((String) request.getParameter("accountID")),
										connection)) {
									
									response.getWriter().write("Success");
									System.out.println("Success Edit profile");
									
									if (!usernameStored.equals(username)) {
										auditBean = new AuditBean("User Management - username updated to " + username,
												(String) lastName + ", " + firstName + " " + middleName,
												(String) session.getAttribute("name"),
												Integer.parseInt((String) session.getAttribute("accountID")));
										SQLOperations.addAudit(auditBean, connection);
									}
									if (!lastNameStored.equals(lastName) || !firstNameStored.equals(firstName) || !middleNameStored
											.equals(middleName)) {
										auditBean = new AuditBean(
												"User Management - user " + username + " updated the name to " + lastName + ", " + firstName + " " + middleName,
												(String) lastName + ", " + firstName + " " + middleName,
												(String) session.getAttribute("name"),
												Integer.parseInt((String) session.getAttribute("accountID")));
										SQLOperations.addAudit(auditBean, connection);
									}
									if (roleStored != role) {
										auditBean = new AuditBean("User Management - user " + username + "'s role changed to " + roleString,
												(String) lastName + ", " + firstName + " " + middleName,
												(String) session.getAttribute("name"),
												Integer.parseInt((String) session.getAttribute("accountID")));
										SQLOperations.addAudit(auditBean, connection);
									}
									
								} else {
									
									if (!usernameStored.equals(username)) {
										auditBean = new AuditBean("User Management - username update to " + username + " failed",
												(String) lastName + ", " + firstName + " " + middleName,
												(String) session.getAttribute("name"),
												Integer.parseInt((String) session.getAttribute("accountID")));
										SQLOperations.addAudit(auditBean, connection);
									}
									if (!lastNameStored.equals(lastName) || !firstNameStored.equals(firstName) || !middleNameStored
											.equals(middleName)) {
										auditBean = new AuditBean(
												"User Management - user " + username + " failed to update the name to " + lastName + ", " + firstName + " " + middleName,
												(String) lastName + ", " + firstName + " " + middleName,
												(String) session.getAttribute("name"),
												Integer.parseInt((String) session.getAttribute("accountID")));
										SQLOperations.addAudit(auditBean, connection);
									}
									if (roleStored != role) {
										auditBean = new AuditBean(
												"User Management - user " + username + "'s role failed to change to " + roleString,
												(String) lastName + ", " + firstName + " " + middleName,
												(String) session.getAttribute("name"),
												Integer.parseInt((String) session.getAttribute("accountID")));
										SQLOperations.addAudit(auditBean, connection);
									}
									
								}
								
							}
							
						}
					}
				} catch (NumberFormatException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else {
				System.out.println("Invalid connection");
			}
		}
	}
}
