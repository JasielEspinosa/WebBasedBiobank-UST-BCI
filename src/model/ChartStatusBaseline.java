package model;

public class ChartStatusBaseline {
	
	int hematologicResponse = 0;
	int relapsed = 0;
	int others = 0;
	int newlyDiagnosed = 0;
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
	int sCR = 0;
	int immunophenotypicCR = 0;
	int molecularCR = 0;
	int vgpr = 0;
	int mr = 0;
	int clinicalRelapse = 0;
	int relapseFromCR = 0;
	int newlyDiagnosedITP = 0;
	int persistentITP = 0;
	int chronicITP = 0;
	int severeITP = 0;
	
	public void setDiseaseStatus(String diseaseStatus) {
		if (diseaseStatus.equalsIgnoreCase("Hematologic response")) {
			hematologicResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("Relapsed") || diseaseStatus.equalsIgnoreCase("Relapse")) {
			relapsed++;
		}
		if (diseaseStatus.equalsIgnoreCase("Others")) {
			others++;
		}
		if (diseaseStatus.equalsIgnoreCase("Newly Diagnosed")) {
			newlyDiagnosed++;
		}
		if (diseaseStatus.equalsIgnoreCase("CR (Complete Remission)") || diseaseStatus
				.equalsIgnoreCase("CR (Complete Response)") || diseaseStatus.contains("CR (Complete Remission)")) {
			cr++;
		}
		if (diseaseStatus.equalsIgnoreCase("nCR (near CR)")) {
			nCR++;
		}
		if (diseaseStatus.equalsIgnoreCase("PR (Partial Response)")) {
			pr++;
		}
		if (diseaseStatus.equalsIgnoreCase("PD (Progressive Disease)")) {
			pd++;
		}
		if (diseaseStatus.equalsIgnoreCase("SD (Stable Disease)") || diseaseStatus
				.equalsIgnoreCase("NR (No Response) or SD (Stable Disease)") || diseaseStatus.equalsIgnoreCase("Stable Disease")) {
			sd++;
		}
		if (diseaseStatus.equalsIgnoreCase("Complete Hematologic Response")) {
			completeHematologicResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("Complete Cytogenetic Response")) {
			completeCytogeneticResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("Major Molecular Response")) {
			majorMolecularResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("Spleen Response")) {
			spleenResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("Symptom Response")) {
			symptomResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("sCR (stringent complete remission)")) {
			sCR++;
		}
		if (diseaseStatus.equalsIgnoreCase("Immunophenotypic CR") || diseaseStatus.equalsIgnoreCase("Immunophenotypic")) {
			immunophenotypicCR++;
		}
		if (diseaseStatus.equalsIgnoreCase("Molecular CR")) {
			molecularCR++;
		}
		if (diseaseStatus.equalsIgnoreCase("VGPR (Very Good Partial Response)")) {
			vgpr++;
		}
		if (diseaseStatus.equalsIgnoreCase("MR (minimal response for relapsed refractory myeloma only)")) {
			mr++;
		}
		/*if (diseaseStatus.equalsIgnoreCase("Clinical Relapse")) {
			clinicalRelapse++;
		}
		if (diseaseStatus.equalsIgnoreCase("Relapse from CR")) {
			relapseFromCR++;
		}*/
		if (diseaseStatus.contains("Newly Diagnosed ITP")) {
			newlyDiagnosedITP++;
		}
		if (diseaseStatus.contains("Persistent ITP")) {
			persistentITP++;
		}
		if (diseaseStatus.contains("Chronic ITP")) {
			chronicITP++;
		}
		if (diseaseStatus.contains("Severe ITP")) {
			severeITP++;
		}
		
	}
	
	public int getHematologicResponse() {
		return hematologicResponse;
	}
	
	public void setHematologicResponse(int hematologicResponse) {
		this.hematologicResponse = hematologicResponse;
	}
	
	public int getRelapsed() {
		return relapsed;
	}
	
	public void setRelapsed(int relapsed) {
		this.relapsed = relapsed;
	}
	
