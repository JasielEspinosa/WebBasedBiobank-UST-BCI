//LEUKEMIA
var leukemiaChartAge;
var leukemiaChartGender;
var leukemiaChartModeOfTreatment;
var leukemiaChartBaselineDiseaseStatus;
var leukemiaChartFollowupDiseaseStatus;
var leukemiaSummarizedBaselineStatistics;
var leukemiaSummarizedFollowupStatistics;

// LYMPHOMA
var lymphomaChartAge;
var lymphomaChartGender;
var lymphomaChartModeOfTreatment;
var lymphomaChartBaselineDiseaseStatus;
var lymphomaChartFollowupDiseaseStatus;
var lymphomaSummarizedBaselineStatistics;
var lymphomaSummarizedFollowupStatistics;

// MYELOPROLFERATIVE
var myeloChartAge;
var myeloChartGender;
var myeloChartModeOfTreatment;
var myeloChartBaselineDiseaseStatus;
var myeloChartFollowupDiseaseStatus;
var myeloSummarizedBaselineStatistics;
var myeloSummarizedFollowupStatistics;

// PLASMA CELL
var plasmaCellChartAge;
var plasmaCellChartGender;
var plasmaCellChartModeOfTreatment;
var plasmaCellChartBaselineDiseaseStatus;
var plasmaCellChartFollowupDiseaseStatus;
var plasmaCellSummarizedBaselineStatistics;
var plasmaCellSummarizedFollowupStatistics;

// AA PNH MDS
var aapnhmdsChartAge;
var aapnhmdsChartGender;
var aapnhmdsChartModeOfTreatment;
var aapnhmdsChartBaselineDiseaseStatus;
var aapnhmdsChartFollowupDiseaseStatus;
var aapnhmdsSummarizedBaselineStatistics;
var aapnhmdsSummarizedFollowupStatistics;

// PLATELET DISORDER
var plateletChartAge;
var plateletChartGender;
var plateletChartModeOfTreatment;
var plateletChartBaselineDiseaseStatus;
var plateletChartFollowupDiseaseStatus;
var plateletSummarizedBaselineStatistics;
var plateletSummarizedFollowupStatistics;

// COAGULATION
var coagulationChartAge;
var coagulationChartGender;
var coagulationChartModeOfTreatment;
var coagulationChartBaselineDiseaseStatus;
var coagulationChartFollowupDiseaseStatus;
var coagulationSummarizedBaselineStatistics;
var coagulationSummarizedFollowupStatistics;

