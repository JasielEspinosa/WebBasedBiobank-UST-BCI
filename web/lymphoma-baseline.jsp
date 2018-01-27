<!DOCTYPE html>
<html>
<head>
<<<<<<< HEAD
<title>Lymphoma - Baseline</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="images/usthlogo.png">

<!-- CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet" href="css/navbar.css">
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
                     <li><a href="leukemia-baseline.html">Leukemia</a></li>
                     <li><a href="lymphoma-baseline.html">Lymphoma</a></li>
                     <li><a href="myelo-baseline.html">Myeloproliferative Neoplasm</a></li>
                     <li><a href="plasmacell-baseline.html">Plasma Cell Disorder</a></li>
                     <li><a href="aaphsmds-baseline.html">AA DNS MDS</a></li>
                     <li><a href="plateletdisorder-baseline.html">Platelet Disorder</a></li>
                     <li><a href="coagulationdisease-baseline.html">Coagulation Disease</a></li>

                     <!-- Dropdown -->
                     <li class="dropdown pull-right"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                        aria-expanded="false"> <i class="fa fa-cog fa-lg" aria-hidden="true"></i><span class="caret"></span></a>
                        <ul class="dropdown-menu dropdown-menu__text" role="menu">
                           <li><a href="audittrail.jsp">Audit Trail</a></li>
                           <li class="divider"></li>
                           <li><a href="profile.jsp">Profile</a></li>
                           <li class="divider"></li>
                           <li><a href="settings.jsp">Settings</a></li>
                           <li class="divider"></li>
                           <li><a href="#">Logout</a></li>
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
      <div class="container-fluid bg-grey">
         <!-- Sidebar -->
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
                     <li><a href="#">CD001</a></li>
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
                     <li><a href="#">CD006</a></li>
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

         <form action="AddLymphomaBaselineServlet" method="post">
            <!-- Form Container -->
            <div class="row">
               <div class="col-sm-10 offset-sm-2 pull-right forms">

                  <!-- Buttons Container -->
                  <div class="row button-container">
                     <div class="col-sm-4">
                        <a href="lymphoma-baseline.jsp" type="button" class="btn bg-yellow">Baseline</a> <a href="lymphoma-followup.jsp"
                           type="button" class="btn bg-yellow">Follow Up</a>
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
                                    <label class="control-label col-sm-5">Patient ID Number</label>
                                    <div class="col-sm-7">
                                       <input type="text" class="form-control" name="patientIDNumber">
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
                                          <label><input type="radio" name="genderMale">Male</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="genderFemale">Female</label>
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
                                    <label class="control-label col-sm-5">Tissue Specimen Collected</label>
                                    <div class="col-sm-7">
                                       <div class="radio">
                                          <label><input type="radio" name="tissueSpecimenCollectedYes">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="tissueSpecimenCollectedNo">No</label>
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
                           <li><a data-toggle="tab" href="#therapy">Therapy and Response</a></li>
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
                                    <label class="control-label col-sm-3">Date of Initial Diagnosis</label>
                                    <div class="col-sm-9">
                                       <input type="date" class="form-control" name="dateOfInitialDiagnosis">
                                    </div>
                                 </div>

                                 <!-- Diagnosis -->
                                 <div class="form-group">
                                    <label for="diagnosis" class="control-label col-sm-3">Diagnosis</label>
                                    <div class="col-sm-9">
                                       <select class="form-control" name="diagnosis">
                                          <option selected="selected" disabled="disabled">Select</option>
                                          <option value="">B21.1 HIV disease resulting in Burkitt lymphoma</option>
                                          <option value="">B21.2 HIV disease resulting in other types of non-Hodgkin lymphoma</option>
                                          <option value="">B21.3 HIV disease resulting in other malignant neoplasms of lymphoid,
                                             haematopoietic and related tissue</option>
                                          <option value="">C81.0 Nodular lymphocyte predominant Hodgkin lymphoma</option>
                                          <option value="">C81.1 Nodular sclerosis (classical) Hodgkin lymphoma</option>
                                          <option value="">C81.2 Mixed cellularity (classical) Hodgkin lymphoma</option>
                                          <option value="">C81.3 Lymphocyte depleted (classical) Hodgkin lymphoma</option>
                                          <option value="">C81.4 Lymphocyte-rich (classical) Hodgkin lymphoma</option>
                                          <option value="">C81.7 Other (classical) Hodgkin lymphoma</option>
                                          <option value="">C81.9 Hodgkin lymphoma, unspecified</option>
                                          <option value="">C82.0 Follicular lymphoma grade I</option>
                                          <option value="">C82.1 Follicular lymphoma grade II</option>
                                          <option value="">C82.2 Follicular lymphoma grade III, unspecified</option>
                                          <option value="">C82.3 Follicular lymphoma grade IIIa</option>
                                          <option value="">C82.4 Follicular lymphoma grade IIIb</option>
                                          <option value="">C82.5 Diffuse follicle centre lymphoma</option>
                                          <option value="">C82.6 Cutaneous follicle centre lymphoma</option>
                                          <option value="">C82.7 Other types of follicular lymphoma</option>
                                          <option value="">C82.9 Follicular lymphoma, unspecified</option>
                                          <!-- Nodular lymphoma NOS -->
                                          <option value="">C83.0 Small cell B-cell lymphoma</option>
                                          <!--  Lymphoplasmacytic lymphoma
                              Nodal marginal zone lymphoma
                              Non-leukaemic variant of B-CLL
                              Splenic marginal zone lymphoma -->
                                          <option value="">C83.1 Mantle cell lymphoma</option>
                                          <!--  Centrocytic lymphoma
                              Malignant lymphomatous polyposis -->
                                          <option value="">C83.3Diffuse large B-cell lymphoma</option>
                                          <option value="">C83.5 Lymphoblastic (diffuse) lymphoma</option>
                                          <!--  B-cell precursor lymphoma
                              Lymphoblastic B-cell lymphoma
                              Lymphoblastic lymphoma NOS
                              Lymphoblastic T-cell lymphoma
                              T-cell precursor lymphoma -->
                                          <option value="">C83.7 Burkitt lymphoma</option>
                                          <!--  Atypical Burkitt lymphoma
                              “Burkitt-like” lymphoma -->
                                          <option value="">C83.8 Other non-follicular lymphoma</option>
                                          <!--  Primary effusion B-cell lymphoma
                              Intravascular large B-cell lymphoma
                              Lymphoid granulomatosis -->
                                          <option value="">C83.9 Non-follicular (diffuse) lymphoma, unspecified</option>
                                          <option value="">C84.0 Mycosis fungoides</option>
                                          <option value="">C84.1 Sézary disease</option>
                                          <option value="">C84.4 Peripheral T-cell lymphoma, not elsewhere classified</option>
                                          <!--  Lennert’s lymphoma
                              Lymphoepithelioid lymphoma -->
                                          <option value="">C84.5 Other mature T/NK-cell lymphomas</option>
                                          <option value="">C84.6 Anaplastic large cell lymphoma, ALK-positive</option>
                                          <!--  Anaplastic large cell lymphoma, CD30-positive -->
                                          <option value="">C84.7 Anaplastic large cell lymphoma, ALK-negative</option>
                                          <!--  Excl.:  primary cutaneous CD30-positive T-cell proliferations (C86.6) -->
                                          <option value="">C84.8 Cutaneous T-cell lymphoma, unspecified</option>
                                          <option value="">C84.9 Mature T/NK-cell lymphoma, unspecified</option>
                                          <!--  NK/T cell lymphoma NOS
                              Excl.:  mature T-cell lymphoma, not elsewhere classified (C84.4) -->
                                          <option value="">C85.1 B-cell lymphoma, unspecified</option>
                                          <!--  Note: If B-cell lineage or involvement is mentioned in conjunction with a specific lymphoma, code to the more specific description. -->
                                          <option value="">C85.2 Mediastinal (thymic) large B-cell lymphoma</option>
                                          <option value="">C85.7 Other specified types of non-Hodgkin lymphoma</option>
                                          <option value="">C85.9 Non-Hodgkin lymphoma, unspecified</option>
                                          <!--  Lymphoma NOS
                              Malignant lymphoma NOS
                              Non-Hodgkin lymphoma NOS -->
                                          <option value="">C86.0 Extranodal NK/T-cell lymphoma, nasal type</option>
                                          <option value="">C86.1 Hepatosplenic T-cell lymphoma</option>
                                          <!--  Alpha-beta and gamma-delta types -->
                                          <option value="">C86.2 Enteropathy-type (intestinal) T-cell lymphoma</option>
                                          <!--  Enteropathy associated T-cell lymphoma -->
                                          <option value="">C86.3 Subcutaneous panniculitis-like T-cell lymphoma</option>
                                          <option value="">C86.4 Blastic NK-cell lymphoma</option>
                                          <option value="">C86.5 Angioimmunoblastic T-cell lymphoma</option>
                                          <!--  Angioimmunoblastic lymphadenopathy with dysproteinaemia [AILD] -->
                                          <option value="">C86.6 Primary cutaneous CD30-positive T-cell proliferations</option>
                                          <!--  Lymphomatoid papulosis
                              Primary cutaneous anaplastic large-cell lymphoma
                              Primary cutaneous CD30-positive large T-cell lymphoma -->
                                          <option value="">C88.0 Waldenström macroglobulinaemia</option>
                                          <!--  Lymphoplasmacytic lymphoma with IgM-production
                              Macroglobulinaemia (primary)(idiopathic)
                              Excl.: small cell B-cell lymphoma (C83.0) -->
                                          <option value="">C88.2 Other heavy chain disease</option>
                                          <!--  Franklin disease
                              Gamma heavy chain disease
                              Mu (µ) heavy chain disease -->
                                          <option value="">C88.3 Immunoproliferative small intestinal disease</option>
                                          <!--  Alpha heavy chain disease
                              Mediterranean lymphoma -->
                                          <option value="">C88.4 Extranodal marginal zone B-cell lymphoma of mucosa-associated
                                             lymphoid tissue [MALT-lyphoma]</option>
                                          <!--  Note: Use additional code (C83.3) if desired, to specify transition to high malignant (diffuse large cell) lymphoma
                              Lymphoma of skin-associated lymphoid tissue (SALT-lymphoma)
                              Lymphoma of bronchial-associated lymphoid tissue (BALT-lymphoma) -->
                                          <option value="">C88.7 Other malignant immunoproliferative diseases</option>
                                          <option value="">C88.9 Malignant immunoproliferative disease, unspecified</option>
                                          <!--  Immunoproliferative disease NOS -->
                                       </select>
                                    </div>
                                 </div>

                                 <!-- Stage of Disease -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-3">Stage of Disease</label>
                                    <div class="col-sm-9">
                                       <input type="text" class="form-control" name="stageOfDisease">
                                    </div>
                                 </div>

                                 <!-- Chief Complaint -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-3">Chief Complaint</label>
                                    <div class="col-sm-9">
                                       <input type="text" class="form-control" name="chiefComplaint">
                                    </div>
                                 </div>

                                 <!-- Constitutional Symptoms -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-3">Constitutional Symptoms</label>
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
                                 </div>

                                 <!-- Family History of Cancer -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-3">Family History of Cancer</label>
                                    <div class="col-sm-9">
                                       <div class="radio">
                                          <label><input type="radio" name="familyHistoryYes">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="familyHistory">No</laNobel>
                                       </div>
                                    </div>
                                 </div>

                                 <!-- Relationship to Patient -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-3">Relationship to Patient</label>
                                    <div class="col-sm-9">
                                       <input type="text" class="form-control" name="relationshipToPatient">
                                    </div>
                                 </div>

                                 <!-- Other Diseases in the Family -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-3">Other Diseases in the Family</label>
                                    <div class="col-sm-9">
                                       <input type="text" class="form-control" name="otherDiseasesInTheFamily">
                                    </div>
                                 </div>

                                 <!-- Comorbidities -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-3">Comorbidities</label>
                                    <div class="col-sm-9">
                                       <input type="text" class="form-control" name="comorbidities">
                                    </div>
                                 </div>

                                 <!-- Concomitant Medications -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-3">Concomitant Medications</label>
                                    <div class="col-sm-9">
                                       <div class="radio">
                                          <label><input type="radio" name="concomitantMedications">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="concomitantMedications">No</label>
                                       </div>
                                    </div>
                                 </div>

                                 <div class="form-group">
                                    <div class="row">
                                       <div class="col-sm-3"></div>
                                       <label class="control-label col-sm-3" style="text-align: left;">Generic Name</label> <label
                                          class="control-label col-sm-3" style="text-align: left;">Dose</label> <label
                                          class="control-label col-sm-3" style="text-align: left;">Frequency</label>
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
                                    <label class="control-label col-sm-3">Smoking History</label>
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
                                       <input type="text" class="form-control" name="smokingHistorySpecify">
                                    </div>
                                 </div>

                                 <!-- Alcohol Intake History -->
                                 <div class="form-group">
                                    <label class="control-label col-lg-3">Alcohol intake history </label>
                                    <div class="col-sm-9">
                                       <div class="radio">
                                          <label><input type="radio" name="alcoholIntakeHistory">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="alcoholIntakeHistory">No</label>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-lg-3">Specify</label>
                                    <div class="col-sm-9">
                                       <input type="text" class="form-control" name="alcoholIntakeSpecify" />
                                    </div>
                                 </div>

                                 <!-- Chemical Exposure -->
                                 <div class="form-group">
                                    <label class="control-label col-lg-3">Chemical exposure</label>
                                    <div class="col-sm-9">
                                       <div class="radio">
                                          <label><input type="radio" name="chemicalExposureHistory">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="chemicalExposureHistory">No</label>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-lg-3">Specify</label>
                                    <div class="col-sm-9">
                                       <input type="text" class="form-control" name="chemicalExposureSpecify" />
                                    </div>
                                 </div>

                                 <br />
                                 <!-- Physical Exam -->
                                 <h3 class="text-center">Physical Exam</h3>

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
                                    <label class="control-label col-lg-3">Presence of Splenomegaly</label>
                                    <div class="col-sm-9">
                                       <div class="radio">
                                          <label><input type="radio" name="presenceOfSplenomegaly">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="presenceOfSplenomegaly">No</label>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-lg-3">Presence of Hepatomegaly</label>
                                    <div class="col-sm-9">
                                       <div class="radio">
                                          <label><input type="radio" name="presenceOfHepatomegaly">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="presenceOfHepatomegaly">No</label>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-lg-3">Presence of Lymphadenopathies</label>
                                    <div class="col-sm-9">
                                       <div class="radio">
                                          <label><input type="radio" name="presenceOfLymphadenopathies">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="presenceOfLymphadenopathies">No</label>
                                       </div>
                                    </div>
                                 </div>

                                 <!-- Other findings -->
                                 <br />
                                 <div class="form-group">
                                    <label class="control-label col-lg-3">Other findings</label>
                                    <div class="col-sm-9">
                                       <input type="text" class="form-control" name="otherFindings" />
                                    </div>
                                 </div>

                              </div>
                              <!-- End of form -->
                           </div>
                           <!-- End of Clinical -->

                           <!-- Laboratory -->
                           <div id="laboratory" class="tab-pane fade">

                              <!-- form -->
                              <div class="form-horizontal">

                                 <!-- Date of Blood Collection -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Date of blood collection</label>
                                    <div class="col-lg-8">
                                       <input type="date" class="form-control" name="dateOfBloodCollection" />
                                    </div>
                                 </div>

                                 <br />
                                 <!-- Hematology -->
                                 <h3 class="text-center">Hematology</h3>

                                 <!-- Labels -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Laboratory Parameter</label> <label class="col-sm-4"
                                       style="text-align: left;">Result</label>
                                    <div class="col-sm-4">
                                       <input type="checkbox"> <label>Not done</label>
                                    </div>
                                 </div>
                                 <!-- End of Labels -->

                                 <!-- Fields -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Hemoglobin (g/L)</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="hemoglobin" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Hematocrit (%)</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">White blood cells (x10 ^9/L)</label>
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
                                    <label class="control-label col-sm-4">Metamyelocytes (%)</label>
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
                                    <label class="control-label col-sm-4">Platelet count (x 10^9/L)</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="plateletCount" />
                                    </div>
                                 </div>

                                 <!-- Other Lab -->
                                 <div class="form-group" style="margin-bottom: 0px">
                                    <h3>
                                       <label class="control-label col-sm-4">Other Laboratories</label>
                                    </h3>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Laboratory Parameter</label> <label class="col-lg-4"
                                       style="text-align: left;">Result</label>
                                    <div class="col-lg-4">
                                       <input type="checkbox"> <label>Not done</label>
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Creatinine (mg/dl)</label>
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
                                    <label class="control-label col-sm-4">Na</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">K</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="" />
                                    </div>
                                 </div>
                                 <!-- TABLE -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Bilirubin</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Total</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Direct</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Indirect</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="" />
                                    </div>
                                 </div>
                                 <!-- End Table -->
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
                                    <label class="control-label col-sm-4">Beta-2-microglobulin mg/dl</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Hepatitis B Testing </label>
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
                                    <label class="control-label col-sm-4">ESR</label>
                                    <div class="col-lg-4">
                                       <input type="text" class="form-control" name="" />
                                    </div>
                                 </div>
                                 <!-- Labels -->

                                 <!-- Hematopathology review of slides  -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Hematopathology review of slides</label>
                                    <div class="col-sm-8">
                                       <div class="radio">
                                          <label><input type="radio" name="hematopathologyReviewOfSlides">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="hematopathologyReviewOfSlides">No</label>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Date Performed</label>
                                    <div class="col-lg-8">
                                       <input type="date" class="form-control" name="hematopathologyDatePerformed" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Description</label>
                                    <div class="col-sm-8">
                                       <input type="text" class="form-control" name="hematopathologyDescription" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Attach scanned document</label>
                                    <div class="col-sm-8">
                                       <input type="file" class="form-control" name="hematopathologyAttachScannedDocument" />
                                    </div>
                                 </div>

                                 <!-- Immunohistochemistry of tissue  -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Immunohistochemistry of tissue</label>
                                    <div class="col-sm-8">
                                       <div class="radio">
                                          <label><input type="radio" name="immunohistochemistryReviewOfSlides">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="immunohistochemistryHematopathologyReviewOfSlides">No</label>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Date Performed</label>
                                    <div class="col-lg-8">
                                       <input type="date" class="form-control" name="immunohistochemistryDatePerformed" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Description</label>
                                    <div class="col-sm-8">
                                       <input type="text" class="form-control" name="description" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Attach scanned document</label>
                                    <div class="col-sm-8">
                                       <input type="file" class="form-control" name="attachScannedDocument" />
                                    </div>
                                 </div>

                                 <!-- Imaging Studies -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Imaging Studies</label>
                                    <div class="col-sm-8">
                                       <div class="radio">
                                          <label><input type="radio" name="imagingStudies">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="imagingStudies">No</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="imagingStudies">Not Applicable</label>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Result</label>
                                    <div class="col-lg-5">
                                       <input type="text" class="form-control" name="" />
                                    </div>
                                 </div>

                                 <!-- Bone Marrow  -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Bone Marrow Aspirate and Biopsy result</label>
                                    <div class="col-sm-8">
                                       <div class="radio">
                                          <label><input type="radio" name="boneMarrowAspirate">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="boneMarrowAspirate">No</label>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Date Performed</label>
                                    <div class="col-lg-8">
                                       <input type="date" class="form-control" name="boneMarrowDatePerformed" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Description</label>
                                    <div class="col-sm-8">
                                       <input type="text" class="form-control" name="description" />
                                    </div>
                                 </div>
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Attach scanned document</label>
                                    <div class="col-sm-8">
                                       <input type="file" class="form-control" name="attachScannedDocument" />
                                    </div>
                                 </div>

                                 <!-- Flow cytometry -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Flow Cytometry</label>
                                    <div class="col-sm-8">
                                       <div class="radio">
                                          <label><input type="radio" name="flowCytometry">Yes</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="flowCytometry">No</label>
                                       </div>
                                       <div class="radio">
                                          <label><input type="radio" name="flowCytometry">Not Applicable</label>
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
                                    <label class="control-label col-lg-4">Attach scanned document</label>
                                    <div class="col-sm-8">
                                       <input type="file" class="form-control" name="attachScannedDocument" />
                                    </div>
                                 </div>

                              </div>
                              <!-- End of Form -->
                           </div>
                           <!-- End of Laboratory -->

                           <!-- Therapy -->
                           <div id="therapy" class="tab-pane fade">

                              <!-- Form -->
                              <div class="form-horizontal">

                                 <!-- Treatment -->
                                 <div class="form-group">
                                    <label for="severity" class="control-label col-sm-4">Mode of Treatment</label>
                                    <div class="col-sm-8">
                                       <select class="form-control" name="treament">
                                          <option selected="selected" disabled="disabled">Select</option>
                                          <option value="Pharmacologic 1st line">Pharmacologic 1st line</option>
                                          <option value="Pharmacologic 2nd line/Salvage regimen">Pharmacologic 2nd line/Salvage
                                             regimen</option>
                                          <option value="Supportive/Palliative">Supportive/Palliative</option>
                                       </select>
                                    </div>
                                 </div>

                                 <!-- Regimen/Protocol -->
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Regimen/Protocol</label>
                                    <div class="col-sm-8">
                                       <input type="text" class="form-control" name="regimenProtocol" />
                                    </div>
                                 </div>

                                 <!-- Chemotherapy Medications  -->
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Chemotherapy Medications</label>
                                    <div class="col-sm-8">
                                       <input type="text" class="form-control" name="chemotherapyMedications" />
                                    </div>
                                 </div>

                                 <!-- Cycle Number  -->
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Cycle Number</label>
                                    <div class="col-sm-8">
                                       <input type="text" class="form-control" name="cycleNumber" />
                                    </div>
                                 </div>

                                 <!-- Date Started -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-4">Date Started</label>
                                    <div class="col-lg-8">
                                       <input type="date" class="form-control" name="dateStarted" />
                                    </div>
                                 </div>

                                 <!-- Complications  -->
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Complications</label>
                                    <div class="col-sm-8">
                                       <input type="text" class="form-control" name="complications" />
                                    </div>
                                 </div>

                                 <!-- Disease Status -->
                                 <div class="form-group">
                                    <label class="control-label col-lg-4">Disease Status</label>
                                    <div class="col-lg-8">
                                       <select class="form-control" name="diseasestatus">
                                          <option selected="selected" disabled="disabled">Select</option>
                                          <option value="">Newly Diagnosed</option>
                                          <option value="">CR (Complete Response)</option>
                                          <option value="">PR (Partial Response)</option>
                                          <option value="">NR (No Response) or SD Stable Disease)</option>
                                          <option value="">PD (Progressive Disease)</option>
                                       </select>
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
=======

