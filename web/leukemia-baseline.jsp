<!DOCTYPE html>
<html>
<head>
<title>USTH | Leukemia Baseline</title>
<meta charset="utf-8">
<link rel="icon" href="images/usthlogo.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/navbar.css">
<link rel="stylesheet" href="css/sidebar.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="fonts/open-sans.css">
<link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">
<!-- JS -->
<script src="js/jquery-ui.js"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>
<script src="js/jquery.min-2.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/sidebar.js"></script>
<script src="js/radio-showhide.js" type="text/javascript"></script>
<script src="js/JsBarcode.all.min.js"></script>
<script src="js/Chart.bundle.js"></script>
<script src="js/Chart.bundle.min.js"></script>
<script src="js/Chart.js"></script>
<script src="js/Chart.min.js"></script>
<script src="js/chartjs-plugin-datalabels.js"></script>
<script src="js/chartjs-plugin-datalabels.min.js"></script>
<script src="js/utils.js"></script>
<script defer src="js/fontawesome-all.js"></script>
<!-- <script src="js/jquery.min.js"></script>  -->
<!-- <script src="js/bootstrap.js"></script>  -->
</head>
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
        <div class="collapse navbar-collapse"  id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
            <li><a href="dashboard-main.jsp">Dashboard</a></li>
            <li class="active"><a href="leukemia-baseline.jsp">Leukemia</a></li>
            <li><a href="lymphoma-baseline.jsp">Lymphoma</a></li>
            <li><a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a></li>
            <li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
            <li><a href="aaphsmds-baseline.jsp">AA DNS MDS</a></li>
            <li><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>
            <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
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
  <!-- Sidebar -->
  <div class="row-offcanvas row-offcanvas-left">
    <div id="sidebar" class="sidebar-offcanvas">
      <div class="col-md-12">
        <!-- Search Box -->
        <div class="row">
          <div class="col-sm-12 search-box">
            <div>
              <input type="text" placeholder="Search Patient" class="sidebar__searchbox--border"
                style="font-weight: bold; text-align: center;">
            </div>
<<<<<<< HEAD
          </div>
        </div>
        <!-- End of Search Box -->
        <ul class="nav nav-pills nav-stacked sidebar__searchbox--border" id="patientList">
          <li></li>
        </ul>
        <!-- Add Patient Button -->
        <div class="row">
          <div class="col-sm-12 add-box">
            <button id="addPatient" type="button" class="btn bg-yellow sidebar__addptngenrep--border"
              data-toggle="modal" data-target="#usermanagement__popup" data-whatever="@mdo">Add Patient</button>
          </div>
        </div>
        <!-- End of Add Patient Button -->
        <!-- Generate Report Button -->
        <div class="row">
          <div class="col-sm-12 add-box">
            <button id="generateReport" type="button" class="btn bg-yellow sidebar__addptngenrep--border"
              data-target="#genrep" data-toggle="modal" data-whatever="@mdo">Generate Report</button>
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
        <!-- Main Content -->
        <!-- Form Container -->
        <form action="AddLeukemiaBaselineServlet" method="post">
          <!-- Forms Container -->
          <div class="col-md-12">
            <div class="col-md-12 forms" id="mainContent">
              <!-- Buttons Container -->
              <div class="row button-container buttons__firsthalf--position" id="existingPatientButtons">
                <div class="col-sm-6 buttons__firsthalf-position ">
                  <a href="leukemia-baseline.jsp" type="button" class="btn bg-yellow button-border " id="baselineBtn">Baseline</a>
                  <a href="leukemia-followup.jsp" type="button" class="btn bg-yellow button-border " id="followUpBtn">Follow
                    Up</a>
                </div>
                <div class="col-sm-6 text-right btn-toolbar">
                  <a href="#" type="button" class="btn bg-yellow button-border " id="patientStatsLeuk"
                    data-target="#patstats" data-toggle="modal">Patient Statistics</a> <a href="#" type="button"
                    class="btn bg-yellow button-border " id="edtPatientBtn">Edit Patient</a> <a href="#" type="button"
                    class="btn bg-yellow button-border " id="archPatientBtn">Archive Patient</a>
                </div>
              </div>
              <!-- End of Buttons Container -->
              <!-- Forms -->
              <div class="row">
                <!-- General -->
                <div class="col-md-5">
                  <!-- General Tab -->
                  <ul class="nav nav-tabs">
                    <li class="active "><a data-toggle="tab" href="#general" class="tab-content__border">General</a></li>
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
                              <label><input type="radio" name="gender" value="1">Male</label>
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
                              <label><input type="radio" name="tissueSpecimenCollected" value="1">Yes</label>
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
=======
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
               <ul class="nav navbar-nav">
                  <li><a href="dashboard-main.jsp">Dashboard</a></li>
                  <li class="active"><a href="leukemia-baseline.jsp">Leukemia</a></li>
                  <li><a href="lymphoma-baseline.jsp">Lymphoma</a></li>
                  <li><a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a></li>
                  <li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
                  <li><a href="aapnhmds-baseline.jsp">AA DNS MDS</a></li>
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
>>>>>>> branch 'master' of https://github.com/Mnizus/Web-Based-Biobank-for-UST-BCI.git
                  </div>