$( document ).ready(function() {
	
	// LEUKEMIA
	
	// LEUKEMIA AGE CHART
	var pieData = {
			  labels: [		  
				  "0-10", 
				  "11-20", 
				  "21-30", 
				  "31-40",
				  "41-50", 
				  "51-60", 
				  "61-70", 
				  "71-80",
				  "81-90", 
				  "90-100", 
				  "101 and Above"],
			  datasets: [
			    {
			      // data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
			      backgroundColor: [
		                '#6A0000',
		                '#F30909',
		                '#F05E17',
		                '#F3C218',
		                '#A1DC23',
		                '#1AE645',
		                '#72C8B9',
		                '#668CE3',
		                '#2E20F3',
		                '#9516F7',
		                '#C34CB9'
			      ]
			    }]
	};
	var ctx = document.getElementById("leukemiaChartAge").getContext("2d");
	leukemiaChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	// END OF AGE CHART

	// LEUKEMIA GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      // data: [50, 50],
		      backgroundColor: [
		    	 '#3465F4',
		    	 '#F28AF3'
		      ]
		    }]
	};
	var ctx = document.getElementById("leukemiaChartGender").getContext("2d");
	leukemiaChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	// END OF GENDER CHART
	
	// LEUKEMIA MODE OF TREATMENT BASELINE
	var ctx = document.getElementById("leukemiaChartModeOfTreatment").getContext('2d');
	leukemiaChartModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Pharmacologic 1st Line',
		          // data: [ 5 ],
		          backgroundColor: '#8A5B0A'
		        }, {
		          label: 'Pharmacologic 2nd Line / Salvage',
		          // data: [ 10 ],
		          backgroundColor: '#A6A422'
		        },
		        {
			      label: 'Supportive / Palliative Only',
			      // data: [ 15 ],
			      backgroundColor: '#22BA57'
			    },
			    {
				  label: 'Watch and Wait',
				  // data: [ 20 ],
				  backgroundColor: '#2EABCF'
				},
				{
				  label: 'Others',
				  // data: [ 25 ],
				  backgroundColor: '#FF6000'
				}
		  ],
		    labels: [
		    	'Pharmacologic 1st Line', 
		    	'Pharmacologic 2nd Line / Salvage', 
		    	'Supportive / Palliative Only',
		    	'Watch and Wait',
		    	'Others']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            		autoSkip: false
		            	}
		            }]
		        }
		    }
		});
	// END OF LEUKEMIA MODE OF TREATMENT
	
	// LEUKEMIA BASELINE DISEASE STATUS
	var ctx = document.getElementById("leukemiaChartBaselineDiseaseStatus").getContext('2d');
	leukemiaChartBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Newly Diagnosed',
		          // data: [ 2 ],
		          backgroundColor: '#1C41E4'
		        },
		        {
			      label: 'CR',
			      // data: [ 6 ],
			      backgroundColor: '#A33FF0'
			    },
			    {
				  label: 'nCR',
				  // data: [ 8 ],
				  backgroundColor: '#EA2AD5'
				},
				{
				  label: 'PR',
				  // data: [ 10 ],
				  backgroundColor: '#FFA200'
				},
				{
			      label: 'PD',
			      // data: [ 12 ],
			      backgroundColor: '#76B12B'
			    }, {
			      label: 'SD',
			      // data: [ 14 ],
			      backgroundColor: '#1EBEA5'
			    },
			    {
				  label: 'Complete Hematologic Response',
				  // data: [ 16 ],
				  backgroundColor: '#257EDA'
				},
				{
				  label: 'Complete Cytogenetic Response',
				  // data: [ 18 ],
				  backgroundColor: '#9577EE'
				},
				{
				  label: 'Major Molecular Response',
				  // data: [ 20 ],
				  backgroundColor: '#C633E1'
				},
				{
				  label: 'Spleen Response',
				  // data: [ 18 ],
				  backgroundColor: '#DD148F'
			    },
				{
				  label: 'Symptom Response',
				  // data: [ 16 ],
				  backgroundColor: '#8A5B0A'
				},
				{
				  label: 'Others',
				  // data: [ 12 ],
				  backgroundColor: '#FF6000'
				}
			],
		    labels: [
		      'Newly Diagnosed',
      	      'CR', 
      	      'nCR', 
      	      'PR', 
      	      'PD', 
      	      'SD', 
      	      'Complete Hematologic Response', 
      	      'Complete Cytogenetic Response', 
      	      'Major Molecular Response', 
      	      'Spleen Response', 
      	      'Symptom Response',
      	      'Others' ],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 15,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END
	
	// LEUKEMIA BASELINE FOLLOWUP DISEASE
	var ctx = document.getElementById("leukemiaChartFollowupDiseaseStatus").getContext('2d');
	leukemiaChartFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Relapsed',
		          // data: [ 2 ],
		          backgroundColor: '#A6A422'
		        }, {
		          label: 'Refractory Disease',
		          // data: [ 4 ],
		          backgroundColor: '#22BA57'
		        },
		        {
			      label: 'CR',
			      // data: [ 6 ],
			      backgroundColor: '#2EABCF'
			    },
			    {
				  label: 'nCR',
				  // data: [ 8 ],
				  backgroundColor: '#1C41E4'
				},
				{
				  label: 'PR',
				  // data: [ 10 ],
				  backgroundColor: '#A33FF0'
				},
				{
			      label: 'PD',
			      // data: [ 12 ],
			      backgroundColor: '#EA2AD5'
			    }, {
			      label: 'SD',
			      // data: [ 14 ],
			      backgroundColor: '#FFA200'  
			    },
			    {
				  label: 'Complete Hematologic Response',
				  // data: [ 16 ],
				  backgroundColor: '#76B12B'
				},
				{
				  label: 'Complete Cytogenetic Response',
				  // data: [ 18 ],
				  backgroundColor: '#1EBEA5'
				},
				{
				  label: 'Major Molecular Response',
				  // data: [ 20 ],
				  backgroundColor: '#257EDA'
				},
				{
				  label: 'Spleen Response',
				  // data: [ 18 ],
				  backgroundColor: '#9577EE'
			    },
				{
				  label: 'Symptom Response',
				  // data: [ 16 ],
				  backgroundColor: '#C633E1'
				},
				{
				  label: 'Dead',
				  // data: [ 14 ],
				  backgroundColor: '#FF0000'
				},
				{
				  label: 'Others',
				  // data: [ 14 ],
				  backgroundColor: '#FF6000'
		       }
			],
		    labels: [
		      'Relapsed', 
      	      'Refractory Disease', 
      	      'CR', 
      	      'nCR', 
      	      'PR', 
      	      'PD', 
      	      'SD', 
      	      'Complete Hematologic Response', 
      	      'Complete Cytogenetic Response', 
      	      'Major Molecular Response', 
      	      'Spleen Response', 
      	      'Symptom Response',
      	      'Dead',
      	      'Others'],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END
	
	// LEUKEMIA SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("leukemiaSummarizedBaselineStatistics").getContext('2d');
	leukemiaSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 80,
			                stepSize: 10,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END
	
	// LEUKEMIA SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("leukemiaSummarizedFollowupStatistics").getContext('2d');
	leukemiaSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 80,
			                stepSize: 10,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END
	
