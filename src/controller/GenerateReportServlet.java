package controller;

import java.io.IOException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itextpdf.text.*;
import com.itextpdf.text.Font.*;
import com.itextpdf.text.pdf.*;

import model.AuditBean;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;
import utility.database.SQLOperationsFollowUp;

@WebServlet("/GenerateReportServlet")
public class GenerateReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection connection;
	
	public void init() throws ServletException {
		connection = SQLOperations.getConnection();
		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("Connection SQLOperations is READY.");
		} else {
			System.err.println("Connection SQLOperations is NULL.");
		}
		connection = SQLOperationsBaseline.getConnection();
		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("Connection SQLOperationsBaseline is READY.");
		} else {
			System.err.println("Connection SQLOperationsBaseline is NULL.");
		}
		connection = SQLOperationsFollowUp.getConnection();
		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("Connection SQLOperationsFollowUp is READY.");
		} else {
			System.err.println("Connection SQLOperationsFollowUp is NULL.");
		}
	}
	
	public GenerateReportServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		String fromDateGR = request.getParameter("fromDateGenerateReport");
		String toDateGR = request.getParameter("toDateGenerateReport");
		String diseaseTypeGR = request.getParameter("diseaseType");
		System.out.println("From Date: " + fromDateGR);
		System.out.println("To Date: " + toDateGR);
		System.out.println("Disease Type: " + diseaseTypeGR);
		int diseaseTypeID = 0;
		if (diseaseTypeGR.equalsIgnoreCase("All")) {
			diseaseTypeID = 0;
			diseaseTypeGR = "All Diseases";
		} else if (diseaseTypeGR.equalsIgnoreCase("AA, PNH, MDS")) {
			diseaseTypeID = 1;
		} else if (diseaseTypeGR.equalsIgnoreCase("Coagulation")) {
			diseaseTypeID = 2;
		} else if (diseaseTypeGR.equalsIgnoreCase("Leukemia")) {
			diseaseTypeID = 3;
		} else if (diseaseTypeGR.equalsIgnoreCase("Lymphoma")) {
			diseaseTypeID = 4;
		} else if (diseaseTypeGR.equalsIgnoreCase("Myeloproliferative Neoplasm")) {
			diseaseTypeID = 5;
		} else if (diseaseTypeGR.equalsIgnoreCase("Plasma Cell Disorder")) {
			diseaseTypeID = 6;
		} else if (diseaseTypeGR.equalsIgnoreCase("Platelet Disorder")) {
			diseaseTypeID = 7;
		} else if (diseaseTypeGR.equalsIgnoreCase("Thalassemia")) {
			diseaseTypeID = 8;
			//diseaseTypeID = 0;
		}
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
		boolean diseaseStatusBaselineGR;
		if (request.getParameter("dsBaselineGR") != null) {
			diseaseStatusBaselineGR = true;
			System.out.println("Baseline Included: " + diseaseStatusBaselineGR);
		} else {
			diseaseStatusBaselineGR = false;
			System.out.println("Baseline Included: " + diseaseStatusBaselineGR);
		}
		boolean diseaseStatusFollowupGR;
		if (request.getParameter("dsFollowupGR") != null) {
			diseaseStatusFollowupGR = true;
			System.out.println("Follow Up Included: " + diseaseStatusFollowupGR);
		} else {
			diseaseStatusFollowupGR = false;
			System.out.println("Follow Up Included: " + diseaseStatusFollowupGR);
		}
		//generate report
