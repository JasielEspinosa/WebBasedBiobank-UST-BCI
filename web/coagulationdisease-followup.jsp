<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script> 
    <![endif]-->
<!DOCTYPE html>
<html>
<head>
<title>USTH - Coagulation Follow Up</title>
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
<script src="js/bootstrap.min.js"></script>
<script src="js/sidebar.js"></script>
<script src="js/radio-showhide.js" type="text/javascript"></script>
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
         <div
            class="col-sm-11 header__bannertitle--visibility header__bannertitle--position header__bannertitle--spacing">
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
               <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                  data-target="#bs-example-navbar-collapse-1">
                  <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
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
                  <li class="active"><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
                  <!-- Dropdown -->
                  <li class="dropdown pull-right"><a href="#" class="dropdown-toggle" data-toggle="dropdown"
                     role="button" aria-expanded="false"> <i class="fa fa-cog fa-lg" aria-hidden="true"></i><span
                        class="caret"></span>
                  </a>
                     <ul class="dropdown-menu dropdown-menu__text" role="menu">
                        <li><a style="font-weight: bold;" href="audittrail.jsp"><i
                              class="fas fa-file-alt dropdown-icons--margin"></i> Audit Trail</a></li>
                        <li class="divider" style="background-color: #000000;"></li>
                        <li><a style="font-weight: bold;" href="profile.jsp"><i
                              class="fas fa-user-md dropdown-icons--margin"></i> Profile</a></li>
                        <li class="divider" style="background-color: #000000;"></li>
                        <li><a style="font-weight: bold;" href="usermanagement.jsp"><i
                              class="fas fa-wrench dropdown-icons--margin"></i> Settings</a></li>
                        <li class="divider" style="background-color: #000000;"></li>
                        <li><a style="font-weight: bold;" href="login.jsp"><i
                              class="fas fa-sign-out-alt dropdown-icons--margin"></i> Logout</a></li>
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
                     <input type="text" placeholder="Search Patient" class="sidebar__searchbox--border"
                        style="font-weight: bold; text-align: center;">
                  </div>
               </div>
            </div>
            <!-- End of Search Box -->
            <ul class="nav nav-pills nav-stacked sidebar__searchbox--border">
            </ul>
            <!-- Add Patient Button -->
            <div class="row">
               <div class="col-sm-12 add-box">
                  <button id="addPatientLeukemia" type="button" class="btn bg-yellow sidebar__addptngenrep--border"
                     data-toggle="modal" data-target="#usermanagement__popup" data-whatever="@mdo">Add Patient</button>
               </div>
            </div>
            <!-- End of Add Patient Button -->
            <!-- Generate Report Button -->
            <div class="row">
               <div class="col-sm-12 add-box">
                  <button id="generateReport" type="button" class="btn bg-yellow sidebar__addptngenrep--border"
                     data-toggle="modal" data-target="#usermanagement__popup" data-whatever="@mdo">Generate
                     Report</button>
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
            <!-- Old Sidenav Code
               <div class="row">
                  <ul id="sidebar" class="nav nav-stacked col-sm-12">
                     < % 
                     	while (coagulationPatientsList.next()) {
                     %>
                     <li><a
                        href="GetCoagulationPatientServlet?patientId=< %= coagulationPatientsList.getInt("patientId")%>">< %=coagulationPatientsList.getInt("patientId")%></a></li>
                     < %
                     	}
                     % >
                  </ul>
               </div>
               Sidenav -->
            <!-- Forms Container -->
            <div class="col-md-12">
               <div class="col-md-12 forms">
                  <!-- Buttons Container -->
                  <div class="row button-container buttons__firsthalf--position ">
                     <div class="col-sm-6 buttons__firsthalf-position ">
                        <a href="coagulationdisease-baseline.jsp" type="button" class="btn bg-yellow button-border"
                           id="baselineBtn">Baseline</a> <a href="coagulationdisease-followup.jsp" type="button"
                           class="btn bg-yellow button-border" id="followUpBtn">Follow Up</a>
                     </div>
                     <div class="col-sm-6 text-right btn-toolbar">
                        <a href="#" type="button" class="btn bg-yellow button-border" id="edtPatientBtn">Patient
                           Statistics</a> <a href="#" type="button" class="btn bg-yellow button-border" id="edtPatientBtn">Edit
                           Patient</a> <a href="#" type="button" class="btn bg-yellow button-border" id="archPatientBtn">Archive
                           Patient</a>
                     </div>
                  </div>
                  <!-- End of Buttons Container -->
                  <!-- Forms -->
                  <form action="AddCoagulationFollowUpServlet" method="post">
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
                              <div class="visit">
                                 <ul>
                                    <!--                             <a href="#"><li>02-24-2017</li></a>
                                    <a href="#"><li>02-24-2017</li></a>
                                    <a href="#"><li>02-24-2017</li></a>
                                    <a href="#"><li>02-24-2017</li></a>
                                    <a href="#"><li>02-24-2017</li></a> -->
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
                                       <label class="control-label col-sm-6">Did the patient self-administered
                                          factor concentrates at home from last visit?</label>
                                       <div class="col-sm-6">
                                          <div class="radio">
                                             <label><input type="radio" name="factorConcentrate" value="1">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="factorConcentrate" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="specifyReasonFactorConcentrate" style="display: none;">
                                       <label class="control-label col-sm-6">Specify Reason</label>
                                       <div class="col-sm-6">
                                          <input type="text" class="form-control" name="specifyReasonFactorConcentrate">
                                       </div>
                                    </div>
                                    <div class="form-group" id="datesOfAdministrationFactorConcentrate"
                                       style="display: none;">
                                       <label class="control-label col-sm-6">Dates of Administration</label>
                                       <div class="col-sm-6">
                                          <input type="text" class="form-control"
                                             name="datesOfAdministrationFactorConcentrate">
                                       </div>
                                    </div>
                                    <div class="form-group" id="doseOfFactorConcentrate" style="display: none;">
                                       <label class="control-label col-sm-6">Dose of Factor Concentrate</label>
                                       <div class="col-sm-6">
                                          <input type="text" class="form-control" name="doseOfFactorConcentrate">
                                       </div>
                                    </div>
                                    <br />
                                    <div class="form-group">
                                       <label class="control-label col-sm-6">Did the patient undergo any
                                          procedure or intervention?</label>
                                       <div class="col-sm-6">
                                          <div class="radio">
                                             <label><input type="radio" name="procedure" value="1">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="procedure" value="2">No</label>
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
                                       <label class="control-label col-sm-6">Special Notes</label>
                                       <div class="col-sm-6">
                                          <input type="text" class="form-control" name="specialNotes">
                                       </div>
                                    </div>
                                 </div>
                              </div>
                              <!-- End of Medical Events -->
                           </div>
                           <!-- End of Follow Up Tab Content -->
                           <input type="submit" class="btn bg-yellow col-sm-4 pull-right button-border">
                        </div>
                        <!-- End of Follow Up -->
                     </div>
                  </form>
                  <!-- End of Forms -->
               </div>
            </div>
         </div>
      </div>
   </div>
   <!-- End of Main Content -->
</body>
</html>