// LYMPHOMA
	
	// LYMPHOMA AGE CHART
	var pieData = {
			  labels: [
				  "0-10", 
				  "11-20", 
				  "21-30", 
				  "31-40",
				  "41-50", 
				  "51-60", 
				  "61-70", 
				  "71-80",
				  "81-90", 
				  "90-100", 
				  "101 and Above"],
			  datasets: [
			    {
			      // data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
			      backgroundColor: [
		                '#6A0000',
		                '#F30909',
		                '#F05E17',
		                '#F3C218',
		                '#A1DC23',
		                '#1AE645',
		                '#72C8B9',
		                '#668CE3',
		                '#2E20F3',
		                '#9516F7',
		                '#C34CB9'
			      ]
			    }]
	};
	var ctx = document.getElementById("lymphomaChartAge").getContext("2d");
	lymphomaChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	// END OF AGE CHART

	// LYMPHOMA GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      // data: [50, 50],
		      backgroundColor: [
			    	 '#3465F4',
			    	 '#F28AF3'
		      ]
		    }]
	};
	var ctx = document.getElementById("lymphomaChartGender").getContext("2d");
	lymphomaChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	// END OF GENDER CHART
	
	// LYMPHOMA MODE OF TREATMENT BASELINE
	var ctx = document.getElementById("lymphomaChartModeOfTreatment").getContext('2d');
	lymphomaChartModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Pharmacologic 1st Line',
		          // data: [ 5 ],
		          backgroundColor: '#DD148F'
		        }, {
		          label: 'Pharmacologic 2nd Line / Salvage',
		          // data: [ 10 ],
		          backgroundColor: '#8A5B0A'
		        },
		        {
			      label: 'Supportive / Palliative Only',
			      // data: [ 15 ],
			      backgroundColor: '#A6A422'
			    }
		  ],
		    labels: [
		    	'Pharmacologic 1st Line', 
		    	'Pharmacologic 2nd Line / Salvage', 
		    	'Supportive / Palliative Only']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF LYMPHOMA MODE OF TREATMENT
	
	// LYMPHOMA BASELINE DISEASE STATUS
	var ctx = document.getElementById("lymphomaChartBaselineDiseaseStatus").getContext('2d');
	lymphomaChartBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Newly Diagnosed',
		          // data: [ 2 ],
		          backgroundColor: '#22BA57'
		        }, 
		        {
			      label: 'CR',
			      // data: [ 6 ],
			      backgroundColor: '#2EABCF'
			    },
				{
				  label: 'PR',
				  // data: [ 10 ],
				  backgroundColor: '#1C41E4'
				},
				{
			      label: 'NR or SD',
			      // data: [ 12 ],
			      backgroundColor: '#A33FF0'
			    }, {
			      label: 'PD',
			      // data: [ 14 ],
			      backgroundColor: '#EA2AD5'
			    }
			],
		    labels: [
		      'Newly Diagnosed',
      	      'CR', 
      	      'PR', 
      	      'NR or SD', 
      	      'PD' ],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END
	
	// LYMPHOMA FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("lymphomaChartFollowupDiseaseStatus").getContext('2d');
	lymphomaChartFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
			        {
				      label: 'CR',
				      // data: [ 6 ],
				      backgroundColor: '#FFA200'
				    },
					{
					  label: 'PR',
					  // data: [ 10 ],
					  backgroundColor: '#76B12B'
					},
					{
				      label: 'NR or SD',
				      // data: [ 12 ],
				      backgroundColor: '#1EBEA5'
				    }, {
				      label: 'PD',
				      // data: [ 14 ],
				      backgroundColor: '#257EDA'
				    },
				    {
					  label: 'RR',
					  // data: [ 10 ],
					  backgroundColor: '#9577EE'
					},
					{
					   label: 'Dead',
					   // data: [ 12 ],
					   backgroundColor: '#FF0000'
					}, {
					   label: 'Others',
					   // data: [ 14 ],
					   backgroundColor: '#FF6000'
					}
			],
		    labels: [
		    	  'CR', 
	      	      'PR', 
	      	      'NR or SD', 
	      	      'PD',
	      	      'RR', 
	      	      'Dead', 
	      	      'Others'
	      	],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END
	
	// LYMPHOMA SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("lymphomaSummarizedBaselineStatistics").getContext('2d');
	lymphomaSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 80,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END
	
	// LYMPHOMA SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("lymphomaSummarizedFollowupStatistics").getContext('2d');
	lymphomaSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 80,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END
	
