package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import model.SearchBean;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;
import utility.pdf.GenerateReport;

/**
 * Servlet implementation class GenerateReportServlet
 */
@WebServlet("/GenerateReportServlet")
public class GenerateReportServlet extends HttpServlet {
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
	
    public GenerateReportServlet() {
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
		
		String fromDateGenerateReport = request.getParameter("fromDateGenerateReport");
		String toDateGenerateReport = request.getParameter("toDateGenerateReport");

		int age = Integer.parseInt(request.getParameter("age"));
		int gender = Integer.parseInt(request.getParameter("gender"));
		int modeOfTreatment = Integer.parseInt(request.getParameter("modeOfTreatment"));
		int diseaseStatusBaseline = Integer.parseInt(request.getParameter("diseaseStatusBaseline"));
		int diseaseStatusFollowup = Integer.parseInt(request.getParameter("diseaseStatusFollowup"));
		
		int diseaseType = Integer.parseInt(request.getParameter("diagnosis"));
		//generate report
		
		GenerateReport gr = new GenerateReport(fromDateGenerateReport, toDateGenerateReport, age, gender, modeOfTreatment, diseaseStatusBaseline, diseaseStatusFollowup);
		
		try {
			if (connection != null) {
				//patient table
				
				ResultSet patientListRS;
				if(diseaseType == 9) {
					patientListRS = SQLOperations.grGetPatients(fromDateGenerateReport,toDateGenerateReport,connection);
				}else {
					patientListRS = SQLOperations.grGetPatients(diseaseType,fromDateGenerateReport,toDateGenerateReport, connection);
				}
				
				while(patientListRS.next()) {
					
					//logic for every disease header
				   
					int patientID = patientListRS.getInt("PatientID");
					int generalDataID = patientListRS.getInt("GeneralDataID");
					ResultSet generalDataRS = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
					while(generalDataRS.next()) {
						String name = generalDataRS.getString("FirstName") + " " + generalDataRS.getString("MiddleName") + " " + generalDataRS.getString("LastName");
						int genderID = generalDataRS.getInt("Gender");
						String genderValue;
						if(genderID == 1) {
							genderValue = "Male";
						}
						else {
							genderValue = "Female";
						}
						
						//put age algo here jas
						String dateOfBirth = generalDataRS.getString("DateOfBirth");
						
						int ageValue;
						
						//end of age algo
						
						int treatmentID = patientListRS.getInt("TreatmentID");
						
						ResultSet treatmentRS = SQLOperationsBaseline.getTreatment(treatmentID, connection);
						treatmentRS.first();
						int modeOfTreatmentID = treatmentRS.getInt("ModeOfTreatmentID");
						ResultSet modeOfTreatmentRS = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentID, connection);
						modeOfTreatmentRS.first();
						
						String modeOfTreatmentValue =  modeOfTreatmentRS.getString("ModeOfTreatment");
						
						//if walang baseline dapat hindi to kasama so mag if statement ka dito
						int diseaseStatusID = patientListRS.getInt("DiseaseStatusID");
						ResultSet diseaseStatusRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusID, connection);
						diseaseStatusRS.first();
						
						String diseaseStatusBaselineValue = diseaseStatusRS.getString("DiseaseStatus");
						//end
						ResultSet followupRS = SQLOperations.grGetFollowup(patientID,fromDateGenerateReport,toDateGenerateReport, connection);
						while(followupRS.next()) {
							diseaseStatusID = followupRS.getInt("DiseaseStatusID");
							diseaseStatusRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusID, connection);
							diseaseStatusRS.first();
							String diseaseStatusFollowupValue = diseaseStatusRS.getString("DiseaseStatus");
						}
					}
				}
					
				
				
			} else {
				System.out.println("Invalid Connection resource");
			}
		} catch (NullPointerException npe) {
			System.err.println("Invalid Connection resource - " + npe.getMessage());
		} catch (Exception e) {
			System.err.println("Exception - " + e.getMessage());
		}
		
		
		try {
            // Get the text that will be added to the PDF
            String text = "test";
            if (text == null || text.trim().length() == 0) {
                 text = "You didn't enter any text.";
            }
            // step 1
            Document document = new Document();
            // step 2
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PdfWriter.getInstance(document, baos);
            // step 3
            document.open();
            // step 4
            document.add(new Paragraph(String.format(
                "You have submitted the following text using the %s method:",
                request.getMethod())));
            document.add(new Paragraph(text));
            // step 5
            document.close();
 
            // setting some response headers
            response.setHeader("Expires", "0");
            response.setHeader("Cache-Control",
                "must-revalidate, post-check=0, pre-check=0");
            response.setHeader("Pragma", "public");
            // setting the content type
            response.setContentType("application/pdf");
            // the contentlength
            response.setContentLength(baos.size());
            // write ByteArrayOutputStream to the ServletOutputStream
            OutputStream os = response.getOutputStream();
            baos.writeTo(os);
            os.flush();
            os.close();
        }
        catch(DocumentException e) {
            throw new IOException(e.getMessage());
        }
	}

}
