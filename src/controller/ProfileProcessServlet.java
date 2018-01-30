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
import utility.database.SQLOperations;
import utility.factory.BeanFactory;

/**
 * Servlet implementation class ProfileProcessServlet
 */
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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(true);
		
		String username = request.getParameter("username");
		String oldPassword = request.getParameter("oldPassword");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String middleInitial = request.getParameter("middleInitial");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain"); 
		
		String dbOldPassword = "";
		
		if(connection != null) {
			
			ResultSet oldPassRs = SQLOperations.getOldPassword(Integer.parseInt((String) session.getAttribute("accountID")), connection);
			try {
				
				if(oldPassword.equals("") && password.equals("")  && confirmPassword.equals("")) {
					AccountBean ab = BeanFactory.getAccountBean(username, password, lastName, firstName, middleInitial, 0);
					if(SQLOperations.updateProfileNoPass(ab, Integer.parseInt((String) session.getAttribute("accountID")), connection)) {
					    response.getWriter().write("Success");
					    System.out.println("Success");
						
					}else {
						 response.getWriter().write("Failed 3");
						 System.out.println("Failed 3");
					}
				}else {
					if(oldPassRs.next()) {
						dbOldPassword = oldPassRs.getString("Password");
					}
					
					if(!dbOldPassword.equals(oldPassword)){
					    response.getWriter().write("Old Password is incorrect.");
						System.out.println("Failed 1");
					}else if(!password.equals(confirmPassword)) {
					    response.getWriter().write("New Password and confirm password does not match.");
						System.out.println("Failed 2");
					}else {
						AccountBean ab = BeanFactory.getAccountBean(username, password, lastName, firstName, middleInitial, 0);
						if(SQLOperations.updateProfile(ab, Integer.parseInt((String) session.getAttribute("accountID")), connection)) {
						    response.getWriter().write("Success");
						    System.out.println("Success");
							
						}else {
							 response.getWriter().write("Failed 3");
							 System.out.println("Failed 3");
						}
					}
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
