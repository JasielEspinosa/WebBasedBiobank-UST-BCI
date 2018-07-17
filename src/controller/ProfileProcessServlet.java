package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AccountBean;
import model.AuditBean;
import utility.database.SQLOperations;
import utility.factory.BeanFactory;

@WebServlet("/ProfileProcessServlet")
public class ProfileProcessServlet extends HttpServlet {
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
	
	public ProfileProcessServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		AuditBean auditBean;
		System.out.println(session.getAttribute("name"));
		
		try {
			if (connection != null) {
				ResultSet userRS = SQLOperations.getProfile(Integer.parseInt((String) session.getAttribute("accountID")), connection);
				while (userRS.next()) {
					
					String usernameStored = userRS.getString("Username");
					String passwordStored = userRS.getString("Password");
					String lastNameStored = userRS.getString("LastName").trim().toUpperCase();
					String firstNameStored = userRS.getString("FirstName").trim().toUpperCase();
					String middleNameStored = userRS.getString("MiddleName").trim().toUpperCase();
					
					String username = request.getParameter("username");
					String currentPassword = request.getParameter("oldPassword");
					String newPassword = request.getParameter("password");
					//String confirmPassword = request.getParameter("confirmPassword");
					String lastName = request.getParameter("lastName").trim().toUpperCase();
					String firstName = request.getParameter("firstName").trim().toUpperCase();
					String middleName = request.getParameter("middleInitial").trim().toUpperCase();
					
					//No changes occured
					if (username.equals(usernameStored) && lastName.equals(lastNameStored) && firstName
							.equals(firstNameStored) && middleName.equals(middleNameStored) && newPassword.equals("")) {
						System.out.println("No changes occured");
						
						response.getWriter().write("noChange");
						
					} else {
						
						ResultSet checkExistingUserRS = SQLOperations.getUsernames(username, connection);
						if (checkExistingUserRS.next() && !username.equals(usernameStored)) {
							
							response.getWriter().write("userExists");
							
							if (!usernameStored.equals(username)) {
								auditBean = new AuditBean("User Profile - username attempt change to " + username + " but already existed",
										(String) session.getAttribute("name"), (String) session.getAttribute("name"),
										Integer.parseInt((String) session.getAttribute("accountID")));
								SQLOperations.addAudit(auditBean, connection);
							}
							
						} else {
							
							if (currentPassword.equals("")) {
								
								response.getWriter().write("confirmOldPass");
								
							} else {
								
								if (!currentPassword.equals(passwordStored)) {
									response.getWriter().write("incorrectPass");
									
									auditBean = new AuditBean("User Profile - password change attempt failed",
											(String) session.getAttribute("name"), (String) session.getAttribute("name"),
											Integer.parseInt((String) session.getAttribute("accountID")));
									SQLOperations.addAudit(auditBean, connection);
									
								} else {
									
									if (newPassword.equals("")) {
										
										//update no password change
										AccountBean ab = BeanFactory.getAccountBean(username, passwordStored, lastName, middleName,
												firstName, 0);
										if (SQLOperations.updateProfileNoPass(ab,
												Integer.parseInt((String) session.getAttribute("accountID")), connection)) {
											response.getWriter().write("Success");
											System.out.println("Success");
											
											if (!usernameStored.equals(username)) {
												auditBean = new AuditBean("User Profile - username updated to " + username,
														(String) session.getAttribute("name"), (String) session.getAttribute("name"),
														Integer.parseInt((String) session.getAttribute("accountID")));
												SQLOperations.addAudit(auditBean, connection);
											}
											if (!lastNameStored.equals(lastName) || !firstNameStored.equals(firstName) || !middleNameStored
													.equals(middleName)) {
												auditBean = new AuditBean(
														"User profile - user " + username + " updated the name to " + lastName + ", " + firstName + " " + middleName,
														(String) session.getAttribute("name"), (String) session.getAttribute("name"),
														Integer.parseInt((String) session.getAttribute("accountID")));
												SQLOperations.addAudit(auditBean, connection);
												
											}
											
										} else {
											
											if (!usernameStored.equals(username)) {
												auditBean = new AuditBean("User Profile - username update to " + username + " failed",
														(String) session.getAttribute("name"), (String) session.getAttribute("name"),
														Integer.parseInt((String) session.getAttribute("accountID")));
												SQLOperations.addAudit(auditBean, connection);
											}
											if (!lastNameStored.equals(lastName) || !firstNameStored.equals(firstName) || !middleNameStored
													.equals(middleName)) {
												auditBean = new AuditBean(
														"User profile - user " + username + " failed to update the name to " + lastName + ", " + firstName + " " + middleName,
														(String) session.getAttribute("name"), (String) session.getAttribute("name"),
														Integer.parseInt((String) session.getAttribute("accountID")));
												SQLOperations.addAudit(auditBean, connection);
											}
											
										}
										
									} else if (!newPassword.equals("")) {
										
										if (newPassword.equals(passwordStored)) {
											response.getWriter().write("noPassChange");
										} else {
											
											//update with password change
											AccountBean ab = BeanFactory.getAccountBean(username, newPassword, lastName, middleName,
													firstName, 0);
											if (SQLOperations.updateProfile(ab,
													Integer.parseInt((String) session.getAttribute("accountID")), connection)) {
												response.getWriter().write("Success");
												System.out.println("Success");
												
												if (!usernameStored.equals(username)) {
													auditBean = new AuditBean("User Profile - username updated to " + username,
															(String) session.getAttribute("name"), (String) session.getAttribute("name"),
															Integer.parseInt((String) session.getAttribute("accountID")));
													SQLOperations.addAudit(auditBean, connection);
												}
												if (!lastNameStored.equals(lastName) || !firstNameStored
														.equals(firstName) || !middleNameStored.equals(middleName)) {
													auditBean = new AuditBean(
															"User profile - user " + username + " updated the name to " + lastName + ", " + firstName + " " + middleName,
															(String) session.getAttribute("name"), (String) session.getAttribute("name"),
															Integer.parseInt((String) session.getAttribute("accountID")));
													SQLOperations.addAudit(auditBean, connection);
												}
												auditBean = new AuditBean("User Profile - password updated",
														(String) session.getAttribute("name"), (String) session.getAttribute("name"),
														Integer.parseInt((String) session.getAttribute("accountID")));
												SQLOperations.addAudit(auditBean, connection);
												
											} else {
												
												if (!usernameStored.equals(username)) {
													auditBean = new AuditBean("User Profile - username update to " + username + " failed",
															(String) session.getAttribute("name"), (String) session.getAttribute("name"),
															Integer.parseInt((String) session.getAttribute("accountID")));
													SQLOperations.addAudit(auditBean, connection);
												}
												if (!lastNameStored.equals(lastName) || !firstNameStored
														.equals(firstName) || !middleNameStored.equals(middleName)) {
													auditBean = new AuditBean(
															"User profile - user " + username + " failed to update the name to " + lastName + ", " + firstName + " " + middleName,
															(String) session.getAttribute("name"), (String) session.getAttribute("name"),
															Integer.parseInt((String) session.getAttribute("accountID")));
													SQLOperations.addAudit(auditBean, connection);
												}
												auditBean = new AuditBean("User Profile - password update failed",
														(String) session.getAttribute("name"), (String) session.getAttribute("name"),
														Integer.parseInt((String) session.getAttribute("accountID")));
												SQLOperations.addAudit(auditBean, connection);
												
											}
											
										}
									}
								}
							}
							
						}
						
					}
				}
			} else {
				System.out.println("Invalid connection");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