<title>USTH-BCI Biobank - Lymphoma</title>

<!-- CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">

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
               <li><a href="dashboard.jsp">Dashboard</a></li>
               <li><a href="aaphsmds-baseline.jsp">AA, PHS, MDS</a></li>
               <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
               <li><a href="leukemia-baseline.jsp">Leukemia</a></li>
               <li class="active"><a href="lymphoma-baseline.jsp">Lymphoma</a></li>
               <li><a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a></li>
               <li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
               <li><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>
            </ul>
         </div>
         <!-- End of Navbar -->

      </div>
      <!-- End of header -->

      <!-- Main Content -->
      <div class="container-fluid bg-grey">
         <!-- Sidebar -->
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
                     <li><a href="#">CD001</a></li>
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
                     <li><a href="#">CD006</a></li>
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
         <!-- Form Container -->
         <div class="row">
            <div class="col-sm-10 offset-sm-2 pull-right forms">

               <!-- Buttons Container -->
               <div class="row button-container">
                  <div class="col-sm-4">
                     <a href="lymphoma-baseline.jsp" type="button" class="btn bg-yellow">Baseline</a> <a
                        href="lymphoma-followup.jsp" type="button" class="btn bg-yellow">Follow Up</a>
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
                                 <label class="control-label col-sm-5">Patient ID Number</label>
                                 <div class="col-sm-7">
                                    <input type="text" class="form-control" name="patientIDNumber">
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
                                 <label class="control-label col-sm-5">Tissue Specimen Collected</label>
                                 <div class="col-sm-7">
                                    <div class="radio">
                                       <label><input type="radio" name="tissueSpecimenCollected">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="tissueSpecimenCollected">No</label>
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
                        <li><a data-toggle="tab" href="#therapy">Therapy and Response</a></li>
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
                                 <label class="control-label col-sm-3">Date of Initial Diagnosis</label>
                                 <div class="col-sm-9">
                                    <input type="date" class="form-control" name="dateOfInitialDiagnosis">
                                 </div>
                              </div>

                              <!-- Diagnosis -->
                              <div class="form-group">
                                 <label for="diagnosis" class="control-label col-sm-3">Diagnosis</label>
                                 <div class="col-sm-9">
                                    <select class="form-control" name="diagnosis">
                                       <option selected="selected" disabled="disabled">Select</option>
                                       <option value="">B21.1 HIV disease resulting in Burkitt lymphoma</option>
                                       <option value="">B21.2 HIV disease resulting in other types of
                                          non-Hodgkin lymphoma</option>
                                       <option value="">B21.3 HIV disease resulting in other malignant
                                          neoplasms of lymphoid, haematopoietic and related tissue</option>
                                       <option value="">C81.0 Nodular lymphocyte predominant Hodgkin lymphoma</option>
                                       <option value="">C81.1 Nodular sclerosis (classical) Hodgkin lymphoma</option>
                                       <option value="">C81.2 Mixed cellularity (classical) Hodgkin lymphoma</option>
                                       <option value="">C81.3 Lymphocyte depleted (classical) Hodgkin lymphoma</option>
                                       <option value="">C81.4 Lymphocyte-rich (classical) Hodgkin lymphoma</option>
                                       <option value="">C81.7 Other (classical) Hodgkin lymphoma</option>
                                       <option value="">C81.9 Hodgkin lymphoma, unspecified</option>
                                       <option value="">C82.0 Follicular lymphoma grade I</option>
                                       <option value="">C82.1 Follicular lymphoma grade II</option>
                                       <option value="">C82.2 Follicular lymphoma grade III, unspecified</option>
                                       <option value="">C82.3 Follicular lymphoma grade IIIa</option>
                                       <option value="">C82.4 Follicular lymphoma grade IIIb</option>
                                       <option value="">C82.5 Diffuse follicle centre lymphoma</option>
                                       <option value="">C82.6 Cutaneous follicle centre lymphoma</option>
                                       <option value="">C82.7 Other types of follicular lymphoma</option>
                                       <option value="">C82.9 Follicular lymphoma, unspecified</option>
                                       <!-- Nodular lymphoma NOS -->
                                       <option value="">C83.0 Small cell B-cell lymphoma</option>
                                       <!--  Lymphoplasmacytic lymphoma
                              Nodal marginal zone lymphoma
                              Non-leukaemic variant of B-CLL
                              Splenic marginal zone lymphoma -->
                                       <option value="">C83.1 Mantle cell lymphoma</option>
                                       <!--  Centrocytic lymphoma
                              Malignant lymphomatous polyposis -->
                                       <option value="">C83.3Diffuse large B-cell lymphoma</option>
                                       <option value="">C83.5 Lymphoblastic (diffuse) lymphoma</option>
                                       <!--  B-cell precursor lymphoma
                              Lymphoblastic B-cell lymphoma
                              Lymphoblastic lymphoma NOS
                              Lymphoblastic T-cell lymphoma
                              T-cell precursor lymphoma -->
                                       <option value="">C83.7 Burkitt lymphoma</option>
                                       <!--  Atypical Burkitt lymphoma
                              “Burkitt-like” lymphoma -->
                                       <option value="">C83.8 Other non-follicular lymphoma</option>
                                       <!--  Primary effusion B-cell lymphoma
                              Intravascular large B-cell lymphoma
                              Lymphoid granulomatosis -->
                                       <option value="">C83.9 Non-follicular (diffuse) lymphoma, unspecified</option>
                                       <option value="">C84.0 Mycosis fungoides</option>
                                       <option value="">C84.1 Sézary disease</option>
                                       <option value="">C84.4 Peripheral T-cell lymphoma, not elsewhere
                                          classified</option>
                                       <!--  Lennert’s lymphoma
                              Lymphoepithelioid lymphoma -->
                                       <option value="">C84.5 Other mature T/NK-cell lymphomas</option>
                                       <option value="">C84.6 Anaplastic large cell lymphoma, ALK-positive</option>
                                       <!--  Anaplastic large cell lymphoma, CD30-positive -->
                                       <option value="">C84.7 Anaplastic large cell lymphoma, ALK-negative</option>
                                       <!--  Excl.:  primary cutaneous CD30-positive T-cell proliferations (C86.6) -->
                                       <option value="">C84.8 Cutaneous T-cell lymphoma, unspecified</option>
                                       <option value="">C84.9 Mature T/NK-cell lymphoma, unspecified</option>
                                       <!--  NK/T cell lymphoma NOS
                              Excl.:  mature T-cell lymphoma, not elsewhere classified (C84.4) -->
                                       <option value="">C85.1 B-cell lymphoma, unspecified</option>
                                       <!--  Note: If B-cell lineage or involvement is mentioned in conjunction with a specific lymphoma, code to the more specific description. -->
                                       <option value="">C85.2 Mediastinal (thymic) large B-cell lymphoma</option>
                                       <option value="">C85.7 Other specified types of non-Hodgkin lymphoma</option>
                                       <option value="">C85.9 Non-Hodgkin lymphoma, unspecified</option>
                                       <!--  Lymphoma NOS
                              Malignant lymphoma NOS
                              Non-Hodgkin lymphoma NOS -->
                                       <option value="">C86.0 Extranodal NK/T-cell lymphoma, nasal type</option>
                                       <option value="">C86.1 Hepatosplenic T-cell lymphoma</option>
                                       <!--  Alpha-beta and gamma-delta types -->
                                       <option value="">C86.2 Enteropathy-type (intestinal) T-cell lymphoma</option>
                                       <!--  Enteropathy associated T-cell lymphoma -->
                                       <option value="">C86.3 Subcutaneous panniculitis-like T-cell lymphoma</option>
                                       <option value="">C86.4 Blastic NK-cell lymphoma</option>
                                       <option value="">C86.5 Angioimmunoblastic T-cell lymphoma</option>
                                       <!--  Angioimmunoblastic lymphadenopathy with dysproteinaemia [AILD] -->
                                       <option value="">C86.6 Primary cutaneous CD30-positive T-cell
                                          proliferations</option>
                                       <!--  Lymphomatoid papulosis
                              Primary cutaneous anaplastic large-cell lymphoma
                              Primary cutaneous CD30-positive large T-cell lymphoma -->
                                       <option value="">C88.0 Waldenström macroglobulinaemia</option>
                                       <!--  Lymphoplasmacytic lymphoma with IgM-production
                              Macroglobulinaemia (primary)(idiopathic)
                              Excl.: small cell B-cell lymphoma (C83.0) -->
                                       <option value="">C88.2 Other heavy chain disease</option>
                                       <!--  Franklin disease
                              Gamma heavy chain disease
                              Mu (µ) heavy chain disease -->
                                       <option value="">C88.3 Immunoproliferative small intestinal disease</option>
                                       <!--  Alpha heavy chain disease
                              Mediterranean lymphoma -->
                                       <option value="">C88.4 Extranodal marginal zone B-cell lymphoma of
                                          mucosa-associated lymphoid tissue [MALT-lyphoma]</option>
                                       <!--  Note: Use additional code (C83.3) if desired, to specify transition to high malignant (diffuse large cell) lymphoma
                              Lymphoma of skin-associated lymphoid tissue (SALT-lymphoma)
                              Lymphoma of bronchial-associated lymphoid tissue (BALT-lymphoma) -->
                                       <option value="">C88.7 Other malignant immunoproliferative diseases</option>
                                       <option value="">C88.9 Malignant immunoproliferative disease,
                                          unspecified</option>
                                       <!--  Immunoproliferative disease NOS -->
                                    </select>
                                 </div>
                              </div>

                              <!-- Stage of Disease -->
                              <div class="form-group">
                                 <label class="control-label col-sm-3">Stage of Disease</label>
                                 <div class="col-sm-9">
                                    <input type="text" class="form-control" name="stageOfDisease">
                                 </div>
                              </div>

                              <!-- Chief Complaint -->
                              <div class="form-group">
                                 <label class="control-label col-sm-3">Chief Complaint</label>
                                 <div class="col-sm-9">
                                    <input type="text" class="form-control" name="chiefComplaint">
                                 </div>
                              </div>

                              <!-- Constitutional Symptoms -->
                              <div class="form-group">
                                 <label class="control-label col-sm-3">Constitutional Symptoms</label>
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
                              </div>

                              <!-- Family History of Cancer -->
                              <div class="form-group">
                                 <label class="control-label col-sm-3">Family History of Cancer</label>
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
                                 <label class="control-label col-sm-3">Relationship to Patient</label>
                                 <div class="col-sm-9">
                                    <input type="text" class="form-control" name="relationshipToPatient">
                                 </div>
                              </div>

                              <!-- Other Diseases in the Family -->
                              <div class="form-group">
                                 <label class="control-label col-sm-3">Other Diseases in the Family</label>
                                 <div class="col-sm-9">
                                    <input type="text" class="form-control" name="otherDiseasesInTheFamily">
                                 </div>
                              </div>

                              <!-- Comorbidities -->
                              <div class="form-group">
                                 <label class="control-label col-sm-3">Comorbidities</label>
                                 <div class="col-sm-9">
                                    <input type="text" class="form-control" name="comorbidities">
                                 </div>
                              </div>

                              <!-- Concomitant Medications -->
                              <div class="form-group">
                                 <label class="control-label col-sm-3">Concomitant Medications</label>
                                 <div class="col-sm-9">
                                    <div class="radio">
                                       <label><input type="radio" name="concomitantMedications">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="concomitantMedications">No</label>
                                    </div>
                                 </div>
                              </div>

                              <div class="form-group">
                                 <div class="row">
                                    <div class="col-sm-3"></div>
                                    <label class="control-label col-sm-3" style="text-align: left;">Generic Name</label>
                                    <label class="control-label col-sm-3" style="text-align: left;">Dose</label> <label
                                       class="control-label col-sm-3" style="text-align: left;">Frequency</label>
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
                                 <label class="control-label col-sm-3">Smoking History</label>
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
                                    <input type="text" class="form-control" name="smokingHistorySpecify">
                                 </div>
                              </div>

                              <!-- Alcohol Intake History -->
                              <div class="form-group">
                                 <label class="control-label col-lg-3">Alcohol intake history </label>
                                 <div class="col-sm-9">
                                    <div class="radio">
                                       <label><input type="radio" name="alcoholIntakeHistory">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="alcoholIntakeHistory">No</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-3">Specify</label>
                                 <div class="col-sm-9">
                                    <input type="text" class="form-control" name="alcoholIntakeSpecify" />
                                 </div>
                              </div>

                              <!-- Chemical Exposure -->
                              <div class="form-group">
                                 <label class="control-label col-lg-3">Chemical exposure</label>
                                 <div class="col-sm-9">
                                    <div class="radio">
                                       <label><input type="radio" name="chemicalExposureHistory">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="chemicalExposureHistory">No</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-3">Specify</label>
                                 <div class="col-sm-9">
                                    <input type="text" class="form-control" name="chemicalExposureSpecify" />
                                 </div>
                              </div>

                              <br />
                              <!-- Physical Exam -->
                              <h3 class="text-center">Physical Exam</h3>

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
                                 <label class="control-label col-lg-3">Presence of Splenomegaly</label>
                                 <div class="col-sm-9">
                                    <div class="radio">
                                       <label><input type="radio" name="presenceOfSplenomegaly">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="presenceOfSplenomegaly">No</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-3">Presence of Hepatomegaly</label>
                                 <div class="col-sm-9">
                                    <div class="radio">
                                       <label><input type="radio" name="presenceOfHepatomegaly">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="presenceOfHepatomegaly">No</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-3">Presence of Lymphadenopathies</label>
                                 <div class="col-sm-9">
                                    <div class="radio">
                                       <label><input type="radio" name="presenceOfLymphadenopathies">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="presenceOfLymphadenopathies">No</label>
                                    </div>
                                 </div>
                              </div>

                              <!-- Other findings -->
                              <br />
                              <div class="form-group">
                                 <label class="control-label col-lg-3">Other findings</label>
                                 <div class="col-sm-9">
                                    <input type="text" class="form-control" name="otherFindings" />
                                 </div>
                              </div>

                           </div>
                           <!-- End of form -->
                        </div>
                        <!-- End of Clinical -->

                        <!-- Laboratory -->
                        <div id="laboratory" class="tab-pane fade">

                           <!-- form -->
                           <div class="form-horizontal">

                              <!-- Date of Blood Collection -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Date of blood collection</label>
                                 <div class="col-lg-8">
                                    <input type="date" class="form-control" name="" />
                                 </div>
                              </div>

                              <br />
                              <!-- Hematology -->
                              <h3 class="text-center">Hematology</h3>

                              <!-- Labels -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Laboratory Parameter</label> <label
                                    class="col-sm-4" style="text-align: left;">Result</label>
                                 <div class="col-sm-4">
                                    <input type="checkbox"> <label>Not done</label>
                                 </div>
                              </div>
                              <!-- End of Labels -->

                              <!-- Fields -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Hemoglobin (g/L)</label>
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
                                 <label class="control-label col-sm-4">White blood cells (x10 ^9/L)</label>
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
                                 <label class="control-label col-sm-4">Metamyelocytes (%)</label>
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
                                 <label class="control-label col-sm-4">Platelet count (x 10^9/L)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="" />
                                 </div>
                              </div>

                              <!-- Other Lab -->
                              <div class="form-group" style="margin-bottom: 0px">
                                 <h3><label class="control-label col-sm-4">Other Laboratories</label></h3>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Laboratory Parameter</label> <label
                                    class="col-lg-4" style="text-align: left;">Result</label>
                                 <div class="col-lg-4">
                                    <input type="checkbox"> <label>Not done</label>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Creatinine (mg/dl)</label>
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
                                 <label class="control-label col-sm-4">Na</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">K</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="" />
                                 </div>
                              </div>
                              <!-- TABLE -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Bilirubin</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Total</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Direct</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Indirect</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="" />
                                 </div>
                              </div>
                              <!-- End Table -->
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
                                 <label class="control-label col-sm-4">Beta-2-microglobulin mg/dl</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Hepatitis B Testing </label>
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
                                 <label class="control-label col-sm-4">ESR</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="" />
                                 </div>
                              </div>
                              <!-- Labels -->

                              <!-- Hematopathology review of slides  -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Hematopathology review of slides</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio" name="hematopathologyReviewOfSlides">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="hematopathologyReviewOfSlides">No</label>
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
                                 <label class="control-label col-lg-4">Attach scanned document</label>
                                 <div class="col-sm-8">
                                    <input type="file" class="form-control" name="attachScannedDocument" />
                                 </div>
                              </div>

                              <!-- Immunohistochemistry of tissue  -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Immunohistochemistry of tissue</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio" name="hematopathologyReviewOfSlides">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="hematopathologyReviewOfSlides">No</label>
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
                                 <label class="control-label col-lg-4">Attach scanned document</label>
                                 <div class="col-sm-8">
                                    <input type="file" class="form-control" name="attachScannedDocument" />
                                 </div>
                              </div>

                              <!-- Imaging Studies -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Imaging Studies</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio" name="imagingStudies">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="imagingStudies">No</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="imagingStudies">Not Applicable</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Result</label>
                                 <div class="col-lg-5">
                                    <input type="text" class="form-control" name="" />
                                 </div>
                              </div>

                              <!-- Bone Marrow  -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Bone Marrow Aspirate and Biopsy result</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio" name="boneMarrowAspirate">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="boneMarrowAspirate">No</label>
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
                                 <label class="control-label col-lg-4">Attach scanned document</label>
                                 <div class="col-sm-8">
                                    <input type="file" class="form-control" name="attachScannedDocument" />
                                 </div>
                              </div>

                              <!-- Flow cytometry -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Flow Cytometry</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio" name="flowCytometry">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="flowCytometry">No</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="flowCytometry">Not Applicable</label>
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
                                 <label class="control-label col-lg-4">Attach scanned document</label>
                                 <div class="col-sm-8">
                                    <input type="file" class="form-control" name="attachScannedDocument" />
                                 </div>
                              </div>

                           </div>
                           <!-- End of Form -->
                        </div>
                        <!-- End of Laboratory -->

                        <!-- Therapy -->
                        <div id="therapy" class="tab-pane fade">

                           <!-- Form -->
                           <div class="form-horizontal">

                              <!-- Treatment -->
                              <div class="form-group">
                                 <label for="severity" class="control-label col-sm-4">Mode of Treatment</label>
                                 <div class="col-sm-8">
                                    <select class="form-control" name="treament">
                                       <option selected="selected" disabled="disabled">Select</option>
                                       <option value="Pharmacologic 1st line">Pharmacologic 1st line</option>
                                       <option value="Pharmacologic 2nd line/Salvage regimen">Pharmacologic 2nd
                                          line/Salvage regimen</option>
                                       <option value="Supportive/Palliative">Supportive/Palliative</option>
                                    </select>
                                 </div>
                              </div>

                              <!-- Regimen/Protocol -->
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Regimen/Protocol</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="regimenProtocol" />
                                 </div>
                              </div>

                              <!-- Chemotherapy Medications  -->
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Chemotherapy Medications</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="chemotherapyMedications" />
                                 </div>
                              </div>

                              <!-- Cycle Number  -->
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Cycle Number</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="cycleNumber" />
                                 </div>
                              </div>

                              <!-- Date Started -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Date Started</label>
                                 <div class="col-lg-8">
                                    <input type="date" class="form-control" name="dateStarted" />
                                 </div>
                              </div>

                              <!-- Complications  -->
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Complications</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="complications" />
                                 </div>
                              </div>

                              <!-- Disease Status -->
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Disease Status</label>
                                 <div class="col-lg-8">
                                    <select class="form-control" name="diseasestatus">
                                       <option selected="selected" disabled="disabled">Select</option>
                                       <option value="">Newly Diagnosed</option>
                                       <option value="">CR (Complete Response)</option>
                                       <option value="">PR (Partial Response)</option>
                                       <option value="">NR (No Response) or SD Stable Disease)</option>
                                       <option value="">PD (Progressive Disease)</option>
                                    </select>
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
>>>>>>> branch 'master' of https://github.com/Mnizus/Web-Based-Biobank-for-UST-BCI.git
         <!-- End of Forms -->
      </div>
      <!-- End of Main Content -->

   </div>
   <!-- End of main container -->

</body>