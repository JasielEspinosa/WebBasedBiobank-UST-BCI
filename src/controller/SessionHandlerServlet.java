package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import utility.database.SQLOperations;

@WebServlet("/SessionHandler")
public class SessionHandlerServlet extends HttpServlet {
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

	public SessionHandlerServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("sessionTest");
		HttpSession session = request.getSession(true);
		if (session.getAttribute("name") == null) {
			System.out.println("session is null");
			String redirectURL = "login.jsp";

			Map<String, String> data = new HashMap<>();
			data.put("redirect", redirectURL);
			String json = new Gson().toJson(data);

			response.setContentType("application/json");
			response.getWriter().write(json);
		}
	}

}
