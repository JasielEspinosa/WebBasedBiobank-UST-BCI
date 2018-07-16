package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

@WebServlet("/SessionTerminateServlet")
public class SessionTerminateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public SessionTerminateServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.invalidate();
		String redirectURL = "login.jsp";
		Map<String, String> data = new HashMap<>();
		data.put("redirect", redirectURL);
		String json = new Gson().toJson(data);
		response.setContentType("application/json");
		response.getWriter().write(json);
	}
}