/*		GenerateReport generateReport = new GenerateReport(fromDateGR, toDateGR, ageGR, genderGR, modeOfTreatmentGR,
				diseaseStatusBaselineGR, diseaseStatusFollowupGR);*/
		String paperSize = request.getParameter("paperSize");
		String paperLayout = request.getParameter("paperLayout");
		System.out.println(paperSize);
		System.out.println(paperLayout);
		//ServletOutputStream servletOutputStream = response.getOutputStream();
		response.setContentType("application/pdf");
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
		//create some special styles and font sizes
		Font font_tnr_8 = new Font(FontFamily.TIMES_ROMAN, 8, Font.NORMAL, new BaseColor(0, 0, 0));
		Font font_tnr_8_b = new Font(FontFamily.TIMES_ROMAN, 8, Font.BOLD, new BaseColor(0, 0, 0));
		Font font_tnr_16 = new Font(FontFamily.TIMES_ROMAN, 16, Font.NORMAL, new BaseColor(0, 0, 0));
		@SuppressWarnings("unused")
		Font font_tnr_18_b = new Font(FontFamily.TIMES_ROMAN, 18, Font.BOLD, new BaseColor(0, 0, 0));
		try {
			if (connection != null) {
				getServletContext().log("Connection found. Start of Generate Patient Report Roll");
				Document document = new Document();
				PdfWriter writer = PdfWriter.getInstance(document, response.getOutputStream());
				MyFooter event = new MyFooter();
				writer.setPageEvent(event);
				document.addTitle("Generate Report of Patients");
				document.addAuthor("Cancer Developers");
				document.addCreationDate();
				document.addProducer();
				document.addCreator("Cancer Developers");
				document.setPageSize(paper);
				document.open();
				Paragraph paragraph;
				Anchor anchor;
				ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
				String img_ustlogo = classLoader.getResource("/images/logo_bci.png").getPath();
				//Image image_ustlogo = Image.getInstance(img_ustlogo);
				String img_usthlogo = classLoader.getResource("/images/logo_hematology.png").getPath();
				//Image image_usthlogo = Image.getInstance(img_usthlogo);
				//document.add(image);
				float[] header_col = { 1f, 5f, 1f };
				PdfPTable table_header = new PdfPTable(header_col);
				table_header.setWidthPercentage(92f);
				table_header.addCell(headerCellImage(img_ustlogo, PdfPCell.ALIGN_LEFT));
				table_header.addCell(headerCellText("UNIVERSITY OF SANTO TOMAS" + Chunk.NEWLINE + "BENAVIDES CANCER INSTITUTE",
						PdfPCell.ALIGN_CENTER, PdfPCell.ALIGN_MIDDLE, font_tnr_16));
				table_header.addCell(headerCellImage(img_usthlogo, PdfPCell.ALIGN_RIGHT));
				PdfPCell cellSpace = new PdfPCell(new Phrase(""));
				cellSpace.setBorder(Rectangle.NO_BORDER);
				cellSpace.setColspan(3);
				for (int spacing = 1; spacing < 7; spacing++) {
					table_header.addCell(cellSpace);
				}
				document.add(table_header);
				String timeStamp = new SimpleDateFormat("yyyy MMMM dd - HH:mm").format(Calendar.getInstance().getTime());
				anchor = new Anchor(timeStamp + " PH Time", font_tnr_8_b);
				document.add(anchor);
				document.add(Chunk.NEWLINE);
				anchor = new Anchor("Printed by: " + (String) session.getAttribute("name"), font_tnr_8_b);
				//anchor.setReference("#" + "Sample".trim());
				document.add(anchor);
				document.add(Chunk.NEWLINE);
				System.out.println("Disease ID: " + diseaseTypeID);
				//Patient Table
				ResultSet patientListRS;
				if (diseaseTypeID != 0) {
					patientListRS = SQLOperations.grGetPatients(diseaseTypeID, fromDateGR, toDateGR, connection);
				} else {
					patientListRS = SQLOperations.grGetPatientsAll(fromDateGR, toDateGR, connection);
				}
				paragraph = new Paragraph();
				while (patientListRS.next()) {
					//logic for every disease header
					int patientID = patientListRS.getInt("PatientID");
					int generalDataID = patientListRS.getInt("GeneralDataID");
					ResultSet generalDataRS = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
					float[] tablecol_patient = { 1.5f, 2f, 1f, 1f, 1f, 1f, 1f, 2f };
					PdfPTable table_patient = new PdfPTable(tablecol_patient);
					table_patient.setWidthPercentage(100f);
					cellSpace.setColspan(8);
					for (int spacing = 1; spacing < 3.5; spacing++) {
						table_patient.addCell(cellSpace);
					}
					while (generalDataRS.next()) {
						String dateOfBirth = generalDataRS.getString("DateOfBirthDec");
						DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
						LocalDateTime getLocalTime = LocalDateTime.now();
						Calendar cal1 = new GregorianCalendar();
						Calendar cal2 = new GregorianCalendar();
						int age = 0;
						int factor = 0;
						Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
						Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(dateFormat.format(getLocalTime));
						cal1.setTime(date1);
						cal2.setTime(date2);
						if (cal2.get(Calendar.DAY_OF_YEAR) < cal1.get(Calendar.DAY_OF_YEAR)) {
							factor = -1;
						}
						age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR) + factor;
						String ageValue = String.valueOf(age);
						String Gender = generalDataRS.getString("Gender");
						//System.out.println("Gender: " + Gender);
						if (Gender.equals("1")) {
							Gender = "M";
						} else if (Gender.equals("2")) {
							Gender = "F";
						}
						ResultSet patientInfoRS = SQLOperationsBaseline.getPatient(patientID, connection);
						patientInfoRS.first();
						int diseaseID = patientListRS.getInt("DiseaseID");
						ResultSet diseaseRS = SQLOperations.getDiseaseName(diseaseID, connection);
						diseaseRS.first();
						String diseaseName = diseaseRS.getString("DiseaseName");
						if (ageGR == true && genderGR == true) {
							insertTableCell(table_patient, "PATIENT ID: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, String.valueOf(patientID), Element.ALIGN_LEFT, 1, font_tnr_8);
							insertTableCell(table_patient, "AGE: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, ageValue, Element.ALIGN_LEFT, 1, font_tnr_8);
							insertTableCell(table_patient, "GENDER: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, Gender.trim().toUpperCase(), Element.ALIGN_LEFT, 1, font_tnr_8);
							insertTableCell(table_patient, "DISEASE: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, diseaseName.trim(), Element.ALIGN_LEFT, 1, font_tnr_8);
						} else if (ageGR == false && genderGR == true) {
							insertTableCell(table_patient, "PATIENT ID: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, String.valueOf(patientID), Element.ALIGN_LEFT, 2, font_tnr_8);
							insertTableCell(table_patient, "GENDER: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, Gender.trim().toUpperCase(), Element.ALIGN_LEFT, 2, font_tnr_8);
							insertTableCell(table_patient, "DISEASE: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, diseaseName.trim(), Element.ALIGN_LEFT, 1, font_tnr_8);
						} else if (ageGR == true && genderGR == false) {
							insertTableCell(table_patient, "PATIENT ID: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, String.valueOf(patientID), Element.ALIGN_LEFT, 2, font_tnr_8);
							insertTableCell(table_patient, "AGE: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, ageValue, Element.ALIGN_LEFT, 2, font_tnr_8);
							insertTableCell(table_patient, "DISEASE: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, diseaseName.trim(), Element.ALIGN_LEFT, 1, font_tnr_8);
						} else if (ageGR == false && genderGR == false) {
							insertTableCell(table_patient, "PATIENT ID: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, String.valueOf(patientID), Element.ALIGN_LEFT, 4, font_tnr_8);
							insertTableCell(table_patient, "DISEASE: ", Element.ALIGN_RIGHT, 1, font_tnr_8_b);
							insertTableCell(table_patient, diseaseName.trim(), Element.ALIGN_LEFT, 2, font_tnr_8);
						}
						//table_patient.setHeaderRows(1);
						//insertCell(table_patient, "", Element.ALIGN_CENTER, 8, font_tnr_7);
						table_patient.setHeaderRows(1);
						paragraph.add(table_patient);
						if (diseaseStatusBaselineGR == true && modeOfTreatmentGR == true) {
							float[] tablecol_baseline = { 1f, 3f, 3f };
							PdfPTable table_baseline = new PdfPTable(tablecol_baseline);
							table_baseline.setWidthPercentage(100f);
							insertTableCell(table_baseline, "BASELINE ", Element.ALIGN_LEFT, 3, font_tnr_8_b);
							insertTableCell(table_baseline, "ENTRY DATE", Element.ALIGN_CENTER, 1, font_tnr_8_b);
							insertTableCell(table_baseline, "MODE OF TREATMENT", Element.ALIGN_CENTER, 1, font_tnr_8_b);
							insertTableCell(table_baseline, "DISEASE STATUS", Element.ALIGN_CENTER, 1, font_tnr_8_b);
							table_baseline.setHeaderRows(2);
							insertTableCell(table_baseline, generalDataRS.getString("DateOfEntryDec").trim(), Element.ALIGN_CENTER, 1,
									font_tnr_8);
							int treatmentBaselineID = patientInfoRS.getInt("TreatmentID");
							ResultSet treatmentBaselineRS = SQLOperationsBaseline.getTreatment(treatmentBaselineID, connection);
							treatmentBaselineRS.first();
							int modeOfTreatmentBaselineID = treatmentBaselineRS.getInt("ModeOfTreatmentID");
							ResultSet modeOfTreatmentBaselineRS = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentBaselineID,
									connection);
							modeOfTreatmentBaselineRS.first();
							String modeOfTreatmentBaselineValue = "N/A";
							if (modeOfTreatmentBaselineRS.first() != false) {
								if (modeOfTreatmentBaselineRS.getString("NameOfTreatment") != null) {
									modeOfTreatmentBaselineValue = modeOfTreatmentBaselineRS.getString("NameOfTreatment");
									if (modeOfTreatmentBaselineValue.contains("&#40;") || modeOfTreatmentBaselineValue.contains("&#41;")) {
										modeOfTreatmentBaselineValue = modeOfTreatmentBaselineValue.replaceAll("&#40;", "(");
										modeOfTreatmentBaselineValue = modeOfTreatmentBaselineValue.replaceAll("&#41;", ")");
									}
								}
							}
							//Baseline Mode Of Treatment
							insertTableCell(table_baseline, modeOfTreatmentBaselineValue, Element.ALIGN_CENTER, 1, font_tnr_8);
							int diseaseStatusBaselineID = patientListRS.getInt("DiseaseStatusID");
							ResultSet diseaseStatusBaselineRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusBaselineID, connection);
							diseaseStatusBaselineRS.first();
							String diseaseStatusBaselineValue = "N/A";
							if (diseaseStatusBaselineRS.first() != false) {
								diseaseStatusBaselineValue = diseaseStatusBaselineRS.getString("OtherDisease");
								if (diseaseStatusBaselineValue.contains("&#40;") || diseaseStatusBaselineValue.contains("&#41;")) {
									diseaseStatusBaselineValue = diseaseStatusBaselineValue.replaceAll("&#40;", "(");
									diseaseStatusBaselineValue = diseaseStatusBaselineValue.replaceAll("&#41;", ")");
								}
								if (diseaseStatusBaselineValue == "") {
									diseaseStatusBaselineValue = diseaseStatusBaselineRS.getString("DiseaseStatus");
									if (diseaseStatusBaselineValue.contains("&#40;") || diseaseStatusBaselineValue.contains("&#41;")) {
										diseaseStatusBaselineValue = diseaseStatusBaselineValue.replaceAll("&#40;", "(");
										diseaseStatusBaselineValue = diseaseStatusBaselineValue.replaceAll("&#41;", ")");
									}
								}
							}
							//Baseline Disease Status
							insertTableCell(table_baseline, diseaseStatusBaselineValue, Element.ALIGN_CENTER, 1, font_tnr_8);
							paragraph.add(table_baseline);
						} else if (diseaseStatusBaselineGR == true && modeOfTreatmentGR == false) {
							float[] tablecol_baseline = { 1f, 3f, 3f };
							PdfPTable table_baseline = new PdfPTable(tablecol_baseline);
							table_baseline.setWidthPercentage(100f);
							insertTableCell(table_baseline, "BASELINE ", Element.ALIGN_LEFT, 3, font_tnr_8_b);
							insertTableCell(table_baseline, "ENTRY DATE", Element.ALIGN_CENTER, 1, font_tnr_8_b);
							insertTableCell(table_baseline, "DISEASE STATUS", Element.ALIGN_CENTER, 2, font_tnr_8_b);
							insertTableCell(table_baseline, generalDataRS.getString("DateOfEntryDec").trim(), Element.ALIGN_CENTER, 1,
									font_tnr_8);
							int diseaseStatusBaselineID = patientListRS.getInt("DiseaseStatusID");
							ResultSet diseaseStatusBaselineRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusBaselineID, connection);
							diseaseStatusBaselineRS.first();
							String diseaseStatusBaselineValue = "N/A";
							if (diseaseStatusBaselineRS.first() != false) {
								diseaseStatusBaselineValue = diseaseStatusBaselineRS.getString("OtherDisease");
								if (diseaseStatusBaselineValue.contains("&#40;") || diseaseStatusBaselineValue.contains("&#41;")) {
									diseaseStatusBaselineValue = diseaseStatusBaselineValue.replaceAll("&#40;", "(");
									diseaseStatusBaselineValue = diseaseStatusBaselineValue.replaceAll("&#41;", ")");
								}
								if (diseaseStatusBaselineValue == "") {
									diseaseStatusBaselineValue = diseaseStatusBaselineRS.getString("DiseaseStatus");
									if (diseaseStatusBaselineValue.contains("&#40;") || diseaseStatusBaselineValue.contains("&#41;")) {
										diseaseStatusBaselineValue = diseaseStatusBaselineValue.replaceAll("&#40;", "(");
										diseaseStatusBaselineValue = diseaseStatusBaselineValue.replaceAll("&#41;", ")");
									}
								}
							}
							//Baseline Disease Status
							insertTableCell(table_baseline, diseaseStatusBaselineValue, Element.ALIGN_CENTER, 2, font_tnr_8);
							table_baseline.setHeaderRows(2);
							paragraph.add(table_baseline);
						} else if (diseaseStatusBaselineGR == false && modeOfTreatmentGR == true) {
							float[] tablecol_baseline = { 1f, 3f, 3f };
							PdfPTable table_baseline = new PdfPTable(tablecol_baseline);
							table_baseline.setWidthPercentage(100f);
							insertTableCell(table_baseline, "BASELINE ", Element.ALIGN_LEFT, 3, font_tnr_8_b);
							insertTableCell(table_baseline, "ENTRY DATE", Element.ALIGN_CENTER, 1, font_tnr_8_b);
							insertTableCell(table_baseline, "MODE OF TREATMENT", Element.ALIGN_CENTER, 2, font_tnr_8_b);
							insertTableCell(table_baseline, generalDataRS.getString("DateOfEntryDec").trim(), Element.ALIGN_CENTER, 1,
									font_tnr_8);
							int treatmentBaselineID = patientInfoRS.getInt("TreatmentID");
							ResultSet treatmentBaselineRS = SQLOperationsBaseline.getTreatment(treatmentBaselineID, connection);
							treatmentBaselineRS.first();
							int modeOfTreatmentBaselineID = treatmentBaselineRS.getInt("ModeOfTreatmentID");
							ResultSet modeOfTreatmentBaselineRS = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentBaselineID,
									connection);
							modeOfTreatmentBaselineRS.first();
							String modeOfTreatmentBaselineValue = "N/A";
							if (modeOfTreatmentBaselineRS.first() != false) {
								if (modeOfTreatmentBaselineRS.getString("NameOfTreatment") != null) {
									modeOfTreatmentBaselineValue = modeOfTreatmentBaselineRS.getString("NameOfTreatment");
									if (modeOfTreatmentBaselineValue.contains("&#40;") || modeOfTreatmentBaselineValue.contains("&#41;")) {
										modeOfTreatmentBaselineValue = modeOfTreatmentBaselineValue.replaceAll("&#40;", "(");
										modeOfTreatmentBaselineValue = modeOfTreatmentBaselineValue.replaceAll("&#41;", ")");
									}
								}
							}
							//Baseline Mode Of Treatment
							insertTableCell(table_baseline, modeOfTreatmentBaselineValue, Element.ALIGN_CENTER, 2, font_tnr_8);
							table_baseline.setHeaderRows(2);
							paragraph.add(table_baseline);
						}
						if (diseaseStatusFollowupGR == true) {
							float[] tablecol_followupHead = { 1f, 6f };
							PdfPTable table_followupHead = new PdfPTable(tablecol_followupHead);
							table_followupHead.setWidthPercentage(100f);
							insertTableCell(table_followupHead, "FOLLOW UP", Element.ALIGN_LEFT, 3, font_tnr_8_b);
							insertTableCell(table_followupHead, "VISIT DATE", Element.ALIGN_CENTER, 1, font_tnr_8_b);
							insertTableCell(table_followupHead, "DISEASE STATUS", Element.ALIGN_CENTER, 1, font_tnr_8_b);
							//table_followupHead.setHeaderRows(2);
							paragraph.add(table_followupHead);
							ResultSet grFollowupRS = SQLOperations.grGetFollowup(patientID, fromDateGR, toDateGR, connection);
							while (grFollowupRS.next()) {
								int followupID = grFollowupRS.getInt("FollowUpID");
								ResultSet followupRS = SQLOperationsFollowUp.getFollowup(followupID, connection);
								followupRS.first();
								//make header
								float[] tablecol_followup = { 1f, 6f, };
								PdfPTable table_followup = new PdfPTable(tablecol_followup);
								table_followup.setWidthPercentage(100f);
								String dateOfVisitValue = "N/A";
								if (followupRS.first() != false) {
									dateOfVisitValue = followupRS.getString("DateOfVisitDec");
								}
								insertTableCell(table_followup, dateOfVisitValue, Element.ALIGN_CENTER, 1, font_tnr_8);
								int diseaseStatusFollowupID = grFollowupRS.getInt("DiseaseStatusID");
								ResultSet diseaseStatusFollowupRS = SQLOperationsFollowUp.getDiseaseStatus(diseaseStatusFollowupID,
										connection);
								diseaseStatusFollowupRS.first();
								String diseaseStatusFollowupValue = "N/A";
								if (diseaseStatusFollowupRS.first() != false) {
									diseaseStatusFollowupValue = diseaseStatusFollowupRS.getString("OtherDisease");
									if (diseaseStatusFollowupValue.contains("&#40;") || diseaseStatusFollowupValue.contains("&#41;")) {
										diseaseStatusFollowupValue = diseaseStatusFollowupValue.replaceAll("&#40;", "(");
										diseaseStatusFollowupValue = diseaseStatusFollowupValue.replaceAll("&#41;", ")");
									}
									if (diseaseStatusFollowupValue == "") {
										diseaseStatusFollowupValue = diseaseStatusFollowupRS.getString("DiseaseStatus");
										if (diseaseStatusFollowupValue.contains("&#40;") || diseaseStatusFollowupValue.contains("&#41;")) {
											diseaseStatusFollowupValue = diseaseStatusFollowupValue.replaceAll("&#40;", "(");
											diseaseStatusFollowupValue = diseaseStatusFollowupValue.replaceAll("&#41;", ")");
										}
									}
								}
								//Follow Up Disease Status
								insertTableCell(table_followup, diseaseStatusFollowupValue, Element.ALIGN_CENTER, 1, font_tnr_8);
								paragraph.add(table_followup);
							}
						}
					}
					//paragraph.add(Chunk.NEWLINE);
				}
				document.add(paragraph);
				document.close();
				AuditBean auditBean = new AuditBean("Generate Patient Report", (String) session.getAttribute("name"),
						(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
				SQLOperations.addAudit(auditBean, connection);
			} else {
				System.out.println("Invalid Connection resource");
			}
		} catch (NullPointerException npe) {
			System.err.println("Invalid Connection resource - " + npe.getMessage());
		} catch (ParseException e) {
			System.out.println("Age Algo Error");
		} catch (DocumentException e) {
			throw new IOException(e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception - " + e.getMessage());
		}
	}
	
	private void insertTableCell(PdfPTable table, String text, int align, int colspan, Font font) {
		PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
		cell.setHorizontalAlignment(align);
		cell.setColspan(colspan);
		if (text.trim().equalsIgnoreCase("")) {
			cell.setMinimumHeight(10f);
		}
		table.addCell(cell);
	}
	
	public PdfPCell headerCellText(String text, int alignment_ctr, int alignment_mdl, Font font) {
		PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
		cell.setPadding(0);
		cell.setHorizontalAlignment(alignment_ctr);
		cell.setVerticalAlignment(alignment_mdl);
		cell.setBorder(PdfPCell.NO_BORDER);
		return cell;
	}
	
	public PdfPCell headerCellImage(String path, int alignment) throws DocumentException, IOException {
		Image img = Image.getInstance(path);
		PdfPCell cell = new PdfPCell(img, true);
		cell.setPadding(0);
		cell.setHorizontalAlignment(alignment);
		cell.setBorder(PdfPCell.NO_BORDER);
		return cell;
	}
}
