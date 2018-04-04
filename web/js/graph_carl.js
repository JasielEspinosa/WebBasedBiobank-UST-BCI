$( document ).ready(function() {

	//LEUKEMIA
	
	// LEUKEMIA AGE CHART
	var pieData = {
			  labels: [
				  "Below 1",			  
				  "1-10", 
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
			      data: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10],
			      backgroundColor: [
		                'rgba(182, 186, 215, 1)',
		                'rgba(42, 58, 84, 1)',
		                'rgba(56, 96, 147, 1)',
		                'rgba(88, 138, 189, 1)',
		                'rgba(128, 175, 217, 1)',
		                'rgba(164, 203, 232, 1)',
		                'rgba(206, 224, 158, 1)',
		                'rgba(147, 184, 149, 1)',
		                'rgba(145, 219, 216, 1)',
		                'rgba(0, 180, 189, 1)',
		                'rgba(255, 143, 131, 1)',
		                'rgba(6, 124, 209, 1)'
			      ]
			    }]
	};
	var ctx = document.getElementById("leukemiaChartAge").getContext("2d");
	var leukemiaChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	//END OF AGE CHART

	// LEUKEMIA GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      data: [50, 50],
		      backgroundColor: [
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 99, 132, 0.2)'
		      ]
		    }]
	};
	var ctx = document.getElementById("leukemiaChartGender").getContext("2d");
	var leukemiaChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	//END OF GENDER CHART
	
	// LEUKEMIA MODE OF TREATMENT BASELINE
	var ctx = document.getElementById("leukemiaChartModeOfTreatment").getContext('2d');
	var leukemiaChartModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Pharmacologic 1st Line',
		          data: [ 5 ],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Pharmacologic 2nd Line / Salvage',
		          data: [ 10 ],
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Supportive / Palliative Only',
			      data: [ 15 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Watch and Wait',
				  data: [ 20 ],
			      backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
				  label: 'Others',
				  data: [ 25 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	//END OF LEUKEMIA MODE OF TREATMENT
	
	// LEUKEMIA BASELINE DISEASE STATUS
	var ctx = document.getElementById("leukemiaChartBaselineDiseaseStatus").getContext('2d');
	var leukemiaChartBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Newly Diagnosed',
		          data: [ 2 ],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        },
		        {
			      label: 'Relapsed',
			      data: [ 2 ],
			      backgroundColor: 'rgba(6, 124, 209, 1)'
			    },
			    {
			      label: 'Refractory Disease',
			      data: [ 2 ],
			      backgroundColor: 'rgba(255, 99, 132, 0.2)'
			    },
		        {
			      label: 'CR',
			      data: [ 6 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'nCR',
				  data: [ 8 ],
			      backgroundColor: 'rgba(245, 245, 220, 1)'
				},
				{
				  label: 'PR',
				  data: [ 10 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
			      label: 'PD',
			      data: [ 12 ],
			      backgroundColor: 'rgba(255, 99, 132, 0.2)'
			    }, {
			      label: 'SD',
			      data: [ 14 ],
			      backgroundColor: 'rgba(54, 162, 235, 0.2)'  
			    },
			    {
				  label: 'Complete Hematologic Response',
				  data: [ 16 ],
				  backgroundColor:'rgba(255, 206, 86, 0.2)'
				},
				{
				  label: 'Complete Cytogenetic Response',
				  data: [ 18 ],
				  backgroundColor: 'rgba(75, 192, 192, 0.2)'
				},
				{
				  label: 'Major Molecular Response',
				  data: [ 20 ],
				  backgroundColor: 'rgba(153, 102, 255, 0.2)'
				},
				{
				  label: 'Spleen Response',
				  data: [ 18 ],
				  backgroundColor: 'rgba(255, 159, 64, 0.2)'
			    },
				{
				  label: 'Symptom Response',
				  data: [ 16 ],
				  backgroundColor: 'rgba(206, 224, 158, 1)'
				},
				{
				  label: 'Dead',
				  data: [ 12 ],
				  backgroundColor: 'rgba(145, 219, 216, 1)'
			    },
				{
				  label: 'Others',
				  data: [ 12 ],
				  backgroundColor: 'rgba(145, 219, 216, 1)'
				}
			],
		    labels: [
		      'Newly Diagnosed',
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
      	      'Others' ],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 15,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END
	
	// LEUKEMIA BASELINE FOLLOWUP DISEASE
	var ctx = document.getElementById("leukemiaChartFollowupDiseaseStatus").getContext('2d');
	var leukemiaChartFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Relapsed',
		          data: [ 2 ],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Refractory Disease',
		          data: [ 4 ],
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'CR',
			      data: [ 6 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'nCR',
				  data: [ 8 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
				},
				{
				  label: 'PR',
				  data: [ 10 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
			      label: 'PD',
			      data: [ 12 ],
			      backgroundColor: 'rgba(255, 99, 132, 0.2)'
			    }, {
			      label: 'SD',
			      data: [ 14 ],
			      backgroundColor: 'rgba(54, 162, 235, 0.2)'  	  
			    },
			    {
				  label: 'Complete Hematologic Response',
				  data: [ 16 ],
				  backgroundColor:'rgba(255, 206, 86, 0.2)'
				},
				{
				  label: 'Complete Cytogenetic Response',
				  data: [ 18 ],
				  backgroundColor: 'rgba(75, 192, 192, 0.2)'
				},
				{
				  label: 'Major Molecular Response',
				  data: [ 20 ],
				  backgroundColor: 'rgba(153, 102, 255, 0.2)'
				},
				{
				  label: 'Spleen Response',
				  data: [ 18 ],
				  backgroundColor: 'rgba(255, 159, 64, 0.2)'
			    },
				{
				  label: 'Symptom Response',
				  data: [ 16 ],
				  backgroundColor: 'rgba(206, 224, 158, 1)'
				},
				{
				  label: 'Dead',
				  data: [ 14 ],
				  backgroundColor: 'rgba(147, 184, 149, 1)'
				},
				{
				  label: 'Others',
				  data: [ 14 ],
				  backgroundColor: 'rgba(147, 184, 149, 1)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END
	
	//LEUKEMIA SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("leukemiaSummarizedBaselineStatistics").getContext('2d');
	var leukemiaSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
	//LEUKEMIA SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("leukemiaSummarizedFollowupStatistics").getContext('2d');
	var leukemiaSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
//LYMPHOMA
	
	// LYMPHOMA AGE CHART
	var pieData = {
			  labels: [
				  "Below 1",			  
				  "1-10", 
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
			      data: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10],
			      backgroundColor: [
		                'rgba(182, 186, 215, 1)',
		                'rgba(42, 58, 84, 1)',
		                'rgba(56, 96, 147, 1)',
		                'rgba(88, 138, 189, 1)',
		                'rgba(128, 175, 217, 1)',
		                'rgba(164, 203, 232, 1)',
		                'rgba(206, 224, 158, 1)',
		                'rgba(147, 184, 149, 1)',
		                'rgba(145, 219, 216, 1)',
		                'rgba(0, 180, 189, 1)',
		                'rgba(255, 143, 131, 1)',
		                'rgba(6, 124, 209, 1)'
			      ]
			    }]
	};
	var ctx = document.getElementById("lymphomaChartAge").getContext("2d");
	var lymphomaChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	//END OF AGE CHART

	// LYMPHOMA GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      data: [50, 50],
		      backgroundColor: [
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 99, 132, 0.2)'
		      ]
		    }]
	};
	var ctx = document.getElementById("lymphomaChartGender").getContext("2d");
	var lymphomaChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	//END OF GENDER CHART
	
	// LYMPHOMA MODE OF TREATMENT BASELINE
	var ctx = document.getElementById("lymphomaModeOfTreatment").getContext('2d');
	var lymphomaModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Pharmacologic 1st Line',
		          data: [ 5 ],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Pharmacologic 2nd Line / Salvage',
		          data: [ 10 ],
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Supportive / Palliative Only',
			      data: [ 15 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	//END OF LYMPHOMA MODE OF TREATMENT
	
	// LYMPHOMA BASELINE DISEASE STATUS
	var ctx = document.getElementById("lymphomaChartBaselineDiseaseStatus").getContext('2d');
	var lymphomaChartBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Newly Diagnosed',
		          data: [ 2 ],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, 
		        {
			      label: 'CR',
			      data: [ 6 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
				{
				  label: 'PR',
				  data: [ 10 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
			      label: 'NR or SD',
			      data: [ 12 ],
			      backgroundColor: 'rgba(255, 99, 132, 0.2)'
			    }, {
			      label: 'PD',
			      data: [ 14 ],
			      backgroundColor: 'rgba(54, 162, 235, 0.2)'  
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END
	
	// LYMPHOMA FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("lymphomaChartFollowupDiseaseStatus").getContext('2d');
	var lymphomaChartFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
			        {
				      label: 'CR',
				      data: [ 6 ],
				      backgroundColor: 'rgba(255, 143, 131, 1)'
				    },
					{
					  label: 'PR',
					  data: [ 10 ],
					  backgroundColor: 'rgba(6, 124, 209, 1)'
					},
					{
				      label: 'NR or SD',
				      data: [ 12 ],
				      backgroundColor: 'rgba(255, 99, 132, 0.2)'
				    }, {
				      label: 'PD',
				      data: [ 14 ],
				      backgroundColor: 'rgba(54, 162, 235, 0.2)'  
				    },
				    {
					  label: 'RR',
					  data: [ 10 ],
					  backgroundColor: 'rgba(6, 124, 209, 1)'
					},
					{
					   label: 'Dead',
					   data: [ 12 ],
					   backgroundColor: 'rgba(255, 99, 132, 0.2)'
					}, {
					   label: 'Others',
					   data: [ 14 ],
					   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END
	
	//LYMPHOMA SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("lymphomaSummarizedBaselineStatistics").getContext('2d');
	var lymphomaSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
	//LYMPHOMA SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("lymphomaSummarizedFollowupStatistics").getContext('2d');
	var lymphomaSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
//MYELOPROLIFERATIVE
	
	// MYELOPROLIFERATIVE AGE CHART
	var pieData = {
			  labels: [
				  "Below 1",			  
				  "1-10", 
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
			      data: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10],
			      backgroundColor: [
		                'rgba(182, 186, 215, 1)',
		                'rgba(42, 58, 84, 1)',
		                'rgba(56, 96, 147, 1)',
		                'rgba(88, 138, 189, 1)',
		                'rgba(128, 175, 217, 1)',
		                'rgba(164, 203, 232, 1)',
		                'rgba(206, 224, 158, 1)',
		                'rgba(147, 184, 149, 1)',
		                'rgba(145, 219, 216, 1)',
		                'rgba(0, 180, 189, 1)',
		                'rgba(255, 143, 131, 1)',
		                'rgba(6, 124, 209, 1)'
			      ]
			    }]
	};
	var ctx = document.getElementById("myeloChartAge").getContext("2d");
	var myeloChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	//END OF MYELOPROLIFERATIVE AGE CHART

	// MYELOPROLIFERATIVE GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      data: [50, 50],
		      backgroundColor: [
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 99, 132, 0.2)'
		      ]
		    }]
	};
	var ctx = document.getElementById("myeloChartGender").getContext("2d");
	var myeloChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	//END OF GENDER CHART
	
	// MYELOPROLIFERATIVE MODE OF TREATMENT 
	var ctx = document.getElementById("myeloModeOfTreatment").getContext('2d');
	var myeloModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Pharmacologic Treatment',
		          data: [ 10 ],
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Supportive / Palliative',
			      data: [ 15 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
		        {
				  label: 'Watch and Wait',
				  data: [ 15 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
				  label: 'Others',
				  data: [ 15 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	//END OF MYELOPROLIFERATIVE MODE OF TREATMENT
	
	// MYELOPROLIFERATIVE BASELINE DISEASE STATUS
	var ctx = document.getElementById("myeloChartBaselineDiseaseStatus").getContext('2d');
	var myeloChartBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'CR',
		          data: [ 2 ],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, 
		        {
			      label: 'PR',
			      data: [ 6 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
				{
				  label: 'PD',
				  data: [ 10 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
			      label: 'SD',
			      data: [ 12 ],
			      backgroundColor: 'rgba(255, 99, 132, 0.2)'
			    }, {
			      label: 'Hematologic Response',
			      data: [ 14 ],
			      backgroundColor: 'rgba(54, 162, 235, 0.2)'  
			    },
				{
				   label: 'Spleen Response ',
				   data: [ 16 ],
				   backgroundColor: 'rgba(6, 124, 209, 1)'
			    },
			    {
				   label: 'Symptom Response',
				   data: [ 18 ],
				   backgroundColor: 'rgba(255, 99, 132, 0.2)'
				}, {
				   label: 'Others',
				   data: [ 20 ],
				   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END
	
	// MYELOPROLIFERATIVE FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("myeloChartFollowupDiseaseStatus").getContext('2d');
	var myeloChartFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
			          label: 'CR',
			          data: [ 2 ],
			          backgroundColor: 'rgba(139,69,19, 0.8)'
			        }, 
			        {
				      label: 'PR',
				      data: [ 6 ],
				      backgroundColor: 'rgba(255, 143, 131, 1)'
				    },
					{
					  label: 'PD',
					  data: [ 10 ],
					  backgroundColor: 'rgba(6, 124, 209, 1)'
					},
					{
				      label: 'SD',
				      data: [ 12 ],
				      backgroundColor: 'rgba(255, 99, 132, 0.2)'
				    }, {
				      label: 'Hematologic Response',
				      data: [ 14 ],
				      backgroundColor: 'rgba(54, 162, 235, 0.2)'  
				    },
					{
					   label: 'Spleen Response ',
					   data: [ 16 ],
					   backgroundColor: 'rgba(6, 124, 209, 1)'
				    },
				    {
					   label: 'Symptom Response',
					   data: [ 18 ],
					   backgroundColor: 'rgba(255, 99, 132, 0.2)'
					},
					{
					  label: 'Dead',
				      data: [ 18 ],
					  backgroundColor: 'rgba(255, 99, 132, 0.2)'
				    },
					{
					   label: 'Others',
					   data: [ 20 ],
					   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END
	
	//MYELOPROLIFERATIVE SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("myeloSummarizedBaselineStatistics").getContext('2d');
	var myeloSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
	//MYELOPROLIFERATIVE SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("myeloSummarizedFollowupStatistics").getContext('2d');
	var myeloSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  data: [7, 14, 21, 38],
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
	// END OF MYELOPROLIFERATIVE
	
//PLASMA CELL
	
	// PLASMA CELL AGE CHART
	var pieData = {
			  labels: [
				  "Below 1",			  
				  "1-10", 
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
			      data: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10],
			      backgroundColor: [
		                'rgba(182, 186, 215, 1)',
		                'rgba(42, 58, 84, 1)',
		                'rgba(56, 96, 147, 1)',
		                'rgba(88, 138, 189, 1)',
		                'rgba(128, 175, 217, 1)',
		                'rgba(164, 203, 232, 1)',
		                'rgba(206, 224, 158, 1)',
		                'rgba(147, 184, 149, 1)',
		                'rgba(145, 219, 216, 1)',
		                'rgba(0, 180, 189, 1)',
		                'rgba(255, 143, 131, 1)',
		                'rgba(6, 124, 209, 1)'
			      ]
			    }]
	};
	var ctx = document.getElementById("plasmaCellChartAge").getContext("2d");
	var plasmaCellChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	//END OF PLASMA CELL AGE CHART

	// PLASMA CELL GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      data: [50, 50],
		      backgroundColor: [
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 99, 132, 0.2)'
		      ]
		    }]
	};
	var ctx = document.getElementById("plasmaCellChartGender").getContext("2d");
	var plasmaCellChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	//END OF PLASMA CELL GENDER CHART
	
	// PLASMA CELL MODE OF TREATMENT 
	var ctx = document.getElementById("plasmaCellModeOfTreatment").getContext('2d');
	var plasmaCellModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Pharmacologic For Transplant Candidate',
		          data: [ 10 ],
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Pharmacologic For Non-Transplant Candidate',
			      data: [ 15 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
		        {
				  label: 'Maintenance',
				  data: [ 17 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
				  label: 'Radiotherapy',
				  data: [ 19 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
				},
				{
				  label: 'Supportive',
				  data: [ 21 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
			    },
			    {
				  label: 'Watch and Wait',
				  data: [ 23 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
			    },
				{
				  label: 'Others',
				  data: [ 25 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	//END OF PLASMA CELL MODE OF TREATMENT
	
	// PLASMA CELL BASELINE DISEASE STATUS
	var ctx = document.getElementById("plasmaCellBaselineDiseaseStatus").getContext('2d');
	var plasmaCellBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'CR',
		          data: [ 2 ],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, 
		        {
			      label: 'sCR',
			      data: [ 4 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
				{
				  label: 'Immunophenotypic CR',
				  data: [ 6 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
			      label: 'Molecular CR',
			      data: [ 8 ],
			      backgroundColor: 'rgba(255, 99, 132, 0.2)'
			    }, {
			      label: 'VGPR',
			      data: [ 10 ],
			      backgroundColor: 'rgba(54, 162, 235, 0.2)'  
			    },
				{
				   label: 'PR',
				   data: [ 12 ],
				   backgroundColor: 'rgba(6, 124, 209, 1)'
			    },
			    {
				   label: 'MR',
				   data: [ 14 ],
				   backgroundColor: 'rgba(255, 99, 132, 0.2)'
				}, {
				   label: 'SD',
				   data: [ 16 ],
				   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
				},
				{
				   label: 'PD',
				   data: [ 18 ],
				   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
				},
				{
				   label: 'Relapse',
				   data: [ 20 ],
				   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
				},
				{
				   label: 'Clinical Relapse',
				   data: [ 16 ],
				   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
			    },
				{
				   label: 'Relapse from CR',
				   data: [ 18 ],
				   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
				},
				{
				   label: 'Others',
				   data: [ 20 ],
				   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
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
    	      'Clinical Relapse',
    	      'Relapse from CR',
    	      'Others'
      	   ],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END OF PLASMA CELL BASELINE DISEASE STATUS
	
	// PLASMA CELL FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("plasmaCellFollowupDiseaseStatus").getContext('2d');
	var plasmaCellFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
			          label: 'CR',
			          data: [ 2 ],
			          backgroundColor: 'rgba(139,69,19, 0.8)'
			        }, 
			        {
				      label: 'sCR',
				      data: [ 4 ],
				      backgroundColor: 'rgba(255, 143, 131, 1)'
				    },
					{
					  label: 'Immunophenotypic CR',
					  data: [ 6 ],
					  backgroundColor: 'rgba(6, 124, 209, 1)'
					},
					{
				      label: 'Molecular CR',
				      data: [ 8 ],
				      backgroundColor: 'rgba(255, 99, 132, 0.2)'
				    }, {
				      label: 'VGPR',
				      data: [ 10 ],
				      backgroundColor: 'rgba(54, 162, 235, 0.2)'  
				    },
					{
					   label: 'PR',
					   data: [ 12 ],
					   backgroundColor: 'rgba(6, 124, 209, 1)'
				    },
				    {
					   label: 'MR',
					   data: [ 14 ],
					   backgroundColor: 'rgba(255, 99, 132, 0.2)'
					}, {
					   label: 'SD',
					   data: [ 16 ],
					   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
					},
					{
					   label: 'PD',
					   data: [ 18 ],
					   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
					},
					{
					   label: 'Relapse',
					   data: [ 20 ],
					   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
					},
					{
					   label: 'Clinical Relapse',
					   data: [ 16 ],
					   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
					},
					{
					   label: 'Relapse from CR',
					   data: [ 18 ],
					   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
				    },
				    {
					   label: 'Dead',
					   data: [ 20 ],
					   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
					},
				    {
					   label: 'Others',
					   data: [ 20 ],
					   backgroundColor: 'rgba(54, 162, 235, 0.2)'  
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
	    	      'Clinical Relapse',
	    	      'Relapse from CR',
	    	      'Dead',
	    	      'Others'
	      	],
      	    borderWidth: 1
		  },
		  options: {
		        scales: {
		            yAxes: [{
		            	ticks: {
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END OF PLASMA CELL FOLLOWUP DISEASE STATUS
	
	// PLASMA CELL SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("plasmaCellSummarizedBaselineStatistics").getContext('2d');
	var plasmaCellSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
	//PLASMA CELL SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("plasmaCellSummarizedFollowupStatistics").getContext('2d');
	var plasmaCellSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
//AA PNH MDS
	
	// AA PNH MDS AGE CHART
	var pieData = {
			  labels: [
				  "Below 1",			  
				  "1-10", 
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
			      data: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10],
			      backgroundColor: [
		                'rgba(182, 186, 215, 1)',
		                'rgba(42, 58, 84, 1)',
		                'rgba(56, 96, 147, 1)',
		                'rgba(88, 138, 189, 1)',
		                'rgba(128, 175, 217, 1)',
		                'rgba(164, 203, 232, 1)',
		                'rgba(206, 224, 158, 1)',
		                'rgba(147, 184, 149, 1)',
		                'rgba(145, 219, 216, 1)',
		                'rgba(0, 180, 189, 1)',
		                'rgba(255, 143, 131, 1)',
		                'rgba(6, 124, 209, 1)'
			      ]
			    }]
	};
	var ctx = document.getElementById("aapnhmdsChartAge").getContext("2d");
	var aapnhmdsChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	//END OF AA PNH MDS AGE CHART

	// AA PNH MDS GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      data: [50, 50],
		      backgroundColor: [
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 99, 132, 0.2)'
		      ]
		    }]
	};
	var ctx = document.getElementById("aapnhmdsChartGender").getContext("2d");
	var aapnhmdsChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	//END OF AA PNH MDS GENDER CHART
	
	// AA PNH MDS MODE OF TREATMENT 
	var ctx = document.getElementById("aapnhmdsModeOfTreatment").getContext('2d');
	var aapnhmdsModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Hematopoietic Stem Cell Transplantation',
		          data: [ 10 ],
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Pharmacologic Treatment ',
			      data: [ 15 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
		        {
				  label: 'Supportive',
				  data: [ 17 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
				  label: 'Both Pharmacologic and Supportive',
				  data: [ 19 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
				},
				{
				  label: 'Watch and Wait ',
				  data: [ 21 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	//END OF AA PNH MDS MODE OF TREATMENT
	
	// AA PNH MDS BASELINE DISEASE STATUS
	var ctx = document.getElementById("aapnhmdsBaselineDiseaseStatus").getContext('2d');
	var aapnhmdsBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Hematologic Response',
		          data: [ 2 ],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, 
		        {
			      label: 'Stable Disease',
			      data: [ 4 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
				{
				  label: 'Relapsed',
				  data: [ 6 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
			      label: 'Others',
			      data: [ 8 ],
			      backgroundColor: 'rgba(255, 99, 132, 0.2)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END OF AA PNH MDS BASELINE DISEASE STATUS
	
	// AA PNH MDS FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("aapnhmdsFollowupDiseaseStatus").getContext('2d');
	var aapnhmdsFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    		{
			          label: 'Hematologic Response',
			          data: [ 2 ],
			          backgroundColor: 'rgba(139,69,19, 0.8)'
			        }, 
			        {
				      label: 'Stable Disease',
				      data: [ 4 ],
				      backgroundColor: 'rgba(255, 143, 131, 1)'
				    },
					{
					  label: 'Relapsed',
					  data: [ 6 ],
					  backgroundColor: 'rgba(6, 124, 209, 1)'
					},
					{
					  label: 'Dead',
					  data: [ 8 ],
					  backgroundColor: 'rgba(255, 99, 132, 0.2)'
					},
					{
				      label: 'Others',
				      data: [ 8 ],
				      backgroundColor: 'rgba(255, 99, 132, 0.2)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END OF AA PNH MDS FOLLOWUP DISEASE STATUS
	
	// AA PNH MDS SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("aapnhmdsSummarizedBaselineStatistics").getContext('2d');
	var aapnhmdsSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
	//AA PNH MDS SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("aapnhmdsSummarizedFollowupStatistics").getContext('2d');
	var aapnhmdsSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
//PLATELET
	
	// PLATELET AGE CHART
	var pieData = {
			  labels: [
				  "Below 1",			  
				  "1-10", 
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
			      data: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10],
			      backgroundColor: [
		                'rgba(182, 186, 215, 1)',
		                'rgba(42, 58, 84, 1)',
		                'rgba(56, 96, 147, 1)',
		                'rgba(88, 138, 189, 1)',
		                'rgba(128, 175, 217, 1)',
		                'rgba(164, 203, 232, 1)',
		                'rgba(206, 224, 158, 1)',
		                'rgba(147, 184, 149, 1)',
		                'rgba(145, 219, 216, 1)',
		                'rgba(0, 180, 189, 1)',
		                'rgba(255, 143, 131, 1)',
		                'rgba(6, 124, 209, 1)'
			      ]
			    }]
	};
	var ctx = document.getElementById("plateletChartAge").getContext("2d");
	var plateletChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	//END OF PLATELET AGE CHART

	//PLATELET GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      data: [50, 50],
		      backgroundColor: [
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 99, 132, 0.2)'
		      ]
		    }]
	};
	var ctx = document.getElementById("plateletChartGender").getContext("2d");
	var plateletChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	//END OF PLATELET GENDER CHART
	
	// PLATELET MODE OF TREATMENT 
	var ctx = document.getElementById("plateletModeOfTreatment").getContext('2d');
	var plateletModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Pharmacologic 1st Line',
		          data: [ 10 ],
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Pharmacologic 2nd Line',
			      data: [ 15 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
		        {
				  label: 'Supportive',
				  data: [ 17 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
				  label: 'Both Pharmacologic and Supportive',
				  data: [ 19 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
				},
				{
				  label: 'Watch and Wait ',
				  data: [ 21 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
			    },
			    {
				  label: 'Others',
				  data: [ 21 ],
				  backgroundColor: 'rgba(245, 245, 220, 1)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	//END OF PLATELET MODE OF TREATMENT
	
	// PLATELET BASELINE DISEASE STATUS
	var ctx = document.getElementById("plateletBaselineDiseaseStatus").getContext('2d');
	var plateletBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Hematologic Response',
		          data: [ 2 ],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, 
		        {
			      label: 'Stable Disease',
			      data: [ 4 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
				{
				  label: 'Relapsed',
				  data: [ 6 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
			      label: 'Others',
			      data: [ 8 ],
			      backgroundColor: 'rgba(255, 99, 132, 0.2)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END OF PLATELET BASELINE DISEASE STATUS
	
	// PLATELET FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("plateletFollowupDiseaseStatus").getContext('2d');
	var plateletFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    		{
			          label: 'Hematologic Response',
			          data: [ 2 ],
			          backgroundColor: 'rgba(139,69,19, 0.8)'
			        }, 
			        {
				      label: 'Stable Disease',
				      data: [ 4 ],
				      backgroundColor: 'rgba(255, 143, 131, 1)'
				    },
					{
					  label: 'Relapsed',
					  data: [ 6 ],
					  backgroundColor: 'rgba(6, 124, 209, 1)'
					},
					{
					  label: 'Dead',
					  data: [ 8 ],
					  backgroundColor: 'rgba(255, 99, 132, 0.2)'
					},
					{
				      label: 'Others',
				      data: [ 8 ],
				      backgroundColor: 'rgba(255, 99, 132, 0.2)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END OF PLATELET FOLLOWUP DISEASE STATUS
	
	// PLATELET SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("plateletSummarizedBaselineStatistics").getContext('2d');
	var plateletSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
	//PLATELET SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("plateletSummarizedFollowupStatistics").getContext('2d');
	var plateletSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
//COAGULATION
	
	// COAGULATION AGE CHART
	var pieData = {
			  labels: [
				  "Below 1",			  
				  "1-10", 
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
			      data: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10],
			      backgroundColor: [
		                'rgba(182, 186, 215, 1)',
		                'rgba(42, 58, 84, 1)',
		                'rgba(56, 96, 147, 1)',
		                'rgba(88, 138, 189, 1)',
		                'rgba(128, 175, 217, 1)',
		                'rgba(164, 203, 232, 1)',
		                'rgba(206, 224, 158, 1)',
		                'rgba(147, 184, 149, 1)',
		                'rgba(145, 219, 216, 1)',
		                'rgba(0, 180, 189, 1)',
		                'rgba(255, 143, 131, 1)',
		                'rgba(6, 124, 209, 1)'
			      ]
			    }]
	};
	var ctx = document.getElementById("coagulationChartAge").getContext("2d");
	var coagulationChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
	});
	//END OF COAGULATION AGE CHART

	//COAGULATION GENDER CHART
	var pieData = {
		  labels: [
		  "Male", 
		  "Female"],
		  datasets: [
		    {
		      data: [50, 50],
		      backgroundColor: [
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 99, 132, 0.2)'
		      ]
		    }]
	};
	var ctx = document.getElementById("coagulationChartGender").getContext("2d");
	var coagulationChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
	});
	//END OF COAGULATION GENDER CHART
	
	// COAGULATION MODE OF TREATMENT 
	var ctx = document.getElementById("coagulationModeOfTreatment").getContext('2d');
	var coagulationModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Factor Concentrates',
		          data: [ 10 ],
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Blood Component',
			      data: [ 15 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
		        {
				  label: 'Others',
				  data: [ 17 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false
		            }
		            }]
		        }
		    }
		});
	//END OF COAGULATION MODE OF TREATMENT
	
	// COAGULATION BASELINE DISEASE STATUS
	var ctx = document.getElementById("coagulationBaselineDiseaseStatus").getContext('2d');
	var coagulationBaselineDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Hematologic Response',
		          data: [ 2 ],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, 
		        {
			      label: 'Stable Disease',
			      data: [ 4 ],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
				{
				  label: 'Relapsed',
				  data: [ 6 ],
				  backgroundColor: 'rgba(6, 124, 209, 1)'
				},
				{
			      label: 'Others',
			      data: [ 8 ],
			      backgroundColor: 'rgba(255, 99, 132, 0.2)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END OF COAGULATION BASELINE DISEASE STATUS
	
	// COAGULATION FOLLOWUP DISEASE STATUS
	var ctx = document.getElementById("coagulationFollowupDiseaseStatus").getContext('2d');
	var coagulationFollowupDiseaseStatus = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    		{
			          label: 'Hematologic Response',
			          data: [ 2 ],
			          backgroundColor: 'rgba(139,69,19, 0.8)'
			        }, 
			        {
				      label: 'Stable Disease',
				      data: [ 4 ],
				      backgroundColor: 'rgba(255, 143, 131, 1)'
				    },
					{
					  label: 'Relapsed',
					  data: [ 6 ],
					  backgroundColor: 'rgba(6, 124, 209, 1)'
					},
					{
					  label: 'Dead',
					  data: [ 8 ],
					  backgroundColor: 'rgba(255, 99, 132, 0.2)'
					},
					{
				      label: 'Others',
				      data: [ 8 ],
				      backgroundColor: 'rgba(255, 99, 132, 0.2)'
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
		            		min: 0,
			                max: 30,
			                stepSize: 5,
			                beginAtZero:true
		            	}
		            }],
		            xAxes: [{
		            	barThickness : 20,
	                    barPercentage: 1.0,
	                    categoryPercentage: 1.0,
		            	ticks: {
		            	autoSkip: false,
		            }
		            }]
		        },
		    }
		});
	//END OF COAGULATION FOLLOWUP DISEASE STATUS
	
	// COAGULATION SUMMARIZED BASELINE STATISTICS
	var ctx = document.getElementById("coagulationSummarizedBaselineStatistics").getContext('2d');
	var coagulationSummarizedBaselineStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Baseline Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Baseline Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Baseline Gender Dataset',
				  data: [7, 14, 21, 38],
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
	
	//COAGULATION SUMMARIZED FOLLOWUP STATISTICS
	var ctx = document.getElementById("coagulationSummarizedFollowupStatistics").getContext('2d');
	var coagulationSummarizedFollowupStatistics = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Follow-up Mode of Treatment Dataset',
		          data: [2, 4, 6, 8],
		          backgroundColor: 'rgba(139,69,19, 0.8)'
		        }, {
		          label: 'Follow-up Disease Status Dataset',
		          data: [5, 10, 15, 20],
		          type: 'line',
		          backgroundColor: 'rgba(0, 180, 189, 1)' 	  
		        },
		        {
			      label: 'Follow-up Age Dataset',
			      type: 'bubble',
			      data: [10, 40],
			      backgroundColor: 'rgba(255, 143, 131, 1)'
			    },
			    {
				  label: 'Follow-up Gender Dataset',
				  data: [7, 14, 21, 38],
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
//END OF CODE