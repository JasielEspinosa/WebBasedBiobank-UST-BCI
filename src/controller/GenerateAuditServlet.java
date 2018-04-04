package controller;

import java.io.IOException;

import java.sql.Connection;
import java.sql.ResultSet;

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

@WebServlet("/GenerateAuditServlet")
public class GenerateAuditServlet extends HttpServlet {
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

	public GenerateAuditServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");

		String fromDateGR = request.getParameter("fromDateGenerateReport");
		String toDateGR = request.getParameter("toDateGenerateReport");
		String doctorGR = request.getParameter("doctor");

		int doctorUserID = 0;

		if (doctorGR.equalsIgnoreCase("All")) {
			doctorGR = "All Doctors";
		} else if (doctorGR.equalsIgnoreCase("Dr. Mesina")) {
			doctorUserID = 1;
		} else if (doctorGR.equalsIgnoreCase("Encoder")) {
			doctorUserID = 2;
		}

		System.out.println("From Date: " + fromDateGR);
		System.out.println("To Date: " + toDateGR);
		System.out.println("Doctor : " + doctorGR);

		String paperSize = request.getParameter("paperSize");
		String paperLayout = request.getParameter("paperLayout");

		System.out.println(paperSize);
		System.out.println(paperLayout);

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
				PdfWriter.getInstance(document, response.getOutputStream());

				document.addTitle("GenerateReportServlet");
				document.addAuthor("Cancer Developers");
				document.addCreationDate();
				document.addProducer();
				document.addCreator("Cancer Developers");
				document.setPageSize(paper);

				document.open();

				Paragraph paragraph;
				Anchor anchor;

				ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

				String img_ustlogo = classLoader.getResource("/images/ustlogo.png").getPath();
				//Image image_ustlogo = Image.getInstance(img_ustlogo);

				String img_usthlogo = classLoader.getResource("/images/usthlogo.png").getPath();
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

				anchor = new Anchor("Generate Audit Trail Report Test".trim(), font_tnr_8_b);
				//anchor.setReference("#" + "Sample".trim());

				document.add(anchor);
				document.add(Chunk.NEWLINE);

				System.out.println("Doctor User ID: " + doctorUserID);

				//Audit Table
				ResultSet auditListRS = null;
				if (doctorUserID != 0) {

					if (fromDateGR != "" && toDateGR == "") {
						System.out.println("Opt1");
						auditListRS = SQLOperations.getAuditFrom(doctorUserID, fromDateGR, connection);
					} else if (fromDateGR == "" && toDateGR != "") {
						System.out.println("Opt2");
						auditListRS = SQLOperations.getAuditTo(doctorUserID, toDateGR, connection);
					} else if (fromDateGR != "" && toDateGR != "") {
						System.out.println("Opt3");
						auditListRS = SQLOperations.getAuditFromTo(doctorUserID, fromDateGR, toDateGR, connection);
					} else {
						System.out.println("ALL SELECTED YEAR AUDITS");
						auditListRS = SQLOperations.getAudit(doctorUserID, connection);
					}

				} else {

					if (fromDateGR != "" && toDateGR == "") {
						System.out.println("Opt4");
						auditListRS = SQLOperations.getAuditAllFrom(fromDateGR, connection);
					} else if (fromDateGR == "" && toDateGR != "") {
						System.out.println("Opt5");
						auditListRS = SQLOperations.getAuditAllTo(toDateGR, connection);
					} else if (fromDateGR != "" && toDateGR != "") {
						System.out.println("Opt6");
						auditListRS = SQLOperations.getAuditAllFromTo(fromDateGR, toDateGR, connection);
					} else {
						System.out.println("ALL YEAR AUDITS");
						auditListRS = SQLOperations.getAuditAll(connection);
					}

				}

				System.out.println("Audit Trail: " + auditListRS.first());

				paragraph = new Paragraph();

				float[] tablecol_auditHead = { 1f, 1f, 1f, 1f };
				PdfPTable table_auditHead = new PdfPTable(tablecol_auditHead);
				table_auditHead.setWidthPercentage(100f);
				
				cellSpace.setColspan(8);
				for (int spacing = 1; spacing < 2; spacing++) {
					table_auditHead.addCell(cellSpace);
				}

				insertTableCell(table_auditHead, "ACTION", Element.ALIGN_CENTER, 1, font_tnr_8_b);
				insertTableCell(table_auditHead, "PERFORMED ON", Element.ALIGN_CENTER, 1, font_tnr_8_b);
				insertTableCell(table_auditHead, "PERFORMED BY", Element.ALIGN_CENTER, 1, font_tnr_8_b);
				insertTableCell(table_auditHead, "EVENT DATE", Element.ALIGN_CENTER, 1, font_tnr_8_b);

				//table_auditHead.setHeaderRows(1);

				paragraph.add(table_auditHead);

				auditListRS.beforeFirst();

				while (auditListRS.next()) {

					float[] tablecol_audit = { 1f, 1f, 1f, 1f };
					PdfPTable table_audit = new PdfPTable(tablecol_audit);
					table_audit.setWidthPercentage(100f);

					String actionValue = auditListRS.getString("action");
					String performedOn = auditListRS.getString("performedOn");
					String performedBy = auditListRS.getString("performedBy");
					String date = auditListRS.getString("dateDec");
					String time = auditListRS.getString("time");

					insertTableCell(table_audit, actionValue, Element.ALIGN_CENTER, 1, font_tnr_8);
					insertTableCell(table_audit, performedOn, Element.ALIGN_CENTER, 1, font_tnr_8);
					insertTableCell(table_audit, performedBy.trim().toUpperCase(), Element.ALIGN_CENTER, 1, font_tnr_8);
					insertTableCell(table_audit, date + " " + time, Element.ALIGN_CENTER, 1, font_tnr_8);

					paragraph.add(table_audit);

				}

				document.add(paragraph);

				document.close();
				
				HttpSession session = request.getSession(true);

				AuditBean auditBean = new AuditBean("Generate Audit Report", (String) session.getAttribute("name"),
						(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
				SQLOperations.addAudit(auditBean, connection);

			} else {
				System.out.println("Invalid Connection resource");
			}
		} catch (NullPointerException npe) {
			System.err.println("Invalid Connection resource - " + npe.getMessage());
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
