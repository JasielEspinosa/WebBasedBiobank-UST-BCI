package model;

public class ChartStatusFollowup {
	
	int hematologicResponse = 0;
	int relapsed = 0;
	int others = 0;
	int dead = 0;
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
	int sCR = 0;
	int immunophenotypicCR = 0;
	int molecularCR = 0;
	int vgpr = 0;
	int mr = 0;
	int clinicalRelapse = 0;
	int relapseFromCR = 0;
	int remission = 0;
	int timeToResponse = 0;
	int nr = 0;
	int lossofCR = 0;
	int refractoryITP = 0;
	
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
		if (diseaseStatus.equalsIgnoreCase("Dead")) {
			dead++;
		}
		if (diseaseStatus.equalsIgnoreCase("Refractory Disease")) {
			refractoryDisease++;
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
				.equalsIgnoreCase("NR (No Response) or SD (Stable Disease)") || diseaseStatus
						.equalsIgnoreCase("SD (Stable Disease)") || diseaseStatus.contains("Stable Disease")) {
			sd++;
		}
		if (diseaseStatus.equalsIgnoreCase("Complete Hematologic response")) {
			completeHematologicResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("Complete Cytogenetic Response")) {
			completeCytogeneticResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("Major Molecular Response")) {
			majorMolecularResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("Spleen response")) {
			spleenResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("Symptom response")) {
			symptomResponse++;
		}
		if (diseaseStatus.equalsIgnoreCase("RR (Relapsed/Refractory Disease)")) {
			rr++;
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
		if (diseaseStatus.contains("R (Remission)")) {
			remission++;
		}
		if (diseaseStatus.contains("Time to Response")) {
			timeToResponse++;
		}
		if (diseaseStatus.contains("NR (No Remission)")) {
			nr++;
		}
		if (diseaseStatus.contains("Loss of CR or R") || diseaseStatus.equalsIgnoreCase("Loss of Response")) {
			lossofCR++;
		}
		if (diseaseStatus.contains("Refractory ITP")) {
			refractoryITP++;
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
	
	public int getDead() {
		return dead;
	}
	
	public void setDead(int dead) {
		this.dead = dead;
	}
	
	public int getRefractoryDisease() {
		return refractoryDisease;
	}
	
	public void setRefractoryDisease(int refractoryDisease) {
		this.refractoryDisease = refractoryDisease;
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
	
	public int getRr() {
		return rr;
	}
	
	public void setRr(int rr) {
		this.rr = rr;
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
	
	public int getRemission() {
		return remission;
	}
	
	public void setRemission(int remission) {
		this.remission = remission;
	}
	
	public int getTimeToResponse() {
		return timeToResponse;
	}
	
	public void setTimeToResponse(int timeToResponse) {
		this.timeToResponse = timeToResponse;
	}
	
	public int getNr() {
		return nr;
	}
	
	public void setNr(int nr) {
		this.nr = nr;
	}
	
	public int getLossofCR() {
		return lossofCR;
	}
	
	public void setLossofCR(int lossofCR) {
		this.lossofCR = lossofCR;
	}
	
	public int getRefractoryITP() {
		return refractoryITP;
	}
	
	public void setRefractoryITP(int refractoryITP) {
		this.refractoryITP = refractoryITP;
	}
	
}
