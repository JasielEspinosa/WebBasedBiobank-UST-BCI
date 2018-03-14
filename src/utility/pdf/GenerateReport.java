package utility.pdf;

public class GenerateReport {

	String fromDateGenerateReport;
	String toDateGenerateReport;

	boolean age;
	boolean gender;
	boolean modeOfTreatment;
	boolean diseaseStatusBaseline;
	boolean diseaseStatusFollowup;

	public GenerateReport(String fromDateGenerateReport, String toDateGenerateReport, boolean age, boolean gender, boolean modeOfTreatment,
			boolean diseaseStatusBaseline, boolean diseaseStatusFollowup) {
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
