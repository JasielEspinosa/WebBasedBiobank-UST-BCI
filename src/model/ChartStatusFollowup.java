package model;

public class ChartStatusFollowup {
	
	int hematologicResponse = 0;
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
		if(diseaseStatus.equals("Hematologic response")) {
			hematologicResponse++;
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
		if(diseaseStatus.equals("CR (Complete Remission)") || diseaseStatus.equals("CR (Complete Response)") || diseaseStatus.contains("Complete Remission")) {
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
		if(diseaseStatus.equals("SD (Stable Disease)") || diseaseStatus.equals("NR (No Response) or (SD Stable Disease)") || diseaseStatus.equals("Stable Disease") || diseaseStatus.equals("SD (Stable Disease)")) {
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
		if(diseaseStatus.equals("sCR (stringent complete remission)")) {
			sCR++;
		}
		if(diseaseStatus.equals("immunophenotypic CR")) {
			symptomResponse++;
		}
		if(diseaseStatus.equals("VGPR (Very Good Partial Response)")) {
			vgpr++;
		}
		if(diseaseStatus.equals("MR (minimal response for relapsed refractory myeloma only)")) {
			mr++;
		}
		if(diseaseStatus.equals("Clinical Relapse")) {
			clinicalRelapse++;
		}
		if(diseaseStatus.equals("Relapse from CR")) {
			relapseFromCR++;
		}
		if(diseaseStatus.contains("R (Remission)")) {
			remission++;
		}
		if(diseaseStatus.contains("Time to Response")) {
			timeToResponse++;
		}
		if(diseaseStatus.contains("NR ( No Remission)")) {
			nr++;
		}
		if(diseaseStatus.contains("Loss of CR or R")) {
			lossofCR++;
		}
		if(diseaseStatus.contains("Refractory ITP")) {
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
