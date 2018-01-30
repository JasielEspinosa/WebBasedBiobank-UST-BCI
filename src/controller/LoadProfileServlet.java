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

import utility.database.SQLOperations;

/**
 * Servlet implementation class LoadProfileServlet
 */
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
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json"); 
		
		
		if(connection != null) {
		ResultSet profileInfoRs = SQLOperations.getProfile(Integer.parseInt((String)session.getAttribute("accountID")), connection);	
			try {
				if(profileInfoRs.next()) {
				    Map<String, String> profile = new LinkedHashMap<>();
				    profile.put("Username", profileInfoRs.getString("Username"));
				    profile.put("Lastname", profileInfoRs.getString("Lastname"));
				    profile.put("Firstname", profileInfoRs.getString("Firstname"));
				    profile.put("MiddleName", profileInfoRs.getString("MiddleName"));
				    String json = new Gson().toJson(profile);
				    response.getWriter().write(json);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}else {
		System.out.println("Invalid connection");
	}
	
}
}
