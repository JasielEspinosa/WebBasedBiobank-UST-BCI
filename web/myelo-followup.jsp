<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
<!DOCTYPE html>
<html>
   <head>
   
      <title>USTH - Myelo Followup</title>
      <meta charset="utf-8">
      <link rel="icon" href="images/usthlogo.png">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      
      <!-- CSS -->
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <link href="css/style.css" rel="stylesheet">
      <link rel="stylesheet" href="css/navbar.css">
      <link rel="stylesheet" href="css/sidebar.css">
      <link href="css/responsive.css" rel="stylesheet">
      <link rel="stylesheet" href="fonts/open-sans.css">
      <link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">
      
      <!-- JS -->
      <script src="js/jquery-ui.js"></script>
      <script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>
      <script src="js/jquery.min-2.js"></script>
      <script src="js/bootstrap.min.js"></script><script src="js/sidebar.js"></script>
      <script defer src="js/fontawesome-all.js"></script>
       <!-- <script src="js/jquery.min.js"></script>  -->
       <!-- <script src="js/bootstrap.js"></script>  -->
       
   </head>

<body>

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
                     <li class="active"><a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a></li>
                     <li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
                     <li><a href="aaphsmds-baseline.jsp">AA DNS MDS</a></li>
                     <li><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>
                     <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>

                     <!-- Dropdown -->
                    <li class="dropdown pull-right"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                        aria-expanded="false"> <i class="fa fa-cog fa-lg" aria-hidden="true"></i><span class="caret"></span>
                     </a>
                        <ul class="dropdown-menu dropdown-menu__text" role="menu">
                           <li><a style="font-weight: bold;" href="audittrail.jsp"><i class="fas fa-file-alt dropdown-icons--margin"></i> Audit Trail</a></li>
                           <li class="divider" style="background-color: #000000;"></li>
                           <li><a style="font-weight: bold;" href="profile.jsp"><i class="fas fa-user-md dropdown-icons--margin"></i> Profile</a></li>
                           <li class="divider" style="background-color: #000000;"></li>
                           <li><a  style="font-weight: bold;" href="usermanagement.jsp"><i class="fas fa-wrench dropdown-icons--margin"></i> Settings</a></li>
                           <li class="divider" style="background-color: #000000;"></li>
                           <li><a  style="font-weight: bold;" href="login.jsp"><i class="fas fa-sign-out-alt dropdown-icons--margin"></i> Logout</a></li> 
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
                        <input type="text" placeholder="Search Patient" class="sidebar__searchbox--border" style="font-weight:bold; text-align:center;">
                     </div>
                  </div>
               </div>
               <!-- End of Search Box -->
               <ul class="nav nav-pills nav-stacked sidebar__searchbox--border">

               </ul>
               <!-- Add Patient Button -->
               <div class="row">
                  <div class="col-sm-12 add-box">
                     <button id="addPatientLeukemia" type="button" class="btn bg-yellow sidebar__addptngenrep--border" data-toggle="modal"
                        data-target="#usermanagement__popup" data-whatever="@mdo">Add Patient</button>
                  </div>
               </div>
               <!-- End of Add Patient Button -->
               <!-- Generate Report Button -->
               <div class="row">
                  <div class="col-sm-12 add-box">
                     <button id="generateReport" type="button" class="btn bg-yellow sidebar__addptngenrep--border" data-toggle="modal"
                        data-target="#usermanagement__popup" data-whatever="@mdo">Generate Report</button>
                  </div>
               </div>
               <!-- End of Generate Report Button -->
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
                  <div class="col-md-12">
                     <div class="col-md-12 forms">

                        <!-- Buttons Container -->
                        <div class="row button-container buttons__firsthalf--position ">
                           <div class="col-sm-6 buttons__firsthalf-position ">
                              <a href="myelo-baseline.jsp" type="button" class="btn bg-yellow button-border" id="baselineBtn">Baseline</a> <a
                                 href="myelo-followup.jsp" type="button" class="btn bg-yellow button-border" id="followUpBtn">Follow Up</a>
                           </div>
                           <div class="col-sm-6 text-right btn-toolbar">
                              <a href="#" type="button" class="btn bg-yellow button-border" id="edtPatientBtn">Patient Statistics</a>
                              <a href="#" type="button" class="btn bg-yellow button-border" id="edtPatientBtn">Edit Patient</a> <a
                                 href="#" type="button" class="btn bg-yellow button-border" id="archPatientBtn">Archive Patient</a>
                           </div>
                        </div>
                        <!-- End of Buttons Container -->

					<!-- Forms -->
					<div class="row">

						<!-- Visit -->
						<div class="col-md-3">

							<!-- Visit Tab -->
							<ul class="nav nav-tabs">
								<li class="active"><a data-toggle="tab" href="#Visit">Visits</a></li>
							</ul>
							<!-- End of Visit Tab -->

							<!-- Visit Tab Content -->
							<div class="tab-content tab-content__border">
								<div class="visit">
									<ul>
										<a href="#"><li>02-24-2017</li></a>
										<a href="#"><li>02-24-2017</li></a>
										<a href="#"><li>02-24-2017</li></a>
										<a href="#"><li>02-24-2017</li></a>
										<a href="#"><li>02-24-2017</li></a>
									</ul>
								</div>
							</div>
							<!-- End of Visit Tab Content -->
						</div>
						<!-- End of Visit -->

						<!-- Follow Up -->
						<div class="col-md-9">

							<!-- Follow Up Navtabs-->
							<ul class="nav nav-tabs">
								<li class="active"><a data-toggle="tab"
									href="#medicalEvents">Medical Events</a></li>
								<li><a data-toggle="tab" href="#clinical">Clinical</a></li>
								<li><a data-toggle="tab" href="#laboratory">Laboratory</a></li>
								<li><a data-toggle="tab" href="#diseaseStatus">Disease
										Status</a></li>
							</ul>
							<!-- End of Follow Up Navtabs -->

							<!-- Follow Up Tab Content -->
							<div class="tab-content tab-content__border">

								<!-- Medical Events -->
								<div id="medicalEvents" class="tab-pane fade in active">

									<!-- Form -->
									<div class="form-horizontal">

										<!-- Date of Entry -->
										<div class="form-group">
											<label class="control-label col-sm-6">Date of Entry</label>
											<div class="col-sm-6">
												<input type="date" class="form-control" name="dateOfEntry">
											</div>
										</div>

										<!-- Date of Visit -->
										<div class="form-group">
											<label class="control-label col-sm-6">Date of Visit</label>
											<div class="col-sm-6">
												<input type="date" class="form-control" name="dateOfVisit">
											</div>
										</div>

										<!-- Questions -->
										<br />
										<div class="form-group">
											<label class="control-label col-sm-6">Did the patient
												stop or start a new medication for the hematologic
												malignancy?</label>
											<div class="col-sm-6">
												<div class="radio">
													<label><input type="radio" name="">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="">No</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-6">Result</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" name="specify">
											</div>
										</div>

										<br />
										<div class="form-group">
											<label class="control-label col-sm-6">Did the patient
												stop or start a new medication for other diseases?</label>
											<div class="col-sm-6">
												<div class="radio">
													<label><input type="radio" name="">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="">No</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-6">Result</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" name="specify">
											</div>
										</div>

										<br />
										<div class="form-group">
											<label class="control-label col-sm-6">Did the patient
												undergo any procedure or intervention?</label>
											<div class="col-sm-6">
												<div class="radio">
													<label><input type="radio" name="">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="">No</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-6">Result</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" name="specify">
											</div>
										</div>

										<br />
										<div class="form-group">
											<label class="control-label col-sm-6">Were there
												complications from chemotherapy?</label>
											<div class="col-sm-6">
												<div class="radio">
													<label><input type="radio" name="">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="">No</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-6">Result</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" name="specify">
											</div>
										</div>


									</div>

								</div>
								<!-- End of Medical Events -->

								<!-- Clinical -->
								<div id="clinical" class="tab-pane fade in">

									<!-- Form -->
									<div class="form-horizontal">

										<!-- Current Symptoms -->
										<div class="form-group">
											<label class="control-label col-sm-4">Current
												Symptoms</label>
											<div class="col-sm-8">
												<input type="text" class="form-control"
													name="currentSymptoms">
											</div>
										</div>

										<br />
										<!-- Physical Exam -->
										<h3 class="text-center">
                                          <label class="control-label">Current Physical Exam</label>
                                       </h3>
										<div class="form-group">
											<label class="control-label col-sm-4">Weight</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="weight" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">ECOG</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" name="ecog" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Pertinent
												findings</label>
											<div class="col-sm-6">
												<div class="radio">
													<label><input type="radio" name="">Yes</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="">No</label>
												</div>
											</div>
										</div>

									</div>

								</div>
								<!-- End of Clinical -->

								<!-- Laboratory -->
								<div id="laboratory" class="tab-pane fade in">

									<!-- Form -->
									<div class="form-horizontal">

										<!-- Date of Blood Collection -->
										<div class="form-group">
											<label class="control-label col-sm-4">Date of blood
												collection</label>
											<div class="col-lg-8">
												<input type="date" class="form-control"
													name="dateOfCloodCollection" />
											</div>
										</div>

										<br />
										<!-- Hematology -->
										<h3 class="text-center">
                                          <label class="control-label">Hematology</label>
                                       </h3>

										<!-- Labels -->
										<div class="form-group">
											<label class="control-label col-sm-4">Laboratory
												Parameter</label> <label class="col-sm-4" style="text-align: left;">Result</label>
											<div class="col-sm-4">
												<input type="checkbox"> <label>Not done</label>
											</div>
										</div>
										<!-- End of Labels -->

										<!-- Fields -->
										<div class="form-group">
											<label class="control-label col-sm-4">Hemoglobin
												(g/L)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="hemoglobin" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Hematocrit (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="hematocrit" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">White blood
												cells (x10 ^9/L)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control"
													name="whiteBloodCells" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Neutrophils (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="neutrophils" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Lymphocytes (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="lymphocytes" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Monocytes (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="monocytes" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Eosinophils (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="eosiphils" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Basophils (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="basophils" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Myelocytes (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="myelocytes" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Metamyelocytes
												(%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control"
													name="metamyelocytes" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Blasts (%)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="blasts" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-sm-4">Platelet count
												(x 10^9/L)</label>
											<div class="col-lg-4">
												<input type="text" class="form-control" name="plateletCount" />
											</div>
										</div>
										<!-- End of Fields -->

										<br />
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
													name="boneMarrowAspirateDatePerformed" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Description</label>
											<div class="col-sm-8">
												<input type="text" class="form-control"
													name="boneMarrowAspirateDescription" />
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-4">Attach scanned
												document</label>
											<div class="col-sm-8">
												<input type="file" class="form-control"
													name="boneMarrowAspirateAttachScannedDocument" />
											</div>
										</div>

									</div>
									<!-- End of Form -->

								</div>
								<!-- End of Laboratory -->

								<!-- Disease Status -->
								<div id="diseaseStatus" class="tab-pane fade in">

									<!-- Form -->
									<div class="form-horizontal">

										<div class="form-group">
											<label class="control-label col-lg-5">Disease Status</label>
											<div class="col-lg-5">
												<select class="form-control" name="diseaseStatus">
													<option selected="selected" disabled="disabled">Select</option>
													<option value="">CR (Complete Remission)</option>
													<option value="">PR (Partial Response)</option>
													<option value="">PD (Progressive Disease)</option>
													<option value="">SD Stable Disease)</option>
													<option value="">Hematologic response</option>
													<option value="">Spleen response</option>
													<option value="">Symptom response</option>
													<option value="">Dead</option>
												</select>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-lg-5">Others</label>
											<div class="col-lg-5">
												<input type="text" class="form-control" name="others" />
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-lg-5">Special Notes</label>
											<div class="col-lg-5">
												<input type="text" class="form-control" name="notes" />
											</div>
										</div>

									</div>
									<!-- End of form -->

								</div>
								<!-- End of Disease Status -->

							</div>
							<!-- End of Follow Up Tab Content -->

							<input type="submit" class="btn bg-yellow col-sm-4 pull-right button-border">
						</div>
						<!-- End of Follow Up -->
					</div>
				</div>
			</div>
			<!-- End of Forms -->

		<!-- End of Main Content -->

</body>
</html>