	public int getOthers() {
		return others;
	}
	
	public void setOthers(int others) {
		this.others = others;
	}
	
	public int getNewlyDiagnosed() {
		return newlyDiagnosed;
	}
	
	public void setNewlyDiagnosed(int newlyDiagnosed) {
		this.newlyDiagnosed = newlyDiagnosed;
	}
	
	public int getCr() {
		return cr;
	}
	
	public void setCr(int cr) {
		this.cr = cr;
	}
	
	public int getnCR() {
		return nCR;
	}
	
	public void setnCR(int nCR) {
		this.nCR = nCR;
	}
	
	public int getPr() {
		return pr;
	}
	
	public void setPr(int pr) {
		this.pr = pr;
	}
	
	public int getPd() {
		return pd;
	}
	
	public void setPd(int pd) {
		this.pd = pd;
	}
	
	public int getSd() {
		return sd;
	}
	
	public void setSd(int sd) {
		this.sd = sd;
	}
	
	public int getCompleteHematologicResponse() {
		return completeHematologicResponse;
	}
	
	public void setCompleteHematologicResponse(int completeHematologicResponse) {
		this.completeHematologicResponse = completeHematologicResponse;
	}
	
	public int getCompleteCytogeneticResponse() {
		return completeCytogeneticResponse;
	}
	
	public void setCompleteCytogeneticResponse(int completeCytogeneticResponse) {
		this.completeCytogeneticResponse = completeCytogeneticResponse;
	}
	
	public int getMajorMolecularResponse() {
		return majorMolecularResponse;
	}
	
	public void setMajorMolecularResponse(int majorMolecularResponse) {
		this.majorMolecularResponse = majorMolecularResponse;
	}
	
	public int getSpleenResponse() {
		return spleenResponse;
	}
	
	public void setSpleenResponse(int spleenResponse) {
		this.spleenResponse = spleenResponse;
	}
	
	public int getSymptomResponse() {
		return symptomResponse;
	}
	
	public void setSymptomResponse(int symptomResponse) {
		this.symptomResponse = symptomResponse;
	}
	
	public int getsCR() {
		return sCR;
	}
	
	public void setsCR(int sCR) {
		this.sCR = sCR;
	}
	
	public int getImmunophenotypicCR() {
		return immunophenotypicCR;
	}
	
	public void setImmunophenotypicCR(int immunophenotypicCR) {
		this.immunophenotypicCR = immunophenotypicCR;
	}
	
	public int getMolecularCR() {
		return molecularCR;
	}
	
	public void setMolecularCR(int molecularCR) {
		this.molecularCR = molecularCR;
	}
	
	public int getVgpr() {
		return vgpr;
	}
	
	public void setVgpr(int vgpr) {
		this.vgpr = vgpr;
	}
	
	public int getMr() {
		return mr;
	}
	
	public void setMr(int mr) {
		this.mr = mr;
	}
	
	public int getClinicalRelapse() {
		return clinicalRelapse;
	}
	
	public void setClinicalRelapse(int clinicalRelapse) {
		this.clinicalRelapse = clinicalRelapse;
	}
	
	public int getRelapseFromCR() {
		return relapseFromCR;
	}
	
	public void setRelapseFromCR(int relapseFromCR) {
		this.relapseFromCR = relapseFromCR;
	}
	
	public int getNewlyDiagnosedITP() {
		return newlyDiagnosedITP;
	}
	
	public void setNewlyDiagnosedITP(int newlyDiagnosedITP) {
		this.newlyDiagnosedITP = newlyDiagnosedITP;
	}
	
	public int getPersistentITP() {
		return persistentITP;
	}
	
	public void setPersistentITP(int persistentITP) {
		this.persistentITP = persistentITP;
	}
	
	public int getChronicITP() {
		return chronicITP;
	}
	
	public void setChronicITP(int chronicITP) {
		this.chronicITP = chronicITP;
	}
	
	public int getSevereITP() {
		return severeITP;
	}
	
	public void setSevereITP(int severeITP) {
		this.severeITP = severeITP;
	}
	
}
