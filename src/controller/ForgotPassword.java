package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import security.SendEmail;
import security.TokenGenerator;
import utility.database.SQLOperations;

/**
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
	String email = "";
	String password = "";
	String redirectLink = "";
	  @Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		email = getServletContext().getInitParameter("Email");
		password = getServletContext().getInitParameter("EmailPassword");
		redirectLink = getServletContext().getInitParameter("ForgotRedirectLink");
		
		System.out.println(email);
		
		connection = SQLOperations.getConnection();

		if (connection != null) {
			//getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}
    public ForgotPassword() {
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
		
		String forgotpasswordEmail = request.getParameter("forgotpasswordEmail");
		
		ResultSet forgotpassRS = SQLOperations.getAccountID(forgotpasswordEmail, connection);
		
		response.setCharacterEncoding("UTF-8");
		
		try {
			if(forgotpassRS.first()) {
				String token = TokenGenerator.generateToken(forgotpassRS.getString("AccountID"));
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Calendar cal = Calendar.getInstance();
				cal.setTime(Calendar.getInstance().getTime());
				cal.add( Calendar.DATE, 1 );
			
				String expiration =  dateFormat.format(cal.getTime());
				
				SQLOperations.insertToken(forgotpassRS.getInt("AccountID"), token, expiration, connection);
				System.out.println(SendEmail.send(email, password, forgotpasswordEmail, "USTH BCI Biobank Forgot Password", redirectLink,token));
				response.getWriter().write("Success");
			}
			else {
				response.getWriter().write("Fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