// MYELOPROLIFERATIVE
	
	// MYELOPROLIFERATIVE AGE CHART
	var pieData = {
			  labels: [
				  "0-10", 
				  "11-20", 
				  "21-30", 
				  "31-40",
				  "41-50", 
				  "51-60", 
				  "61-70", 
				  "71-80",
				  "81-90", 
				  "90-100", 
				  "101 and Above"],
			  datasets: [
			    {
			      // data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
			      backgroundColor: [
		                '#6A0000',
		                '#F30909',
		                '#F05E17',
		                '#F3C218',
		                '#A1DC23',
		                '#1AE645',
		                '#72C8B9',
		                '#668CE3',
		                '#2E20F3',
		                '#9516F7',
		                '#C34CB9'
			      ]
			    }]
	};
	var ctx = document.getElementById("myeloChartAge").getContext("2d");
	myeloChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	// END OF MYELOPROLIFERATIVE AGE CHART

	// MYELOPROLIFERATIVE GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      // data: [50, 50],
		      backgroundColor: [
			    	 '#3465F4',
			    	 '#F28AF3'
		      ]
		    }]
	};
	var ctx = document.getElementById("myeloChartGender").getContext("2d");
	myeloChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	// END OF GENDER CHART
	
	// MYELOPROLIFERATIVE MODE OF TREATMENT
	var ctx = document.getElementById("myeloChartModeOfTreatment").getContext('2d');
	myeloChartModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Pharmacologic Treatment',
		          // data: [ 10 ],
		          backgroundColor: '#C633E1'
		        },
		        {
			      label: 'Supportive / Palliative',
			      // data: [ 15 ],
			      backgroundColor: '#DD148F'
			    },
		        {
				  label: 'Watch and Wait',
				  // data: [ 15 ],
				  backgroundColor: '#8A5B0A'
				},
				{
				  label: 'Others',
				  // data: [ 15 ],
				  backgroundColor: '#FF6000'
				}
		  ],
		    labels: [
		    	'Pharmacologic Treatment', 
		    	'Supportive / Palliative',
		    	'Watch and Wait', 
		    	'Others']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF MYELOPROLIFERATIVE MODE OF TREATMENT
	
	// MYELOPROLIFERATIVE BASELINE DISEASE STATUS
	var ctx = document.getElementById("myeloChartBaselineDiseaseStatus").getContext('2d');
	myeloChartBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'CR',
		          // data: [ 2 ],
		          backgroundColor: '#A6A422'
		        }, 
		        {
			      label: 'PR',
			      // data: [ 6 ],
			      backgroundColor: '#22BA57'
			    },
				{
				  label: 'PD',
				  // data: [ 10 ],
				  backgroundColor: '#2EABCF'
				},
				{
			      label: 'SD',
			      // data: [ 12 ],
			      backgroundColor: '#1C41E4'
			    }, {
			      label: 'Hematologic Response',
			      // data: [ 14 ],
			      backgroundColor: '#A33FF0'
			    },
				{
				   label: 'Spleen Response ',
				   // data: [ 16 ],
				   backgroundColor: '#EA2AD5'
			    },
			    {
				   label: 'Symptom Response',
				   // data: [ 18 ],
				   backgroundColor: '#FFA200'
				}, {
				   label: 'Others',
				   // data: [ 20 ],
				   backgroundColor: '#FF6000'
				}
			],
		    labels: [
		      'CR',
      	      'PR ', 
      	      'PD', 
      	      'SD', 
      	      'Hematologic Response', 
      	      'Spleen Response ', 
      	      'Symptom Response', 
      	      'Others' ],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END
	
	// MYELOPROLIFERATIVE FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("myeloChartFollowupDiseaseStatus").getContext('2d');
	myeloChartFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
			          label: 'CR',
			          // data: [ 2 ],
			          backgroundColor: '#76B12B'
			        }, 
			        {
				      label: 'PR',
				      // data: [ 6 ],
				      backgroundColor: '#1EBEA5'
				    },
					{
					  label: 'PD',
					  // data: [ 10 ],
					  backgroundColor: '#257EDA'
					},
					{
				      label: 'SD',
				      // data: [ 12 ],
				      backgroundColor: '#9577EE'
				    }, {
				      label: 'Hematologic Response',
				      // data: [ 14 ],
				      backgroundColor: '#C633E1'
				    },
					{
					   label: 'Spleen Response ',
					   // data: [ 16 ],
					   backgroundColor: '#DD148F'
				    },
				    {
					   label: 'Symptom Response',
					   // data: [ 18 ],
					   backgroundColor: '#FFA200'
					},
					{
					  label: 'Dead',
				      // data: [ 18 ],
					  backgroundColor: '#FF0000'
				    },
					{
					   label: 'Others',
					   // data: [ 20 ],
					   backgroundColor: '#FF6000'
					}
			],
		    labels: [
		    	  'CR',
	      	      'PR ', 
	      	      'PD', 
	      	      'SD', 
	      	      'Hematologic Response', 
	      	      'Spleen Response ', 
	      	      'Symptom Response', 
	      	      'Dead',
	      	      'Others'
	      	],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END
	
	// MYELOPROLIFERATIVE SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("myeloSummarizedBaselineStatistics").getContext('2d');
	myeloSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 80,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END
	
	// MYELOPROLIFERATIVE SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("myeloSummarizedFollowupStatistics").getContext('2d');
	myeloSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 80,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF MYELOPROLIFERATIVE
	
