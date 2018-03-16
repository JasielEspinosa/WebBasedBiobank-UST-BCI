package model;

public class ChartModel {

	private int maleChart;
	private int femaleChart;
	ChartAge chartAge;
	ChartModeOfTreatmentBean chartModeOfTreatmentBean;
	ChartStatusBaseline chartStatusBaseline;
	ChartStatusFollowup chartStatusFollowup;

	public ChartModel(int maleChart, int femaleChart, ChartAge chartAge,
			ChartModeOfTreatmentBean chartModeOfTreatmentBean, ChartStatusBaseline chartStatusBaseline,
			ChartStatusFollowup chartStatusFollowup) {
		this.maleChart = maleChart;
		this.femaleChart = femaleChart;
		this.chartAge = chartAge;
		this.chartModeOfTreatmentBean = chartModeOfTreatmentBean;
		this.chartStatusBaseline = chartStatusBaseline;
		this.chartStatusFollowup = chartStatusFollowup;
	}

	public int getMaleChart() {
		return maleChart;
	}

	public void setMaleChart(int maleChart) {
		this.maleChart = maleChart;
	}

	public int getFemaleChart() {
		return femaleChart;
	}

	public void setFemaleChart(int femaleChart) {
		this.femaleChart = femaleChart;
	}

	public ChartAge getChartAge() {
		return chartAge;
	}

	public void setChartAge(ChartAge chartAge) {
		this.chartAge = chartAge;
	}

	public ChartModeOfTreatmentBean getChartModeOfTreatmentBean() {
		return chartModeOfTreatmentBean;
	}

	public void setChartModeOfTreatmentBean(ChartModeOfTreatmentBean chartModeOfTreatmentBean) {
		this.chartModeOfTreatmentBean = chartModeOfTreatmentBean;
	}

	public ChartStatusBaseline getChartStatusBaseline() {
		return chartStatusBaseline;
	}

	public void setChartStatusBaseline(ChartStatusBaseline chartStatusBaseline) {
		this.chartStatusBaseline = chartStatusBaseline;
	}

	public ChartStatusFollowup getChartStatusFollowup() {
		return chartStatusFollowup;
	}

	public void setChartStatusFollowup(ChartStatusFollowup chartStatusFollowup) {
		this.chartStatusFollowup = chartStatusFollowup;
	}
	
	

}
