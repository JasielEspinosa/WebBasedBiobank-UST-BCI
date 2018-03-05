package utility.pdf;

public class GenerateReport {
	
	String fromDateGenerateReport;
	String toDateGenerateReport;

	int age;
	int gender;
	int modeOfTreatment;
	int diseaseStatusBaseline;
	int diseaseStatusFollowup;
	
	
	public GenerateReport(String fromDateGenerateReport, String toDateGenerateReport, int age, int gender,
			int modeOfTreatment, int diseaseStatusBaseline, int diseaseStatusFollowup) {
		super();
		this.fromDateGenerateReport = fromDateGenerateReport;
		this.toDateGenerateReport = toDateGenerateReport;
		this.age = age;
		this.gender = gender;
		this.modeOfTreatment = modeOfTreatment;
		this.diseaseStatusBaseline = diseaseStatusBaseline;
		this.diseaseStatusFollowup = diseaseStatusFollowup;
	}
}