// PLASMA CELL
	
	// PLASMA CELL AGE CHART
	var pieData = {
			  labels: [
				  "0-10", 
				  "11-20", 
				  "21-30", 
				  "31-40",
				  "41-50", 
				  "51-60", 
				  "61-70", 
				  "71-80",
				  "81-90", 
				  "90-100", 
				  "101 and Above"],
			  datasets: [
			    {
			      // data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
			      backgroundColor: [
		                '#6A0000',
		                '#F30909',
		                '#F05E17',
		                '#F3C218',
		                '#A1DC23',
		                '#1AE645',
		                '#72C8B9',
		                '#668CE3',
		                '#2E20F3',
		                '#9516F7',
		                '#C34CB9'
			      ]
			    }]
	};
	var ctx = document.getElementById("plasmaCellChartAge").getContext("2d");
	plasmaCellChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	// END OF PLASMA CELL AGE CHART

	// PLASMA CELL GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      // data: [50, 50],
		      backgroundColor: [
			    	 '#3465F4',
			    	 '#F28AF3'
		      ]
		    }]
	};
	var ctx = document.getElementById("plasmaCellChartGender").getContext("2d");
	plasmaCellChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	// END OF PLASMA CELL GENDER CHART
	
	// PLASMA CELL MODE OF TREATMENT
	var ctx = document.getElementById("plasmaCellChartModeOfTreatment").getContext('2d');
	plasmaCellChartModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Pharmacologic For Transplant Candidate',
		          // data: [ 10 ],
		          backgroundColor: '#76B12B'
		        },
		        {
			      label: 'Pharmacologic For Non-Transplant Candidate',
			      // data: [ 15 ],
			      backgroundColor: '#1EBEA5'
			    },
		        {
				  label: 'Maintenance',
				  // data: [ 17 ],
				  backgroundColor: '#257EDA'
				},
				{
				  label: 'Radiotherapy',
				  // data: [ 19 ],
				  backgroundColor: '#9577EE'
				},
				{
				  label: 'Supportive',
				  // data: [ 21 ],
				  backgroundColor: '#C633E1'
			    },
			    {
				  label: 'Watch and Wait',
				  // data: [ 23 ],
				  backgroundColor: '#DD148F'
			    },
				{
				  label: 'Others',
				  // data: [ 25 ],
				  backgroundColor: '#FF6000'
				}
		  ],
		    labels: [
		    	'Pharmacologic For Transplant Candidate', 
		    	'Pharmacologic For Non-Transplant Candidate',
		    	'Maintenance', 
		    	'Radiotherapy',
		    	'Supportive',
		    	'Watch and Wait', 
		    	'Others']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        },
		    }
		});
	// END OF PLASMA CELL MODE OF TREATMENT
	
	// PLASMA CELL BASELINE DISEASE STATUS
	var ctx = document.getElementById("plasmaCellChartBaselineDiseaseStatus").getContext('2d');
	plasmaCellChartBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'CR',
		          // data: [ 2 ],
		          backgroundColor: '#8A5B0A'
		        }, 
		        {
			      label: 'sCR',
			      // data: [ 4 ],
			      backgroundColor: '#A6A422'
			    },
				{
				  label: 'Immunophenotypic CR',
				  // data: [ 6 ],
				  backgroundColor: '#22BA57'
				},
				{
			      label: 'Molecular CR',
			      // data: [ 8 ],
			      backgroundColor: '#2EABCF'
			    }, {
			      label: 'VGPR',
			      // data: [ 10 ],
			      backgroundColor: '#1C41E4'
			    },
				{
				   label: 'PR',
				   // data: [ 12 ],
				   backgroundColor: '#A33FF0'
			    },
			    {
				   label: 'MR',
				   // data: [ 14 ],
				   backgroundColor: '#EA2AD5'
				}, {
				   label: 'SD',
				   // data: [ 16 ],
				   backgroundColor: '#FFA200'
				},
				{
				   label: 'PD',
				   // data: [ 18 ],
				   backgroundColor: '#76B12B'
				},
				{
				   label: 'Relapse',
				   // data: [ 20 ],
				   backgroundColor: '#1EBEA5'
				},
				/*{
				   label: 'Clinical Relapse',
				   // data: [ 16 ],
				   backgroundColor: '#257EDA'
			    },
				{
				   label: 'Relapse from CR',
				   // data: [ 18 ],
				   backgroundColor: '#9577EE'
				},*/
				{
				   label: 'Others',
				   // data: [ 20 ],
				   backgroundColor: '#FF6000'
				}
			],
		    labels: [
		      'CR',
      	      'sCR ', 
      	      'Immunophenotypic CR', 
      	      'Molecular CR', 
      	      'VGPR', 
      	      'PR', 
      	      'MR', 
      	      'SD',
      	      'PD', 
    	      'Relapse',
    	      /*'Clinical Relapse',
    	      'Relapse from CR',*/
    	      'Others'
      	   ],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END OF PLASMA CELL BASELINE DISEASE STATUS
	
	// PLASMA CELL FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("plasmaCellChartFollowupDiseaseStatus").getContext('2d');
	plasmaCellChartFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
			          label: 'CR',
			          // data: [ 2 ],
			          backgroundColor: '#C633E1'
			        }, 
			        {
				      label: 'sCR',
				      // data: [ 4 ],
				      backgroundColor: '#DD148F'
				    },
					{
					  label: 'Immunophenotypic CR',
					  // data: [ 6 ],
					  backgroundColor: '#8A5B0A'
					},
					{
				      label: 'Molecular CR',
				      // data: [ 8 ],
				      backgroundColor: '#A6A422'
				    }, {
				      label: 'VGPR',
				      // data: [ 10 ],
				      backgroundColor: '#22BA57'
				    },
					{
					   label: 'PR',
					   // data: [ 12 ],
					   backgroundColor: '#2EABCF'
				    },
				    {
					   label: 'MR',
					   // data: [ 14 ],
					   backgroundColor: '#1C41E4'
					}, {
					   label: 'SD',
					   // data: [ 16 ],
					   backgroundColor: '#A33FF0'
					},
					{
					   label: 'PD',
					   // data: [ 18 ],
					   backgroundColor: '#EA2AD5'
					},
					{
					   label: 'Relapse',
					   // data: [ 20 ],
					   backgroundColor: '#FFA200'
					},
					/*{
					   label: 'Clinical Relapse',
					   // data: [ 16 ],
					   backgroundColor: '#76B12B'
					},
					{
					   label: 'Relapse from CR',
					   // data: [ 18 ],
					   backgroundColor: '#1EBEA5'
				    },*/
				    {
					   label: 'Dead',
					   // data: [ 20 ],
					   backgroundColor: '#FF0000'
					},
				    {
					   label: 'Others',
					   // data: [ 20 ],
					   backgroundColor: '#FF6000'
					}
			],
		    labels: [
		    	  'CR',
	      	      'sCR ', 
	      	      'Immunophenotypic CR', 
	      	      'Molecular CR', 
	      	      'VGPR', 
	      	      'PR', 
	      	      'MR', 
	      	      'SD',
	      	      'PD', 
	    	      'Relapse',
	    	      /*'Clinical Relapse',
	    	      'Relapse from CR',*/
	    	      'Dead',
	    	      'Others'
	      	],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END OF PLASMA CELL FOLLOWUP DISEASE STATUS
	
	// PLASMA CELL SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("plasmaCellSummarizedBaselineStatistics").getContext('2d');
	plasmaCellSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 80,
			                stepSize: 10,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF PLASMA CELL SUMMARIZED BASELINE STATISTICS
	
	// PLASMA CELL SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("plasmaCellSummarizedFollowupStatistics").getContext('2d');
	plasmaCellSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 80,
			                stepSize: 10,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF PLASMA CELL SUMMARIZED FOLLOWUP STATISTICS
	
