$( document ).ready(function() {

	//LEUKEMIA

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
	//END 

    //LEUKEMIA MODE OF TREATMENT
	var ctx = document.getElementById("leukemiaChartModeOfTreatment").getContext('2d');
	var leukemiaChartModeOfTreatment = new Chart(ctx, {
		  type: 'bar',
		  data: {
		    datasets: [
		    	{
		          label: 'Baseline Mode of Treatment Dataset',
		          data: [2, 4, 6, 8]
		        }, {
		          label: 'Baseline Data Status Dataset',
		          data: [5, 10, 15, 20],

		          // Changes this dataset to become a line
		          type: 'line'
		        },
		        {
			      label: 'Age Dataset',
			      data: [7, 14, 21, 38]
			    },
			    {
				  label: 'Age Dataset',
				  data: [7, 14, 21, 38]
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
	
	// LEUKEMIA DISEASE STATUS BASELINE
	var ctx = document.getElementById("leukemiaChartDiseaseStatusBaseline").getContext('2d');
	var leukemiaChartDiseaseStatusBaseline = new Chart(ctx, {
	    type: 'bar',
	    data: {
	        labels: [ "Relapsed", 
	        	      "Refractory Disease", 
	        	      "CR", 
	        	      "nCR", 
	        	      "PR", 
	        	      "PD", 
	        	      "SD", 
	        	      "Complete Hematologic Response", 
	        	      "Complete Cytogenetic Response", 
	        	      "Major Molecular Response", 
	        	      "Spleen Response", 
	        	      "Symptom Response",
	        	      "Dead",
	        	      "Others" ],
	        datasets: [{
	            data: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 18, 16, 14, 12],
	            label: 'Disease Status Baseline',
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(206, 224, 158, 1)',
	                'rgba(147, 184, 149, 1)',
	                'rgba(145, 219, 216, 1)',
	                'rgba(0, 180, 189, 1)',
	                'rgba(255, 143, 131, 1)',
	                'rgba(6, 124, 209, 1)',
	                'rgba(245, 245, 220, 1)',
	                'rgba(139,69,19, 0.8)'
	            ],
	            borderColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(206, 224, 158, 1)',
	                'rgba(147, 184, 149, 1)',
	                'rgba(145, 219, 216, 1)',
	                'rgba(0, 180, 189, 1)',
	                'rgba(255, 143, 131, 1)',
	                'rgba(6, 124, 209, 1)',
	                'rgba(245, 245, 220, 1)',
	                'rgba(139,69,19, 0.8)'
	            ],
	            borderWidth: 1
	        }]
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
	            	ticks: {
	            	autoSkip: false
	            }
	            }]
	        }
	    }
	});
	//END
	
	// LEUKEMIA DISEASE STATUS FOLLOWUP
	var ctx = document.getElementById("leukemiaChartDiseaseStatusFollowUp").getContext('2d');
	var leukemiaChartDiseaseStatusFollowUp = new Chart(ctx, {
	    type: 'bar',
	    data: {
	        labels: [ "Relapsed", 
      	      "Refractory Disease", 
    	      "CR", 
    	      "nCR", 
    	      "PR", 
    	      "PD", 
    	      "SD", 
    	      "Complete Hematologic Response", 
    	      "Complete Cytogenetic Response", 
    	      "Major Molecular Response", 
    	      "Spleen Response", 
    	      "Symptom Response",
    	      "Dead"],
	        datasets: [{
	            data: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 18, 16, 14],
	            label: 'Disease Status Follow-up',
	            backgroundColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(206, 224, 158, 1)',
	                'rgba(147, 184, 149, 1)',
	                'rgba(145, 219, 216, 1)',
	                'rgba(0, 180, 189, 1)',
	                'rgba(255, 143, 131, 1)',
	                'rgba(6, 124, 209, 1)',
	                'rgba(245, 245, 220, 1)'
	            ],
	            borderColor: [
	                'rgba(255, 99, 132, 0.2)',
	                'rgba(54, 162, 235, 0.2)',
	                'rgba(255, 206, 86, 0.2)',
	                'rgba(75, 192, 192, 0.2)',
	                'rgba(153, 102, 255, 0.2)',
	                'rgba(255, 159, 64, 0.2)',
	                'rgba(206, 224, 158, 1)',
	                'rgba(147, 184, 149, 1)',
	                'rgba(145, 219, 216, 1)',
	                'rgba(0, 180, 189, 1)',
	                'rgba(255, 143, 131, 1)',
	                'rgba(6, 124, 209, 1)',
	                'rgba(245, 245, 220, 1)'
	            ],
	            borderWidth: 1
	        }]
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
	            	ticks: {
	            	autoSkip: false
	            }
	            }]
	        }
	    }
	});
	//END
	
	// LYMPHOMA
	
	var ctx = document.getElementById("lymphomaChart").getContext('2d');
	var lymphomaChart = new Chart(ctx, {
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
	var ctx = document.getElementById("lymphomaChart3").getContext('2d');
	var lymphomaChart3 = new Chart(ctx, {
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
	
	// MYELOPROLIFERATIVE NEOPLASM 
	var ctx = document.getElementById("myeproliferativeChart").getContext('2d');
	var myeproliferativeChart = new Chart(ctx, {
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
    var ctx = document.getElementById("myeproliferativeChart2").getContext("2d");
    var myeproliferativeChart2 = new Chart(ctx, {
			  type: 'pie',
			  data: pieData
    });
	var ctx = document.getElementById("myeproliferativeChart3").getContext('2d');
	var myeproliferativeChart3 = new Chart(ctx, {
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