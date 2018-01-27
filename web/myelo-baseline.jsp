<!DOCTYPE html>
<html>
<head>

<title>USTH-BCI Biobank - Myeloproliferative Neoplasm</title>

<!-- CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet"
	href="vendor/formvalidation/dist/css/formValidation.min.css">

<!-- JS -->
<script src="js/jquery.min.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/bootstrap.js"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>

</head>

<body>

	<!-- Main Container -->
	<div class="container-fluid main-container">

		<!-- Header -->
		<div class="navbar navbar-default navbar-fixed-top">

			<!-- Banner -->
			<div class="row header bg-navyblue">
				<div class="col-sm-1">
					<img src="images/usthlogo.png" width="90%">
				</div>
				<div class="col-sm-10">
					<h4>UST-BCI Section of Clinical Hematology</h4>
					<p>Hematologic Disease Database</p>
				</div>
				<div class="col-sm-1">
					<img src="images/ustlogo.png" width="90%">
				</div>
			</div>
			<!-- End of Banner -->

			<!-- Navbar -->
			<div class="nav-collapse">
				<ul class="nav navbar-nav">

					<li><a href="dashboard-main.jsp">Dashboard</a></li>
					<li><a href="aaphsmds-baseline.jsp">AA, PHS, MDS</a></li>
					<li><a href="coagulationdisease-baseline.jsp">Coagulation
							Disease</a></li>
					<li><a href="leukemia-baseline.jsp">Leukemia</a></li>
					<li><a href="lymphoma-baseline.jsp">Lymphoma</a></li>
					<li class="active"><a href="myelo-baseline.jsp">Myeloproliferative
							Neoplasm</a></li>
					<li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
					<li><a href="plateletdisorder-baseline.jsp">Platelet
							Disorder</a></li>
				</ul>
			</div>
			<!-- End of Navbar -->

		</div>
		<!-- End of Header -->

		<!-- Main Content -->
		<div class="container-fluid bg-grey">
			<!-- sidebar -->
			<div class="row affix sidebar-container">
				<div class="col-sm-12 sidebar">

					<!-- Search Box -->
					<div class="row">
						<div class="col-sm-12 search-box">
							<div>
								<input type="text" placeholder="Search..">
							</div>
						</div>
					</div>
					<!-- End of Search Box -->

					<!-- Sidenav -->
					<div class="row">
						<ul id="sidebar" class="nav nav-stacked col-sm-12">
							<!--                   <li><a href="#">CD001</a></li>
                  <li><a href="#">CD002</a></li>
                  <li><a href="#">CD003</a></li>
                  <li><a href="#">CD004</a></li>
                  <li><a href="#">CD005</a></li>
                  <li><a href="#">CD006</a></li>
                  <li><a href="#">CD003</a></li>
                  <li><a href="#">CD004</a></li>
                  <li><a href="#">CD005</a></li>
                  <li><a href="#">CD006</a></li>
                  <li><a href="#">CD003</a></li>
                  <li><a href="#">CD004</a></li>
                  <li><a href="#">CD005</a></li>
                  <li><a href="#">CD006</a></li> -->
						</ul>
					</div>
					<!-- End of Sidenav -->

					<!-- Add box -->
					<div class="row">
						<div class="col-sm-12 add-box">
							<button type="button" class="btn bg-yellow">Add Patient</button>
						</div>
					</div>
					<!-- End of Add box -->

				</div>
			</div>
			<!-- End of Sidebar -->

			<form action="AddMyeloBaselineServlet" method="post">

				<!-- Forms Container -->
				<div class="row">
					<div class="col-sm-10 offset-sm-2 pull-right forms">

						<!-- buttons container -->
						<div class="row button-container">
							<div class="col-sm-4">
								<a type="button" href="plasmacell-baseline.jsp"
									class="btn bg-yellow">Baseline</a> <a type="button"
									href="plasmacell-followup.jsp" class="btn bg-yellow">Follow
									Up</a>
							</div>
						</div>
						<!-- End of Buttons Container -->

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
													<input type="text" class="form-control"
														name="middleInitial">
												</div>
											</div>

											<!-- Gender -->
											<div class="form-group">
												<label class="control-label col-sm-5">Gender</label>
												<div class="col-sm-7">
													<div class="radio">
														<label><input type="radio" name="gender">Male</label>
													</div>
													<div class="radio">
														<label><input type="radio" name="gender">Female</label>
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
												<label class="control-label col-sm-5">Tissue
													Specimen Collected</label>
												<div class="col-sm-7">
													<div class="radio">
														<label><input type="radio"
															name="tissueSpecimenCollected">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="tissueSpecimenCollected">No</label>
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
							<!-- End of General -->

							<!-- CLT -->
							<div class="col-sm-8">

								<!-- CLT Navtabs -->
								<ul class="nav nav-tabs">
									<li class="active"><a data-toggle="tab" href="#clinical">Clinical</a></li>
									<li><a data-toggle="tab" href="#laboratory">Laboratory</a></li>
									<li><a data-toggle="tab" href="#therapy">Therapy and
											Response</a></li>
								</ul>
								<!-- End of CLT Navtabs -->

								<!-- CLT Tab Content -->
								<div class="tab-content">

									<!-- Clinical -->
									<div id="clinical" class="tab-pane fade in active">

										<!-- Form -->
										<div class="form-horizontal">

											<!-- Date of Initial Diagnosis -->
											<div class="form-group">
												<label class="control-label col-sm-3">Date of
													Initial Diagnosis</label>
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
														<option value="">D75.81 Primary Myelofibrosis</option>
														<option value="">D45.0 Polycythemia Vera</option>
														<option value="">D47.3 Essential Thrombocythemia</option>
														<option value="">D75.81 Secondary Myelofibrosis (Post-Polycythemia Vera)</option>
														<option value="">D75.81 Secondary Myelofibrosis (Post-Essential Thrombocythemia)</option>
														<option value="">Others</option>
													</select>
												</div>
											</div>

											<!-- Prognostic Risk Scoring Used -->
											<div class="form-group">
												<label class="control-label col-sm-3">Prognostic
													Risk Scoring Used</label>
												<div class="col-sm-9">
													<select class="form-control" name="prognosticRiskScoring">
														<option selected="selected" disabled="disabled">Select</option>
														<option value="">IPSS risk</option>
														<option value="">DIPSS risk</option>
														<option value="">Others</option>
													</select>
												</div>
											</div>

											<!-- Risk Score -->
											<div class="form-group">
												<label class="control-label col-lg-3">Risk Score</label>
												<div class="col-lg-9">
													<select class="form-control" name="riskScore">
														<option selected="selected" disabled="disabled">Select</option>
														<option value="">Low Risk</option>
														<option value="">Intermediate -1 risk</option>
														<option value="">Intermediate -2 risk</option>
														<option value="">High Risk</option>
														<option value="">Others</option>
													</select>
												</div>
											</div>

											<!-- Chief Complaint -->
											<div class="form-group">
												<label class="control-label col-sm-3">Chief
													Complaint</label>
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
													<input type="text" class="form-control"
														name="otherSymptoms">
												</div>
											</div>

											<!-- Family History of Cancer -->
											<div class="form-group">
												<label class="control-label col-sm-3">Family History
													of Cancer</label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio" name="familyHistory">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio" name="familyHistory">No</label>
													</div>
												</div>
											</div>

											<!-- Relationship to Patient -->
											<div class="form-group">
												<label class="control-label col-sm-3">Relationship
													to Patient</label>
												<div class="col-sm-9">
													<input type="text" class="form-control"
														name="relationshipToPatient">
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

											<!-- Thrombosis History  -->
											<div class="form-group">
												<label class="control-label col-sm-3">Thrombosis
													History</label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio"
															name="thrombosisHistory">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="thrombosisHistory">No</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-sm-3">Specify</label>
												<div class="col-sm-9">
													<input type="text" class="form-control" name="">
												</div>
											</div>

											<!-- Concomitant Medications -->
											<div class="form-group">
												<label class="control-label col-sm-3">Concomitant
													Medications</label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio"
															name="concomitantMedications">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="concomitantMedications">No</label>
													</div>
												</div>
											</div>

											<!-- Concomitant Medications -->
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
														<label><input type="radio" name="smokingHistory">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio" name="smokingHistory">No</label>
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
														<label><input type="radio" name="smokingHistory">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio" name="smokingHistory">No</label>
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
															name="chemicalExposureHistory">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="chemicalExposureHistory">No</label>
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

											<br />
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
												<label class="control-label col-lg-3">Presence of
													Splenomegaly</label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio"
															name="presenceOfSplenomegaly">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="presenceOfSplenomegaly">No</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-lg-3">Presence of
													Hepatomegaly</label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio"
															name="presenceOfHepatomegaly">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="presenceOfHepatomegaly">No</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-lg-3">Presence of
													Lymphadenopathies</label>
												<div class="col-sm-9">
													<div class="radio">
														<label><input type="radio"
															name="presenceOfLymphadenopathies">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="presenceOfLymphadenopathies">No</label>
													</div>
												</div>
											</div>
											<br />
											<div class="form-group">
												<label class="control-label col-lg-3">Other findings</label>
												<div class="col-sm-9">
													<input type="text" class="form-control"
														name="otherFindings" />
												</div>
											</div>

										</div>
										<!-- End of form -->

									</div>
									<!-- End of Clinical -->

									<!-- Laboratory -->
									<div id="laboratory" class="tab-pane fade">

										<!-- Form -->
										<div class="form-horizontal">

											<!-- Date of Blood Collection -->
											<div class="form-group">
												<label class="control-label col-sm-4">Date of blood
													collection</label>
												<div class="col-lg-8">
													<input type="date" class="form-control" name="" />
												</div>
											</div>

											<br />
											<!-- Hematology -->
											<h3 class="text-center">Hematology</h3>

											<!-- Labels -->
											<div class="form-group">
												<label class="control-label col-sm-4">Laboratory
													Parameter</label> <label class="col-sm-4" style="text-align: left;">Result</label>
												<div class="col-sm-4">
													<input type="checkbox"> <label>Not done</label>
												</div>
											</div>
											<!-- End of labels -->

											<!-- Fields -->
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
												<label class="control-label col-sm-4">Neutrophils
													(%)</label>
												<div class="col-lg-4">
													<input type="text" class="form-control" name="" />
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-sm-4">Lymphocytes
													(%)</label>
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
												<label class="control-label col-sm-4">Eosinophils
													(%)</label>
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
											<!-- End of fields -->

											<br />
											<!-- Other Lab -->
											<h3 class="text-center">Other Laboratories</h3>

											<div class="form-group">
												<label class="control-label col-sm-4">Laboratory
													Parameter</label> <label class="col-lg-4" style="text-align: left;">Result</label>
												<div class="col-lg-4">
													<input type="checkbox"> <label>Not done</label>
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
												<label class="control-label col-sm-4">Uric acid
													mg/dl</label>
												<div class="col-lg-4">
													<input type="text" class="form-control" name="" />
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-sm-4">SGOT (U/L)</label>
												<div class="col-lg-4">
													<input type="text" class="form-control" name="" />
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-sm-4">SGPT (U/L)</label>
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
											<div class="form-group">
												<label class="control-label col-sm-4">EPO level
													mlU/ml</label>
												<div class="col-lg-4">
													<input type="text" class="form-control" name="" />
												</div>
											</div>

											<!-- Bone Marrow  -->
											<div class="form-group">
												<label class="control-label col-sm-4">Bone Marrow
													Aspirate and Biopsy result</label>
												<div class="col-sm-8">
													<div class="radio">
														<label><input type="radio"
															name="boneMarrowAspirate">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="boneMarrowAspirate">No</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-sm-4">Date Performed</label>
												<div class="col-lg-8">
													<input type="date" class="form-control"
														name="datePerformed" />
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

											<!-- Molecular Analysis (Jak 2 assay) -->
											<div class="form-group">
												<label class="control-label col-sm-4">Molecular
													Analysis (Jak 2 assay)</label>
												<div class="col-sm-8">
													<div class="radio">
														<label><input type="radio"
															name="molecularAnalysis">Yes</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="molecularAnalysis">No</label>
													</div>
													<div class="radio">
														<label><input type="radio"
															name="molecularAnalysis">Not Applicable</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-lg-4">Result</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" name="result" />
												</div>
											</div>

										</div>
										<!-- end of form -->

									</div>
									<!-- End of Clinical -->

									<!-- Therapy -->
									<div id="therapy" class="tab-pane fade">

										<!-- Form -->
										<div class="form-horizontal">

											<!-- Treatment -->
											<div class="form-group">
												<label for="severity" class="control-label col-sm-4">Mode
													of Treatment</label>
												<div class="col-sm-8">
													<select class="form-control" name="treament">
														<option value="Hematopoietic Stem Cell Transplantation">Hematopoietic Stem Cell
                                             Transplantation</option>
														<option value="Pharmacologic Treatment">Pharmacologic Treatment</option>
														<option value="Supportive">Supportive</option>
														<option value="Both Pharmacologic and Supportive">Both Pharmacologic and Supportive</option>
														<option value="Watch and Wait">Watch and Wait</option>
													</select>
												</div>
											</div>

											<!-- Medications -->
											<div class="form-group">
												<label class="control-label col-lg-4">Medications</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" name="medications" />
												</div>
											</div>

											<!-- Date Started -->
											<div class="form-group">
												<label class="control-label col-sm-4">Date Started</label>
												<div class="col-lg-8">
													<input type="date" class="form-control" name="dateStarted" />
												</div>
											</div>

										</div>
										<!-- End of Form -->
									</div>
									<!-- End of Therapy -->

								</div>
								<!-- End of CLT Tab Content -->

								<input type="submit" class="btn bg-yellow col-sm-4 pull-right">
							</div>
							<!-- End of CLT -->
						</div>
					</div>
				</div>
			</form>

			<!-- End of Forms -->
		</div>
		<!-- End of Main Content -->

	</div>
	<!-- End of main container -->
</body>
</html>