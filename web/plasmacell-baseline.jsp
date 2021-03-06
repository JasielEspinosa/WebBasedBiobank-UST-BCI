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
<link rel="icon" href="images/logo_usth.png">
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
<link rel="stylesheet" href="css/jBox.css">
<link rel="stylesheet" href="css/TooltipDark.css">
<link rel="stylesheet" href="css/grids-responsive-min.css">
<link rel="stylesheet" href="fontawesome-free-5.0.8/web-fonts-with-css/css/fontawesome-all.min.css">
<link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">
<!-- JS -->
<script src="js/utils.js"></script>
<script src="js/genrep.js"></script>
<script src="js/sidebar.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/jquery.min-2.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/sidebar.js"></script>
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
<script src="js/loadEditingFields.js" type="text/javascript"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>
<script defer src="js/fontawesome-all.js"></script>
<script src="js/normalrangeplasma.js"></script>
<script src="js/rangetooltip.js"></script>
<script src="js/jBox.js"></script>
<!-- <script src="js/jquery.min.js"></script>  -->
<!-- <script src="js/bootstrap.js"></script>  -->
</head>
<body>
   <!-- Header -->
   <div class="navbar-fixed-top">
      <!-- Banner -->
      <div class="row header bg-navyblue">
         <div class="col-sm-1">
            <img src="images/logo_bcihema.png" class="header__logo--size header__logo--position">
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
                     aria-expanded="false"> <i class="fa fa-cog fa-lg" aria-hidden="true"></i> <span class="caret"></span>
                  </a>
                     <ul class="dropdown-menu dropdown-menu__text" role="menu">
                        <li class="role2"><a style="font-weight: bold;" href="audittrail.jsp"> <i class="fas fa-file-alt dropdown-icons--margin"></i>
                              Audit Trail
                        </a></li>
                        <li class="divider role2" style="background-color: #000000;"></li>
                        <li><a style="font-weight: bold;" href="profile.jsp"> <i class="fas fa-user-md dropdown-icons--margin"></i>
                              Profile
                        </a></li>
                        <li class="divider role2" style="background-color: #000000;"></li>
                        <li class="role2"><a style="font-weight: bold;" href="usermanagement.jsp"> <i
                              class="fas fa-wrench dropdown-icons--margin"></i> Settings
                        </a></li>
                        <li class="divider role2" style="background-color: #000000;"></li>
                        <li><a style="font-weight: bold;" onclick="logout()"> <i class="fas fa-sign-out-alt dropdown-icons--margin"></i>
                              Logout
                        </a></li>
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
                  <a href="plasmacell-baseline.jsp">
                     <button id="addPatient" type="button" class="btn bg-yellow sidebar__addptngenrep--border" data-toggle="modal"
                        data-target="#usermanagement__popup" data-whatever="@mdo">Add Patient</button>
                  </a>
               </div>
            </div>
            <!-- End of Add Patient Button -->
            <!-- Generate Report Button -->
            <div class="row role2">
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
            <!-- Forms Container -->
            <form action="" method="post" id="PlasmaCellBaseline">
               <div class="col-md-12">
                  <div class="col-md-12 forms">
                     <!-- Buttons Container -->
                     <div class="row button-container buttons__firsthalf--position" id="button-container">
                        <div class="col-sm-6 buttons__firsthalf-position">
                           <a href="plasmacell-baseline.jsp" type="button" class="btn bg-yellow button-border baselinenbtn-text"
                              id="baselineBtn"> <span>Baseline</span>
                           </a> <a href="plasmacell-followup.jsp" type="button" class="btn bg-yellow button-border followupnbtn-text"
                              id="followUpBtn"> <span>FollowUp</span>
                           </a>
                        </div>
                        <div class="col-sm-6 text-right btn-toolbar">
                           <a href="#" type="button" class="btn bg-yellow button-border patstatsbtn-text secondhalfbtns-position"
                              id="patientStatistics" data-target="#patstats" data-toggle="modal"> <span>Patient Statistics</span>
                           </a> <a href="#" type="button" class="btn bg-yellow button-border editfollowupbtn-text secondhalfbtns-position"
                              id="editPatientBtn"> <span>Edit Patient</span>
                           </a> <a href="#" type="button" class="btn bg-yellow button-border deletefollowup-text secondhalfbtns-position"
                              id="archPatientBtn"> <span>Delete Patient</span>
                           </a>
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
                                                      <span aria-hidden="true">&times;</span> <span class="sr-only">Close</span>
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
                                          <input type="text" class="form-control" name="patientIDNumberDisplay" readonly>
                                       </div>
                                       <div class="col-sm-7">
                                          <input type="text" class="form-control" name="patientIDNumber" readonly hidden="hidden">
                                       </div>
                                    </div>
                                    <!-- Last Name -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">Last Name</label>
                                       <div class="col-sm-7">
                                          <input type="text" class="form-control" name="lastName" required>
                                       </div>
                                    </div>
                                    <!-- First Name -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">First Name</label>
                                       <div class="col-sm-7">
                                          <input type="text" class="form-control" name="firstName" required>
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
                                             <label> <input type="radio" name="gender" value="1" Required="Required"> Male
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="gender" value="2"> Female
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- DOB -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">Date of Birth</label>
                                       <div class="col-sm-7">
                                          <input required type="date" class="form-control" name="dateOfBirth">
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">Age</label>
                                       <div class="col-sm-7">
                                          <input type="text" class="form-control" id='age' readonly="readonly">
                                       </div>
                                    </div>
                                    <!-- Address -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">Address</label>
                                       <div class="col-sm-7">
                                          <input type="text" class="form-control" name="address" placeholder="Line 1, Line 2, Line 3">
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
                                          <input required type="date" class="form-control" name="dateOfEntry">
                                       </div>
                                    </div>
                                    <!-- Tissue Specimen Collected -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">Tissue Specimen Collected</label>
                                       <div class="col-sm-7">
                                          <div class="radio">
                                             <label> <input type="radio" name="tissueSpecimenCollected" value="1"
                                                Required="Required"> Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="tissueSpecimenCollected" value="0"> No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Specimen Type -->
                                    <div class="form-group" id="specimenType" style="display: none;">
                                       <label class="control-label col-sm-5">Specimen Type</label>
                                       <div class="col-sm-7">
                                          <select required class="form-control" name="specimenType">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
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
                                          <input required type="date" class="form-control" name="dateOfInitialDiagnosis">
                                       </div>
                                    </div>
                                    <!-- Diagnosis -->
                                    <div class="form-group">
                                       <label for="diagnosis" class="control-label col-sm-3">Diagnosis</label>
                                       <div class="col-sm-9">
                                          <select required class="form-control" name="diagnosis">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
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
                                          <select required class="form-control" name="issStaging">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
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
                                          <select required class="form-control" name="constitutionalSymptoms">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
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
                                          <textarea rows="4" class="form-control" name="otherSymptoms"></textarea>
                                       </div>
                                    </div>
                                    <!-- Family History of Cancer -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-3">Family History of Cancer</label>
                                       <div class="col-sm-9">
                                          <div class="radio">
                                             <label> <input type="radio" name="familyHistoryOfCancer" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="familyHistoryOfCancer" value="0"> No
                                             </label>
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
                                          <textarea rows="4" class="form-control" name="otherDiseasesInTheFamily"></textarea>
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
                                             <label> <input type="radio" name="concomitantMedications" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="concomitantMedications" value="0"> No
                                             </label>
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
                                             <input type="number" Required="required" step=".1" min="0"
                                                onfocusout="setThreeNumberDecimal(this)" class="form-control" name="dose">
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
                                             <label> <input type="radio" name="smokingHistory" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="smokingHistory" value="0"> No
                                             </label>
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
                                             <label> <input type="radio" name="alcoholIntakeHistory" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="alcoholIntakeHistory" value="0"> No
                                             </label>
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
                                             <label> <input type="radio" name="chemicalExposureHistory" value="1"
                                                Required="Required"> Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="chemicalExposureHistory" value="0"> No
                                             </label>
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
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="height" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-lg-3">Weight</label>
                                       <div class="col-sm-9">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="weight" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-lg-3">ECOG</label>
                                       <div class="col-sm-9">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="ecog" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-lg-3">Other pertinent findings</label>
                                       <div class="col-sm-9">
                                          <textarea rows="4" class="form-control" name="otherFindings"></textarea>
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
                                          <input required type="date" class="form-control" name="dateOfBloodCollection" />
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
                                    <!-- Fields -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Hemoglobin (g/L)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="hemoglobin" id="hemoglobin" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Hemoglobin Value ( g/L ): <br/> Male: 138 - 172 <br/> Female: 121 - 151
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="hemoglobinStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Hematocrit (%)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="hematocrit" id="hematocrit" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Hematocrit Value ( g/L ): <br/> Male: 40 - 54 <br/> Female: 36 - 48
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="hematocritStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">White blood cells (x10 ^9/L)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="whiteBloodCells"
                                             id="whiteBloodCells" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal White Blood Cell Value ( x 10^9/L ): <br/> Male: 4.0 - 11.0 <br/> Female: 4.0 - 11.0
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="whiteBloodCellsStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Neutrophils (%)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="neutrophils"
                                             id="neutrophils" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Neutrophils Value ( % ): <br/> Male: 45 - 80 <br/> Female: 45 - 80
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="neutrophilsStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Lymphocytes (%)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="lymphocytes"
                                             id="lymphocytes" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Lymphocytes Value ( % ): <br/> Male: 20 - 40 <br/> Female: 20 - 40
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="lymphocytesStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Monocytes (%)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="monocytes" id="monocytes" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Monocytes Value ( % ): <br/> Male: 2 - 10 <br/> Female: 2 - 10
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="monocytesStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Eosinophils (%)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="eosinophils"
                                             id="eosinophils" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Eosinophils Value ( % ): <br/> Male: 1 - 6 <br/> Female: 1 - 6
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="eosinophilsStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Basophils (%)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="basophils" id="basophils" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Basophils Value ( % ): <br/> Male: 0 - 2 <br/> Female: 0 - 2
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="basophilsStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Myelocytes (%)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="myelocytes" id="myelocytes" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Myelocytes Value ( % ): <br/> Male: 0 <br/> Female: 0
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="myelocytesStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Metamyelocytes (%)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="metamyelocytes"
                                             id="metamyelocytes" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Metamyelocytes Value ( % ): <br/> Male: 0 <br/> Female: 0
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="metamyelocytesStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Blasts (%)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="blasts" id="blasts" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Blasts Value ( % ): <br/> Male: 0 <br/> Female: 0
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="blastsStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Platelet count (x 10^9/L)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="plateletCount"
                                             id="plateletCount" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Platelet Count Value ( x 10^9/L ): <br/> Male: 150 - 400 <br/> Female: 150 - 400
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="plateletCountStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <!-- End of Fields -->
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
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="bun" id="bun" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal BUN Value: <br/> Male: 7 - 20 <br/> Female: 7-20
                                        <br /><br /> Reference: www.mercynorthiowa.com/cbc-normal-ranges">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="bunStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Creatinine (mg/dl)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="creatinine" id="creatinine" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Creatinine Value ( mg/dl ): <br/> Male: 0.6 - 1.2 <br/> Female: 0.5 - 1.1
                                        <br /><br /> Reference: www.medicinenet.com/creatinine_blood_test_/article.htm">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="creatinineStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Uric acid mg/dl</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="uricAcid" id="uricAcid" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Uric Acid Value ( mg/dl ): <br/> Male: 3.4 - 7.0 <br/> Female: 2.4 - 6.0
                                        <br /><br /> Reference: www.chemocare.com/chemotherapy/side-effects/hyperuricemia-high-uric-acid.aspx">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="uricAcidStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Ionized calcium (mg/dl)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="iCa" id="ionized" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Ionized Calcium Value ( mg/dl ): <br/> Male: 4.64 - 5.28 <br/> Female: 4.64 - 5.28
                                        <br /><br /> Reference: www.chemocare.com/chemotherapy/side-effects/hyperuricemia-high-uric-acid.aspx">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="ionizedStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Na (meg/L)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="na" id="na" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal NA Value ( meg/l ): <br/> Male: 135 - 145 <br/> Female: 135 - 145
                                        <br /><br /> Reference: https://www.healthline.com/health/sodium-blood">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="naStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">K (mg/dl)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="k" id="k" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal K Value ( me/dl ): <br/> Male: 13.65 - 21.45 <br/> Female: 13.65 - 21.45
                                        <br /><br /> Reference: https://emedicine.medscape.com/article/2172316-overview">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="kStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Total protein</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="totalProtein"
                                             id="totalprotein" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Total Protein Value: <br/> Male: 6 - 8.3 <br/> Female: 6 - 8.3
                                        <br /><br /> Reference: https://emedicine.medscape.com/article/2172316-overview">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="totalproteinStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Albumin</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="albumin" id="albumin" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Albumin Value: <br/> Male: 3.5 - 5.5 <br/> Female: 3.5 - 5.5
                                        <br /><br /> Reference: https://emedicine.medscape.com/article/2172316-overview">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="albuminStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Globulin</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="globulin" id="globulin" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Globulin Value: <br/> Male: 2.0 - 3.5 <br/> Female: 2.0 - 3.5
                                        <br /><br /> Reference: https://emedicine.medscape.com/article/2172316-overview">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="globulinStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Beta Microglobulin</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="beta2Microglobulin"
                                             id="beta2" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal Beta Microglobulin Value ( u/l ): <br/> Male: 0 - 0.3 <br/> Female: 0 - 0.3 
                                        <br /><br /> Reference: https://www.medicinenet.com/liver_blood_tests/article.htm">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="beta2Status" class="status"></span>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">LDH (U/L)</label>
                                       <div class="col-lg-4">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="ldh" id="ldh" />
                                       </div>
                                       <div class="col-sm-4 status-position">
                                          <span class="tooltipPointer1"
                                             title="Normal LDH Value ( u/l ): <br/> Male: 100 - 190 <br/> Female: 100 - 190 
                                        <br /><br /> Reference: https://www.webmd.com/a-to-z-guides/lactic-acid-dehydrogenase-test#2">
                                             <i class="fas fa-info-circle" style="cursor: pointer;"></i>
                                          </span> <span id="ldhStatus" class="status"></span>
                                       </div>
                                    </div>
                                    <!-- Imaging Studies -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Imaging Studies</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label> <input type="radio" name="imagingStudies" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="imagingStudies" value="0"> No / Not
                                                Applicable
                                             </label>
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
                                             <label> <input type="radio" name="boneMarrowAspirate" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="boneMarrowAspirate" value="0"> No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="boneMarrowAspirateDatePerformed" style="display: none;">
                                       <label class="control-label col-sm-4">Date Performed</label>
                                       <div class="col-lg-8">
                                          <input required type="date" class="form-control" name="boneMarrowAspirateDatePerformed" />
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
                                             <label> <input type="radio" name="serumFreeLightChainAsssay" value="1"
                                                Required="Required"> Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="serumFreeLightChainAsssay" value="0"> No /
                                                Not Applicable
                                             </label>
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
                                             <label> <input type="radio" name="serumProteinElectrophoresis" value="1"
                                                Required="Required"> Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="serumProteinElectrophoresis" value="0"> No /
                                                Not Applicable
                                             </label>
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
                                             <label> <input type="radio" name="serumImmunofixation" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="serumImmunofixation" value="0"> No / Not
                                                Applicable
                                             </label>
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
                                             <label> <input type="radio" name="urineProtein" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="urineProtein" value="0"> No / Not Applicable
                                             </label>
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
                                             <label> <input type="radio" name="cytogeneticAndMolecularAnalysis" value="1"
                                                Required="Required"> Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="cytogeneticAndMolecularAnalysis" value="0">
                                                Not Done
                                             </label>
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
                                             <label> <input type="radio" name="transplantCandidate" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="transplantCandidate" value="0"> No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Treatment -->
                                    <div class="form-group">
                                       <label for="severity" class="control-label col-sm-4">Mode of Treatment</label>
                                       <div class="col-sm-8">
                                          <select required class="form-control" name="treatment">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
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
                                          <textarea rows="4" class="form-control" name="otherRegimens"></textarea>
                                       </div>
                                    </div>
                                    <!-- Regimen/ Protocol (For transplant candidates) -->
                                    <div class="form-group">
                                       <label for="severity" class="control-label col-sm-4">Regimen/Protocol (For transplant
                                          candidates)</label>
                                       <div class="col-sm-8">
                                          <select required class="form-control" name="regimenProtocolTransplant">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
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
                                          <textarea rows="4" class="form-control" name="otherRegimensTransplant"></textarea>
                                       </div>
                                    </div>
                                    <!-- Regimen/ Protocol (For nontransplant candidates) -->
                                    <div class="form-group">
                                       <label for="severity" class="control-label col-sm-4">Regimen/Protocol (For nontransplant
                                          candidates)</label>
                                       <div class="col-sm-8">
                                          <select required class="form-control" name="regimenProtocolNonTransplant">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
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
                                          <textarea rows="4" class="form-control" name="otherRegimensNonTransplant"></textarea>
                                       </div>
                                    </div>
                                    <!-- Maintenance Therapy -->
                                    <div class="form-group">
                                       <label class="control-label col-lg-4">Maintenance Therapy</label>
                                       <div class="col-sm-8">
                                          <select required class="form-control" name="regimenProtocolMaintenanceTherapy">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
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
                                          <textarea rows="4" class="form-control" name="otherRegimensMaintenanceTherapy"></textarea>
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
                                             <label> <input type="radio" name="bisphosphonates" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="bisphosphonates" value="0"> No
                                             </label>
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
                                             <label> <input type="radio" name="radiotherapy" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="radiotherapy" value="0"> No
                                             </label>
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
                                             <label> <input type="radio" name="dialysis" value="1" Required="Required"> Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="dialysis" value="0"> No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Other Medications -->
                                    <div class="form-group" id="otherMedications" style="display: none">
                                       <label class="control-label col-sm-4">Other Medications</label>
                                       <div class="col-lg-8">
                                          <textarea rows="4" class="form-control" name="otherMedications"></textarea>
                                       </div>
                                    </div>
                                    <!-- Date Started -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Date Started</label>
                                       <div class="col-lg-8">
                                          <input required type="date" class="form-control" name="dateStarted" />
                                       </div>
                                    </div>
                                    <!-- Complications -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Complications</label>
                                       <div class="col-lg-8">
                                          <input type="text" class="form-control" name="complications" />
                                       </div>
                                    </div>
                                    <!-- Disease Status -->
                                    <div id="diseaseStatus" class="tab-pane fade in">
                                       <!-- Form -->
                                       <div class="form-horizontal">
                                          <div class="form-group">
                                             <label class="control-label col-lg-4">Disease Status</label>
                                             <div class="col-lg-5">
                                                <select required class="form-control" name="diseaseStatus">
                                                   <option selected="selected" disabled="disabled">Select</option>
                                                   <option value="CR (Complete Remission)">CR (Complete Remission)</option>
                                                   <option value="SCR (Stringent Complete Remission)">SCR (Stringent Complete
                                                      Remission)</option>
                                                   <option value="Immunophenotypic">Immunophenotypic CR</option>
                                                   <option value="Molecular CR">Molecular CR</option>
                                                   <option value="VGPR (Very Good Partial Response)">VGPR (Very Good Partial
                                                      Response)</option>
                                                   <option value="PR (Partial Response)">PR (Partial Response)</option>
                                                   <option value="MR (Minimal Response for relapsed refractory myeloma only)">MR
                                                      (Minimal Response for relapsed refractory myeloma only)</option>
                                                   <option value="SD (Stable Disease)">SD (Stable Disease)</option>
                                                   <option value="PD (Progressive Disease)">PD (Progressive Disease)</option>
                                                   <option value="Relapse">Relapse</option>
                                                   <option value="Others">Others</option>
                                                </select>
                                             </div>
                                          </div>
                                          <div class="form-group" id="relapseDisease" style="display: none;">
                                             <label class="control-label col-lg-4">For Relapse Disease</label>
                                             <div class="col-lg-5">
                                                <select required class="form-control" name="relapseDisease">
                                                   <option selected="selected" disabled="disabled">Select</option>
                                                   <option value="Clinical Relapse">Clinical Relapse</option>
                                                   <option value="Relapse from CR">Relapse from CR</option>
                                                </select>
                                             </div>
                                          </div>
                                          <div class="form-group" id="diseaseStatusOthers" style="display: none;">
                                             <label class="control-label col-lg-4">Others</label>
                                             <div class="col-lg-5">
                                                <textarea rows="4" class="form-control" name="diseaseStatusOthers"></textarea>
                                             </div>
                                          </div>
                                       </div>
                                       <!-- End of form -->
                                    </div>
                                    <!-- End of Disease Status -->
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
   <form role="form" action="GenerateReportServlet" method="post" id="">
      <div class="modal fade centered-modal" id="genrep" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
         data-backdrop="static">
         <div class="modal-dialog modal-lg">
            <div class="modal-content">
               <div class="modal-header">
                  Generate Report:
                  <button type="button" class="close" data-dismiss="modal">
                     <span aria-hidden="true">&times;</span> <span class="sr-only">Close</span>
                  </button>
               </div>
               <div class="modal-body">
                  <div class="form-horizontal" style="text-align: right;">
                     <!-- <form role="form"> -->
                     <!-- From Date  -->
                     <div class="form-group">
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">From:</label>
                        </div>
                        <div class="col-sm-10">
                           <input type="date" class="form-control" name="fromDateGenerateReport" required="Required">
                        </div>
                     </div>
                     <!-- End of From Date -->
                     <!-- To Date  -->
                     <div class="form-group">
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">To:</label>
                        </div>
                        <div class="col-sm-10">
                           <input type="date" class="form-control" name="toDateGenerateReport" required="Required">
                        </div>
                     </div>
                     <!-- End of To Date -->
                     <!-- Diseases -->
                     <div class="form-group">
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">Disease Type:</label>
                        </div>
                        <div class="col-sm-10">
                           <select required class="form-control" name="diseaseType">
                              <option value="" selected="selected" disabled="disabled">Select</option>
                              <option value="All">All</option>
                              <option value="AA, PNH, MDS">AA, PNH, MDS</option>
                              <option value="Coagulation">Coagulation</option>
                              <option value="Leukemia">Leukemia</option>
                              <option value="Lymphoma">Lymphoma</option>
                              <option value="Myeloproliferative Neoplasm">Myeloproliferative Neoplasm</option>
                              <option value="Plasma Cell Disorder">Plasma Cell Disorder</option>
                              <option value="Platelet Disorder">Platelets Disorder</option>
                              <option value="Thalassemia">Thalassemia</option>
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
                           <input type="checkbox" name="ageGR" value="ageGR" checked> <label class="genrepmodal__checkboxes">Age</label>
                           <input type="checkbox" name="genderGR" value="genderGR" checked> <label class="genrepmodal__checkboxes">Gender</label>
                           <input type="checkbox" name="modeOfTreatmentGR" value="modeOfTreatmentGR" checked> <label
                              class="genrepmodal__checkboxes">Mode of Treatment</label> <input type="checkbox" name="dsBaselineGR"
                              value="dsBaselineGR" checked> <label class="genrepmodal__checkboxes">Disease Status Baseline</label> <input
                              type="checkbox" name="dsFollowupGR" value="dsFollowupGR" checked> <label
                              class="genrepmodal__checkboxes">Disease Status Follow-up</label>
                        </div>
                     </div>
                     <!-- Paper Print -->
                     <div class="form-group">
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">Paper Size:</label>
                        </div>
                        <div class="col-sm-3">
                           <select required class="form-control" name="paperSize">
                              <option value="" selected="selected" disabled="disabled">Select</option>
                              <option value="LETTER">Letter</option>
                              <option value="LEGAL">Legal</option>
                              <option value="A4">A4</option>
                           </select>
                        </div>
                        <div class="col-sm-3"></div>
                        <div class="col-sm-2">
                           <label for="message-text" class="control-label">Paper Layout:</label>
                        </div>
                        <div class="col-sm-1">
                           <div class="radio">
                              <label> <input type="radio" name="paperLayout" value="portrait" required="Required"> Portrait
                              </label>
                           </div>
                           <div class="radio">
                              <label> <input type="radio" name="paperLayout" value="landscape"> Landscape
                              </label>
                           </div>
                        </div>
                     </div>
                     <!-- End of Paper Print  -->
                     <!-- </form> -->
                  </div>
               </div>
               <div class="modal-footer">
                  <button type="submit" class="btn btn-success">Ok</button>
                  <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
               </div>
            </div>
         </div>
      </div>
   </form>
   <!-- End of Generate Report Modal  -->
   <!-- Patient Statistics Modal  -->
   <div class="modal fade centered-modal" id="patstats" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
      data-backdrop="static">
      <div class="modal-dialog modal-sm">
         <div class="modal-content">
            <div class="modal-header">
               Patient Statistics:
               <button type="button" class="close" data-dismiss="modal">
                  <span aria-hidden="true">&times;</span> <span class="sr-only">Close</span>
               </button>
            </div>
            <div class="modal-body">
               <div class="row">
                  <h3 style="text-align: center;">
                     <b>Disease Status</b>
                  </h3>
                  <br>
                  <!-- To and From Date  -->
                  <div class="form-group col-md-offset-2">
                     <div class="col-sm-5">
                        <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                           name="fromDateAgeStats">
                     </div>
                     <div class="col-sm-5">
                        <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                           name="toDateAgeStats">
                     </div>
                  </div>
                  <!-- End of To and From Date -->
                  <div class="col-md-10 col-md-offset-1">
                     <canvas id="plasmaBaselinePatStatsChart" width="600" height="500"></canvas>
                  </div>
               </div>
               <script>
																var ctx = document.getElementById("plasmaBaselinePatStatsChart")
																		.getContext('2d');
																var plasmaBaselinePatStatsChart = new Chart(ctx, {
																	type : 'line',
																	data : {
																		xLabels : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug',
																				'Sept', 'Oct', 'Nov', 'Dec' ],
																		yLabels : [ 'CR', 'sCR', 'Immunophenotypic CR', 'Molecular CR',
																				'VGPR', 'PR', 'MR', 'SD', 'PD', 'Clinical Relapse',
																				'Relapse from CR', 'Others' ],
																		datasets : [ {
																			label : 'Plasma Cell Disease Status',
																			backgroundColor : 'rgba(6, 124, 209, 1)',
																			fill : false
																		} ],
																		labels : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug',
																				'Sept', 'Oct', 'Nov', 'Dec' ],
																		borderWidth : 1,
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
      <input type="hidden" id="roleSession" data-value="${sessionScope.role}" />
   <script src="js/user-restrictions.js"></script>
   <script src="js/JsBarcode.barcodePrint.js"></script>
   <script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
   <script src="js/normalrange.js"></script>
   <script src="js/disease.plasmacell-baseline.js"></script>
   <script src="js/inactivity.js"></script>
   <script src="js/logout.js"></script>
   <script src="js/age-compute.js"></script>
</body>
</html>