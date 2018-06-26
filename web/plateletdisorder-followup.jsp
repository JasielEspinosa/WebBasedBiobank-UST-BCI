<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<!DOCTYPE html>
<html>
<head>
<title>USTH | Platelet Follow Up</title>
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
<script src="js/radio-showhide.js" type="text/javascript"></script>
<script src="js/loadEditingFields.js" type="text/javascript"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>
<script defer src="js/fontawesome-all.js"></script>
<script src="js/normalrangeplateletfu.js"></script>
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
                  <li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
                  <li><a href="aapnhmds-baseline.jsp">AA PNH MDS</a></li>
                  <li class="active"><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>
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
                  <a href="plateletdisorder-baseline.jsp">
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
            <form action="" method="post" id="PlateletFollowUp">
               <div class="col-md-12">
                  <div class="col-md-12 forms">
                     <!-- Buttons Container -->
                     <div class="row button-container buttons__firsthalf--position" id="button-container">
                        <div class="col-sm-6 buttons__firsthalf-position">
                           <a href="plateletdisorder-baseline.jsp" type="button" class="btn bg-yellow button-border baselinenbtn-text"
                              id="baselineBtn"> <span>Baseline</span>
                           </a> <a href="plateletdisorder-followup.jsp" type="button" class="btn bg-yellow button-border followupnbtn-text"
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
                        <div class="col-sm-3">
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
                        <div class="col-sm-9">
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
                                       <label class="control-label col-sm-6">Did the patient stop or start a new medication for
                                          other diseases?</label>
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
                                 </div>
                                 <!-- End of Form -->
                              </div>
                              <!-- End of Laboratory -->
                              <!-- Disease Status -->
                              <div id="diseaseStatus" class="tab-pane fade in">
                                 <!-- Form -->
                                 <div class="form-horizontal">
                                    <div class="form-group">
                                       <label class="control-label col-lg-5">Quality of Response</label>
                                       <div class="col-lg-5">
                                          <select required class="form-control" name="qualityOfResponse">
                                             <option value="" selected="selected" disabled="disabled">Select</option>
                                             <option
                                                value="CR (Complete Remission): platelet count > 100 x
                                             109/L">CR
                                                (Complete Remission): platelet count > 100 x 109/L</option>
                                             <option
                                                value="R (Remission): platelet count > 30 x 109/L or at
                                             least 2-fold increase the baseline count">R
                                                (Remission): platelet count > 30 x 109/L or at least 2-fold increase the baseline count</option>
                                             <option
                                                value="NR (No Remission): platelet count < 30 x 109/L or
                                             less than 2-fold increase the baseline count or bleeding">NR
                                                (No Remission): platelet count &#x3C; 30 x 109/L or less than 2-fold increase the baseline
                                                count or bleeding</option>
                                             <option value="Loss of Response">Loss of Response</option>
                                             <option value="Refractory ITP">Refractory ITP</option>
                                             <option value="Stable Disease">Stable Disease</option>
                                             <option value="Dead">Dead</option>
                                             <option value="Others">Others</option>
                                          </select>
                                       </div>
                                    </div>
                                    <div class="form-group" id="diseaseStatusOthers" style="display: none;">
                                       <label class="control-label col-lg-5">Other Please Specify</label>
                                       <div class="col-lg-5">
                                          <textarea rows="4" class="form-control" name="diseaseStatusOthers"></textarea>
                                       </div>
                                    </div>
                                    <div class="form-group">
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
                     <canvas id="plateletFollowPatStatsChart" width="600" height="500"></canvas>
                  </div>
               </div>
               <script>
																var ctx = document.getElementById("plateletFollowPatStatsChart")
																		.getContext('2d');
																var plateletFollowPatStatsChart = new Chart(ctx, {
																	type : 'line',
																	data : {
																		xLabels : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug',
																				'Sept', 'Oct', 'Nov', 'Dec' ],
																		yLabels : [ 'Newly Diagnosed ITP', 'Persistent ITP', 'Chronic ITP',
																				'Severe ITP', 'CR', 'R', 'NR', 'Loss of CR or R',
																				'Refractory ITP', 'Stable Disease', 'Dead', 'Others' ],
																		datasets : [ {
																			label : 'Platelet Disorder Disease Status',
																			backgroundColor : 'rgba(6, 124, 209, 1)',
																			fill : false
																		} ],
																		labels : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug',
																				'Sept', 'Oct', 'Nov', 'Dec' ],
																		borderWidth : 1,
																	},
																	options : {
																		data : {
																			display : false
																		},
																		scales : {
																			stacked : true,
																			yAxes : [ {
																				type : 'category',
																				position : 'left',
																				display : true,
																				ticks : {
																					reverse : true
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
   <script src="js/normalrange.js"></script>
   <script src="js/disease.platelet-followup.js"></script>
   <script src="js/inactivity.js"></script>
   <script src="js/logout.js"></script>
</body>
</html>