// AA PNH MDS
	
	// AA PNH MDS AGE CHART
	var pieData = {
			  labels: [
				  "0-10", 
				  "11-20", 
				  "21-30", 
				  "31-40",
				  "41-50", 
				  "51-60", 
				  "61-70", 
				  "71-80",
				  "81-90", 
				  "90-100", 
				  "101 and Above"],
			  datasets: [
			    {
			      // data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
			      backgroundColor: [
		                '#6A0000',
		                '#F30909',
		                '#F05E17',
		                '#F3C218',
		                '#A1DC23',
		                '#1AE645',
		                '#72C8B9',
		                '#668CE3',
		                '#2E20F3',
		                '#9516F7',
		                '#C34CB9'
			      ]
			    }]
	};
	var ctx = document.getElementById("aapnhmdsChartAge").getContext("2d");
	aapnhmdsChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	// END OF AA PNH MDS AGE CHART

	// AA PNH MDS GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      // data: [50, 50],
		      backgroundColor: [
			    	 '#3465F4',
			    	 '#F28AF3'
		      ]
		    }]
	};
	var ctx = document.getElementById("aapnhmdsChartGender").getContext("2d");
	aapnhmdsChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	// END OF AA PNH MDS GENDER CHART
	
	// AA PNH MDS MODE OF TREATMENT
	var ctx = document.getElementById("aapnhmdsChartModeOfTreatment").getContext('2d');
	aapnhmdsChartModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Hematopoietic Stem Cell Transplantation',
		          // data: [ 10 ],
		          backgroundColor: '#257EDA'
		        },
		        {
			      label: 'Pharmacologic Treatment ',
			      // data: [ 15 ],
			      backgroundColor: '#9577EE'
			    },
		        {
				  label: 'Supportive',
				  // data: [ 17 ],
				  backgroundColor: '#C633E1'
				},
				{
				  label: 'Both Pharmacologic and Supportive',
				  // data: [ 19 ],
				  backgroundColor: '#DD148F'
				},
				{
				  label: 'Watch and Wait ',
				  // data: [ 21 ],
				  backgroundColor: '#8A5B0A'
			    },
		  ],
		    labels: [
		    	'Hematopoietic Stem Cell Transplantation', 
		    	'Pharmacologic Treatment ',
		    	'Supportive', 
		    	'Both Pharmacologic and Supportive',
		    	'Watch and Wait ']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF AA PNH MDS MODE OF TREATMENT
	
	// AA PNH MDS BASELINE DISEASE STATUS
	var ctx = document.getElementById("aapnhmdsChartBaselineDiseaseStatus").getContext('2d');
	aapnhmdsChartBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Hematologic Response',
		          // data: [ 2 ],
		          backgroundColor: '#A6A422'
		        }, 
		        {
			      label: 'Stable Disease',
			      // data: [ 4 ],
			      backgroundColor: '#22BA57'
			    },
				{
				  label: 'Relapsed',
				  // data: [ 6 ],
				  backgroundColor: '#2EABCF'
				},
				{
			      label: 'Others',
			      // data: [ 8 ],
			      backgroundColor: '#FF6000'
			    }
			],
		    labels: [
		      'Hematologic Response',
      	      'Stable Disease ', 
      	      'Relapsed', 
      	      'Others'
      	   ],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END OF AA PNH MDS BASELINE DISEASE STATUS
	
	// AA PNH MDS FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("aapnhmdsChartFollowupDiseaseStatus").getContext('2d');
	aapnhmdsChartFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    		{
			          label: 'Hematologic Response',
			          // data: [ 2 ],
			          backgroundColor: '#1C41E4'
			        }, 
			        {
				      label: 'Stable Disease',
				      // data: [ 4 ],
				      backgroundColor: '#A33FF0'
				    },
					{
					  label: 'Relapsed',
					  // data: [ 6 ],
					  backgroundColor: '#EA2AD5'
					},
					{
					  label: 'Dead',
					  // data: [ 8 ],
					  backgroundColor: '#FF0000'
					},
					{
				      label: 'Others',
				      // data: [ 8 ],
				      backgroundColor: '#FF6000'
				    }
			],
		    labels: [
		    	  'Hematologic Response',
	      	      'Stable Disease', 
	      	      'Relapsed',
	      	      'Dead',
	      	      'Others'
	      	],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END OF AA PNH MDS FOLLOWUP DISEASE STATUS
	
	// AA PNH MDS SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("aapnhmdsSummarizedBaselineStatistics").getContext('2d');
	aapnhmdsSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 80,
			                stepSize: 10,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF AA PNH MDS SUMMARIZED BASELINE STATISTICS
	
	// AA PNH MDS SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("aapnhmdsSummarizedFollowupStatistics").getContext('2d');
	aapnhmdsSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 80,
			                stepSize: 10,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF AA PNH MDS SUMMARIZED FOLLOWUP STATISTICS
	
