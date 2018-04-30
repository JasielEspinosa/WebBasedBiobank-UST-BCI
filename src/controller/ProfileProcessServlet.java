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
		String username = request.getParameter("username");//.toUpperCase().trim();
		String oldPassword = request.getParameter("oldPassword");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String lastName = request.getParameter("lastName").toUpperCase().trim();
		String firstName = request.getParameter("firstName").toUpperCase().trim();
		String middleInitial = request.getParameter("middleInitial").toUpperCase().trim();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		String dbOldPassword = "";
		System.out.println(session.getAttribute("name"));
		if (connection != null) {
			ResultSet oldPassRs = SQLOperations.getOldPassword(Integer.parseInt((String) session.getAttribute("accountID")), connection);
			try {
				if (oldPassword.equals("") && password.equals("") && confirmPassword.equals("")) {
					AccountBean ab = BeanFactory.getAccountBean(username, password, lastName, middleInitial, firstName, 0);
					if (SQLOperations.updateProfileNoPass(ab, Integer.parseInt((String) session.getAttribute("accountID")), connection)) {
						response.getWriter().write("Success");
						System.out.println("Success");
						AuditBean auditBean = new AuditBean("User profile - username updated", (String) session.getAttribute("name"),
								(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
						SQLOperations.addAudit(auditBean, connection);
					} else {
						response.getWriter().write("Failed change names");
						System.out.println("Failed change names");
						AuditBean auditBean = new AuditBean("User profile - username change attempt failed",
								(String) session.getAttribute("name"), (String) session.getAttribute("name"),
								Integer.parseInt((String) session.getAttribute("accountID")));
						SQLOperations.addAudit(auditBean, connection);
					}
				} else {
					if (oldPassRs.next()) {
						dbOldPassword = oldPassRs.getString("Password");
					}
					if (!dbOldPassword.equals(oldPassword)) {
						AuditBean auditBean = new AuditBean("User profile - incorrect old password input",
								(String) session.getAttribute("name"), (String) session.getAttribute("name"),
								Integer.parseInt((String) session.getAttribute("accountID")));
						SQLOperations.addAudit(auditBean, connection);
						response.getWriter().write("Old Password is incorrect.");
						System.out.println("Failed Old Password is incorrect.");
					} else if (!password.equals(confirmPassword)) {
						AuditBean auditBean = new AuditBean("User profile - attempt password change failed",
								(String) session.getAttribute("name"), (String) session.getAttribute("name"),
								Integer.parseInt((String) session.getAttribute("accountID")));
						SQLOperations.addAudit(auditBean, connection);
						response.getWriter().write("New Password and confirm password does not match.");
						System.out.println("Failed New Password and confirm password does not match.");
					} else {
						AccountBean ab = BeanFactory.getAccountBean(username, password, lastName, middleInitial, firstName, 0);
						if (SQLOperations.updateProfile(ab, Integer.parseInt((String) session.getAttribute("accountID")), connection)) {
							response.getWriter().write("Success");
							System.out.println("Success");
							AuditBean auditBean = new AuditBean("User profile - password updated", (String) session.getAttribute("name"),
									(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
							SQLOperations.addAudit(auditBean, connection);
						} else {
							AuditBean auditBean = new AuditBean("User profile - attempt password update failed",
									(String) session.getAttribute("name"), (String) session.getAttribute("name"),
									Integer.parseInt((String) session.getAttribute("accountID")));
							SQLOperations.addAudit(auditBean, connection);
							response.getWriter().write("Failed change password");
							System.out.println("Failed change password");
						}
					}
				}
				// if name changed
				//String oldFullName = (String) session.getAttribute("name");
				String oldLastName = (String) session.getAttribute("lastName");
				String oldFirstName = (String) session.getAttribute("firstName");
				String oldMiddleName = (String) session.getAttribute("middleName");
				//String newFullName = lastName + ", " + firstName + " " + middleInitial;
				if (!oldLastName.equals(lastName)) {
					AuditBean auditBean = new AuditBean("User profile - last name updated to " + lastName,
							(String) session.getAttribute("name"), (String) session.getAttribute("name"),
							Integer.parseInt((String) session.getAttribute("accountID")));
					SQLOperations.addAudit(auditBean, connection);
				}
				if (!oldFirstName.equals(firstName)) {
					AuditBean auditBean = new AuditBean("User profile - first name updated to " + firstName,
							(String) session.getAttribute("name"), (String) session.getAttribute("name"),
							Integer.parseInt((String) session.getAttribute("accountID")));
					SQLOperations.addAudit(auditBean, connection);
				}
				if (!oldMiddleName.equals(middleInitial)) {
					AuditBean auditBean = new AuditBean("User profile - middle name updated to " + middleInitial,
							(String) session.getAttribute("name"), (String) session.getAttribute("name"),
							Integer.parseInt((String) session.getAttribute("accountID")));
					SQLOperations.addAudit(auditBean, connection);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Invalid connection");
		}
		//AccountBean ab = BeanFactory.getAccountBean(username, confirmPassword, lastName, middleInitial, firstName, roleId)
	}
}
