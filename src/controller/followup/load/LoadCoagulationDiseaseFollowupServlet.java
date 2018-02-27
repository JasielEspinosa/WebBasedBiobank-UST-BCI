package controller.followup.load;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import utility.database.SQLOperationsBaseline;
import utility.database.SQLOperationsFollowUp;

/**
 * Servlet implementation class LoadAAPHSMDSFollowupServlet
 */
@WebServlet("/LoadAAPHSMDSFollowupServlet")
public class LoadCoagulationDiseaseFollowupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private Connection connection;

	public void init()
			throws ServletException {
		connection = SQLOperationsBaseline.getConnection();

		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}
    public LoadCoagulationDiseaseFollowupServlet() {
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
	    Map<String, String> followupData = new LinkedHashMap<>();
		
		int followupId = Integer.parseInt(request.getParameter("followupId"));
		followupData.put("followupId", Integer.toString(followupId));
		
		try {	
			if (connection != null) {
				
				//get followup table
				ResultSet followup = SQLOperationsFollowUp.getFollowup(followupId, connection);
				followup.first();
				followupData.put("dateOfEntry", followup.getString("dateOfEntry"));
				followupData.put("dateOfVisit", followup.getString("dateOfVisit"));
				followupData.put("notes", followup.getString("notes"));
				
				int medicalEventsid =  followup.getInt("MedicalEventsID");

				//medical events
				ResultSet medicalEvents = SQLOperationsFollowUp.getMedicalEvents(medicalEventsid, connection);
				medicalEvents.first();
				
				followupData.put("factorConcentrate", medicalEvents.getString("factorConcentrate"));
				followupData.put("factorConcentrateDates", medicalEvents.getString("factorConcentrateDates"));
				followupData.put("factorConcentrateDose", medicalEvents.getString("factorConcentrateDose"));

				followupData.put("procedureIntervention", medicalEvents.getString("procedureIntervention"));
				
				//return data to js
			    String json = new Gson().toJson(followupData);
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