// PLATELET
	
	// PLATELET AGE CHART
	var pieData = {
			  labels: [
				  "0-10", 
				  "11-20", 
				  "21-30", 
				  "31-40",
				  "41-50", 
				  "51-60", 
				  "61-70", 
				  "71-80",
				  "81-90", 
				  "90-100", 
				  "101 and Above"],
			  datasets: [
			    {
			      // data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
			      backgroundColor: [
		                '#6A0000',
		                '#F30909',
		                '#F05E17',
		                '#F3C218',
		                '#A1DC23',
		                '#1AE645',
		                '#72C8B9',
		                '#668CE3',
		                '#2E20F3',
		                '#9516F7',
		                '#C34CB9'
			      ]
			    }]
	};
	var ctx = document.getElementById("plateletChartAge").getContext("2d");
	plateletChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	// END OF PLATELET AGE CHART

	// PLATELET GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      // data: [50, 50],
		      backgroundColor: [
			    	 '#3465F4',
			    	 '#F28AF3'
		      ]
		    }]
	};
	var ctx = document.getElementById("plateletChartGender").getContext("2d");
	plateletChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	// END OF PLATELET GENDER CHART
	
	// PLATELET MODE OF TREATMENT
	var ctx = document.getElementById("plateletChartModeOfTreatment").getContext('2d');
	plateletChartModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Pharmacologic 1st Line',
		          // data: [ 10 ],
		          backgroundColor: '#FFA200'
		        },
		        {
			      label: 'Pharmacologic 2nd Line',
			      // data: [ 15 ],
			      backgroundColor: '#76B12B'
			    },
		        {
				  label: 'Supportive',
				  // data: [ 17 ],
				  backgroundColor: '#1EBEA5'
				},
				{
				  label: 'Both Pharmacologic and Supportive',
				  // data: [ 19 ],
				  backgroundColor: '#257EDA'
				},
				{
				  label: 'Watch and Wait ',
				  // data: [ 21 ],
				  backgroundColor: '#9577EE'
			    },
			    {
				  label: 'Others',
				  // data: [ 21 ],
				  backgroundColor: '#FF6000'
				}
		  ],
		    labels: [
		    	'Pharmacologic 1st Line', 
		    	'Pharmacologic 2nd Line',
		    	'Supportive', 
		    	'Both Pharmacologic and Supportive',
		    	'Watch and Wait ',
		    	'Others']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF PLATELET MODE OF TREATMENT
	
	// PLATELET BASELINE DISEASE STATUS
	var ctx = document.getElementById("plateletChartBaselineDiseaseStatus").getContext('2d');
	plateletChartBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Newly Diagnosed ITP',
		          // data: [ 2 ],
		          backgroundColor: '#C633E1'
		        }, 
		        {
			      label: 'Persistetnt ITP',
			      // data: [ 4 ],
			      backgroundColor: '#DD148F'
			    },
				{
				  label: 'Chronic ITP',
				  // data: [ 6 ],
				  backgroundColor: '#8A5B0A'
				},
				{
			      label: 'Severe ITP',
			      // data: [ 8 ],
			      backgroundColor: '#A6A422'
			    }
			],
		    labels: [
		      'Newly Diagnosed ITP',
      	      'Persistetnt ITP', 
      	      'Chronic ITP', 
      	      'Severe ITP'
      	   ],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END OF PLATELET BASELINE DISEASE STATUS
	
	// PLATELET FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("plateletChartFollowupDiseaseStatus").getContext('2d');
	plateletChartFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    		{
			          label: 'CR',
			          // data: [ 2 ],
			          backgroundColor: '#22BA57'
			        }, 
			        {
				      label: 'R',
				      // data: [ 4 ],
				      backgroundColor: '#2EABCF'
				    },
					{
					  label: 'Time to Response',
					  // data: [ 6 ],
					  backgroundColor: '#257EDA'
					},
					{
					  label: 'NR',
					  // data: [ 6 ],
					  backgroundColor: '#1C41E4'
					},
					{
					  label: 'Loss of CR or R',
					  // data: [ 8 ],
					  backgroundColor: '#A33FF0'
					},
					{
				      label: 'Refractory ITP',
				      // data: [ 8 ],
				      backgroundColor: '#EA2AD5'
				    },
				    {
					   label: 'Stable Disease',
					   // data: [ 8 ],
					   backgroundColor: '#FFA200'
					},
					{
						label: 'Dead',
						// data: [ 8 ],
						backgroundColor: '#FF0000'
					},
					{
						label: 'Others',
						// data: [ 8 ],
						backgroundColor: '#FF6000'
					}
			],
		    labels: [
		    	  'CR',
	      	      'R', 
	      	      'Time to Response',
	      	      'NR',
	      	      'Loss of CR or R',
	      	      'Refractory ITP',
	      	      'Stable Disease',
	      	      'Dead',
	      	      'Otherss'
	      	],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END OF PLATELET FOLLOWUP DISEASE STATUS
	
	// PLATELET SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("plateletSummarizedBaselineStatistics").getContext('2d');
	plateletSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 80,
			                stepSize: 10,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF PLATELET SUMMARIZED BASELINE STATISTICS
	
	// PLATELET SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("plateletSummarizedFollowupStatistics").getContext('2d');
	plateletSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 80,
			                stepSize: 10,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF PLATELET SUMMARIZED FOLLOWUP STATISTICS
	
