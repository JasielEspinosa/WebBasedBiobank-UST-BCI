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
				  data: [ 12 ],
				  backgroundColor: 'rgba(145, 219, 216, 1)'
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
      	      'Dead' ],
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
	
	// LYMPHOMA BASELINE FOLLOWUP DISEASE
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
	
	// MYELOPROLIFERATIVE MODE OF TREATMENT BASELINE
	var ctx = document.getElementById("myeloModeOfTreatment").getContext('2d');
	var myeloModeOfTreatment = new Chart(ctx, {
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
	//END OF MYELOPROLIFERATIVE MODE OF TREATMENT
	
	// MYELOPROLIFERATIVE BASELINE DISEASE STATUS
	var ctx = document.getElementById("myeloChartBaselineDiseaseStatus").getContext('2d');
	var myeloChartBaselineDiseaseStatus = new Chart(ctx, {
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
	
	// MYELOPROLIFERATIVE BASELINE FOLLOWUP DISEASE
	var ctx = document.getElementById("myeloChartFollowupDiseaseStatus").getContext('2d');
	var myeloChartFollowupDiseaseStatus = new Chart(ctx, {
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
	
	// PLASMA CELL 
	var ctx = document.getElementById("plasmaCellChart").getContext('2d');
	var plasmaCellChart = new Chart(ctx, {
	    type: 'bar',
	    data: {
	        labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"],
	        datasets: [{
	            label: 'Baseline',
	            data: [12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3],
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)'
	            ],
	            borderColor: [
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)',
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderWidth: 1
	        }]
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero:true
	                }
	            }]
	        }
	    }
	});
	var pieData = {
			  labels: [
			  "Jan", 
			  "Feb", 
			  "Mar", 
			  "Apr",
			  "May", 
			  "Jun", 
			  "Jul", 
			  "Aug",
			  "Sept", 
			  "Oct", 
			  "Nov", 
			  "Dec"],
			  datasets: [
			    {
			      data: [20, 40, 10, 30, 20, 40, 10, 30, 20, 40, 10, 30],
			      backgroundColor: [
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88",
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88",
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88"
			      ]
			    }]
	};
    var ctx = document.getElementById("plasmaCellChart2").getContext("2d");
    var plasmaCellChart2 = new Chart(ctx, {
			  type: 'pie',
			  data: pieData
    });
	var ctx = document.getElementById("plasmaCellChart3").getContext('2d');
	var plasmaCellChart3 = new Chart(ctx, {
	    type: 'line',
	    data: {
	        labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"],
	        datasets: [{
	            label: 'Follow Up',
	            data: [12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3],
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)'
	            ],
	            borderColor: [
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)',
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderWidth: 1
	        }]
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero:true
	                }
	            }]
	        }
	    }
	});
	
	// AA DNS MDS 
	var ctx = document.getElementById("aadnsmdsChart").getContext('2d');
	var aadnsmdsChart = new Chart(ctx, {
	    type: 'bar',
	    data: {
	        labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"],
	        datasets: [{
	            label: 'Baseline',
	            data: [12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3],
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)'
	            ],
	            borderColor: [
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)',
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderWidth: 1
	        }]
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero:true
	                }
	            }]
	        }
	    }
	});
	var pieData = {
			  labels: [
			  "Jan", 
			  "Feb", 
			  "Mar", 
			  "Apr",
			  "May", 
			  "Jun", 
			  "Jul", 
			  "Aug",
			  "Sept", 
			  "Oct", 
			  "Nov", 
			  "Dec"],
			  datasets: [
			    {
			      data: [20, 40, 10, 30, 20, 40, 10, 30, 20, 40, 10, 30],
			      backgroundColor: [
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88",
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88",
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88"
			      ]
			    }]
	};
    var ctx = document.getElementById("aadnsmdsChart2").getContext("2d");
    var aadnsmdsChart2 = new Chart(ctx, {
			  type: 'pie',
			  data: pieData
    });
	var ctx = document.getElementById("aadnsmdsChart3").getContext('2d');
	var aadnsmdsChart3 = new Chart(ctx, {
	    type: 'line',
	    data: {
	        labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"],
	        datasets: [{
	            label: 'Follow Up',
	            data: [12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3],
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)'
	            ],
	            borderColor: [
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)',
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderWidth: 1
	        }]
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero:true
	                }
	            }]
	        }
	    }
	});
	
	// PLATELET DISORDER 
	var ctx = document.getElementById("plateletChart").getContext('2d');
	var plateletChart = new Chart(ctx, {
	    type: 'bar',
	    data: {
	        labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"],
	        datasets: [{
	            label: 'Baseline',
	            data: [12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3],
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)'
	            ],
	            borderColor: [
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)',
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderWidth: 1
	        }]
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero:true
	                }
	            }]
	        }
	    }
	});
	var pieData = {
			  labels: [
			  "Jan", 
			  "Feb", 
			  "Mar", 
			  "Apr",
			  "May", 
			  "Jun", 
			  "Jul", 
			  "Aug",
			  "Sept", 
			  "Oct", 
			  "Nov", 
			  "Dec"],
			  datasets: [
			    {
			      data: [20, 40, 10, 30, 20, 40, 10, 30, 20, 40, 10, 30],
			      backgroundColor: [
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88",
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88",
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88"
			      ]
			    }]
	};
    var ctx = document.getElementById("plateletChart2").getContext("2d");
    var plateletChart2 = new Chart(ctx, {
			  type: 'pie',
			  data: pieData
    });
	var ctx = document.getElementById("plateletChart3").getContext('2d');
	var plateletChart3 = new Chart(ctx, {
	    type: 'line',
	    data: {
	        labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"],
	        datasets: [{
	            label: 'Follow Up',
	            data: [12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3],
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)'
	            ],
	            borderColor: [
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)',
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderWidth: 1
	        }]
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero:true
	                }
	            }]
	        }
	    }
	});
	
	// COAGULATION DISEASE 
	var ctx = document.getElementById("coagulationChart").getContext('2d');
	var coagulationChart = new Chart(ctx, {
	    type: 'bar',
	    data: {
	        labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"],
	        datasets: [{
	            label: 'Baseline',
	            data: [12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3],
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)'
	            ],
	            borderColor: [
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)',
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderWidth: 1
	        }]
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero:true
	                }
	            }]
	        }
	    }
	});
	var pieData = {
			  labels: [
			  "Jan", 
			  "Feb", 
			  "Mar", 
			  "Apr",
			  "May", 
			  "Jun", 
			  "Jul", 
			  "Aug",
			  "Sept", 
			  "Oct", 
			  "Nov", 
			  "Dec"],
			  datasets: [
			    {
			      data: [20, 40, 10, 30, 20, 40, 10, 30, 20, 40, 10, 30],
			      backgroundColor: [
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88",
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88",
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88"
			      ]
			    }]
	};
    var ctx = document.getElementById("coagulationChart2").getContext("2d");
    var coagulationChart2 = new Chart(ctx, {
			  type: 'pie',
			  data: pieData
    });
	var ctx = document.getElementById("coagulationChart3").getContext('2d');
	var coagulationChart3 = new Chart(ctx, {
	    type: 'line',
	    data: {
	        labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"],
	        datasets: [{
	            label: 'Follow Up',
	            data: [12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3],
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)'
	            ],
	            borderColor: [
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)',
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderWidth: 1
	        }]
	    },
	    options: {
	        scales: {
	            yAxes: [{
	                ticks: {
	                    beginAtZero:true
	                }
	            }]
	        }
	    }
	}); 
	
	
});
//END OF CODE