<<<<<<< HEAD
                  <!-- End of General Tab Content -->
                </div>
                <!-- End of General -->
                <!-- CLT -->
                <div class="col-md-7">
                  <!-- CLT Navtabs -->
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
                        <!-- Date of Initial Diagnosis -->
                        <div class="form-group">
                          <label class="control-label col-sm-3">Date of Initial Diagnosis</label>
                          <div class="col-sm-9">
                            <input type="date" class="form-control" name="dateOfInitialDiagnosis">
                          </div>
=======
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
            <!-- Main Content -->
            <!-- Form Container -->
            <form action="" method="post" id="LeukemiaBaseline">
               <!-- Forms Container -->
               <div class="col-md-12">
                  <div class="col-md-12 forms" id="mainContent">
                     <!-- Buttons Container -->
                     <div class="row button-container buttons__firsthalf--position" id="existingPatientButtons">
                        <div class="col-sm-6 buttons__firsthalf-position ">
                           <a href="leukemia-baseline.jsp" type="button" class="btn bg-yellow button-border " id="baselineBtn">Baseline</a>
                           <a href="leukemia-followup.jsp" type="button" class="btn bg-yellow button-border " id="followUpBtn">Follow Up</a>
>>>>>>> branch 'master' of https://github.com/Mnizus/Web-Based-Biobank-for-UST-BCI.git
                        </div>
