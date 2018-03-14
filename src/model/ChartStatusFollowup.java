package model;

public class ChartStatusFollowup {
	
	int hematologicResponse = 0;
	int stableDisease = 0;
	int relapsed  = 0;
	int others  = 0;
	int dead  = 0;
	int refractoryDisease = 0;
	int cr = 0;
	int nCR = 0;
	int pr = 0;
	int pd = 0;
	int sd = 0;
	int completeHematologicResponse = 0;
	int completeCytogeneticResponse = 0;
	int majorMolecularResponse = 0;
	int spleenResponse = 0;
	int symptomResponse = 0;
	int rr = 0;
	
	
	public void setDiseaseStatus(String diseaseStatus) {
		if(diseaseStatus.equals("Hematologic response")) {
			hematologicResponse++;
		}
		if(diseaseStatus.equals("Stable Disease")) {
			stableDisease++;
		}
		if(diseaseStatus.equals("Relapsed")) {
			relapsed++;
		}
		if(diseaseStatus.equals("Others")) {
			others++;
		}
		if(diseaseStatus.equals("Dead")) {
			dead++;
		}
		if(diseaseStatus.equals("Refractory Disease")) {
			refractoryDisease++;
		}
		if(diseaseStatus.equals("CR (Complete Remission)") || diseaseStatus.equals("CR (Complete Response)")) {
			cr++;
		}
		if(diseaseStatus.equals("nCR (near CR)")) {
			nCR++;
		}
		if(diseaseStatus.equals("PR (Partial Response)")) {
			pr++;
		}
		if(diseaseStatus.equals("PD (Progressive Disease)")) {
			pd++;
		}
		if(diseaseStatus.equals("SD Stable Disease)") || diseaseStatus.equals("NR (No Response) or SD Stable Disease)")) {
			sd++;
		}
		if(diseaseStatus.equals("Complete Hematologic response")) {
			completeHematologicResponse++;
		}
		if(diseaseStatus.equals("Complete Cytogenetic Response")) {
			completeCytogeneticResponse++;
		}
		if(diseaseStatus.equals("Major Molecular Response")) {
			majorMolecularResponse++;
		}
		if(diseaseStatus.equals("Spleen response")) {
			spleenResponse++;
		}
		if(diseaseStatus.equals("Symptom response")) {
			symptomResponse++;
		}
		if(diseaseStatus.equals("RR (Relapsed/Refractory Disease)")) {
			rr++;
		}
		
	}

}
