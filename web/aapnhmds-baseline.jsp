<%-- <jsp:useBean id="aapnhmdsPatientsList" type="java.sql.ResultSet" scope="request"/> --%>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<!DOCTYPE html>
<html>
<head>
<title>USTH | AA PNH MDS Baseline</title>
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
                  <li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
                  <li class="active"><a href="aapnhmds-baseline.jsp">AA PNH MDS</a></li>
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
                        <li><a style="font-weight: bold;" onclick="logout()"><i class="fas fa-sign-out-alt dropdown-icons--margin"></i>
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
            <!-- Forms Container -->
            <form action="" method="post" id="AAPNHMDSBaseline">
               <div class="col-md-12">
                  <div class="col-md-12 forms">
                     <!-- Buttons Container -->
                     <div class="row button-container buttons__firsthalf--position ">
                        <div class="col-sm-6 buttons__firsthalf-position ">
                           <a href="aapnhmds-baseline.jsp" type="button" class="btn bg-yellow button-border" id="baselineBtn">Baseline</a> <a
                              href="aapnhmds-followup.jsp" type="button" class="btn bg-yellow button-border" id="followUpBtn">Follow Up</a>
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
                                    <!-- Barcode Pop-Up -->
                                    <div class="form-group">
                                       <div class="col-sm-1">
                                          <a id="" data-toggle="modal" data-target="#patientBarcode_popup" href="#"> <img
                                             alt="Barcode Icon" src="images/barcode.png"
                                             class="form__barcodeicon--size body__barcodebtn--style">
                                          </a>
                                       </div>
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
                                          <input type="text" class="form-control" name="patientIDNumber" disabled>
                                       </div>
                                    </div>
                                    <!-- Last Name -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">Last Name</label>
                                       <div class="col-sm-7">
                                          <input type="text" class="form-control" name="lastName" required id="lastName">
                                          <span id="invalidName"></span>
                                       </div>
                                    </div>
                                    <!-- First Name -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">First Name</label>
                                       <div class="col-sm-7">
                                          <input type="text" class="form-control" name="firstName" required id="firstName">
                                       </div>
                                       <span id="invalidName"></span>
                                    </div>
                                    <!-- Middle Initial -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">Middle Initial</label>
                                       <div class="col-sm-7">
                                          <input type="text" class="form-control" name="middleInitial" id="middleInitial">
                                       </div>
                                       <span id="invalidName"></span>
                                    </div>
                                    <!-- Gender -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">Gender</label>
                                       <div class="col-sm-7">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="gender" value="1" Required="Required">
                                                Male
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="gender" value="2">
                                                Female
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
                                          <input required type="date" class="form-control" name="dateOfEntry">
                                       </div>
                                    </div>
                                    <!-- Tissue Specimen Collected -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-5">Tissue Specimen Collected</label>
                                       <div class="col-sm-7">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="tissueSpecimenCollected" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="tissueSpecimenCollected" value="0">
                                                No
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
                        <!-- End of General -->
                        <!-- CLT -->
                        <div class="col-md-7">
                           <!-- CLT Navtabs-->
                           <ul class="nav nav-tabs">
                              <li class="active"><a data-toggle="tab" href="#clinical">Clinical</a></li>
                              <li><a data-toggle="tab" href="#laboratory">Laboratory</a></li>
                              <li><a data-toggle="tab" href="#therapy">Therapy and Response</a></li>
                           </ul>
                           <!-- End of CLT Navtabs -->
                           <!-- CLT Tab Content -->
                           <div class="tab-content tab-content__border">
                              <!-- Clinical -->
                              <div id="clinical" class="tab-pane fade in active">
                                 <!-- Form -->
                                 <div class="form-horizontal">
                                    <!-- Date of Visit -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Date of Visit</label>
                                       <div class="col-sm-8">
                                          <input required type="date" class="form-control" name="dateOfVisit">
                                       </div>
                                    </div>
                                    <!-- Diagnosis -->
                                    <div class="form-group">
                                       <label for="diagnosis" class="control-label col-sm-4">Diagnosis</label>
                                       <div class="col-sm-8">
                                          <select required class="form-control" name="diagnosis">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
                                             <option value="D61.0  Constitutional aplastic anaemia">D61.0 Constitutional aplastic
                                                anaemia</option>
                                             <option value="D61.1  Drug-induced aplastic anaemia">D61.1 Drug-induced aplastic
                                                anaemia</option>
                                             <option value="D61.2  Aplastic anaemia due to other external agents">D61.2 Aplastic
                                                anaemia due to other external agents</option>
                                             <option value="D61.3  Idiopathic aplastic anaemia">D61.3 Idiopathic aplastic anaemia</option>
                                             <option value="D61.8  Other specified aplastic anaemias">D61.8 Other specified
                                                aplastic anaemias</option>
                                             <option value="D61.9  Aplastic anaemia, unspecified">D61.9 Aplastic anaemia,
                                                unspecified</option>
                                             <option value="D46.0  Refractory anaemia without ring sideroblasts, so stated">D46.0
                                                Refractory anaemia without ring sideroblasts, so stated</option>
                                             <option value="D46.1  Refractory anaemia with ring sideroblasts">D46.1 Refractory
                                                anaemia with ring sideroblasts</option>
                                             <option value="D46.2  Refractory anaemia with excess of blasts [RAEB]">D46.2
                                                Refractory anaemia with excess of blasts [RAEB]</option>
                                             <option value="D46.4  Refractory anaemia, unspecified">D46.4 Refractory anaemia,
                                                unspecified</option>
                                             <option value="D46.5  Refractory anaemia with multi-lineage dysplasia">D46.5
                                                Refractory anaemia with multi-lineage dysplasia</option>
                                             <option
                                                value="D46.6  Myelodysplastic syndrome with isolated del(5q) chromosomal abnormality 5 q-minus syndrome">D46.6
                                                Myelodysplastic syndrome with isolated del(5q) chromosomal abnormality 5 q-minus syndrome</option>
                                             <option value="D46.7  Other myelodysplastic syndromes">D46.7 Other myelodysplastic
                                                syndromes</option>
                                             <option value="D59.5  Paroxysmal Nocturnal Hemoglobinuria">D59.5 Paroxysmal Nocturnal
                                                Hemoglobinuria</option>
                                             <option value="D59.6Haemoglobinuria due to haemolysis from other external causes">D59.6Haemoglobinuria
                                                due to haemolysis from other external causes</option>
                                          </select>
                                       </div>
                                    </div>
                                    <!-- Severity -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Classification/Risk Statification</label>
                                       <div class="col-sm-8">
                                          <select required class="form-control" name="severity">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
                                             <option value="AA Moderately Severe">AA Moderately Severe</option>
                                             <option value="AA Severe">AA Severe</option>
                                             <option value="AA Very Severe">AA Very Severe</option>
                                             <option value="MDS Very Low">MDS Very Low</option>
                                             <option value="MDS Low<">MDS Low</option>
                                             <option value="MDS Intermediate">MDS Intermediate</option>
                                             <option value="MDS High">MDS High</option>
                                             <option value="MDS Very High">MDS Very High</option>
                                          </select>
                                       </div>
                                    </div>
                                    <!-- Chief Complaint -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Chief Complaint</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="chiefComplaint">
                                       </div>
                                    </div>
                                    <!-- Other Symptoms -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Other Symptoms</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="otherSymptoms">
                                       </div>
                                    </div>
                                    <!-- Family History of Cancer -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Family History of Cancer</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="familyHistoryOfCancer" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="familyHistoryOfCancer" value="0">
                                                No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Relationship to Patient -->
                                    <div class="form-group" id="relationshipToPatient" style="display: none;">
                                       <label class="control-label col-sm-4">Relationship to Patient</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="relationshipToPatient">
                                       </div>
                                    </div>
                                    <!-- Specify Cancer-->
                                    <div class="form-group" id="specifyCancer" style="display: none;">
                                       <label class="control-label col-sm-4">Specify Cancer</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="specifyCancer">
                                       </div>
                                    </div>
                                    <!-- Other Diseases in the Family -->
                                    <div class="form-group" id="otherDiseasesInTheFamily" style="display: none;">
                                       <label class="control-label col-sm-4">Other Diseases in the Family</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="otherDiseasesInTheFamily">
                                       </div>
                                    </div>
                                    <!-- Comorbidities -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Comorbidities</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="comorbidities">
                                       </div>
                                    </div>
                                    <!-- Concomitant Medications -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Current/Past Medications</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="concomitantMedications" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="concomitantMedications" value="0">
                                                No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Concomitant Medications Dynamic Tabs -->
                                    <div class="form-group" id="concomitantMedications" style="display: none;">
                                       <div class="row">
                                          <div class="col-sm-4"></div>
                                          <label class="control-label col-sm-3" style="text-align: left;">Generic Name</label>
                                          <label class="control-label col-sm-2" style="text-align: left;">Dose</label>
                                          <label class="control-label col-sm-2" style="text-align: left;">Frequency</label>
                                       </div>
                                       <div class="row">
                                          <div class="col-sm-4"></div>
                                          <div class="col-sm-3" id="genericName" style="display: none;">
                                             <input type="text" class="form-control" name="genericName">
                                          </div>
                                          <div class="col-sm-2" id="dose" style="display: none;">
                                             <input type="text" class="form-control" name="dose">
                                          </div>
                                          <div class="col-sm-2" id="frequency" style="display: none;">
                                             <input type="text" class="form-control" name="frequency">
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Smoking History -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Smoking History</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="smokingHistory" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="smokingHistory" value="0">
                                                No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="smokingHistorySpecify" style="display: none;">
                                       <label class="control-label col-sm-4">Specify:</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="smokingHistorySpecify">
                                       </div>
                                    </div>
                                    <!-- Alcohol Intake History -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Alcohol intake history </label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="alcoholIntakeHistory" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="alcoholIntakeHistory" value="0">
                                                No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="alcoholIntakeSpecify" style="display: none;">
                                       <label class="control-label col-sm-4">Specify</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="alcoholIntakeSpecify" />
                                       </div>
                                    </div>
                                    <!-- Chemical Exposure -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Chemical exposure</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="chemicalExposureHistory" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="chemicalExposureHistory" value="0">
                                                No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="chemicalExposureSpecify" style="display: none;">
                                       <label class="control-label col-sm-4">Specify</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="chemicalExposureSpecify" />
                                       </div>
                                    </div>
                                    <!-- Previous Infection -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Previous Infection</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="previousInfection" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="previousInfection" value="0">
                                                No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="previousInfectionSpecify" style="display: none;">
                                       <label class="control-label col-sm-4">Specify</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="previousInfectionSpecify" />
                                       </div>
                                    </div>
                                    <!-- Previous Hematologic Disorder -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Previous Hematologic Disorder</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="previousHematologicDisorder" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="previousHematologicDisorder" value="0">
                                                No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="previousHematologicDisorderSpecify" style="display: none;">
                                       <label class="control-label col-sm-4">Specify</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="previousHematologicDisorderSpecify" />
                                       </div>
                                    </div>
                                    <br />
                                    <!-- Physical Exam -->
                                    <h3 class="text-center">
                                       <label class="control-label">Physical Exam</label>
                                    </h3>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Height</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="height" />
                                       </div>
                                    </div>
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
                                       <label class="control-label col-sm-4">Other findings</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="otherFindings" />
                                       </div>
                                    </div>
                                    <!-- End of form -->
                                 </div>
                              </div>
                              <!-- End of Clinical -->
                              <!-- Laboratory -->
                              <div id="laboratory" class="tab-pane fade">
                                 <!-- Form -->
                                 <div class="form-horizontal">
                                    <!-- Date of Blood Collection -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Date of blood collection</label>
                                       <div class="col-lg-8">
                                          <input required type="date" class="form-control" name="dateOfBloodCollection" />
                                       </div>
                                    </div>
                                    <br />
                                    <!-- Hematology -->
                                    <h3 class="text-center">
                                       <label class="control-label">Hematology</label>
                                    </h3>
                                    <!-- Labels -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Laboratory Parameter</label>
                                       <label class="col-sm-4" style="text-align: left;">Result</label>
                                       <div class="col-sm-4">
                                          <input type="checkbox">
                                          <label>Not done</label>
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
                                    <!-- End of Fields -->
                                    <!-- Other Lab -->
                                    <h3 class="text-center">
                                       <label class="control-label">Other Laboratories</label>
                                    </h3>
                                    <!-- Labels -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Laboratory Parameter</label>
                                       <label class="col-lg-4" style="text-align: left;">Result</label>
                                       <div class="col-lg-4">
                                          <input type="checkbox">
                                          <label>Not done</label>
                                       </div>
                                    </div>
                                    <!-- End of labels -->
                                    <!-- Fields -->
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
                                       <label class="control-label col-sm-4">Reticulocyte Count</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="reticulocyteCount" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Serum iron</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="serumIron" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Iron-binding capacity</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="ironBindingCapacity" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Serum Ferritin</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="serumFerritin" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Direct antiglobulin (Coombs) test (+/++/+++/-)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="directAntiglobulin" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Indirect antiglobulin (Coombs) test(+/++/+++/-)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="indirectAntiglobulin" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">SGOT (U/L)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="sgot" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">SGPT (U/L)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="sgpt" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">LDH (U/L)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="ldh" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Screening tests for hepatitis viruses A, B, and C (+/-)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="screeningTestsForHepatitisVirusesABC" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Screening tests for EBV, cytomegalovirus (CMV), and HIV
                                          (+/-)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="screeningTestsForEBVCMVHIV" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Erythropoeitin level</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="erythropoeitinLevel" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Serum folic acid</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="serumFolicAcid" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Serum B12</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="serumB12" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">TSH</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="tsh" />
                                       </div>
                                    </div>
                                    <!-- End of fields -->
                                    <br />
                                    <!-- Bone Marrow  -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Bone Marrow Aspirate and Biopsy result</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="boneMarrowAspirate" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="boneMarrowAspirate" value="0">
                                                No
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
                                    <!-- Flow cytometry -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Flow Cytometry</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="flowCytometry" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="flowCytometry" value="0">
                                                No / Not Applicable
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="flowCytometryResult" style="display: none;">
                                       <label class="control-label col-lg-4">Result</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="flowCytometryResult" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="flowCytometryAttachScannedDocument" style="display: none;">
                                       <label class="control-label col-lg-4">Attach scanned document</label>
                                       <div class="col-sm-8">
                                          <input type="file" class="form-control" name="flowCytometryAttachScannedDocument" />
                                       </div>
                                    </div>
                                    <!-- Cytogenetic and Molecular Analysis if for Aplastic Anemia and PNH -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Cytogenetic and Molecular Analysis if for Aplastic
                                          Anemia and PNH</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="cytogeneticAndMolecularAnalysisAAPNH" value="1"
                                                   Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="cytogeneticAndMolecularAnalysisAAPNH" value="0">
                                                Not Done
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="cytogeneticAndMolecularAnalysisAAPNHResult" style="display: none;">
                                       <label class="control-label col-lg-4">Result</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="cytogeneticAndMolecularAnalysisAAPNHResult" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument"
                                       style="display: none;">
                                       <label class="control-label col-lg-4">Attach scanned document</label>
                                       <div class="col-sm-8">
                                          <input type="file" class="form-control"
                                             name="cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument" />
                                       </div>
                                    </div>
                                    <!-- Cytogenetic and Molecular Analysis if for MDS -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Cytogenetic and Molecular Analysis if for MDS</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="cytogeneticAndMolecularAnalysisMDS" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="cytogeneticAndMolecularAnalysisMDS" value="0">
                                                Not Done
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="cytogeneticAndMolecularAnalysisMDSResult" style="display: none;">
                                       <label class="control-label col-lg-4">Result</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="cytogeneticAndMolecularAnalysisMDSResult" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="cytogeneticAndMolecularAnalysisMDSAttachScannedDocument"
                                       style="display: none;">
                                       <label class="control-label col-lg-4">Attach scanned document</label>
                                       <div class="col-sm-8">
                                          <input type="file" class="form-control"
                                             name="cytogeneticAndMolecularAnalysisMDSAttachScannedDocument" />
                                       </div>
                                    </div>
                                 </div>
                                 <!-- end of form -->
                              </div>
                              <!-- End of Laboratory -->
                              <!-- Therapy -->
                              <div id="therapy" class="tab-pane fade">
                                 <!-- Form -->
                                 <div class="form-horizontal">
                                    <!-- Transplant Candidate -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Transplant Candidate</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="transplantCandidate" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label>
                                                <input type="radio" name="transplantCandidate" value="0">
                                                No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Treatment -->
                                    <div class="form-group" id="modeOfTreatment" style="display: none;">
                                       <label for="severity" class="control-label col-sm-4">Mode of Treatment</label>
                                       <div class="col-sm-8">
                                          <select required class="form-control" name="modeOfTreatment">
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
                                    <div class="form-group" id="medications" style="display: none;">
                                       <label class="control-label col-lg-4">Medications</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="medications" />
                                       </div>
                                    </div>
                                    <!-- Date Started -->
                                    <div class="form-group" id="dateStarted" style="display: none;">
                                       <label class="control-label col-sm-4">Date Started</label>
                                       <div class="col-lg-8">
                                          <input required type="date" class="form-control" name="dateStarted" />
                                       </div>
                                    </div>
                                 </div>
                                 <!-- End of Form -->
                              </div>
                              <!-- End of Therapy -->
                           </div>
                           <!-- End of CLT Tab Content -->
                           <input type="submit" class="btn bg-yellow col-sm-4 pull-right button-border" id='submitQuery'>
                           <input type="button" class="btn bg-yellow col-sm-4 pull-right button-border" id='submitCancel' value='Cancel'
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
                     <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
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
                           <select class="form-control" name="diseaseType">
                              <option selected="selected" disabled="disabled">Select</option>
                              <option value="All">All</option>
                              <option value="AA, PNH, MDS">AA, PNH, MDS</option>
                              <option value="Coagulation">Coagulation</option>
                              <option value="Leukemia">Leukemia</option>
                              <option value="Lymphoma">Lymphoma</option>
                              <option value="Plasma Cell Disorders">Plasma Cell Disorders</option>
                              <option value="Platelets Disorders">Platelets Disorders</option>
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
                           <input type="checkbox" name="ageGR" value="ageGR">
                           <label class="genrepmodal__checkboxes">Age</label>
                           <input type="checkbox" name="genderGR" value="genderGR">
                           <label class="genrepmodal__checkboxes">Gender</label>
                           <input type="checkbox" name="modeOfTreatmentGR" value="modeOfTreatmentGR">
                           <label class="genrepmodal__checkboxes">Mode of Treatment</label>
                           <input type="checkbox" name="dsBaselineGR" value="dsBaselineGR">
                           <label class="genrepmodal__checkboxes">Disease Status Baseline</label>
                           <input type="checkbox" name="dsFollowupGR" value="dsFollowupGR">
                           <label class="genrepmodal__checkboxes">Disease Status Follow-up</label>
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
                              <label>
                                 <input type="radio" name="paperLayout" value="portrait" Required="Required">
                                 Portrait
                              </label>
                           </div>
                           <div class="radio">
                              <label>
                                 <input type="radio" name="paperLayout" value="landscape">
                                 Landscape
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
                     <!-- <form role="form"> -->
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
                     <!-- </form> -->
                  </div>
               </div>
               <div class="modal-footer">
                  <button type="submit" onclick="printDiv()" class="btn btn-success">Ok</button>
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
   <script src="js/disease.aapnhmds-baseline.js"></script>
   <script src="js/inactivity.js"></script>
   <script src="js/logout.js"></script>
</body>
</html>