<<<<<<< HEAD
                        <!-- Diagnosis -->
                        <div class="form-group">
                          <label for="diagnosis" class="control-label col-sm-3">Diagnosis</label>
                          <div class="col-sm-9">
                            <select class="form-control" name="diagnosis">
                              <option selected="selected" disabled="disabled">Select</option>
                              <option value="C91    Lymphoid leukemia">C91 Lymphoid leukemia</option>
                              <option value="C91.0  Acute lymphoblastic leukemia [ALL]">C91.0 Acute
                                lymphoblastic leukemia [ALL]</option>
                              <option value="C91.1  Chronic lymphocytic leukemia of B-cell type">C91.1 Chronic
                                lymphocytic leukemia of B-cell type</option>
                              <option value="C91.3  Prolymphocytic leukemia of B-cell type">C91.3
                                Prolymphocytic leukemia of B-cell type</option>
                              <option value="C91.4  Hairy cell leukemia">C91.4 Hairy cell leukemia</option>
                              <option value="C91.5  Adult T-cell lymphoma/leukemia (HTLV-1-associated)">C91.5
                                Adult T-cell lymphoma/leukemia (HTLV-1-associated)</option>
                              <option value="C91.6 Prolymphocytic leukemia of T-cell type">C91.6 Prolymphocytic
                                leukemia of T-cell type</option>
                              <option value="C91.A Mature B-cell leukemia Burkitt-type">C91.A Mature B-cell
                                leukemia Burkitt-type</option>
                              <option value="C91.Z Other lymphoid leukemia">C91.Z Other lymphoid leukemia</option>
                              <option value="C91.9 Lymphoid leukemia, unspecified">C91.9 Lymphoid leukemia,
                                unspecified</option>
                              <option value="C92 Myeloid leukemia">C92 Myeloid leukemia</option>
                              <option value="C92.0 Acute myeloblastic leukemia">C92.0 Acute myeloblastic
                                leukemia</option>
                              <option value="C92.1 Chronic myeloid leukemia, BCR/ABL-positive">C92.1 Chronic
                                myeloid leukemia, BCR/ABL-positive</option>
                              <option value="C92.2 Atypical chronic myeloid leukemia, BCR/ABL-negative">C92.2
                                Atypical chronic myeloid leukemia, BCR/ABL-negative</option>
                              <option value="C92.3 Myeloid sarcoma">C92.3 Myeloid sarcoma</option>
                              <option value="C92.4 Acute promyelocytic leukemia">C92.4 Acute promyelocytic
                                leukemia</option>
                              <option value="C92.5 Acute myelomonocytic leukemia">C92.5 Acute myelomonocytic
                                leukemia</option>
                              <option value="C92.Z Other myeloid leukemia">C92.Z Other myeloid leukemia</option>
                              <option value="C92.9 Myeloid leukemia, unspecified">C92.9 Myeloid leukemia,
                                unspecified</option>
                              <option value="C93 Monocytic leukemia">C93 Monocytic leukemia</option>
                              <option value="C93.0 Acute monoblastic/monocytic leukemia">C93.0 Acute
                                monoblastic/monocytic leukemia</option>
                              <option value="C93.1 Chronic myelomonocytic leukemia">C93.1 Chronic
                                myelomonocytic leukemia</option>
                              <option value="C93.3 Juvenile myelomonocytic leukemia">C93.3 Juvenile
                                myelomonocytic leukemia</option>
                              <option value="C93.Z Other monocytic leukemia">C93.Z Other monocytic leukemia</option>
                              <option value="C93.9 Monocytic leukemia, unspecified">C93.9 Monocytic leukemia,
                                unspecified</option>
                              <option value="C93.92 Monocytic leukemia, unspecified in relapse">C93.92
                                Monocytic leukemia, unspecified in relapse</option>
                              <option value="C94 Other leukemias of specified cell type">C94 Other leukemias of
                                specified cell type</option>
                              <option value="C94.0 Acute erythroid leukemia">C94.0 Acute erythroid leukemia</option>
                              <option value="C942 Acute megakaryoblastic leukemia">C942 Acute megakaryoblastic
                                leukemia</option>
                              <option value="C94.3 Mast cell leukemia">C94.3 Mast cell leukemia</option>
                            </select>
                          </div>
=======
                        <div class="col-sm-6 text-right btn-toolbar">
                           <a href="#" type="button" class="btn bg-yellow button-border" id="patientStatistics">Patient Statistics</a> <a
                              href="#" type="button" class="btn bg-yellow button-border" id="editPatientBtn">Edit Patient</a> <a href="#"
                              type="button" class="btn bg-yellow button-border" id="archPatientBtn">Archive Patient</a>
>>>>>>> branch 'master' of https://github.com/Mnizus/Web-Based-Biobank-for-UST-BCI.git
                        </div>
<<<<<<< HEAD
                        <!-- Classification/Risk Statification -->
                        <div class="form-group">
                          <label class="control-label col-sm-3">Classification/Risk Statification</label>
                          <div class="col-sm-9">
                            <select class="form-control" name="severity">
                              <option selected="selected" disabled="disabled">Select</option>
                              <option value="Low Risk">Low Risk</option>
                              <option value="Intermediate Risk">Intermediate Risk</option>
                              <option value="High Risk">High Risk</option>
                              <option value="Not Applicable">Not Applicable</option>
                            </select>
                          </div>
=======
                     </div>
                     <!-- End of Buttons Container -->
                     <!-- Forms -->
                     <div class="row">
                        <!-- General -->
                        <div class="col-md-5">
                           <!-- General Tab -->
                           <ul class="nav nav-tabs">
                              <li class="active "><a data-toggle="tab" href="#general" class="tab-content__border">General</a></li>
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
                                          <a id="" data-toggle="modal" data-target="#patientBarcode_popup" href="#" alt="Barcode Icon">
                                             <img alt="Barcode Icon" src="images/barcode.png"
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
                                             <label><input type="radio" name="gender" value="1" required="required">Male</label>
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
                                             <label><input type="radio" name="tissueSpecimenCollected" value="1" required="required">Yes</label>
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
>>>>>>> branch 'master' of https://github.com/Mnizus/Web-Based-Biobank-for-UST-BCI.git
                        </div>
<<<<<<< HEAD
                        <!-- Chief Complaint -->
                        <div class="form-group">
                          <label class="control-label col-sm-3">Chief Complaint</label>
                          <div class="col-sm-9">
                            <input type="text" class="form-control" name="chiefComplaint">
                          </div>
