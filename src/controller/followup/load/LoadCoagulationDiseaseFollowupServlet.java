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

@WebServlet("/LoadCoagulationFollowupServlet")
public class LoadCoagulationDiseaseFollowupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;

	public void init() throws ServletException {
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
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		Map<String, String> followupData = new LinkedHashMap<>();

		int followupID = Integer.parseInt(request.getParameter("followupID"));
		followupData.put("followupID", Integer.toString(followupID));

		try {
			if (connection != null) {

				//get followup table
				ResultSet followup = SQLOperationsFollowUp.getFollowup(followupID, connection);
				followup.first();
				followupData.put("dateOfEntry", followup.getString("dateOfEntry"));
				followupData.put("dateOfVisit", followup.getString("dateOfVisit"));

				int medicalEventsid = followup.getInt("MedicalEventsID");

				//medical events
				ResultSet medicalEvents = SQLOperationsFollowUp.getMedicalEvents(medicalEventsid, connection);
				medicalEvents.first();

				followupData.put("specifyReasonFactorConcentrate", medicalEvents.getString("factorConcentrate"));
				followupData.put("datesOfAdministrationFactorConcentrate", medicalEvents.getString("factorConcentrateDates"));
				followupData.put("doseOfFactorConcentrate", medicalEvents.getString("factorConcentrateDose"));

				followupData.put("specifyProcedure", medicalEvents.getString("procedureIntervention"));

				followupData.put("specialNotes", followup.getString("notes"));

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
