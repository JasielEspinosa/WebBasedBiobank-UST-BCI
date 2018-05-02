package controller;

import com.itextpdf.text.*;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.*;

public class MyFooter extends PdfPageEventHelper {
	
	//Font ffont = new Font(Font.FontFamily.UNDEFINED, 5, Font.ITALIC);
	Font font_tnr_8 = new Font(FontFamily.TIMES_ROMAN, 8, Font.NORMAL, new BaseColor(0, 0, 0));
	
	PdfTemplate total;
	
	public void onOpenDocument(PdfWriter writer, Document document) {
		total = writer.getDirectContent().createTemplate(30, 16);
	}
	
	public void onEndPage(PdfWriter writer, Document document) {
		
/*		PdfContentByte cb = writer.getDirectContent();
		Phrase header = new Phrase("USTH BCI Biobank", font_tnr_8);
		Phrase footer = new Phrase("Page " + writer.getPageNumber() + " of " + totcountPage, font_tnr_8);
		ColumnText.showTextAligned(cb, Element.ALIGN_CENTER, header, (document.right() - document.left()) / 2 + document.leftMargin(),
				document.top() + 10, 0);
		ColumnText.showTextAligned(cb, Element.ALIGN_CENTER, footer, (document.right() - document.left()) / 2 + document.leftMargin(),
				document.bottom() - 10, 0);*/
		
		PdfPTable table = new PdfPTable(2);
		try {
			table.setWidths(new int[] { 48, 2 });
			table.setTotalWidth(500);
			//table.setLockedWidth(true);
			//table.getDefaultCell().setFixedHeight(20);
			table.getDefaultCell().setBorder(Rectangle.BOTTOM);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(String.format("Page %d of", writer.getPageNumber()));
			PdfPCell cell = new PdfPCell(Image.getInstance(total));
			cell.setBorder(Rectangle.BOTTOM);
			table.addCell(cell);
			table.writeSelectedRows(0, -1, document.right() - document.rightMargin() - 480, document.bottom() - 7,
					writer.getDirectContent());
		} catch (DocumentException de) {
			throw new ExceptionConverter(de);
		}
		
	}
	
/*	int totcountPage;
	
	public void onCloseDocument(PdfWriter writer, Document document) {
		int n = document.getPageNumber();
		for (int i = 0; i <= n; i++) {
			totcountPage = n;
		}
		System.out.println(totcountPage);
	}*/
	
	public void onCloseDocument(PdfWriter writer, Document document) {
		ColumnText.showTextAligned(total, Element.ALIGN_LEFT, new Phrase(String.valueOf(writer.getPageNumber() - 1)), 2, 2, 0);
	}
	
}
