package model;

public class ChartAge {
	
	private int ageChart[] = {0,0,0,0,0,0,0,0,0,0,0};

	public void setAgeChart(int age) {
		if(age <= 10 && age >=1) {
			ageChart[0]++;	
		}
		else if(age <= 20 && age >=11) {
			ageChart[1]++;	
		}
		else if(age <= 30 && age >=21) {
			ageChart[1]++;	
		}
		else if(age <= 40 && age >=31) {
			ageChart[2]++;	
		}
		else if(age <= 50 && age >=41) {
			ageChart[3]++;	
		}
		else if(age <= 60 && age >=51) {
			ageChart[4]++;	
		}
		else if(age <= 70 && age >=61) {
			ageChart[5]++;	
		}
		else if(age <= 80 && age >=71) {
			ageChart[6]++;	
		}
		else if(age <= 90 && age >=81) {
			ageChart[7]++;	
		}
		else if(age <= 100 && age >91) {
			ageChart[8]++;	
		}
		else {
			ageChart[9]++;	
		}
	}

	public int[] getAgeChart() {
		return ageChart;
	}
	
	
	
	
	
	
	
	
	

	

}