=======
                        <!-- End of General -->
                        <!-- CLT -->
                        <div class="col-md-7">
                           <!-- CLT Navtabs -->
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
                                             <option value="C91    Lymphoid leukemia">C91 Lymphoid leukemia</option>
                                             <option value="C91.0  Acute lymphoblastic leukemia [ALL]">C91.0 Acute lymphoblastic
                                                leukemia [ALL]</option>
                                             <option value="C91.1  Chronic lymphocytic leukemia of B-cell type">C91.1 Chronic
                                                lymphocytic leukemia of B-cell type</option>
                                             <option value="C91.3  Prolymphocytic leukemia of B-cell type">C91.3 Prolymphocytic
                                                leukemia of B-cell type</option>
                                             <option value="C91.4  Hairy cell leukemia">C91.4 Hairy cell leukemia</option>
                                             <option value="C91.5  Adult T-cell lymphoma/leukemia (HTLV-1-associated)">C91.5 Adult
                                                T-cell lymphoma/leukemia (HTLV-1-associated)</option>
                                             <option value="C91.6 Prolymphocytic leukemia of T-cell type">C91.6 Prolymphocytic
                                                leukemia of T-cell type</option>
                                             <option value="C91.A Mature B-cell leukemia Burkitt-type">C91.A Mature B-cell leukemia
                                                Burkitt-type</option>
                                             <option value="C91.Z Other lymphoid leukemia">C91.Z Other lymphoid leukemia</option>
                                             <option value="C91.9 Lymphoid leukemia, unspecified">C91.9 Lymphoid leukemia,
                                                unspecified</option>
                                             <option value="C92 Myeloid leukemia">C92 Myeloid leukemia</option>
                                             <option value="C92.0 Acute myeloblastic leukemia">C92.0 Acute myeloblastic leukemia</option>
                                             <option value="C92.1 Chronic myeloid leukemia, BCR/ABL-positive">C92.1 Chronic myeloid
                                                leukemia, BCR/ABL-positive</option>
                                             <option value="C92.2 Atypical chronic myeloid leukemia, BCR/ABL-negative">C92.2
                                                Atypical chronic myeloid leukemia, BCR/ABL-negative</option>
                                             <option value="C92.3 Myeloid sarcoma">C92.3 Myeloid sarcoma</option>
                                             <option value="C92.4 Acute promyelocytic leukemia">C92.4 Acute promyelocytic leukemia</option>
                                             <option value="C92.5 Acute myelomonocytic leukemia">C92.5 Acute myelomonocytic
                                                leukemia</option>
                                             <option value="C92.Z Other myeloid leukemia">C92.Z Other myeloid leukemia</option>
                                             <option value="C92.9 Myeloid leukemia, unspecified">C92.9 Myeloid leukemia,
                                                unspecified</option>
                                             <option value="C93 Monocytic leukemia">C93 Monocytic leukemia</option>
                                             <option value="C93.0 Acute monoblastic/monocytic leukemia">C93.0 Acute
                                                monoblastic/monocytic leukemia</option>
                                             <option value="C93.1 Chronic myelomonocytic leukemia">C93.1 Chronic myelomonocytic
                                                leukemia</option>
                                             <option value="C93.3 Juvenile myelomonocytic leukemia">C93.3 Juvenile myelomonocytic
                                                leukemia</option>
                                             <option value="C93.Z Other monocytic leukemia">C93.Z Other monocytic leukemia</option>
                                             <option value="C93.9 Monocytic leukemia, unspecified">C93.9 Monocytic leukemia,
                                                unspecified</option>
                                             <option value="C93.92 Monocytic leukemia, unspecified in relapse">C93.92 Monocytic
                                                leukemia, unspecified in relapse</option>
                                             <option value="C94 Other leukemias of specified cell type">C94 Other leukemias of
                                                specified cell type</option>
                                             <option value="C94.0 Acute erythroid leukemia">C94.0 Acute erythroid leukemia</option>
                                             <option value="C942 Acute megakaryoblastic leukemia">C942 Acute megakaryoblastic
                                                leukemia</option>
                                             <option value="C94.3 Mast cell leukemia">C94.3 Mast cell leukemia</option>
                                          </select>
                                       </div>
                                    </div>
                                    <!-- Classification/Risk Statification -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-3">Classification/Risk Statification</label>
                                       <div class="col-sm-9">
                                          <select class="form-control" name="riskScore">
                                             <option selected="selected" disabled="disabled">Select</option>
                                             <option value="Low Risk">Low Risk</option>
                                             <option value="Intermediate Risk">Intermediate Risk</option>
                                             <option value="High Risk">High Risk</option>
                                             <option value="Not Applicable">Not Applicable</option>
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
                                             <option value="Weight Loss">Weight Loss</option>
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
                                             <label><input type="radio" name="familyHistoryOfCancer" value="1" required="required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="familyHistoryOfCancer" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
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
                                             <label><input type="radio" name="concomitantMedications" value="1" required="required">Yes</label>
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
                                             <label><input type="radio" name="smokingHistory" value="1" required="required">Yes</label>
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
                                             <label><input type="radio" name="alcoholIntakeHistory" value="1" required="required">Yes</label>
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
                                             <label><input type="radio" name="chemicalExposureHistory" value="1" required="required">Yes</label>
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
                                    <br />
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
                                       <label class="control-label col-lg-4">Presence of Splenomegaly</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="presenceOfSplenomegaly" value="1" required="required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="presenceOfSplenomegaly" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-lg-4">Presence of Hepatomegaly</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="presenceOfHepatomegaly" value="1" required="required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="presenceOfHepatomegaly" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-lg-4">Presence of Lymphadenopathies</label>
                                       <div class="col-sm-8 ">
                                          <div class="radio">
                                             <label><input type="radio" name="presenceOfLymphadenopathies" value="1" required="required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="presenceOfLymphadenopathies" value="0">No</label>
                                          </div>
                                       </div>
                                    </div>
                                    <br />
                                    <div class="form-group">
                                       <label class="control-label col-lg-3">Other findings</label>
                                       <div class="col-sm-9">
                                          <input type="text" class="form-control" name="otherFindings" />
                                       </div>
                                    </div>
                                    <!-- End of Physical Exam -->
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
                                       <label class="control-label col-sm-4">Date of blood collection</label>
                                       <div class="col-lg-8">
                                          <input type="date" class="form-control" name="dateOfBloodCollection" />
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
                                          <input type="checkbox"><label>Not done</label>
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
                                    <!-- End of Labels -->
                                    <!-- Other Lab -->
                                    <h3 class="text-center">
                                       <label class="control-label">Blood Chemistry</label>
                                    </h3>
                                    <!-- Labels -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Laboratory Parameter</label> <label class="col-lg-4"
                                          style="text-align: left;">Result</label>
                                       <div class="col-lg-4">
                                          <input type="checkbox"> <label>Not done</label>
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
                                       <label class="control-label col-sm-4">Uric acid (mg/dl)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="uricAcid" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Na (meg/L)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="na" />
                                       </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">K (me/dl)</label>
                                       <div class="col-lg-4">
                                          <input type="text" class="form-control" name="k" />
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
                                    <!-- End of fields -->
                                    <!-- Imaging Studies -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Imaging Studies</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="imagingStudies" value="1" required="required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="imagingStudies" value="0">No / Not Applicable</label>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="form-group" id="imagingStudiesResult" style="display: none;">
                                       <label class="control-label col-sm-4">Result</label>
                                       <div class="col-lg-5">
                                          <input type="text" class="form-control" name="imagingStudiesResult" />
                                       </div>
                                    </div>
                                    <!-- Bone Marrow  -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Bone Marrow Aspirate and Biopsy result</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="boneMarrowAspirate" value="1" required="required">Yes</label>
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
                                    <div class="form-group" id="attachScannedDocument" style="display: none;">
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
                                             <label><input type="radio" name="flowCytometry" value="1" required="required">Yes</label>
                                          </div>
                                          <div class="radio">
                                             <label><input type="radio" name="flowCytometry" value="0">No / Not Applicable</label>
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
                                    <!-- Cytogenetic and Molecular Analysis -->
                                    <div class="form-group">
                                       <label class="control-label col-sm-4">Cytogenetic and Molecular Analysis</label>
                                       <div class="col-sm-8">
                                          <div class="radio">
                                             <label><input type="radio" name="cytogeneticAndMolecularAnalysis" value="1" required="required">Yes</label>
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
                                 </div>
                                 <!-- End of form -->
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
                                          <select class="form-control" name="treatment">
                                             <option selected="selected" disabled="disabled">Select</option>
                                             <option value="Pharmacologic 1st line">Pharmacologic 1st line</option>
                                             <option value="Pharmacologic 2nd line/Salvage">Pharmacologic 2nd line/Salvage</option>
                                             <option value="Supportive/Palliative Only">Supportive/Palliative Only</option>
                                             <option value="Watch and Wait">Watch and Wait</option>
                                             <option value="Others">Others</option>
                                          </select>
                                       </div>
                                    </div>
                                    <!-- Others -->
                                    <div class="form-group" id="treatmentSpecify" style="display: none;">
                                       <label class="control-label col-sm-3">Others Please Specify</label>
                                       <div class="col-sm-9">
                                          <input type="text" class="form-control" name="treatmentSpecify">
                                       </div>
                                    </div>
                                    <!-- Regimen/Protocol -->
                                    <div class="form-group">
                                       <label class="control-label col-lg-4">Regimen/Protocol</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="regimenProtocol" />
                                       </div>
                                    </div>
                                    <!-- Medications -->
                                    <div class="form-group">
                                       <label class="control-label col-lg-4">Chemotherapy Medications</label>
                                       <div class="col-sm-8">
                                          <input type="text" class="form-control" name="chemotherapyMedications" />
                                       </div>
                                    </div>
                                    <!-- Cycle Number -->
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
                                    <!-- Disease Status -->
                                    <div class="form-group">
                                       <label class="control-label col-lg-4">Disease Status</label>
                                       <div class="col-lg-8">
                                          <select class="form-control" name="diseaseStatus">
                                             <option selected="selected" disabled="disabled">Select</option>
                                             <option value="Relapsed">Relapsed</option>
                                             <option value="Refractory Disease">Refractory Disease</option>
                                             <option value="CR (Complete Remission)">CR (Complete Remission)</option>
                                             <option value="nCR (near CR)">nCR (near CR)</option>
                                             <option value="PR (Partial Response)">PR (Partial Response)</option>
                                             <option value="PD (Progressive Disease)">PD (Progressive Disease)</option>
                                             <option value="SD Stable Disease)">SD Stable Disease)</option>
                                             <option value="Complete Hematologic response">Complete Hematologic response</option>
                                             <option value="Complete Cytogenetic Response">Complete Cytogenetic Response</option>
                                             <option value="Major Molecular Response">Major Molecular Response</option>
                                             <option value="Spleen response">Spleen response</option>
                                             <option value="Symptom response">Symptom response</option>
                                             <option value="Dead">Dead</option>
                                             <option value="Others">Others</option>
                                          </select>
                                       </div>
                                    </div>
                                    <!-- Others -->
                                    <div class="form-group" id="diseaseStatusOthers" style="display: none;">
                                       <label class="control-label col-sm-3">Others Please Specify</label>
                                       <div class="col-sm-9">
                                          <input type="text" class="form-control" name="diseaseStatusOthers">
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
>>>>>>> branch 'master' of https://github.com/Mnizus/Web-Based-Biobank-for-UST-BCI.git
                        </div>
                        <!-- Constitutional Symptoms -->
                        <div class="form-group">
                          <label class="control-label col-sm-3">Constitutional Symptoms</label>
                          <div class="col-sm-9">
                            <select class="form-control" name="constitutionalSymptoms">
                              <option selected="selected" disabled="disabled">Select</option>
                              <option value="Fever">Fever</option>
                              <option value="Weight Loss">Weight Loss</option>
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
                              <label><input type="radio" name="familyHistoryOfCancer" value="1">Yes</label>
                            </div>
                            <div class="radio">
                              <label><input type="radio" name="familyHistoryOfCancer" value="0">No</label>
                            </div>
                          </div>
                        </div>
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
                              <label><input type="radio" name="concomitantMedications" value="1">Yes</label>
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
                              <label><input type="radio" name="smokingHistory" value="1">Yes</label>
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
                              <label><input type="radio" name="alcoholIntakeHistory" value="1">Yes</label>
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
                              <label><input type="radio" name="chemicalExposureHistory" value="1">Yes</label>
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
                        <br />
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
                          <label class="control-label col-lg-4">Presence of Splenomegaly</label>
                          <div class="col-sm-8">
                            <div class="radio">
                              <label><input type="radio" name="presenceOfSplenomegaly" value="1">Yes</label>
                            </div>
                            <div class="radio">
                              <label><input type="radio" name="presenceOfSplenomegaly" value="0">No</label>
                            </div>
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="control-label col-lg-4">Presence of Hepatomegaly</label>
                          <div class="col-sm-8">
                            <div class="radio">
                              <label><input type="radio" name="presenceOfHepatomegaly" value="1">Yes</label>
                            </div>
                            <div class="radio">
                              <label><input type="radio" name="presenceOfHepatomegaly" value="0">No</label>
                            </div>
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="control-label col-lg-4">Presence of Lymphadenopathies</label>
                          <div class="col-sm-8 ">
                            <div class="radio">
                              <label><input type="radio" name="presenceOfLymphadenopathies" value="1">Yes</label>
                            </div>
                            <div class="radio">
                              <label><input type="radio" name="presenceOfLymphadenopathies" value="0">No</label>
                            </div>
                          </div>
                        </div>
                        <br />
                        <div class="form-group">
                          <label class="control-label col-lg-3">Other findings</label>
                          <div class="col-sm-9">
                            <input type="text" class="form-control" name="otherFindings" />
                          </div>
                        </div>
                        <!-- End of Physical Exam -->
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
                          <label class="control-label col-sm-4">Date of blood collection</label>
                          <div class="col-lg-8">
                            <input type="date" class="form-control" name="dateOfBloodCollection" />
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
                            <input type="checkbox"><label>Not done</label>
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
                        <!-- End of Labels -->
                        <!-- Other Lab -->
                        <h3 class="text-center">
                          <label class="control-label">Blood Chemistry</label>
                        </h3>
                        <!-- Labels -->
                        <div class="form-group">
                          <label class="control-label col-sm-4">Laboratory Parameter</label> <label class="col-lg-4"
                            style="text-align: left;">Result</label>
                          <div class="col-lg-4">
                            <input type="checkbox"> <label>Not done</label>
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
                          <label class="control-label col-sm-4">Uric acid (mg/dl)</label>
                          <div class="col-lg-4">
                            <input type="text" class="form-control" name="uricAcid" />
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="control-label col-sm-4">Na (meg/L)</label>
                          <div class="col-lg-4">
                            <input type="text" class="form-control" name="na" />
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="control-label col-sm-4">K (me/dl)</label>
                          <div class="col-lg-4">
                            <input type="text" class="form-control" name="k" />
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
                        <!-- End of fields -->
                        <!-- Imaging Studies -->
                        <div class="form-group">
                          <label class="control-label col-sm-4">Imaging Studies</label>
                          <div class="col-sm-8">
                            <div class="radio">
                              <label><input type="radio" name="imagingStudies" value="1">Yes</label>
                            </div>
                            <div class="radio">
                              <label><input type="radio" name="imagingStudies" value="0">No / Not
                                Applicable</label>
                            </div>
                          </div>
                        </div>
                        <div class="form-group" id="imagingStudiesResult" style="display: none;">
                          <label class="control-label col-sm-4">Result</label>
                          <div class="col-lg-5">
                            <input type="text" class="form-control" name="imagingStudiesResult" />
                          </div>
                        </div>
                        <!-- Bone Marrow  -->
                        <div class="form-group">
                          <label class="control-label col-sm-4">Bone Marrow Aspirate and Biopsy result</label>
                          <div class="col-sm-8">
                            <div class="radio">
                              <label><input type="radio" name="boneMarrowAspirate" value="1">Yes</label>
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
                        <div class="form-group" id="attachScannedDocument" style="display: none;">
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
                              <label><input type="radio" name="flowCytometry" value="1">Yes</label>
                            </div>
                            <div class="radio">
                              <label><input type="radio" name="flowCytometry" value="0">No / Not
                                Applicable</label>
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
                        <!-- Cytogenetic and Molecular Analysis -->
                        <div class="form-group">
                          <label class="control-label col-sm-4">Cytogenetic and Molecular Analysis</label>
                          <div class="col-sm-8">
                            <div class="radio">
                              <label><input type="radio" name="cytogeneticAndMolecularAnalysis" value="1">Yes</label>
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
                        <div class="form-group" id="cytogeneticAndMolecularAnalysisAttachScannedDocument"
                          style="display: none;">
                          <label class="control-label col-lg-4">Attach scanned document</label>
                          <div class="col-sm-8">
                            <input type="file" class="form-control"
                              name="cytogeneticAndMolecularAnalysisAttachScannedDocument" />
                          </div>
                        </div>
                      </div>
                      <!-- End of form -->
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
                            <select class="form-control" name="treatment">
                              <option selected="selected" disabled="disabled">Select</option>
                              <option value="Pharmacologic 1st line">Pharmacologic 1st line</option>
                              <option value="Pharmacologic 2nd line/Salvage">Pharmacologic 2nd line/Salvage</option>
                              <option value="Supportive/Palliative Only">Supportive/Palliative Only</option>
                              <option value="Watch and Wait">Watch and Wait</option>
                              <option value="Others">Others</option>
                            </select>
                          </div>
                        </div>
                        <!-- Others -->
                        <div class="form-group" id="treatmentSpecify" style="display: none;">
                          <label class="control-label col-sm-3">Others Please Specify</label>
                          <div class="col-sm-9">
                            <input type="text" class="form-control" name="treatmentSpecify">
                          </div>
                        </div>
                        <!-- Regimen/Protocol -->
                        <div class="form-group">
                          <label class="control-label col-lg-4">Regimen/Protocol</label>
                          <div class="col-sm-8">
                            <input type="text" class="form-control" name="regimenProtocol" />
                          </div>
                        </div>
                        <!-- Medications -->
                        <div class="form-group">
                          <label class="control-label col-lg-4">Chemotherapy Medications</label>
                          <div class="col-sm-8">
                            <input type="text" class="form-control" name="chemotherapyMedications" />
                          </div>
                        </div>
                        <!-- Cycle Number -->
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
                        <!-- Disease Status -->
                        <div class="form-group">
                          <label class="control-label col-lg-4">Disease Status</label>
                          <div class="col-lg-8">
                            <select class="form-control" name="diseaseStatus">
                              <option selected="selected" disabled="disabled">Select</option>
                              <option value="Relapsed">Relapsed</option>
                              <option value="Refractory Disease">Refractory Disease</option>
                              <option value="CR (Complete Remission)">CR (Complete Remission)</option>
                              <option value="nCR (near CR)">nCR (near CR)</option>
                              <option value="PR (Partial Response)">PR (Partial Response)</option>
                              <option value="PD (Progressive Disease)">PD (Progressive Disease)</option>
                              <option value="SD Stable Disease)">SD Stable Disease)</option>
                              <option value="Complete Hematologic response">Complete Hematologic response</option>
                              <option value="Complete Cytogenetic Response">Complete Cytogenetic Response</option>
                              <option value="Major Molecular Response">Major Molecular Response</option>
                              <option value="Spleen response">Spleen response</option>
                              <option value="Symptom response">Symptom response</option>
                              <option value="Dead">Dead</option>
                              <option value="Others">Others</option>
                            </select>
                          </div>
                        </div>
                        <!-- Others -->
                        <div class="form-group" id="diseaseStatusOthers" style="display: none;">
                          <label class="control-label col-sm-3">Others Please Specify</label>
                          <div class="col-sm-9">
                            <input type="text" class="form-control" name="diseaseStatusOthers">
                          </div>
                        </div>
                      </div>
                      <!-- End of Form -->
                    </div>
                    <!-- End of Therapy -->
                  </div>
                  <!-- End of CLT Tab Content -->
                  <input type="submit" class="btn bg-yellow col-sm-4 pull-right button-border">
                </div>
                <!-- End of CLT -->
              </div>
            </div>
          </div>
        </form>
        <!-- End of Forms  -->
      </div>
    </div>

    <!-- Generate Report Modal  -->
    <div class="modal fade centered-modal" id="genrep" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
      aria-hidden="true" data-backdrop="static">
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
                    <input type="checkbox"> <label class="genrepmodal__checkboxes">Age</label> <input
                      type="checkbox"> <label class="genrepmodal__checkboxes">Gender</label> <input
                      type="checkbox"> <label class="genrepmodal__checkboxes">Mode of Treatment</label> <input
                      type="checkbox"> <label class="genrepmodal__checkboxes">Disease Status Baseline</label> <input
                      type="checkbox"> <label class="genrepmodal__checkboxes">Disease Status Follow-up</label>
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

  </div>
  <!-- End of Main Container -->
  <script src="js/JsBarcode.barcodePrint.js"></script>
   <script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
   <script src="js/disease.leukemia-baseline.js"></script>

</body>
</html>