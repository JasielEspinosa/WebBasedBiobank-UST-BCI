<!DOCTYPE html>
<html>
<head>
<title>USTH | Leukemia Follow Up</title>
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
<script src="js/radio-showhide.js" type="text/javascript"></script>
<script src="js/loadEditingFields.js" type="text/javascript"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>
<script src="js/fontawesome-all.js"></script>
<script src="js/normalrangeleukfu.js"></script>
<script src="js/rangetooltip.js"></script>
<script src="js/jBox.js"></script>
<!-- <script src="js/jquery.min.js"></script>  -->
<!-- <script src="js/bootstrap.js"></script>  -->
</head>
<style>
@font-face {
   font-family: FontAwesome\ 5 Brands;
   font-style: normal;
   font-weight: 400;
   src: url(../webfonts/fa-brands-400.eot);
   src: url(../webfonts/fa-brands-400.eot?#iefix) format("embedded-opentype"), url(../webfonts/fa-brands-400.woff2) format("woff2"),
      url(../webfonts/fa-brands-400.woff) format("woff"), url(../webfonts/fa-brands-400.ttf) format("truetype"),
      url(../webfonts/fa-brands-400.svg#fontawesome) format("svg")
}

.fab {
   font-family: Font Awesome\ 5 Brands
}

@font-face {
   font-family: FontAwesome\ 5 Free;
   font-style: normal;
   font-weight: 400;
   src: url(../webfonts/fa-regular-400.eot);
   src: url(../webfonts/fa-regular-400.eot?#iefix) format("embedded-opentype"), url(../webfonts/fa-regular-400.woff2) format("woff2"),
      url(../webfonts/fa-regular-400.woff) format("woff"), url(../webfonts/fa-regular-400.ttf) format("truetype"),
      url(../webfonts/fa-regular-400.svg#fontawesome) format("svg")
}

.far {
   font-weight: 400
}

@font-face {
   font-family: FontAwesome\ 5 Free;
   font-style: normal;
   font-weight: 900;
   src: url(../webfonts/fa-solid-900.eot);
   src: url(../webfonts/fa-solid-900.eot?#iefix) format("embedded-opentype"), url(../webfonts/fa-solid-900.woff2) format("woff2"),
      url(../webfonts/fa-solid-900.woff) format("woff"), url(../webfonts/fa-solid-900.ttf) format("truetype"),
      url(../webfonts/fa-solid-900.svg#fontawesome) format("svg")
}

.fa, .far, .fas {
   font-family: Font Awesome\ 5 Free
}

.fa, .fas {
   font-weight: 900
}
</style>
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
                  <li class="active"><a href="leukemia-baseline.jsp">Leukemia</a></li>
                  <li><a href="lymphoma-baseline.jsp">Lymphoma</a></li>
                  <li><a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a></li>
                  <li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
                  <li><a href="aapnhmds-baseline.jsp">AA PNH MDS</a></li>
                  <li><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>
                  <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
                  <!-- Dropdown -->
                  <li class="dropdown pull-right"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                     aria-expanded="false"> <i class="fa fa-cog fa-lg" aria-hidden="true"></i> <span class="caret"></span>
                  </a>
                     <ul class="dropdown-menu dropdown-menu__text" role="menu">
                        <li><a style="font-weight: bold;" href="audittrail.jsp"> <i class="fas fa-file-alt dropdown-icons--margin"></i>
                              Audit Trail
                        </a></li>
                        <li class="divider" style="background-color: #000000;"></li>
                        <li><a style="font-weight: bold;" href="profile.jsp"> <i class="fas fa-user-md dropdown-icons--margin"></i>
                              Profile
                        </a></li>
                        <li class="divider" style="background-color: #000000;"></li>
                        <li><a style="font-weight: bold;" href="usermanagement.jsp"> <i
                              class="fas fa-wrench dropdown-icons--margin"></i> Settings
                        </a></li>
                        <li class="divider" style="background-color: #000000;"></li>
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
   <div class="row-offcanvas row-offcanvas-left">
      <!-- Sidebar -->
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
                  <a href="leukemia-baseline.jsp">
                     <button id="addPatient" type="button" class="btn bg-yellow sidebar__addptngenrep--border" data-toggle="modal"
                        data-target="#usermanagement__popup" data-whatever="@mdo">Add Patient</button>
                  </a>
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
            <form action="" method="post" id="LeukemiaFollowUp">
               <div class="col-md-12">
                  <div class="col-md-12 forms">
                     <!-- Buttons Container -->
                     <div class="row button-container buttons__firsthalf--position" id="button-container">
                        <div class="col-sm-6 buttons__firsthalf-position">
                           <a href="leukemia-baseline.jsp" type="button" class="btn bg-yellow button-border baselinenbtn-text"
                              id="baselineBtn"> <span>Baseline</span>
                           </a> <a href="leukemia-followup.jsp" type="button" class="btn bg-yellow button-border followupnbtn-text"
                              id="followUpBtn"> <span>FollowUp</span>
                           </a>
                        </div>
                        <div class="col-sm-6 text-right btn-toolbar">
                           <a href="#" type="button" class="btn bg-yellow button-border patstatsbtn-text secondhalfbtns-position"
                              id="patientStatistics" data-target="#patstats" data-toggle="modal"> <span>Patient Statistics</span>
                           </a> <a href="#" type="button" class="btn bg-yellow button-border editfollowupbtn-text secondhalfbtns-position"
                              id="editPatientBtn"> <span>Edit FollowUp</span>
                           </a> <a href="#" type="button" class="btn bg-yellow button-border deletefollowup-text secondhalfbtns-position"
                              id="archPatientBtn"> <span>Delete FollowUp</span>
                           </a>
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
                              <div id="visitFill" class="visit">
                                 <ul>
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
                              <li class="active"><a data-toggle="tab" href="#medicalEvents">Medical Events</a></li>
                              <li><a data-toggle="tab" href="#clinical">Clinical</a></li>
                              <li><a data-toggle="tab" href="#laboratory">Laboratory</a></li>
                              <li><a data-toggle="tab" href="#diseaseStatus">Disease Status</a></li>
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
                                          <input required type="date" class="form-control" name="dateOfEntry">
                                       </div>
                                    </div>
                                    <!-- Date of Visit -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-6">Date of Visit</label>
                                       <div class="col-sm-6">
                                          <input required type="date" class="form-control" name="dateOfVisit">
                                       </div>
                                    </div>
                                    <!-- Questions -->
                                    <br />
                                    <div class="form-group">
                                       <label class="control-label col-sm-6">Did the patient stop or start a new medication for the
                                          hematologic malignancy?</label>
                                       <div class="col-sm-6">
                                          <div class="radio">
                                             <label> <input type="radio" name="hematologicMalignancy" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="hematologicMalignancy" value="0"> No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="specifyHematologicMalignancy" style="display: none;">
                                       <label class="control-label col-sm-6">Result</label>
                                       <div class="col-sm-6">
                                          <input type="text" class="form-control" name="specifyHematologicMalignancy">
                                       </div>
                                    </div>
                                    <br />
                                    <div class="form-group">
                                       <label class="control-label col-sm-6">Did the patient stop or start a new concomitant
                                          medications for other disease?</label>
                                       <div class="col-sm-6">
                                          <div class="radio">
                                             <label> <input type="radio" name="otherDiseaseMedication" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="otherDiseaseMedication" value="0"> No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="specifyOtherDiseaseMedication" style="display: none;">
                                       <label class="control-label col-sm-6">Result</label>
                                       <div class="col-sm-6">
                                          <input type="text" class="form-control" name="specifyOtherDiseaseMedication">
                                       </div>
                                    </div>
                                    <br />
                                    <div class="form-group">
                                       <label class="control-label col-sm-6">Did the patient undergo any procedure or intervention?</label>
                                       <div class="col-sm-6">
                                          <div class="radio">
                                             <label> <input type="radio" name="procedure" value="1" Required="Required"> Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="procedure" value="0"> No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="specifyProcedure" style="display: none;">
                                       <label class="control-label col-sm-6">Result</label>
                                       <div class="col-sm-6">
                                          <input type="text" class="form-control" name="specifyProcedure">
                                       </div>
                                    </div>
                                    <br />
                                    <div class="form-group">
                                       <label class="control-label col-sm-6">Were there complications from chemotherapy?</label>
                                       <div class="col-sm-6">
                                          <div class="radio">
                                             <label> <input type="radio" name="chemotherapy" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="chemotherapy" value="0"> No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="specifyChemotherapy" style="display: none;">
                                       <label class="control-label col-sm-6">Result</label>
                                       <div class="col-sm-6">
                                          <input type="text" class="form-control" name="specifyChemotherapy">
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
                                       <label class="control-label col-sm-4">Current Symptoms</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="currentSymptoms">
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
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="weight" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">ECOG</label>
                                       <div class="col-sm-8">
                                          <input type="number" Required="required" step=".1" min="0"
                                             onfocusout="setThreeNumberDecimal(this)" class="form-control" name="ecog" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Pertinent findings</label>
                                       <div class="col-sm-6">
                                          <div class="radio">
                                             <label> <input type="radio" name="pertinentFindings" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="pertinentFindings" value="0"> No
                                             </label>
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
                                    <!-- Flow cytometry -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Flow Cytometry</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label> <input type="radio" name="flowCytometry" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="flowCytometry" value="0"> No / Not Applicable
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
                                    <!-- Molecular Analysis -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Molecular Analysis</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label> <input type="radio" name="molecularAnalysis" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="molecularAnalysis" value="0"> Not Done
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="molecularAnalysisResult" style="display: none;">
                                       <label class="control-label col-lg-4">Result</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="molecularAnalysisResult" />
                                       </div>
                                    </div>
                                    <div class="form-group" id="molecularAnalysisAttachScannedDocument" style="display: none;">
                                       <label class="control-label col-lg-4">Attach scanned document</label>
                                       <div class="col-sm-8">
                                          <input type="file" class="form-control" name="molecularAnalysisAttachScannedDocument" />
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
                                          <select required class="form-control" name="diseaseStatus">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
                                             <option value="Relapsed">Relapsed</option>
                                             <option value="Refractory Disease">Refractory Disease</option>
                                             <option value="CR (Complete Remission)">CR (Complete Remission)</option>
                                             <option value="nCR (near CR)">nCR (near CR)</option>
                                             <option value="PR (Partial Response)">PR (Partial Response)</option>
                                             <option value="PD (Progressive Disease)">PD (Progressive Disease)</option>
                                             <option value="SD (Stable Disease)">SD (Stable Disease)</option>
                                             <option value="Complete Hematologic Response">Complete Hematologic Response</option>
                                             <option value="Complete Cytogenetic Response">Complete Cytogenetic Response</option>
                                             <option value="Major Molecular Response">Major Molecular Response</option>
                                             <option value="Spleen Response">Spleen Response</option>
                                             <option value="Symptom Response">Symptom Response</option>
                                             <option value="Dead">Dead</option>
                                             <option value="Others">Others</option>
                                          </select>
                                       </div>
                                    </div>
                                    <div class="form-group" id="diseaseStatusOthers" style="display: none;">
                                       <label class="control-label col-lg-5">Others</label>
                                       <div class="col-lg-5">
                                          <textarea rows="4" class="form-control" name="diseaseStatusOthers"></textarea>
                                       </div>
                                    </div>
                                    <div class="form-group" id="specialNotes" style="display: none;">
                                       <label class="control-label col-lg-5">Special Notes</label>
                                       <div class="col-lg-5">
                                          <textarea rows="4" class="form-control" name="specialNotes"></textarea>
                                       </div>
                                    </div>
                                 </div>
                                 <!-- End of form -->
                              </div>
                              <!-- End of Disease Status -->
                           </div>
                           <!-- End of Follow Up Tab Content -->
                           <input type="submit" class="btn bg-yellow col-sm-4 pull-right button-border" id='submitQuery'> <input
                              type="button" class="btn bg-yellow col-sm-4 pull-right button-border" id='submitCancel' value='Cancel'
                              onclick='cancelEdit()'>
                        </div>
                        <!-- End of Follow Up -->
                     </div>
                  </div>
               </div>
               <input type="hidden" class="form-control" id="patientID" name="patientID" value=""> <input type="hidden"
                  class="form-control" id="followupID" name="followupID" value="">
            </form>
            <!-- End of Forms -->
         </div>
         <!-- End of Inner Main -->
         <div id="customers">
            <table id="tab_customers" class="table table-striped" style="visibility: hidden;">
               <colgroup>
                  <col width="20%">
                  <col width="20%">
                  <col width="20%">
                  <col width="20%">
               </colgroup>
               <thead>
                  <tr class='warning'>
                     <th>PX#</th>
                     <th>Age</th>
                     <th>Gender</th>
                     <th>Treatment ( Chemotheraphy )</th>
                     <th>Patient Status</th>
                  </tr>
               </thead>
               <tbody>
                  <tr>
                     <td>1</td>
                     <td>50</td>
                     <td>Male</td>
                     <td>Positive</td>
                     <td>Discharged</td>
                  </tr>
                  <tr>
                     <td>2</td>
                     <td>51</td>
                     <td>Female</td>
                     <td>Negative</td>
                     <td>Inpatient</td>
                  </tr>
                  <tr>
                     <td>3</td>
                     <td>52</td>
                     <td>Male</td>
                     <td>Positive</td>
                     <td>Outpatient</td>
                  </tr>
                  <tr>
                     <td>4</td>
                     <td>53</td>
                     <td>Female</td>
                     <td>Negative</td>
                     <td>Inpatient</td>
                  </tr>
                  <tr>
                     <td>5</td>
                     <td>54</td>
                     <td>Male</td>
                     <td>Positive</td>
                     <td>Outpatient</td>
                  </tr>
               </tbody>
            </table>
         </div>
      </div>
      <!-- End of Main -->
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
                              <label> <input type="radio" name="paperLayout" value="portrait" Required="Required"> Portrait
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
      <!-- End of Generate Report Modal  -->
      <!-- Generate Report Modal  -->
      <div class="modal fade centered-modal" id="genrep" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
         data-backdrop="static">
         <div class="modal-dialog modal-md">
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
      <div class="modal-dialog modal-md">
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
                     <canvas id="leukemiaFollowPatStatsChart" width="500" height="400"></canvas>
                  </div>
               </div>
               <script>
																var ctx = document.getElementById("leukemiaFollowPatStatsChart")
																		.getContext('2d');
																var leukemiaFollowPatStatsChart = new Chart(ctx, {
																	type : 'line',
																	data : {
																		xLabels : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug',
																				'Sept', 'Oct', 'Nov', 'Dec' ],
																		yLabels : [ 'Newly Diagnosed', 'Relapsed', 'Refractory Disease',
																				'CR', 'nCR', 'PR', 'PD', 'SD',
																				'Complete Hematologic Response',
																				'Complete Cytogenetic Response',
																				'Major Molecular Response', 'Spleen Response',
																				'Symptom Response', 'Dead', 'Others' ],
																		datasets : [ {
																			label : 'Leukemia Disease Status',
																			backgroundColor : 'rgba(6, 124, 209, 1)',
																			fill : false
																		} ],
																		labels : [ 'Relapsed', 'Refractory Disease', 'CR', 'nCR', 'PR',
																				'PD', 'SD', 'Complete Hematologic Response',
																				'Complete Cytogenetic Response',
																				'Major Molecular Response', 'Spleen Response',
																				'Symptom Response', 'Dead', 'Others' ],
																		borderWidth : 1,
																	},
																	options : {
																		data : {
																			display : false
																		},
																		scales : {
																			stacked : true,
																			yAxes : [ {
																				ticks : {
																					min : 0,
																					max : 30,
																					stepSize : 5,
																					beginAtZero : true
																				}
																			} ],
																			xAxes : [ {
																				ticks : {
																					autoSkip : false,
																				}
																			} ]
																		},
																	}
																});
															</script>
            </div>
            <div class="modal-footer">
               <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
            </div>
         </div>
      </div>
   </div>
   <!-- End of Patient Statistics Modal  -->
   <!-- End of Main Container -->
   <script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
   <script src="js/disease.leukemia-followup.js"></script>
   <script src="js/inactivity.js"></script>
   <script src="js/logout.js"></script>
</body>
</html>