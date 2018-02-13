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

import com.google.gson.Gson;

import model.SearchBean;
import utility.database.SQLOperations;

/**
 * Servlet implementation class LoadPatientsServlet
 */
@WebServlet("/LoadPatientsServlet")
public class LoadPatientsServlet extends HttpServlet {
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
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadPatientsServlet() {
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
		response.setContentType("application/json"); 
		
		List<SearchBean> list = new ArrayList<>();
		
		String action = request.getParameter("action");
		String search = request.getParameter("search");
		
		if(connection != null) {
		ResultSet patientListRs = SQLOperations.getPatientList(action,search,connection);	
			try {
				while(patientListRs.next()) {
				    
					SearchBean sb = new SearchBean(patientListRs.getInt("PatientTable.PatientID"), patientListRs.getString("GeneralDataTable.LastName"),
							patientListRs.getString("GeneralDataTable.FirstName"), patientListRs.getString("GeneralDataTable.MiddleName"));
				    
				    list.add(sb);
				}
				String json = new Gson().toJson(list);
			    response.getWriter().write(json);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}else {
		System.out.println("Invalid connection");
	}
		
		
	}

}
