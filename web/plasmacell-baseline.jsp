<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<!DOCTYPE html>
<html>
<head>
<title>USTH | Plasma Cell Baseline</title>
<meta charset="utf-8">
<link rel="icon" href="images/usthlogo.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- CSS -->
<link rel="stylesheet" href="fonts/open-sans.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/navbar.css">
<link rel="stylesheet" href="css/sidebar.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/pure-min.css">
<link rel="stylesheet" href="css/grids-responsive-min.css">
<link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">
<!-- JS -->
<script src="js/utils.js"></script>
<script src="js/genrep.js"></script>
<script src="js/sidebar.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/jquery.min-2.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/Chart.js"></script>
<script src="js/Chart.min.js"></script>
<script src="js/Chart.bundle.js"></script>
<script src="js/Chart.bundle.min.js"></script>
<script src="js/jspdf.min.js"></script>
<script src="js/jspdf.debug.js"></script>
<script src="js/jspdf.plugin.autotable.js"></script>
<script src="js/chartjs-plugin-datalabels.js"></script>
<script src="js/chartjs-plugin-datalabels.min.js"></script>
<script src="js/JsBarcode.all.min.js"></script>
<script src="js/radio-showhide.js" type="text/javascript"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>
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
                  <li><a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a></li>
                  <li class="active"><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
                  <li><a href="aapnhmds-baseline.jsp">AA PNH MDS</a></li>
                  <li><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>
                  <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
                  <!-- Dropdown -->
                  <li class="dropdown pull-right"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                     aria-expanded="false"> <i class="fa fa-cog fa-lg" aria-hidden="true"></i><span class="caret"></span>
                  </a>
                     <ul class="dropdown-menu dropdown-menu__text" role="menu">
                        <li><a style="font-weight: bold;" href="audittrail.jsp"><i class="fas fa-file-alt dropdown-icons--margin"></i>
                              Audit Trail</a></li>
                        <li class="divider" style="background-color: #000000;"></li>
                        <li><a style="font-weight: bold;" href="profile.jsp"><i class="fas fa-user-md dropdown-icons--margin"></i>
                              Profile</a></li>
                        <li class="divider" style="background-color: #000000;"></li>
                        <li><a style="font-weight: bold;" href="usermanagement.jsp"><i class="fas fa-wrench dropdown-icons--margin"></i>
                              Settings</a></li>
                        <li class="divider" style="background-color: #000000;"></li>
                        <li><a style="font-weight: bold;" href="login.jsp"><i class="fas fa-sign-out-alt dropdown-icons--margin"></i>
                              Logout</a></li>
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
                     <input id="searchbox" type="text" placeholder="Search Patient" class="sidebar__searchbox--border"
                        style="font-weight: bold; text-align: center;">
                  </div>
               </div>
            </div>
            <ul id='searchboxfill' class="nav nav-pills nav-stacked sidebar__searchbox--border">
            </ul>
            <!-- End of Search Box -->
            <!-- Add Patient Button -->
            <div class="row">
               <div class="col-sm-12 add-box">
                  <button id="addPatient" type="button" class="btn bg-yellow sidebar__addptngenrep--border" data-toggle="modal"
                     data-target="#usermanagement__popup" data-whatever="@mdo">Add Patient</button>
               </div>
            </div>
            <!-- End of Add Patient Button -->
            <!-- Generate Report Button -->
            <div class="row">
               <div class="col-sm-12 add-box">
                  <button id="generateReport" type="button" class="btn bg-yellow sidebar__addptngenrep--border" data-target="#genrep"
                     data-toggle="modal" data-whatever="@mdo">Generate Report</button>
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
            <form action="" method="post" id="PlasmaCellBaseline">
               <!-- Forms Container -->
               <div class="col-md-12">
                  <div class="col-md-12 forms">
                     <!-- Buttons Container -->
                     <div class="row button-container buttons__firsthalf--position ">
                        <div class="col-sm-6 buttons__firsthalf-position ">
                           <a href="plasmacell-baseline.jsp" type="button" class="btn bg-yellow button-border" id="baselineBtn">Baseline</a>
                           <a href="plasmacell-followup.jsp" type="button" class="btn bg-yellow button-border" id="followUpBtn">Follow
                              Up</a>
                        </div>
                        <div class="col-sm-6 text-right btn-toolbar">
                           <a href="#" type="button" class="btn bg-yellow button-border" id="patientStatistics" data-target="#patstats"
                              data-toggle="modal">Patient Statistics</a> <a href="#" type="button" class="btn bg-yellow button-border"
                              id="editPatientBtn">Edit Patient</a> <a href="#" type="button" class="btn bg-yellow button-border"
                              id="archPatientBtn">Archive Patient</a>
                        </div>
                     </div>
                     <!-- End of Buttons Container -->
                     <!-- Forms -->
                     <div class="row">
                        <!-- General -->
                        <div class="col-md-5">
                           <!-- General Tab -->
                           <ul class="nav nav-tabs">
                              <li class="active"><a data-toggle="tab" href="#general">General</a></li>
                           </ul>
                           <!-- End of General Tab -->
                           <!-- General Tab Content -->
                           <div class="tab-content tab-content__border">
                              <div id="general" class="tab-pane fade in active">
                                 <!-- Form -->
                                 <div class="form-horizontal">
                                    <!-- Patient ID Number -->
                                    <div class="form-group">
                                       <div class="col-sm-1">
                                          <a id="" data-toggle="modal" data-target="#patientBarcode_popup" href="#"> <img
                                             alt="Barcode Icon" src="images/barcode.png"
                                             class="form__barcodeicon--size body__barcodebtn--style">
                                          </a>
                                       </div>
                                       <!-- Barcode Pop-Up -->
                                       <div id="patientBarcode_popup" class="modal fade centered-modal" tabindex="-1" role="dialog"
                                          aria-labelledby="exampleModalLabel" aria-hidden="true" data-backdrop="static">
                                          <div class="modal-dialog">
                                             <div class="modal-content">
                                                <div class="modal-header">
                                                   <button type="button" class="close" data-dismiss="modal" onclick="closeModal()">
                                                      <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                                                   </button>
                                                   <h4 class="modal-title" id="exampleModalLabel">Patient Barcode:</h4>
                                                   <div id="toPrint">
                                                      <div align="center">
                                                         <img id="patientBarcode" />
                                                      </div>
                                                   </div>
                                                   <a href="#" onclick="printBarcode('toPrint')">PRINT</a>
                                                </div>
                                                <div class="modal-footer">
                                                   <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                                                </div>
                                             </div>
                                          </div>
                                       </div>
                                       <!-- End of Barcode Pop-Up -->
                                       <label class="control-label col-sm-4">Patient ID Number</label>
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
                                             <label><input type="radio" name="gender" value="1" Required="Required">Male</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="gender" value="2">Female</label>
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
                                             <label><input type="radio" name="tissueSpecimenCollected" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="tissueSpecimenCollected" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Specimen Type -->
                                    <div class="form-group" id="specimenType" style="display: none;">
                                       <label class="control-label col-sm-5">Specimen Type</label>
                                       <div class="col-sm-7">
                                          <select class="form-control" name="specimenType">
                                             <option value="BMA">BMA</option>
                                             <option value="BB">BB</option>
                                             <option value="LN">LN</option>
                                          </select>
                                       </div>
                                    </div>
                                 </div>
                                 <!-- End of form -->
                              </div>
                           </div>
                           <!-- End of General Tab Content -->
                        </div>
                        <!-- CLT -->
                        <div class="col-md-7">
                           <!-- form tab -->
                           <ul class="nav nav-tabs">
                              <li class="active"><a data-toggle="tab" href="#clinical">Clinical</a></li>
                              <li><a data-toggle="tab" href="#laboratory">Laboratory</a></li>
                              <li><a data-toggle="tab" href="#therapy">Therapy and Response</a></li>
                           </ul>
                           <!-- forms -->
                           <div class="tab-content tab-content__border">
                              <!-- clinical -->
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
                                             <option value="C90 Multiple myeloma and malignant plasma cell neoplasms">C90 Multiple
                                                myeloma and malignant plasma cell neoplasms</option>
                                             <option value="C90.0 Multiple myeloma">C90.0 Multiple myeloma</option>
                                             <option value="C90.00 ... not having achieved remission">C90.00 ... not having
                                                achieved remission</option>
                                             <option value="C90.01 ... in remission">C90.01 ... in remission</option>
                                             <option value="C90.02 ... in relapse">C90.02 ... in relapse</option>
                                             <option value="C90.2 Extramedullary plasmacytoma">C90.2 Extramedullary plasmacytoma</option>
                                             <option value="C90.20 ... not having achieved remission">C90.20 ... not having
                                                achieved remission</option>
                                             <option value="C90.21 ... in remission">C90.21 ... in remission</option>
                                             <option value="C90.22 ... in relapse">C90.22 ... in relapse</option>
                                             <option value="C90.3 Solitary plasmacytoma">C90.3 Solitary plasmacytoma</option>
                                             <option value="C90.30 ... not having achieved remission">C90.30 ... not having
                                                achieved remission</option>
                                             <option value="C90.31 ... in remission">C90.31 ... in remission</option>
                                             <option value="C90.32 ... in relapse">C90.32 ... in relapse</option>
                                          </select>
                                       </div>
                                    </div>
                                    <!-- ISS Staging -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-3">ISS Staging</label>
                                       <div class="col-sm-9">
                                          <select class="form-control" name="issStaging">
                                             <option selected="selected" disabled="disabled">Select</option>
                                             <option value="Stage I">Stage I</option>
                                             <option value="Stage II">Stage II</option>
                                             <option value="Stage III">Stage III</option>
                                          </select>
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
                                             <option value="Fever">Fever</option>
                                             <option value="Weigh Loss">Weigh Loss</option>
                                             <option value="Night Sweats">Night Sweats</option>
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
                                             <label><input type="radio" name="familyHistoryOfCancer" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="familyHistoryOfCancer" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- INSERT HERE THE DYNAMIC PART -->
                                    <!-- Relationship to Patient -->
                                    <div class="form-group" id="relationshipToPatient" style="display: none;">
                                       <label class="control-label col-sm-3">Relationship to Patient</label>
                                       <div class="col-sm-9">
                                          <input type="text" class="form-control" name="relationshipToPatient">
                                       </div>
                                    </div>
                                    <!-- Specify Cancer-->
                                    <div class="form-group" id="specifyCancer" style="display: none;">
                                       <label class="control-label col-sm-3">Specify Cancer</label>
                                       <div class="col-sm-9">
                                          <input type="text" class="form-control" name="specifyCancer">
                                       </div>
                                    </div>
                                    <!-- Other Diseases in the Family -->
                                    <div class="form-group" id="otherDiseasesInTheFamily" style="display: none;">
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
                                             <label><input type="radio" name="concomitantMedications" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="concomitantMedications" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Generic, Dose and Frequency -->
                                    <div class="form-group" id="concomitantMedications" style="display: none;">
                                       <div class="row">
                                          <div class="col-sm-3"></div>
                                          <label class="control-label col-sm-3" style="text-align: left;">Generic Name</label> <label
                                             class="control-label col-sm-3" style="text-align: left;">Dose</label> <label
                                             class="control-label col-sm-3" style="text-align: left;">Frequency</label>
                                       </div>
                                       <div class="row">
                                          <div class="col-sm-3"></div>
                                          <div class="col-sm-3" id="genericName" style="display: none;">
                                             <input type="text" class="form-control" name="genericName">
                                          </div>
                                          <div class="col-sm-3" id="dose" style="display: none;">
                                             <input type="text" class="form-control" name="dose">
                                          </div>
                                          <div class="col-sm-3" id="frequency" style="display: none;">
                                             <input type="text" class="form-control" name="frequency">
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Smoking History -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-3">Smoking History</label>
                                       <div class="col-sm-9">
                                          <div class="radio">
                                             <label><input type="radio" name="smokingHistory" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="smokingHistory" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="smokingHistorySpecify" style="display: none;">
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
                                             <label><input type="radio" name="alcoholIntakeHistory" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="alcoholIntakeHistory" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="alcoholIntakeSpecify" style="display: none;">
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
                                             <label><input type="radio" name="chemicalExposureHistory" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="chemicalExposureHistory" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="chemicalExposureSpecify" style="display: none;">
                                       <label class="control-label col-lg-3">Specify</label>
                                       <div class="col-sm-9">
                                          <input type="text" class="form-control" name="chemicalExposureSpecify" />
                                       </div>
                                    </div>
                                    <!-- Physical Exam -->
                                    <h3 class="text-center">
                                       <label class="control-label">Physical Exam</label>
                                    </h3>
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
                                       <label class="control-label col-lg-3">Other pertinent findings</label>
                                       <div class="col-sm-9">
                                          <input type="text" class="form-control" name="otherFindings" />
                                       </div>
                                    </div>
                                    <!-- End of form -->
                                 </div>
                              </div>
                              <!-- laboratory -->
                              <div id="laboratory" class="tab-pane fade">
                                 <div class="form-horizontal">
                                    <!-- form -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Date of blood collection</label>
                                       <div class="col-lg-8">
                                          <input type="date" class="form-control" name="dateOfBloodCollection" />
                                       </div>
                                    </div>
                                    <!-- Hematology -->
                                    <h3 class="text-center">
                                       <label class="control-label">Hematology</label>
                                    </h3>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Laboratory Parameter</label> <label class="col-sm-4"
                                          style="text-align: left;">Result</label>
                                       <div class="col-sm-4">
                                          <input type="checkbox"> <label>Not done</label>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Hemoglobin (g/L)</label>
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
                                       <label class="control-label col-sm-4">White blood cells (x10 ^9/L)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="whiteBloodCells" />
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
                                          <input type="text" class="form-control" name="eosinophils" />
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
                                       <label class="control-label col-sm-4">Metamyelocytes (%)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="metamyelocytes" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Blasts (%)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="blasts" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Platelet count (x 10^9/L)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="plateletCount" />
                                       </div>
                                    </div>
                                    <!-- Other Lab -->
                                    <h3 class="text-center">
                                       <label class="control-label">Other Laboratories</label>
                                    </h3>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Laboratory Parameter</label> <label class="col-lg-4"
                                          style="text-align: left;">Result</label>
                                       <div class="col-lg-4">
                                          <input type="checkbox"> <label>Not done</label>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">BUN (mg/dl)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="bun" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Creatinine (mg/dl)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="creatinine" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Uric acid mg/dl</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="uricAcid" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Ionized calcium (mg/dl)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="iCa" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Na (meg/L)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="na" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">K (meg/dl)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="k" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Total protein</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="totalProtein" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Albumin</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="albumin" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Globulin</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="globulin" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">B2 Microglobulin (mg/dl)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="b2Microglobulin" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">LDH (U/L)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="ldh" />
                                       </div>
                                    </div>
                                    <!-- Imaging Studies -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Imaging Studies</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="imagingStudies" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="imagingStudies" value="0">No / Not Applicable</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="imagingStudiesResult" style="display: none;">
                                       <label class="control-label col-lg-4">Result</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="imagingStudiesResult" />
                                       </div>
                                    </div>
                                    <!-- Bone Marrow  -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Bone Marrow Aspirate and Biopsy result</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="boneMarrowAspirate" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="boneMarrowAspirate" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="boneMarrowAspirateDatePerformed" style="display: none;">
                                       <label class="control-label col-sm-4">Date Performed</label>
                                       <div class="col-lg-8">
                                          <input type="date" class="form-control" name="boneMarrowAspirateDatePerformed" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="boneMarrowAspirateDescription" style="display: none;">
                                       <label class="control-label col-lg-4">Description</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="boneMarrowAspirateDescription" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="boneMarrowAspirateAttachScannedDocument" style="display: none;">
                                       <label class="control-label col-lg-4">Attach scanned document</label>
                                       <div class="col-sm-8">
                                          <input type="file" class="form-control" name="boneMarrowAspirateAttachScannedDocument" />
                                       </div>
                                    </div>
                                    <!-- Serum free light chain assay -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Serum free light chain assay</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="serumFreeLightChainAsssay" value="1"
                                                Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="serumFreeLightChainAsssay" value="0">No / Not
                                                Applicable</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="serumFreeLightChainAsssayResult" style="display: none;">
                                       <label class="control-label col-lg-4">Result</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="serumFreeLightChainAsssayResult" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="serumFreeLightChainAsssayAttachScannedDocument" style="display: none;">
                                       <label class="control-label col-lg-4">Attach scanned document</label>
                                       <div class="col-sm-8">
                                          <input type="file" class="form-control" name="serumFreeLightChainAsssayAttachScannedDocument" />
                                       </div>
                                    </div>
                                    <!-- Serum protein electrophoresis -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Serum protein electrophoresis</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="serumProteinElectrophoresis" value="1"
                                                Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="serumProteinElectrophoresis" value="0">No /
                                                Not Applicable</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="serumProteinElectrophoresisResult" style="display: none;">
                                       <label class="control-label col-lg-4">Result</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="serumProteinElectrophoresisResult" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="serumProteinElectrophoresisAttachScannedDocument" style="display: none;">
                                       <label class="control-label col-lg-4">Attach scanned document</label>
                                       <div class="col-sm-8">
                                          <input type="file" class="form-control" name="serumProteinElectrophoresisAttachScannedDocument" />
                                       </div>
                                    </div>
                                    <!-- Serum Immunofixation -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Serum Immunofixation</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="serumImmunofixation" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="serumImmunofixation" value="0">No / Not
                                                Applicable</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="serumImmunofixationResult" style="display: none;">
                                       <label class="control-label col-lg-4">Result</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="serumImmunofixationResult" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="serumImmunofixationAttachScannedDocument" style="display: none;">
                                       <label class="control-label col-lg-4">Attach scanned document</label>
                                       <div class="col-sm-8">
                                          <input type="file" class="form-control" name="serumImmunofixationAttachScannedDocument" />
                                       </div>
                                    </div>
                                    <!-- Urine protein electrophoresis/Immunofixation -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Urine protein electrophoresis / Immunofixation</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="urineProtein" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="urineProtein" value="0">No / Not Applicable</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="urineProteinResult" style="display: none;">
                                       <label class="control-label col-lg-4">Result</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="urineProteinResult" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="urineProteinAttachScannedDocument" style="display: none;">
                                       <label class="control-label col-lg-4">Attach scanned document</label>
                                       <div class="col-sm-8">
                                          <input type="file" class="form-control" name="urineProteinAttachScannedDocument" />
                                       </div>
                                    </div>
                                    <!-- Cytogenetic and Molecular Analysis -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Cytogenetic and Molecular Analysis</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="cytogeneticAndMolecularAnalysis" value="1"
                                                Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="cytogeneticAndMolecularAnalysis" value="0">Not
                                                Done</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="cytogeneticAndMolecularAnalysisResult" style="display: none;">
                                       <label class="control-label col-lg-4">Result</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="cytogeneticAndMolecularAnalysisResult" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="cytogeneticAndMolecularAnalysisAttachScannedDocument" style="display: none;">
                                       <label class="control-label col-lg-4">Attach scanned document</label>
                                       <div class="col-sm-8">
                                          <input type="file" class="form-control"
                                             name="cytogeneticAndMolecularAnalysisAttachScannedDocument" />
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
                                       <label class="control-label col-sm-4">Transplant Candidate</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="transplantCandidate" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="transplantCandidate" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Treatment -->
                                    <div class="form-group">
                                       <label for="severity" class="control-label col-sm-4">Mode of Treatment</label>
                                       <div class="col-sm-8">
                                          <select class="form-control" name="treatment">
                                             <option selected="selected" disabled="disabled">Select</option>
                                             <option value="Pharmacologic for transplant candidate">Pharmacologic for transplant
                                                candidate</option>
                                             <option value="Pharmacologic for non transplant candidate">Pharmacologic for non
                                                transplant candidate</option>
                                             <option value="Maintenance">Maintenance</option>
                                             <option value="Radiotherapy">Radiotherapy</option>
                                             <option value="Supportive">Supportive</option>
                                             <option value="Watch and Wait">Watch and Wait</option>
                                             <option value="Others">Others</option>
                                          </select>
                                       </div>
                                    </div>
                                    <!-- Other Regimens -->
                                    <div class="form-group" id="otherRegimens" style="display: none;">
                                       <label class="control-label col-lg-4">Other Regimens</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="otherRegimens" />
                                       </div>
                                    </div>
                                    <!-- Regimen/ Protocol (For transplant candidates) -->
                                    <div class="form-group">
                                       <label for="severity" class="control-label col-sm-4">Regimen/Protocol (For transplant
                                          candidates)</label>
                                       <div class="col-sm-8">
                                          <select class="form-control" name="regimenProtocolTransplant">
                                             <option selected="selected" disabled="disabled">Select</option>
                                             <option value="Bortezomib dexamethasone">Bortezomib dexamethasone</option>
                                             <option value="Bortezomib/Cyclophosphomide/dexamethasone">Bortezomib/Cyclophosphomide/dexamethasone</option>
                                             <option value="Bortezomib/Doxorubicin/dexamethasone">Bortezomib/Doxorubicin/dexamethasone</option>
                                             <option value="Bortezomib/Lenalidomide/dexamethasone">Bortezomib/Lenalidomide/dexamethasone</option>
                                             <option value="Bortezomib /Thallidomide/ Dexamethasone">Bortezomib /Thallidomide/
                                                Dexamethasone</option>
                                             <option value="Lenalidomide/Dexamethasone">Lenalidomide/Dexamethasone</option>
                                             <option value="Carfilzomib/Lenalidomide/Dexamethasone">Carfilzomib/Lenalidomide/Dexamethasone</option>
                                             <option value="Dexamethasone">Dexamethasone</option>
                                             <option value="Liposomal Doxorubicin/Vincristine/Dexamethason">Liposomal
                                                Doxorubicin/Vincristine/Dexamethason</option>
                                             <option value="Thallidomide/Dexamethasone">Thallidomide/Dexamethasone</option>
                                             <option value="Others">Others</option>
                                          </select>
                                       </div>
                                    </div>
                                    <!-- Other Regimens -->
                                    <div class="form-group" id="otherRegimensTransplant" style="display: none;">
                                       <label class="control-label col-lg-4">Other Regimens</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="otherRegimensTransplant" />
                                       </div>
                                    </div>
                                    <!-- Regimen/ Protocol (For nontransplant candidates) -->
                                    <div class="form-group">
                                       <label for="severity" class="control-label col-sm-4">Regimen/Protocol (For nontransplant
                                          candidates)</label>
                                       <div class="col-sm-8">
                                          <select class="form-control" name="regimenProtocolNonTransplant">
                                             <option selected="selected" disabled="disabled">Select</option>
                                             <option value="Bortezomib dexamethasone">Bortezomib dexamethasone</option>
                                             <option value="Bortezomib/Cyclophosphomide/dexamethasone">Bortezomib/Cyclophosphomide/dexamethasone</option>
                                             <option value="Bortezomib/Lenalidomide/dexamethasone">Bortezomib/Lenalidomide/dexamethasone</option>
                                             <option value="Lenalidomide/low dose Dexamethasone">Lenalidomide/low dose
                                                Dexamethasone</option>
                                             <option value="Melphalan/Prednisone/Bortezomib">Melphalan/Prednisone/Bortezomib</option>
                                             <option value="Melphalan/Prednisone/Lenalidomide">Melphalan/Prednisone/Lenalidomide</option>
                                             <option value="Melpahlan/Prednisone/Thallidomide">Melpahlan/Prednisone/Thallidomide</option>
                                             <option value="Dexamethasone">Dexamethasone</option>
                                             <option value="Liposomal Doxorubicin/Vincristine/Dexamethason">Liposomal
                                                Doxorubicin/Vincristine/Dexamethason</option>
                                             <option value="Melphalan/Prednisone">Melphalan/Prednisone</option>
                                             <option value="Thallidomide/Dexamethasone">Thallidomide/Dexamethasone</option>
                                             <option value="Vincristine /Doxorubicin/dexamethasone">Vincristine
                                                /Doxorubicin/dexamethasone</option>
                                             <option value="Others">Others</option>
                                          </select>
                                       </div>
                                    </div>
                                    <!-- Other Regimens -->
                                    <div class="form-group" id="otherRegimensNonTransplant" style="display: none;">
                                       <label class="control-label col-lg-4">Other Regimens</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="otherRegimensNonTransplant" />
                                       </div>
                                    </div>
                                    <!-- Maintenance Therapy -->
                                    <div class="form-group">
                                       <label class="control-label col-lg-4">Maintenance Therapy</label>
                                       <div class="col-sm-8">
                                          <select class="form-control" name="regimenProtocolMaintenanceTherapy">
                                             <option selected="selected" disabled="disabled">Select</option>
                                             <option value="Bortezomib">Bortezomib</option>
                                             <option value="Lenalidomide">Lenalidomide</option>
                                             <option value="Thallidomide">Thallidomide</option>
                                             <option value="Bortezomib/Prednisone">Bortezomib/Prednisone</option>
                                             <option value="Bortezomib/Thallidomide">Bortezomib/Thallidomide</option>
                                             <option value="Interferon">Interferon</option>
                                             <option value="Thallidomide/Prednisone">Thallidomide/Prednisone</option>
                                             <option value="Others">Others</option>
                                          </select>
                                       </div>
                                    </div>
                                    <!-- Other Regimens -->
                                    <div class="form-group" id="otherRegimensMaintenanceTherapy" style="display: none;">
                                       <label class="control-label col-lg-4">Other Regimens</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="otherRegimensMaintenanceTherapy" />
                                       </div>
                                    </div>
                                    <!-- Cycle Number -->
                                    <div class="form-group">
                                       <label class="control-label col-lg-4">Cycle Number</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="cycleNumber" />
                                       </div>
                                    </div>
                                    <h5 class="text-center">
                                       <label class="control-label">Other Treatment Modalities/Adjunctive treatment</label>
                                    </h5>
                                    <!-- Bisphosphonates -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Bisphosphonates</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="bisphosphonates" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="bisphosphonates" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="bisphosphonatesSpecify" style="display: none">
                                       <label class="control-label col-lg-4">Specify Drug</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="bisphosphonatesSpecify" />
                                       </div>
                                    </div>
                                    <!-- Radiotherapy -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Radiotherapy</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="radiotherapy" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="radiotherapy" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="radiotherapyDoseAndFrequency" style="display: none">
                                       <label class="control-label col-lg-4">Specify Dose and Frequency</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="radiotherapyDoseAndFrequency" />
                                       </div>
                                    </div>
                                    <!-- Dialysis -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Dialysis</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="dialysis" value="1" Required="Required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="dialysis" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Other Medications -->
                                    <div class="form-group" id="otherMedications" style="display: none">
                                       <label class="control-label col-sm-4">Other Medications</label>
                                       <div class="col-lg-8">
                                          <input type="text" class="form-control" name="otherMedications" />
                                       </div>
                                    </div>
                                    <!-- Date Started -->
                                    <div class="form-group" id="dateOfBloodCollection" style="display: none">
                                       <label class="control-label col-sm-4">Date Started</label>
                                       <div class="col-lg-8">
                                          <input type="date" class="form-control" name="dateOfBloodCollection" />
                                       </div>
                                    </div>
                                    <!-- Complications -->
                                    <div class="form-group" id="complications" style="display: none">
                                       <label class="control-label col-sm-4">Complications</label>
                                       <div class="col-lg-8">
                                          <input type="text" class="form-control" name="complications" />
                                       </div>
                                    </div>
                                 </div>
                                 <!-- End of Form -->
                              </div>
                              <!-- End of Therapy -->
                           </div>
                           <!-- End of CLT Tab Content -->
                           <input type="submit" class="btn bg-yellow col-sm-4 pull-right button-border" id='submitQuery'> <input
                              type="button" class="btn bg-yellow col-sm-4 pull-right button-border" id='submitCancel' value='Cancel'
                              onclick='cancelEdit()'>
                        </div>
                        <!-- End of CLT -->
                     </div>
                  </div>
               </div>
            </form>
            <!-- End of Forms container -->
         </div>
      </div>
   </div>
   <!-- End of Main Content -->
   <!-- Generate Report Modal  -->
   <div class="modal fade centered-modal" id="genrep" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
      data-backdrop="static">
      <div class="modal-dialog modal-lg">
         <div class="modal-content">
            <div class="modal-header">
               Generate Report:
               <button type="button" class="close" data-dismiss="modal">
                  <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
               </button>
            </div>
            <div class="modal-body">
               <div class="form-horizontal" style="text-align: right;">
                  <form role="form">
                     <!-- From Date  -->
                     <div class="form-group">
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">From:</label>
                        </div>
                        <div class="col-sm-10">
                           <input type="date" class="form-control" name="fromDateGenerateReport">
                        </div>
                     </div>
                     <!-- End of From Date -->
                     <!-- To Date  -->
                     <div class="form-group">
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">To:</label>
                        </div>
                        <div class="col-sm-10">
                           <input type="date" class="form-control" name="toDateGenerateReport">
                        </div>
                     </div>
                     <!-- End of To Date -->
                     <!-- Diseases -->
                     <div class="form-group">
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">Disease Type:</label>
                        </div>
                        <div class="col-sm-10">
                           <select class="form-control" name="diagnosis">
                              <option selected="selected" disabled="disabled">Select</option>
                              <option value="Leukemia">Leukemia</option>
                              <option value="Lymphoma">Lymphoma</option>
                              <option value="Plasma Cell Disorders">Plasma Cell Disorders</option>
                              <option value="Platelets Disorders">Platelets Disorders</option>
                              <option value="Coagulation">Coagulation</option>
                              <option value="AA, PNH, MDS">AA, PNH, MDS</option>
                              <option value="Thalassemia">Thalassemia</option>
                              <option value="All">All</option>
                           </select>
                        </div>
                     </div>
                     <!-- End of Disease -->
                     <!-- Specific Choice - Age -->
                     <div class="form-group">
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">Specific Type:</label>
                        </div>
                        <div class="col-sm-10 genrepmodal__checkboxgroup--position">
                           <input type="checkbox"> <label class="genrepmodal__checkboxes">Age</label> <input type="checkbox">
                           <label class="genrepmodal__checkboxes">Gender</label> <input type="checkbox"> <label
                              class="genrepmodal__checkboxes">Mode of Treatment</label> <input type="checkbox"> <label
                              class="genrepmodal__checkboxes">Disease Status Baseline</label> <input type="checkbox"> <label
                              class="genrepmodal__checkboxes">Disease Status Follow-up</label>
                        </div>
                     </div>
                  </form>
               </div>
            </div>
            <div class="modal-footer">
               <button type="submit" class="btn btn-success">Ok</button>
               <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
            </div>
         </div>
      </div>
   </div>
   <!-- End of Generate Report Modal  -->
   <!-- Generate Report Modal  -->
   <div class="modal fade centered-modal" id="genrep" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
      data-backdrop="static">
      <div class="modal-dialog modal-md">
         <div class="modal-content">
            <div class="modal-header">
               Generate Report:
               <button type="button" class="close" data-dismiss="modal">
                  <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
               </button>
            </div>
            <div class="modal-body">
               <div class="form-horizontal" style="text-align: right;">
                  <form role="form">
                     <!-- Doctors -->
                     <div class="form-group">
                        <div class="col-sm-5">
                           <label for="message-text" class="control-label">Doctor:</label>
                        </div>
                        <div class="col-sm-5">
                           <select class="form-control" name="diagnosis">
                              <option selected="selected" disabled="disabled">Doctor</option>
                              <option value="Dr. Mesina">Dr. Mesina</option>
                           </select>
                        </div>
                     </div>
                     <!-- End of Doctors -->
                     <!-- From Date  -->
                     <div class="form-group">
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">From:</label>
                        </div>
                        <div class="col-sm-3">
                           <select class="form-control" name="diagnosis">
                              <option selected="selected" disabled="disabled">Month</option>
                              <option value="January">January</option>
                              <option value="February">February</option>
                              <option value="March">March</option>
                              <option value="April">April</option>
                              <option value="May">May</option>
                              <option value="June">June</option>
                              <option value="July">July</option>
                              <option value="August">August</option>
                              <option value="September">September</option>
                              <option value="October">October</option>
                              <option value="November">November</option>
                              <option value="December">December</option>
                           </select>
                        </div>
                        <div class="col-sm-3">
                           <select class="form-control" name="diagnosis">
                              <option selected="selected" disabled="disabled">Day</option>
                              <option value="1">1</option>
                              <option value="2">2</option>
                              <option value="3">3</option>
                              <option value="4">4</option>
                              <option value="5">5</option>
                              <option value="6">6</option>
                              <option value="7">7</option>
                              <option value="8">8</option>
                              <option value="9">9</option>
                              <option value="10">10</option>
                              <option value="11">11</option>
                              <option value="12">12</option>
                              <option value="13">13</option>
                              <option value="14">14</option>
                              <option value="15">15</option>
                              <option value="16">16</option>
                              <option value="17">17</option>
                              <option value="18">18</option>
                              <option value="19">19</option>
                              <option value="20">20</option>
                              <option value="21">21</option>
                              <option value="22">22</option>
                              <option value="23">23</option>
                              <option value="24">24</option>
                              <option value="25">25</option>
                              <option value="26">26</option>
                              <option value="27">27</option>
                              <option value="28">28</option>
                              <option value="29">29</option>
                              <option value="30">30</option>
                              <option value="31">31</option>
                           </select>
                        </div>
                        <div class="col-sm-3">
                           <select class="form-control" name="diagnosis">
                              <option selected="selected" disabled="disabled">Year</option>
                              <option value="2018">2018</option>
                           </select>
                        </div>
                     </div>
                     <!-- End of From Date  -->
                     <!-- To Date  -->
                     <div class="form-group">
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">To:</label>
                        </div>
                        <div class="col-sm-3">
                           <select class="form-control" name="diagnosis">
                              <option selected="selected" disabled="disabled">Month</option>
                              <option value="January">January</option>
                              <option value="February">February</option>
                              <option value="March">March</option>
                              <option value="April">April</option>
                              <option value="May">May</option>
                              <option value="June">June</option>
                              <option value="July">July</option>
                              <option value="August">August</option>
                              <option value="September">September</option>
                              <option value="October">October</option>
                              <option value="November">November</option>
                              <option value="December">December</option>
                           </select>
                        </div>
                        <div class="col-sm-3">
                           <select class="form-control" name="diagnosis">
                              <option selected="selected" disabled="disabled">Day</option>
                              <option value="1">1</option>
                              <option value="2">2</option>
                              <option value="3">3</option>
                              <option value="4">4</option>
                              <option value="5">5</option>
                              <option value="6">6</option>
                              <option value="7">7</option>
                              <option value="8">8</option>
                              <option value="9">9</option>
                              <option value="10">10</option>
                              <option value="11">11</option>
                              <option value="12">12</option>
                              <option value="13">13</option>
                              <option value="14">14</option>
                              <option value="15">15</option>
                              <option value="16">16</option>
                              <option value="17">17</option>
                              <option value="18">18</option>
                              <option value="19">19</option>
                              <option value="20">20</option>
                              <option value="21">21</option>
                              <option value="22">22</option>
                              <option value="23">23</option>
                              <option value="24">24</option>
                              <option value="25">25</option>
                              <option value="26">26</option>
                              <option value="27">27</option>
                              <option value="28">28</option>
                              <option value="29">29</option>
                              <option value="30">30</option>
                              <option value="31">31</option>
                           </select>
                        </div>
                        <div class="col-sm-3">
                           <select class="form-control" name="diagnosis">
                              <option selected="selected" disabled="disabled">Year</option>
                              <option value="2018">2018</option>
                           </select>
                        </div>
                     </div>
                     <!-- End of To Date  -->
                  </form>
               </div>
            </div>
            <div class="modal-footer">
               <button type="submit" onclick="printDiv()" class="btn btn-success">Ok</button>
               <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
            </div>
         </div>
      </div>
   </div>
   <!-- End of Generate Report Modal  -->
   <!-- Patient Statistics Modal  -->
   <div class="modal fade centered-modal" id="patstats" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
      data-backdrop="static">
      <div class="modal-dialog modal-sm">
         <div class="modal-content">
            <div class="modal-header">
               Patient Statistics:
               <button type="button" class="close" data-dismiss="modal">
                  <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
               </button>
            </div>
            <div class="modal-body">
               <div class="row">
                  <div class="col-md-12">
                     <canvas id="aapnhmdsChart" width="400" height="400"></canvas>
                  </div>
               </div>
               <script>
																var ctx = document.getElementById("aapnhmdsChart").getContext('2d');
																var aapnhmdsChart = new Chart(ctx, {
																	type : 'line',
																	data : {
																		labels : [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
																				"Sept", "Oct", "Nov", "Dec" ],
																		datasets : [ {
																			label : 'Baseline | Follow Up',
																			data : [ 12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3 ],
																			backgroundColor : [ 'rgba(255, 99, 132, 0.2)',
																					'rgba(54, 162, 235, 0.2)', 'rgba(255, 206, 86, 0.2)',
																					'rgba(75, 192, 192, 0.2)', 'rgba(153, 102, 255, 0.2)',
																					'rgba(255, 159, 64, 0.2)', 'rgba(255, 99, 132, 0.2)',
																					'rgba(54, 162, 235, 0.2)', 'rgba(255, 206, 86, 0.2)',
																					'rgba(75, 192, 192, 0.2)', 'rgba(153, 102, 255, 0.2)',
																					'rgba(255, 159, 64, 0.2)' ],
																			borderColor : [ 'rgba(255,99,132,1)', 'rgba(54, 162, 235, 1)',
																					'rgba(255, 206, 86, 1)', 'rgba(75, 192, 192, 1)',
																					'rgba(153, 102, 255, 1)', 'rgba(255, 159, 64, 1)',
																					'rgba(255,99,132,1)', 'rgba(54, 162, 235, 1)',
																					'rgba(255, 206, 86, 1)', 'rgba(75, 192, 192, 1)',
																					'rgba(153, 102, 255, 1)', 'rgba(255, 159, 64, 1)' ],
																			borderWidth : 1
																		} ]
																	},
																	options : {
																		scales : {
																			yAxes : [ {
																				ticks : {
																					beginAtZero : true
																				}
																			} ]
																		}
																	}
																});
															</script>
               <br> Hematologic Malignancy: High Concominany Medications: Medium Chemotherapy Medications: Low
            </div>
            <div class="modal-footer">
               <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
            </div>
         </div>
      </div>
   </div>
   <!-- End of Patient Statistics Modal  -->
   <!-- End of Main Container -->
   <script src="js/JsBarcode.barcodePrint.js"></script>
   <script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
   <script src="js/disease.plasmacell-baseline.js"></script>
</body>
</html>