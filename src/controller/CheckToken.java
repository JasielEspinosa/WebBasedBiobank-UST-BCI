package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
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

/**
 * Servlet implementation class CheckToken
 */
@WebServlet("/CheckToken")
public class CheckToken extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Connection connection;
	String redirectLink = "login.jsp";

	public void init(ServletConfig config) throws ServletException {
		//super.init(config);
		connection = SQLOperations.getConnection();
		//redirectLink = getServletContext().getInitParameter("LoginRedirectLink");
//		if (connection != null) {
//			getServletContext().setAttribute("dbConnection", connection);
//			System.out.println("connection is READY.");
//		} else {
//			System.err.println("connection is NULL.");
//		}
	}
    public CheckToken() {
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
		response.setCharacterEncoding("UTF-8");
		String token = request.getParameter("token");
		ResultSet checkTokenRS = SQLOperations.getToken(token, connection);
		LocalDateTime getLocalTime = LocalDateTime.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		try {
			if(checkTokenRS.next()) {
				System.out.println("maytoken");
				Date dateToken = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(checkTokenRS.getString("expirationNoMili"));
				Date dateNow = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateFormat.format(getLocalTime));
				
				if(dateNow.after(dateToken)) {
					

					response.getWriter().write("This link has expired. Please enter your email again on the forgot password.");
				}
			}else {
				System.out.println("latoken");

				response.getWriter().write("The link is not available.");
			}
		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		}
	}

}
