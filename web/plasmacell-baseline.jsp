<!DOCTYPE html>
<html>
<head>
<title>Plasma Baseline</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="images/usthlogo.png">

<!-- CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet" href="css/navbar.css">
<link rel="stylesheet" href="css/sidebar.css">
<link href="css/responsive.css" rel="stylesheet">
<link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- JS -->
<!-- <script src="js/jquery.min.js"></script>  -->
<script src="js/jquery-ui.js"></script>
<!-- <script src="js/bootstrap.js"></script>  -->
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min-2.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>


<!-- Sidebar Javascript -->
<script src="js/sidebar.js"></script>

<!-- FONT -->
<link rel="stylesheet" href="fonts/open-sans.css">

<!-- FONT AWESOME ICON -->
<script defer src="js/fontawesome-all.js"></script>
</head>
<body>

	<!-- Main Container -->
   <div class="container-fluid main-container">
   
		 <!-- Header -->
     	   <div class="navbar-fixed-top">

         <!-- Banner -->
         <div class="row header bg-navyblue">
            <div class="col-sm-1">
               <img src="images/usthlogo.png" class="header__logo--size header__logo--position">
            </div>
            <div class="col-sm-11 header__bannertitle--visibility header__bannertitle--position header__bannertitle--spacing">
               <h4>UST-BCI Section of Clinical Hematology</h4>
               <p>Hematologic Disease Database</p>
            </div>
         </div>
         <!-- End of Banner -->

         <!-- Navbar -->
         <nav class="navbar" role="navigation">
            <div class="container-fluid navbar__nav-item--hover">
               <!-- Brand and toggle get grouped for better mobile display -->
               <div class="navbar-header">
                  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                     <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span
                        class="icon-bar"></span>
                  </button>
               </div>

               <!-- Collect the nav links, forms, and other content for toggling -->
               <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                  <ul class="nav navbar-nav">
                     <li><a href="dashboard-main.jsp">Dashboard</a></li>
                     <li><a href="leukemia-baseline.jsp">Leukemia</a></li>
                     <li><a href="lymphoma-baseline.jsp">Lymphoma</a></li>
                     <li><a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a></li>
                     <li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
                     <li><a href="aaphsmds-baseline.jsp">AA DNS MDS</a></li>
                     <li><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>
                     <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>

                     <!-- Dropdown -->
                     <li class="dropdown pull-right"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                        aria-expanded="false"> <i class="fa fa-cog fa-lg" aria-hidden="true"></i><span class="caret"></span>
                     </a>
                        <ul class="dropdown-menu dropdown-menu__text" role="menu">
                           <li><a href="audittrail.jsp">Audit Trail</a></li>
                           <li class="divider"></li>
                           <li><a href="profile.jsp">Profile</a></li>
                           <li class="divider"></li>
                           <li><a href="settings.jsp">Settings</a></li>
                           <li class="divider"></li>
                           <li><a href="login.jsp">Logout</a></li>
                        </ul></li>
                     <!-- End of Dropdown -->

                  </ul>
               </div>
               <!-- /.navbar-collapse -->
            </div>
            <!-- /.container-fluid -->
         </nav>

      </div>
      <!-- End of header -->

		<!-- Main Content -->
      
			<!-- Sidebar -->
  <div class="row-offcanvas row-offcanvas-left">
   <div id="sidebar" class="sidebar-offcanvas">
    <div class="col-md-12">
     <!-- Search Box -->
     <div class="row">
      <div class="col-sm-12 search-box">
       <div>
        <input type="text" placeholder="Search">
       </div>
      </div>
     </div>
     <!-- End of Search Box -->
     <ul class="nav nav-pills nav-stacked">

     </ul>
     <!-- Add box -->
     <div class="row">
      <div class="col-sm-12 add-box">
       <button id="addEncoder" type="button" class="btn bg-yellow" data-toggle="modal" data-target="#usermanagement__popup" data-whatever="@mdo">Add Encoder</button>
      </div>
     </div>
     <!-- End of Add box -->
    </div>
   </div>

   <div id="main">
    <div class="col-md-12">
     <p class="visible-xs">
      <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">
       <i class="glyphicon glyphicon-chevron-left"></i>
      </button>
     </p>
     <!-- End of Sidebar -->
     
			<!-- Forms Container -->
			<div class="row">
				<div class="col-sm-10 offset-sm-2 forms">

					<!-- Buttons container -->
					<div class="row button-container">
						<div class="col-sm-4">
							<a href="plasmacell-baseline.jsp" type="button"
								class="btn bg-yellow">Baseline</a> <a
								href="plasmacell-followup.jsp" type="button"
								class="btn bg-yellow">Follow Up</a>
						</div>
					</div>
					<!-- End of buttons container -->

					<!-- Forms -->
					<div class="row">

						<!-- General -->
						<div class="col-sm-4">

							<!-- General Tab -->
							<ul class="nav nav-tabs">
								<li class="active"><a data-toggle="tab" href="#general">General</a></li>
							</ul>
							<!-- End of General Tab -->

							<!-- General Tab Content -->
							<div class="tab-content">
								<div id="general" class="tab-pane fade in active">

									<!-- Form -->
									<div class="form-horizontal">

										<!-- Patient ID Number -->
										<div class="form-group">
											<label class="control-label col-sm-5">Patient ID
												Number</label>
											<div class="col-sm-7">
												<input type="text" class="form-control"
													name="patientIDNumber">
											</div>
										</div>

										<!-- Last Name -->
										<div class="form-group">
											<label class="control-label col-sm-5">Last Name</label>
											<div class="col-sm-7">
												<input type="text" class="form-control" name="lastName">
											</div>
										</div>

										<!-- First Name -->
										<div class="form-group">
											<label class="control-label col-sm-5">First Name</label>
											<div class="col-sm-7">
												<input type="text" class="form-control" name="firstName">
											</div>
										</div>

										<!-- Middle Initial -->
										<div class="form-group">
											<label class="control-label col-sm-5">Middle Initial</label>
											<div class="col-sm-7">
												<input type="text" class="form-control" name="middleInitial">
											</div>
										</div>

										<!-- Gender -->
										<div class="form-group">
											<label class="control-label col-sm-5">Gender</label>
											<div class="col-sm-7">
												<div class="radio">
													<label><input type="radio" name="gender" value="1">Male</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="gender" value="2"Female</label>
												</div>
											</div>
										</div>

										<!-- DOB -->
										<div class="form-group">
											<label class="control-label col-sm-5">Date of Birth</label>
											<div class="col-sm-7">
												<input type="date" class="form-control" name="dateOfBirth">
											</div>
										</div>

										<!-- Address -->
										<div class="form-group">
											<label class="control-label col-sm-5">Address</label>
											<div class="col-sm-7">
												<input type="text" class="form-control" name="address">
											</div>
										</div>

										<!-- Civil Status -->
										<div class="form-group">
											<label class="control-label col-sm-5">Civil Status</label>
											<div class="col-sm-7">
												<input type="text" class="form-control" name="civilStatus">
											</div>
										</div>

										<!-- DOE -->
										<div class="form-group">
											<label class="control-label col-sm-5">Date of Entry</label>
											<div class="col-sm-7">
												<input type="date" class="form-control" name="dateOfEntry">
											</div>
										</div>

										<!-- Tissue Specimen Collected -->
										<div class="form-group">
											<label class="control-label col-sm-5">Tissue Specimen
												Collected</label>
											<div class="col-sm-7">
												<div class="radio">
													<label><input type="radio"
														name="tissueSpecimenCollected" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="tissueSpecimenCollected" value="0">No</label>
												</div>
											</div>
										</div>

										<!-- Specimen Type -->
										<div class="form-group">
											<label class="control-label col-sm-5">Specimen Type</label>
											<div class="col-sm-7">
												<select class="form-control">
													<option value="">BMA</option>
													<option value="">BB</option>
													<option value="">LN</option>
												</select>
											</div>
										</div>

									</div>
									<!-- End of form -->

								</div>
							</div>
							<!-- End of General Tab Content -->
						</div>
						<div class="col-sm-8">
							<!-- form tab -->
							<ul class="nav nav-tabs">
								<li class="active"><a data-toggle="tab" href="#clinical">Clinical</a></li>
								<li><a data-toggle="tab" href="#laboratory">Laboratory</a></li>
								<li><a data-toggle="tab" href="#therapy">Therapy and
										Response</a></li>
							</ul>
							<!-- forms -->
							<div class="tab-content">
								<!-- clinical -->
								<div id="clinical" class="tab-pane fade in active">
									<!-- Form -->
									<div class="form-horizontal">
										<!-- Date of Initial Diagnosis -->
										<div class="form-group">
											<label class="control-label col-sm-3">Date of Initial
												Diagnosis</label>
											<div class="col-sm-9">
												<input type="date" class="form-control"
													name="dateOfInitialDiagnosis">
											</div>
										</div>
										<!-- Diagnosis -->
										<div class="form-group">
											<label for="diagnosis" class="control-label col-sm-3">Diagnosis</label>
											<div class="col-sm-9">
												<select class="form-control" name="diagnosis">
													<option selected="selected" disabled="disabled">Select</option>
													<option value="">C90 Multiple myeloma and malignant plasma cell
                                          neoplasms</option>
													<option value="">C90.0 Multiple myeloma</option>
													<option value="">C90.00 …… not having achieved remission</option>
													<option value="">C90.01 …… in remission</option>
													<option value="">C90.02 …… in relapse</option>
													<option value="">C90.2 Extramedullary plasmacytoma</option>
													<option value="">C90.20 …… not having achieved remission</option>
													<option value="">C90.21 …… in remission</option>
													<option value="">C90.22 …… in relapse</option>
													<option value="">C90.3 Solitary plasmacytoma</option>
													<option value="">C90.30 …… not having achieved remission</option>
													<option value="">C90.31 …… in remission</option>
													<option value="">C90.32 …… in relapse</option>
												</select>
											</div>
										</div>
										<!-- ISS Staging -->
										<div class="form-group">
											<label class="control-label col-sm-3">ISS Staging</label>
											<div class="col-sm-9">
												<select class="form-control" name="issStaging">
													<option selected="selected" disabled="disabled">Select</option>
													<option value="">Stage I</option>
													<option value="">Stage II</option>
													<option value="">Stage III</option>
												</select>
											</div>
										</div>
										<!-- Chief Complaint -->
										<div class="form-group">
											<label class="control-label col-sm-3">Chief Complaint</label>
											<div class="col-sm-9">
												<input type="text" class="form-control"
													name="chiefComplaint">
											</div>
										</div>
										<!-- Constitutional Symptoms -->
										<div class="form-group">
											<label class="control-label col-sm-3">Constitutional
												Symptoms</label>
											<div class="col-sm-9">
												<select class="form-control" name="constitutionalSymptoms">
													<option selected="selected" disabled="disabled">Select</option>
													<option value="">Fever</option>
													<option value="">Weigh Loss</option>
													<option value="">Night Sweats</option>
												</select>
											</div>
										</div>
										<!-- Other Symptoms -->
										<div class="form-group">
											<label class="control-label col-sm-3">Other Symptoms</label>
											<div class="col-sm-9">
												<input type="text" class="form-control" name="otherSymptoms">
											</div>
											<!-- Family History of Cancer -->
											<div class="form-group">
												<label class="control-label col-sm-3">Family History
													of Cancer</label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio" name="familyHistory" value="1">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio" name="familyHistory" value="0">No</label>
													</div>
												</div>
											</div>
											<!-- INSERT HERE THE DYNAMIC PART -->
											<!-- Relationship to Patient -->
											<div class="form-group">
												<label class="control-label col-sm-3">Relationship
													to Patient</label>
												<div class="col-sm-9">
													<input type="text" class="form-control"
														name="relationshipToPatient">
												</div>
											</div>
                                 
                                            <!-- Specify Cancer-->
                                            <div class="form-group">
                                             <label class="control-label col-sm-3">Specify Cancer</label>
                                             <div class="col-sm-9">
                                              <input type="text" class="form-control" name="specifyCancer">
                                             </div>
                                            </div>
                                 
											<!-- Other Diseases in the Family -->
											<div class="form-group">
												<label class="control-label col-sm-3">Other Diseases
													in the Family</label>
												<div class="col-sm-9">
													<input type="text" class="form-control"
														name="otherDiseasesInTheFamily">
												</div>
											</div>
											<!-- Comorbidities -->
											<div class="form-group">
												<label class="control-label col-sm-3">Comorbidities</label>
												<div class="col-sm-9">
													<input type="text" class="form-control"
														name="comorbidities">
												</div>
											</div>
											<!-- Concomitant Medications -->
											<div class="form-group">
												<label class="control-label col-sm-3">Concomitant
													Medications</label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio"
															name="concomitantMedications" value="1">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="concomitantMedications" value="0">No</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<div class="row">
													<div class="col-sm-3"></div>
													<label class="control-label col-sm-3"
														style="text-align: left;">Generic Name</label> <label
														class="control-label col-sm-3" style="text-align: left;">Dose</label>
													<label class="control-label col-sm-3"
														style="text-align: left;">Frequency</label>
												</div>
												<div class="row">
													<div class="col-sm-3"></div>
													<div class="col-sm-3">
														<input type="text" class="form-control" name="genericName">
													</div>
													<div class="col-sm-3">
														<input type="text" class="form-control" name="dose">
													</div>
													<div class="col-sm-3">
														<input type="text" class="form-control" name="frequency">
													</div>
												</div>
											</div>
											<!-- Smoking History -->
											<div class="form-group">
												<label class="control-label col-sm-3">Smoking
													History</label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio" name="smokingHistory" value="1">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio" name="smokingHistory" value="0">No</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-sm-3">Specify:</label>
												<div class="col-sm-9">
													<input type="text" class="form-control"
														name="smokingHistorySpecify">
												</div>
											</div>
											<!-- Alcohol Intake History -->
											<div class="form-group">
												<label class="control-label col-lg-3">Alcohol intake
													history </label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio" name="smokingHistory" value="1">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio" name="smokingHistory" value="0">No</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-lg-3">Specify</label>
												<div class="col-sm-9">
													<input type="text" class="form-control"
														name="alcoholIntakeSpecify" />
												</div>
											</div>
											<!-- Chemical Exposure -->
											<div class="form-group">
												<label class="control-label col-lg-3">Chemical
													exposure</label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio"
															name="chemicalExposureHistory" value="1">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="chemicalExposureHistory"value="0">No</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-lg-3">Specify</label>
												<div class="col-sm-9">
													<input type="text" class="form-control"
														name="chemicalExposureSpecify" />
												</div>
											</div>
											<!-- Physical Exam -->
											<h3>Physical Exam</h3>
											<div class="form-group">
												<label class="control-label col-lg-3">Height</label>
												<div class="col-sm-9">
													<input type="text" class="form-control" name="height" />
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-lg-3">Weight</label>
												<div class="col-sm-9">
													<input type="text" class="form-control" name="weight" />
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-lg-3">ECOG</label>
												<div class="col-sm-9">
													<input type="text" class="form-control" name="ecog" />
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-lg-3">Other
													pertinent findings</label>
												<div class="col-sm-9">
													<input type="text" class="form-control"
														name="otherFindings" />
												</div>
											</div>
											<!-- End of form -->
										</div>
									</div>
								</div>

								<!-- laboratory -->
								<div id="laboratory" class="tab-pane fade">

									<div class="form-horizontal">
										<!-- form -->
										<div class="form-group">
											<label class="control-label col-sm-4">Date of blood
												collection</label>
											<div class="col-lg-8">
												<input type="date" class="form-control" name="" />
											</div>
										</div>

										<!-- Hematology -->
										<h3 class="text-center">Hematology</h3>
										<div class="form-group">
											<label class="control-label col-sm-4">Laboratory
												Parameter</label> <label class="col-sm-4" style="text-align: left;">Result</label>
											<div class="col-sm-4">
												<input type="checkbox"> <label>Not done</label>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Hemoglobin
												(g/L)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Hematocrit (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">White blood
												cells (x10 ^9/L)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Neutrophils (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Lymphocytes (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Monocytes (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Eosinophils (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Basophils (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Myelocytes (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Metamyelocytes
												(%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Blasts (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Platelet count
												(x 10^9/L)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>

										<!-- Other Lab -->
										<div class="form-group" style="margin-bottom: 0px">
											<h3>
												<label class="control-label col-sm-4">Other
													Laboratories</label>
											</h3>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Laboratory
												Parameter</label> <label class="col-lg-4" style="text-align: left;">Result</label>
											<div class="col-lg-4">
												<input type="checkbox"> <label>Not done</label>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">BUN (mg/dl)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Creatinine
												(mg/dl)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Uric acid mg/dl</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">iCa (mg/dl)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Na (meg/L)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">K (meg/dl)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Total protein</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Albumin</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Globulin</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">B2
												Microglobulin (mg/dl)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">LDH (U/L)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="" />
											</div>
										</div>

										<!-- Imaging Studies -->
										<div class="form-group">
											<label class="control-label col-sm-4">Imaging Studies</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio" name="imagingStudies" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="imagingStudies" value="0">No</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="imagingStudies" value="2">Not
														Applicable</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Result</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="result" />
											</div>
										</div>

										<!-- Bone Marrow  -->
										<div class="form-group">
											<label class="control-label col-sm-4">Bone Marrow
												Aspirate and Biopsy result</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio"
														name="boneMarrowAspirate" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="boneMarrowAspirate" value="0">No</label>
												</div> 
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Date Performed</label>
											<div class="col-lg-8">
												<input type="date" class="form-control" name="datePerformed" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Description</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="description" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Attach scanned
												document</label>
											<div class="col-sm-8">
												<input type="file" class="form-control"
													name="attachScannedDocument" />
											</div>
										</div>

										<!-- Serum free light chain assay -->
										<div class="form-group">
											<label class="control-label col-sm-4">Serum free
												light chain assay</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio"
														name="serumFreeLightChainAsssay" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="serumFreeLightChainAsssay" value="0">No</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="serumFreeLightChainAsssay" value="2">Not Applicable</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Result</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="result" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Attach scanned
												document</label>
											<div class="col-sm-8">
												<input type="file" class="form-control"
													name="attachScannedDocument" />
											</div>
										</div>

										<!-- Serum protein electrophoresis -->
										<div class="form-group">
											<label class="control-label col-sm-4">Serum protein
												electrophoresis</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio"
														name="serumProteinElectrophoresis" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="serumProteinElectrophoresis"value="0">No</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="serumProteinElectrophoresis" value="2">Not Applicable</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Result</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="result" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Attach scanned
												document</label>
											<div class="col-sm-8">
												<input type="file" class="form-control"
													name="attachScannedDocument" />
											</div>
										</div>

										<!-- Serum Immunofixation -->
										<div class="form-group">
											<label class="control-label col-sm-4">Serum
												Immunofixation</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio"
														name="serumImmunofixation" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="serumImmunofixation" value="0">No</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="serumImmunofixation" value="2">Not Applicable</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Result</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="result" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Attach scanned
												document</label>
											<div class="col-sm-8">
												<input type="file" class="form-control"
													name="attachScannedDocument" />
											</div>
										</div>

										<!-- Urine protein electrophoresis/Immunofixation -->
										<div class="form-group">
											<label class="control-label col-sm-4">Urine protein
												electrophoresis/Immunofixation</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio"
														name="urineProteinElectrophoresisImmunofixation" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="urineProteinElectrophoresisImmunofixation" value="0">No</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="urineProteinElectrophoresisImmunofixation" value="2">Not
														Applicable</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Result</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="result" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Attach scanned
												document</label>
											<div class="col-sm-8">
												<input type="file" class="form-control"
													name="attachScannedDocument" />
											</div>
										</div>

										<!-- Cytogenetic and Molecular Analysis -->
										<div class="form-group">
											<label class="control-label col-sm-4">Cytogenetic and
												Molecular Analysis</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio"
														name="cytogeneticAndMolecularAnalysis" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="cytogeneticAndMolecularAnalysis" value="0">Not Done</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Result</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="result" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Attach scanned
												document</label>
											<div class="col-sm-8">
												<input type="file" class="form-control"
													name="attachScannedDocument" />
											</div>
										</div>

										<!-- end of form -->
									</div>
								</div>

								<!-- therapy -->
								<div id="therapy" class="tab-pane fade">
									<div class="form-horizontal">
										<!-- Transplant Candidate -->
										<div class="form-group">
											<label class="control-label col-sm-4">Transplant
												Candidate</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio"
														name="transplantCandidate" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio"
														name="transplantCandidate" value="0">No</label>
												</div>
											</div>
										</div>
										<!-- Treatment -->
										<div class="form-group">
											<label for="severity" class="control-label col-sm-4">Mode
												of Treatment</label>
											<div class="col-sm-8">
												<select class="form-control" name="treament">
													<option selected="selected" disabled="disabled">Select</option>
													<option value="Pharmacologic for transplant candidate">Pharmacologic for
                                          transplant candidate</option>
													<option value="Pharmacologic for non transplant candidate">Pharmacologic
                                          for non transplant candidate</option>
													<option value="Maintenance">Maintenance</option>
													<option value="Radiotherapy">Radiotherapy</option>
													<option value="Supportive">Supportive</option>
													<option value="Watch and Wait">Watch and Wait</option>
													<option value="Others">Others</option>
												</select>
											</div>
										</div>
										<!-- Other Regimens -->
										<div class="form-group">
											<label class="control-label col-lg-4">Other Regimens</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="otherRegimens" />
											</div>
										</div>
										<!-- Regimen/ Protocol (For transplant candidates) -->
										<div class="form-group">
											<label for="severity" class="control-label col-sm-4">Regimen/Protocol
												(For transplant candidates)</label>
											<div class="col-sm-8">
												<select class="form-control" name="regimenProtocol">
													<option selected="selected" disabled="disabled">Select</option>
													<option value="Bortezomib dexamethasone">Bortezomib dexamethasone</option>
													<option value="Bortezomib/Cyclophosphomide/dexamethasone">Bortezomib/Cyclophosphomide/dexamethasone</option>
													<option value="Bortezomib/Doxorubicin/dexamethasone">Bortezomib/Doxorubicin/dexamethasone</option>
													<option value="Bortezomib/Lenalidomide/dexamethasone">Bortezomib/Lenalidomide/dexamethasone</option>
													<option value="Bortezomib /Thallidomide/ Dexamethasone">Bortezomib
                                          /Thallidomide/ Dexamethasone</option>
													<option value="Lenalidomide/Dexamethasone">Lenalidomide/Dexamethasone</option>
													<option value="Carfilzomib/Lenalidomide/Dexamethasone">Carfilzomib/Lenalidomide/Dexamethasone</option>
													<option value="Dexamethasone">Dexamethasone</option>
													<option
														value="Liposomal Doxorubicin/Vincristine/Dexamethason">Liposomal
                                          Doxorubicin/Vincristine/Dexamethason</option>
													<option value="Thallidomide/Dexamethasone">Thallidomide/Dexamethasone</option>
													<option value="Other">Other</option>
												</select>
											</div>
										</div>
										<!-- Other Regimens -->
										<div class="form-group">
											<label class="control-label col-lg-4">Other Regimens</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="otherRegimens" />
											</div>
										</div>

										<!-- Regimen/ Protocol (For nontransplant candidates) -->
										<div class="form-group">
											<label for="severity" class="control-label col-sm-4">Regimen/Protocol
												(For nontransplant candidates)</label>
											<div class="col-sm-8">
												<select class="form-control" name="regimenProtocol">
													<option selected="selected" disabled="disabled">Select</option>
													<option value="Bortezomib dexamethasone">Bortezomib dexamethasone</option>
													<option value="Bortezomib/Cyclophosphomide/dexamethasone">Bortezomib/Cyclophosphomide/dexamethasone</option>
													<option value="Bortezomib/Lenalidomide/dexamethasone">Bortezomib/Lenalidomide/dexamethasone</option>
													<option value="Lenalidomide/low dose Dexamethasone">Lenalidomide/low
                                          dose Dexamethasone</option>
													<option value="Melphalan/Prednisone/Bortezomib">Melphalan/Prednisone/Bortezomib</option>
													<option value="Melphalan/Prednisone/Lenalidomide">Melphalan/Prednisone/Lenalidomide</option>
													<option value="Melpahlan/Prednisone/Thallidomide">Melpahlan/Prednisone/Thallidomide</option>
													<option value="Dexamethasone">Dexamethasone</option>
													<option
														value="Liposomal Doxorubicin/Vincristine/Dexamethason">Liposomal
                                          Doxorubicin/Vincristine/Dexamethason</option>
													<option value="Melphalan/Prednisone">Melphalan/Prednisone</option>
													<option value="Thallidomide/Dexamethasone">Thallidomide/Dexamethasone</option>
													<option value="Vincristine /Doxorubicin/dexamethasone">Vincristine
                                          /Doxorubicin/dexamethasone</option>
													<option value="Other">Other</option>
												</select>
											</div>
										</div>
										<!-- Other Regimens -->
										<div class="form-group">
											<label class="control-label col-lg-4">Other Regimens</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="otherRegimens" />
											</div>
										</div>

										<!-- Maintenance Therapy -->
										<div class="form-group">
											<label class="control-label col-lg-4">Maintenance
												Therapy</label>
											<div class="col-sm-8">
												<select class="form-control" name="regimenProtocol">
													<option selected="selected" disabled="disabled">Select</option>
													<option value="Bortezomib">Bortezomib</option>
													<option value="Lenalidomide">Lenalidomide</option>
													<option value="Thallidomide">Thallidomide</option>
													<option value="Bortezomib/Prednisone">Bortezomib/Prednisone</option>
													<option value="Bortezomib/Thallidomide">Bortezomib/Thallidomide</option>
													<option value="Interferon">Interferon</option>
													<option value="Thallidomide/Prednisone">Thallidomide/Prednisone</option>
													<option value="Other">Other</option>
												</select>
											</div>
										</div>
										<!-- Other Regimens -->
										<div class="form-group">
											<label class="control-label col-lg-4">Other Regimens</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="otherRegimens" />
											</div>
										</div>

										<!-- Cycle Number -->
										<div class="form-group">
											<label class="control-label col-lg-4">Cycle Number</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="cycleNumber" />
											</div>
										</div>

										<h3 class="text-center">Other Treatment
											Modalities/Adjunctive treatment</h3>
										<!-- Bisphosphonates -->
										<div class="form-group">
											<label class="control-label col-sm-4">Bisphosphonates</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio" name="bisphosphonates" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="bisphosphonates" value="0">No</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Specify Drug</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="speficyDrug" />
											</div>
										</div>
										<!-- Radiotherapy -->
										<div class="form-group">
											<label class="control-label col-sm-4">Radiotherapy</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio" name="bisphosphonates" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="bisphosphonates" value="0">No</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Specify Dose
												and Frequency</label>
											<div class="col-sm-8">
												<input type="text" class="form-control"
													name="speficyDoseAndFrequency" />
											</div>
										</div>
										<!-- Dialysis -->
										<div class="form-group">
											<label class="control-label col-sm-4">Dialysis</label>
											<div class="col-sm-8">
												<div class="radio">
													<label><input type="radio" name="dialysis" value="1">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="dialysis" value="0">No</label>
												</div>
											</div>
										</div>
										<!-- Other Medications -->
										<div class="form-group">
											<label class="control-label col-sm-4">Other
												Medications</label>
											<div class="col-lg-8">
												<input type="date" class="form-control"
													name="otherMedications" />
											</div>
										</div>

										<!-- Date Started -->
										<div class="form-group">
											<label class="control-label col-sm-4">Date Started</label>
											<div class="col-lg-8">
												<input type="date" class="form-control" name="dateStarted" />
											</div>
										</div>

										<!-- Complications -->
										<div class="form-group">
											<label class="control-label col-sm-4">Complications</label>
											<div class="col-lg-8">
												<input type="date" class="form-control" name="complications" />
											</div>
										</div>
									</div>
								</div>
							</div>
							<input type="submit" class="btn bg-yellow col-sm-4 pull-right">
						</div>
					</div>
				</div>
			</div>
		</div>
      </div></div>
      
      </div>
      <!-- End of Main Container -->
</body>
</html>