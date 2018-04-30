package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import utility.database.SQLOperations;

/** Servlet implementation class ResetPasswod */
@WebServlet("/ResetPassword")
public class ResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection connection;
	
	String redirectLink = "";
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		connection = SQLOperations.getConnection();
		redirectLink = getServletContext().getInitParameter("LoginRedirectLink");
		if (connection != null) {
			//getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}
	
	public ResetPassword() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newPassword = request.getParameter("newPassword");
		String token = request.getParameter("token");
		Map<String, String> data = new HashMap<>();
		ResultSet resetPasswordRS = SQLOperations.getToken(token, connection);
		try {
			if (resetPasswordRS.next()) {
				SQLOperations.updatePassword(resetPasswordRS.getInt("AccountID"), newPassword, connection);
				data.put("redirect", redirectLink);
				data.put("noLink", "");
				String json = new Gson().toJson(data);
				response.getWriter().write(json);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
