package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.AccountBean;
import model.StatisticsValueBean;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;

/**
 * Servlet implementation class PatientStatisticsServlet
 */
@WebServlet("/PatientStatisticsServlet")
public class PatientStatisticsServlet extends HttpServlet {
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
    public PatientStatisticsServlet() {
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
		
		
		String sortFrom = request.getParameter("sortFrom");
		String sortTo = request.getParameter("sortTo");
		
		Boolean sortFromStat = true;
		Boolean sortToStat = true;
		
		if(sortFrom.equals("")) {
			sortFromStat = false;
		}
		if(sortTo.equals("")) {
			sortToStat = false;
		}
		
		int patientID = Integer.parseInt(request.getParameter("patientIDNumber"));
		
		ResultSet patientStatisticsRS = null;
		
		ResultSet patientListRS = null;
		
		response.setContentType("application/json");
		List<StatisticsValueBean> statistics = new ArrayList<StatisticsValueBean>();
		
		
		try {
			if (connection != null) {
				if(sortFromStat && sortToStat) {
					patientListRS = SQLOperations.getStatus(patientID, connection, sortFrom, sortTo);
				}
				if(!sortFromStat && !sortToStat) {
					patientListRS = SQLOperations.getStatusAll(patientID, connection);
				}
				if(sortFromStat && !sortToStat) {
					patientListRS = SQLOperations.getStatusFrom(patientID, connection, sortFrom);
				}
				if(!sortFromStat && sortToStat) {
					patientListRS = SQLOperations.getStatusTo(patientID, connection, sortTo);
				}
				
				
				
				int diseaseStatusID;
				ResultSet diseaseStatusRS = null;
				
				if (patientListRS.next()) {
					
					String dateOfEntry = patientListRS.getString("DateOfEntryDec");
					
					diseaseStatusID = patientListRS.getInt("DiseaseStatusID");
					diseaseStatusRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusID, connection);
					diseaseStatusRS.first();
					
					String diseaseStatusBaselineValue = diseaseStatusRS.getString("DiseaseStatus");
					
					StatisticsValueBean svb = new StatisticsValueBean(diseaseStatusBaselineValue, dateOfEntry);
					statistics.add(svb);
				}
				
				ResultSet followupRS = null;
				
				//logic for sort
				if(sortFromStat && sortToStat) {
					followupRS = SQLOperations.getFollowupStatus(patientID, connection, sortFrom, sortTo);
				}
				if(!sortFromStat && !sortToStat) {
					followupRS = SQLOperations.getFollowupStatusAll(patientID, connection);
				}
				if(sortFromStat && !sortToStat) {
					followupRS = SQLOperations.getFollowupStatusFrom(patientID, connection, sortFrom);
				}
				if(!sortFromStat && sortToStat) {
					followupRS = SQLOperations.getFollowupStatusTo(patientID, connection, sortTo);
				}
					
				while(followupRS.next()) {
					
					String dateOfEntry = followupRS.getString("DateOfEntryDec");
					
					diseaseStatusID = followupRS.getInt("DiseaseStatusID");
					diseaseStatusRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusID, connection);
					diseaseStatusRS.first();
					String diseaseStatusFollowupValue = diseaseStatusRS.getString("DiseaseStatus");
					
					StatisticsValueBean svb = new StatisticsValueBean(diseaseStatusFollowupValue, dateOfEntry);
					statistics.add(svb);

				}
				
				
				
				String json = new Gson().toJson(statistics);
				response.getWriter().write(json);
				
			} else {
				System.out.println("Invalid Connection resource");
			}

		} catch (NullPointerException npe) {
			System.err.println("Invalid Connection resource - " + npe.getMessage());
		} catch (Exception e) {
			System.err.println("Exception - " + e.getMessage());
		}
	}

}
