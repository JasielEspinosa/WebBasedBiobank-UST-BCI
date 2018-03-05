<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script> 
    <![endif]-->
<!DOCTYPE html>
<html>
<head>
<title>USTH | Coagulation Follow Up</title>
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
                  <li><a href="aapnhmds-baseline.jsp">AA PNH MDS</a></li>
                  <li><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>
                  <li class="active"><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
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
            <form action="" method="post" id="CoagulationDiseaseFollowUp">
               <div class="col-md-12">
                  <div class="col-md-12 forms">
                     <!-- Buttons Container -->
                     <div class="row button-container buttons__firsthalf--position ">
                        <div class="col-sm-6 buttons__firsthalf-position ">
                           <a href="coagulationdisease-baseline.jsp" type="button" class="btn bg-yellow button-border" id="baselineBtn">Baseline</a>
                           <a href="coagulationdisease-followup.jsp" type="button" class="btn bg-yellow button-border" id="followUpBtn">Follow
                              Up</a>
                        </div>
                        <div class="col-sm-6 text-right btn-toolbar">
                           <a href="#" type="button" class="btn bg-yellow button-border" id="patientStatistics" data-target="#patstats"
                              data-toggle="modal">Patient Statistics</a> <a href="#" type="button" class="btn bg-yellow button-border"
                              id="editPatientBtn">Edit FollowUp</a> <a href="#" type="button" class="btn bg-yellow button-border"
                              id="archPatientBtn">Delete FollowUp</a>
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
                                       <label class="control-label col-sm-6">Did the patient self-administered factor concentrates
                                          at home from last visit?</label>
                                       <div class="col-sm-6">
                                          <div class="radio">
                                             <label> <input type="radio" name="factorConcentrate" value="1" Required="Required">
                                                Yes
                                             </label>
                                          </div>
                                          <div class="radio">
                                             <label> <input type="radio" name="factorConcentrate" value="0"> No
                                             </label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="specifyReasonFactorConcentrate" style="display: none;">
                                       <label class="control-label col-sm-6">Specify Reason</label>
                                       <div class="col-sm-6">
                                          <input type="text" class="form-control" name="specifyReasonFactorConcentrate">
                                       </div>
                                    </div>
                                    <div class="form-group" id="datesOfAdministrationFactorConcentrate" style="display: none;">
                                       <label class="control-label col-sm-6">Dates of Administration</label>
                                       <div class="col-sm-6">
                                          <input type="text" class="form-control" name="datesOfAdministrationFactorConcentrate">
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
                           <input type="checkbox" name="ageGR" value="ageGR"> <label class="genrepmodal__checkboxes">Age</label> <input
                              type="checkbox" name="genderGR" value="genderGR"> <label class="genrepmodal__checkboxes">Gender</label>
                           <input type="checkbox" name="modeOfTreatmentGR" value="modeOfTreatmentGR"> <label
                              class="genrepmodal__checkboxes">Mode of Treatment</label> <input type="checkbox" name="dsBaselineGR"
                              value="dsBaselineGR"> <label class="genrepmodal__checkboxes">Disease Status Baseline</label> <input
                              type="checkbox" name="dsFollowupGR" value="dsFollowupGR"> <label class="genrepmodal__checkboxes">Disease
                              Status Follow-up</label>
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
   <script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
   <script src="js/disease.coagulation-followup.js"></script>
   <script src="js/inactivity.js"></script>
   <script src="js/logout.js"></script>
</body>
</html>