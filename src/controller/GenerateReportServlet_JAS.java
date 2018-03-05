package controller;

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

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import utility.database.SQLOperationsBaseline;

@WebServlet("/GenerateReportServlet_JAS")
public class GenerateReportServlet_JAS extends HttpServlet {
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

	public GenerateReportServlet_JAS() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		Map<String, String> patientData = new LinkedHashMap<>();

		//int patientID = Integer.parseInt(request.getParameter("patientID"));
		int patientID = 1;

		getServletContext().log("User selections");

		String fromDateGR = request.getParameter("fromDateGenerateReport");
		String toDateGR = request.getParameter("toDateGenerateReport");
		String diseaseTypeGR = request.getParameter("diseaseType");

		boolean ageGR;
		if (request.getParameter("ageGR") != null) {
			ageGR = true;
			System.out.println("Age: " + ageGR);
		} else {
			ageGR = false;
			System.out.println("Age: " + ageGR);
		}

		boolean genderGR;
		if (request.getParameter("genderGR") != null) {
			genderGR = true;
			System.out.println("Gender: " + genderGR);
		} else {
			genderGR = false;
			System.out.println("Gender: " + genderGR);
		}

		boolean modeOfTreatmentGR;
		if (request.getParameter("modeOfTreatmentGR") != null) {
			modeOfTreatmentGR = true;
			System.out.println("Mode of Treatment: " + modeOfTreatmentGR);
		} else {
			modeOfTreatmentGR = false;
			System.out.println("Mode of Treatment: " + modeOfTreatmentGR);
		}

		boolean dsBaselineGR;
		if (request.getParameter("dsBaselineGR") != null) {
			dsBaselineGR = true;
			System.out.println("Baseline Included: " + dsBaselineGR);
		} else {
			dsBaselineGR = false;
			System.out.println("Baseline Included: " + dsBaselineGR);
		}

		boolean dsFollowupGR;
		if (request.getParameter("dsFollowupGR") != null) {
			dsFollowupGR = true;
			System.out.println("Follow Up Included: " + dsFollowupGR);
		} else {
			dsFollowupGR = false;
			System.out.println("Follow Up Included: " + dsFollowupGR);
		}

		String paperSize = request.getParameter("paperSize");
		String paperLayout = request.getParameter("paperLayout");

		//ServletOutputStream servletOutputStream = response.getOutputStream();
		response.setContentType("application/pdf");
		/*response.setContentType("text/html");*/

		//create a new document
		Document document = new Document();

		//create some special styles and font sizes
		Font font_tnr_11 = new Font(FontFamily.TIMES_ROMAN, 11);
		Font font_tnr_11_b = new Font(FontFamily.TIMES_ROMAN, 11, Font.BOLD, new BaseColor(0, 0, 0));
		Font font_tnr_18_b = new Font(FontFamily.TIMES_ROMAN, 18, Font.BOLD, new BaseColor(0, 0, 0));

