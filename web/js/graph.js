$( document ).ready(function() {

	// LEUKEMIA 
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
			      data: [20, 40, 10, 30, 20, 40, 10, 30, 20, 40, 10, 30],
			      backgroundColor: [
			         "#878BB6", 
			         "#4ACAB4", 
			         "#FF8153", 
			         "#FFEA88",
			         "#FFCE00", 
			         "#023564", 
			         "#800000", 
			         "#FFA500",
			         "#ADD8E6", 
			         "#0000A0", 
			         "#A52A2A", 
			         "#808000"
			      ]
			    }]
	};
var ctx = document.getElementById("leukemiaChartAge").getContext("2d");
var leukemiaChartAge = new Chart(ctx, {
			  type: 'doughnut',
			  data: pieData
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
var ctx = document.getElementById("leukemiaChartGender").getContext("2d");
var leukemiaChartGender = new Chart(ctx, {
		  type: 'doughnut',
		  data: pieData
});
	var ctx = document.getElementById("leukemiaChartModeOfTreatment").getContext('2d');
	var leukemiaChartModeOfTreatment = new Chart(ctx, {
	    type: 'bar',
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
	var ctx = document.getElementById("leukemiaChartDiseaseStatusBaseline").getContext('2d');
	var leukemiaChartDiseaseStatusBaseline = new Chart(ctx, {
	    type: 'bar',
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
	var ctx = document.getElementById("leukemiaChartDiseaseStatusFollowUp").getContext('2d');
	var leukemiaChartDiseaseStatusFollowUp = new Chart(ctx, {
	    type: 'bar',
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