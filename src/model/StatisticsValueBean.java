package model;

public class StatisticsValueBean {
	
	String diseaseStatus;
	String dateOfEntry;
	
	
	
	
	public StatisticsValueBean(String diseaseStatus, String dateOfEntry) {
		super();
		this.diseaseStatus = diseaseStatus;
		this.dateOfEntry = dateOfEntry;
	}


	

	public String getDiseaseStatus() {
		return diseaseStatus;
	}




	public void setDiseaseStatus(String diseaseStatus) {
		this.diseaseStatus = diseaseStatus;
	}




	public String getDateOfEntry() {
		return dateOfEntry;
	}




	public void setDateOfEntry(String dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}




	public static String getDiseaseStatus(String diseaseStatus) {
		if(diseaseStatus.equals("Hematologic response")) {
			return "Hematologic Response";
		}
		if(diseaseStatus.equals("Relapsed")) {
			return "Relapsed";
		}
		if(diseaseStatus.equals("Others")) {
			return "Others";
		}
		if(diseaseStatus.equals("Dead")) {
			return "Dead";
		}
		if(diseaseStatus.equals("Newly Diagnosed")) {
			return "Newly Diagnosed";
		}
		if(diseaseStatus.equals("Refractory Disease")) {
			return "Refractory Disease";
		}
		if(diseaseStatus.equals("CR (Complete Remission)") || diseaseStatus.equals("CR (Complete Response)") || diseaseStatus.contains("Complete Remission")) {
			return "CR";
		}
		if(diseaseStatus.equals("nCR (near CR)")) {
			return "nCR";
		}
		if(diseaseStatus.equals("PR (Partial Response)")) {
			return "PR	";
		}
		if(diseaseStatus.equals("PD (Progressive Disease)")) {
			return "PD";
		}
		if(diseaseStatus.equals("SD (Stable Disease)") || diseaseStatus.equals("NR (No Response) or (SD Stable Disease)") || diseaseStatus.equals("Stable Disease")) {
			return "SD";
		}
		if(diseaseStatus.equals("Complete Hematologic response")) {
			return "Complete Hematologic Response";
		}
		if(diseaseStatus.equals("Complete Cytogenetic Response")) {
			return "Complete Cytogenetic Response";
		}
		if(diseaseStatus.equals("Major Molecular Response")) {
			return "Major Molecular Response";
		}
		if(diseaseStatus.equals("Spleen response")) {
			return "Spleen Response";
		}
		if(diseaseStatus.equals("Symptom response")) {
			return "Symptom Response";
		}
		if(diseaseStatus.equals("RR (Relapsed/Refractory Disease)")) {
			return "RR";
		}
		if(diseaseStatus.equals("sCR (stringent complete remission)")) {
			return "sCR";
		}
		if(diseaseStatus.equals("immunophenotypic CR")) {
			return "Immunophenotypic CR";
		}
		if(diseaseStatus.equals("VGPR (Very Good Partial Response)")) {
			return "VGPR";
		}
		if(diseaseStatus.equals("MR (minimal response for relapsed refractory myeloma only)")) {
			return "MR";
		}
		if(diseaseStatus.equals("Clinical Relapse")) {
			return "Clinical Relapse";
		}
		if(diseaseStatus.equals("Relapse from CR")) {
			return "Relapse from CR";
		}
		if(diseaseStatus.contains("R (Remission)")) {
			return "R";
		}
		if(diseaseStatus.contains("Newly Diagnosed ITP")) {
			return "Newly Diagnosed ITP";
		}
		if(diseaseStatus.contains("Persistent ITP")) {
			return "Persistent ITP";
		}
		if(diseaseStatus.contains("Chronic ITP")) {
			return "Chronic ITP";
		}
		if(diseaseStatus.contains("Severe ITP")) {
			return "Severe ITP";
		}
		if(diseaseStatus.contains("Time to Response")) {
			return "";
		}
		if(diseaseStatus.contains("NR ( No Remission)")) {
			return "NR";
		}
		if(diseaseStatus.contains("Loss of CR or R")) {
			return "Loss of CR or R";
		}
		if(diseaseStatus.contains("Refractory ITP")) {
			return "Refractory ITP";
		}else {
			return "";
		}

}
}