		try {
			if (connection != null) {

				getServletContext().log("Connection found. Start of Document Roll");

				//create an instance of the PdfWriter using the output stream

				//file path
				//String path = "docs/" + pdfFilename;
				//docWriter = PdfWriter.getInstance(doc, new FileOutputStream(path));

				PdfWriter.getInstance(document, response.getOutputStream());
				Paragraph paragraph = new Paragraph();

				//document header properties			
				document.addTitle("GenerateReportServlet");
				document.addAuthor("Cancer Developers");
				document.addCreationDate();
				document.addProducer();
				document.addCreator("Cancer Developers");

				System.out.println(paperSize);
				System.out.println(paperLayout);

				Rectangle paper = null;

				if (paperSize.equalsIgnoreCase("LETTER")) {
					paper = PageSize.LETTER;
				} else if (paperSize.equalsIgnoreCase("LEGAL")) {
					paper = PageSize.LEGAL;
				} else if (paperSize.equalsIgnoreCase("A4")) {
					paper = PageSize.A4;
				}

				if (paperLayout.equalsIgnoreCase("landscape")) {
					paper = paper.rotate();
				}

				document.setPageSize(paper);

				document.open();

				document.add(new Paragraph("BCI Cancer Patients - " + diseaseTypeGR + " Disease", font_tnr_18_b));

				ResultSet patientInfoRS = SQLOperationsBaseline.getPatient(patientID, connection);
				patientInfoRS.first();
				patientData.put("patientIDNumber", patientInfoRS.getString("PatientID"));

				int generalDataID = patientInfoRS.getInt("GeneralDataID");
				ResultSet generalDataRS = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
				generalDataRS.first();

				String PatientName = generalDataRS.getString("LastName") + ", " + generalDataRS.getString("FirstName") + " "
						+ generalDataRS.getString("MiddleName");

				String Gender = generalDataRS.getString("Gender");
				System.out.println("Gender: " + generalDataRS.getString("Gender"));

				if (Gender.equals("1")) {
					Gender = "M";
				} else if (Gender.equals("2")) {
					Gender = "F";
				}

				//create an anchor reference
				Anchor anchor;

				anchor = new Anchor("Sample".trim(), font_tnr_11_b);
				anchor.setReference("#" + "Sample".trim());
				document.add(anchor);
				document.add(Chunk.NEWLINE);

				//Start infos here

				/*				doc.add(new Paragraph("Patient Name: " + PatientName.trim().toUpperCase(), bf12));
				doc.add(new Paragraph("Gender: " + Gender.trim(), bf12));
				doc.add(new Paragraph("Date of Birth: " + generalDataRS.getString("DateOfBirth").trim(), bf12));
				doc.add(new Paragraph("Date of Entry: " + generalDataRS.getString("DateOfEntry").trim(), bf12));*/

				float[] columnTable1 = { 3f, 5f, 2f, 1f, 2f, 2f };
				PdfPTable table = new PdfPTable(columnTable1);
				table.setWidthPercentage(90f);
				insertCell(table, "Patient Name: ", Element.ALIGN_RIGHT, 1, font_tnr_11_b);
				insertCell(table, PatientName.trim().toUpperCase(), Element.ALIGN_LEFT, 1, font_tnr_11);
				insertCell(table, "Gender: ", Element.ALIGN_RIGHT, 1, font_tnr_11_b);
				insertCell(table, Gender.trim().toUpperCase(), Element.ALIGN_LEFT, 1, font_tnr_11);
				insertCell(table, "Birth Date: ", Element.ALIGN_RIGHT, 1, font_tnr_11_b);
				insertCell(table, generalDataRS.getString("DateOfEntry").trim(), Element.ALIGN_LEFT, 1, font_tnr_11);
				table.setHeaderRows(1);

/*				//insert column headings
				insertCell(table, "Order No", Element.ALIGN_RIGHT, 1, bfBold12);
				insertCell(table, "Account No", Element.ALIGN_LEFT, 1, bfBold12);
				insertCell(table, "Account Name", Element.ALIGN_LEFT, 1, bfBold12);
				insertCell(table, "Order Total", Element.ALIGN_RIGHT, 1, bfBold12);
				table.setHeaderRows(1);*/

				//insert an empty row
				insertCell(table, "", Element.ALIGN_CENTER, 6, font_tnr_11_b);
				
				paragraph.add(table);

				//Incrementing Fill
				//for (int x = 1; x < 5; x++) {

/*					insertCell(table, "10010" + x, Element.ALIGN_RIGHT, 1, bf12);
					insertCell(table, "ABC00" + x, Element.ALIGN_LEFT, 1, bf12);
					insertCell(table, "This is Customer Number ABC00" + x, Element.ALIGN_LEFT, 1, bf12);
					insertCell(table, "Sample", Element.ALIGN_RIGHT, 1, bf12);*/

				//}

				//insertCell(table, "Sample...", Element.ALIGN_RIGHT, 3, bfBold12);

				float[] columnTable2 = { 1f, 1f };
				table = new PdfPTable(columnTable2);
				table.setWidthPercentage(90f);
				
				insertCell(table, "", Element.ALIGN_CENTER, 2, font_tnr_11_b);

				paragraph.add(table);

				document.add(paragraph);

				//start a new page here
				//doc.newPage();

				document.close();

			} else {
				System.out.println("Invalid Connection resource");
			}
		} catch (DocumentException de) {
			System.out.println("DocumentException: " + de.getMessage());
		} catch (NullPointerException npe) {
			System.err.println("Invalid Connection resource - " + npe.getMessage());
		} catch (Exception e) {
			System.err.println("Exception - " + e.getMessage());
		}

	}

	private void insertCell(PdfPTable table, String text, int align, int colspan, Font font) {

		//create a new cell with the specified Text and Font
		PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
		//set the cell alignment
		cell.setHorizontalAlignment(align);
		//set the cell column span in case you want to merge two or more cells
		cell.setColspan(colspan);
		//in case there is no text and you wan to create an empty row
		if (text.trim().equalsIgnoreCase("")) {
			cell.setMinimumHeight(10f);
		}
		//add the call to the table
		table.addCell(cell);

	}

}