// COAGULATION
	
	// COAGULATION AGE CHART
	var pieData = {
			  labels: [		  
				  "0-10", 
				  "11-20", 
				  "21-30", 
				  "31-40",
				  "41-50", 
				  "51-60", 
				  "61-70", 
				  "71-80",
				  "81-90", 
				  "90-100", 
				  "101 and Above"],
			  datasets: [
			    {
			      // data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
			      backgroundColor: [
		                '#6A0000',
		                '#F30909',
		                '#F05E17',
		                '#F3C218',
		                '#A1DC23',
		                '#1AE645',
		                '#72C8B9',
		                '#668CE3',
		                '#2E20F3',
		                '#9516F7',
		                '#C34CB9'
			      ]
			    }]
	};
	var ctx = document.getElementById("coagulationChartAge").getContext("2d");
	coagulationChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	// END OF COAGULATION AGE CHART

	// COAGULATION GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      // data: [50, 50],
		      backgroundColor: [
			    	 '#3465F4',
			    	 '#F28AF3'
		      ]
		    }]
	};
	var ctx = document.getElementById("coagulationChartGender").getContext("2d");
	coagulationChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	// END OF COAGULATION GENDER CHART
	
	// COAGULATION MODE OF TREATMENT
	var ctx = document.getElementById("coagulationChartModeOfTreatment").getContext('2d');
	coagulationChartModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Factor Concentrates',
		          // data: [ 10 ],
		          backgroundColor: '#76B12B'
		        },
		        {
			      label: 'Blood Component',
			      // data: [ 15 ],
			      backgroundColor: '#1EBEA5'
			    },
		        {
				  label: 'Others',
				  // data: [ 17 ],
				  backgroundColor: '#FF6000'
				}
		  ],
		    labels: [
		    	'Factor Concentrates', 
		    	'Blood Component',
		    	'Others']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF COAGULATION MODE OF TREATMENT
	
	// COAGULATION BASELINE DISEASE STATUS
	var ctx = document.getElementById("coagulationChartBaselineDiseaseStatus").getContext('2d');
	coagulationChartBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		        {
			      label: 'Stable Disease',
			      // data: [ 4 ],
			      backgroundColor: '#257EDA'
			    }
			],
		    labels: [
      	      'Stable Disease', 
      	   ],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
			                suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END OF COAGULATION BASELINE DISEASE STATUS
	
	// COAGULATION FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("coagulationChartFollowupDiseaseStatus").getContext('2d');
	coagulationChartFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
			        {
				      label: 'Stable Disease',
				      // data: [ 4 ],
				      backgroundColor: '#9577EE'
				    }
			],
		    labels: [
	      	      'Stable Disease', 
	      	],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		suggestedMin: 0,
		            		suggestedMax: 30,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 0.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	// END OF COAGULATION FOLLOWUP DISEASE STATUS
	
	// COAGULATION SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("coagulationSummarizedBaselineStatistics").getContext('2d');
	coagulationSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 80,
			                stepSize: 10,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF COAGULATION SUMMARIZED BASELINE STATISTICS
	
	// COAGULATION SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("coagulationSummarizedFollowupStatistics").getContext('2d');
	coagulationSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          // data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          // data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      // data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  // data: [7, 14, 21, 38],
			      type: 'line',
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				}
		  ],
		    labels: ['January', 'February', 'March', 'April']
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 80,
			                stepSize: 10,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	// END OF COAGULATION SUMMARIZED FOLLOWUP STATISTICS
	
});
// END OF CODE


function addData(chart, data) {
    chart.data.datasets.forEach((dataset) => {
        dataset.data.push(data);
    });
    chart.update();
}

function removeData(chart) {
    chart.data.labels.pop();
    chart.data.datasets.forEach((dataset) => {
        dataset.data.pop();
    });
    chart.update();
}