<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>USTH | Audit Trail</title>
<link rel="icon" href="images/usthlogo.png">

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
<link rel="stylesheet" type="text/css" href="DataTables/datatables.min.css" />
<!-- JS -->
<script src="js/jquery-ui.js"></script>
<script src="js/jquery.min-2.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
<script src="js/genaudrep.js"></script>
<script src="js/fontawesome-all.js"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>
<!-- <script src="js/jquery.min.js"></script>  -->
<!-- <script src="js/bootstrap.js"></script>  -->
</head>

<body>

  <!-- Main container -->
  <div class="container-fluid main-container">

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
              <li>
                <a href="dashboard-main.jsp">Dashboard</a>
              </li>
              <li>
                <a href="leukemia-baseline.jsp">Leukemia</a>
              </li>
              <li>
                <a href="lymphoma-baseline.jsp">Lymphoma</a>
              </li>
              <li>
                <a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a>
              </li>
              <li>
                <a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a>
              </li>
              <li>
                <a href="aapnhmds-baseline.jsp">AA PNH MDS</a>
              </li>
              <li>
                <a href="plateletdisorder-baseline.jsp">Platelet Disorder</a>
              </li>
              <li>
                <a href="coagulationdisease-baseline.jsp">Coagulation Disease</a>
              </li>

              <!-- Dropdown -->
              <li class="dropdown pull-right">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                  <i class="fa fa-cog fa-lg" aria-hidden="true"></i><span class="caret"></span>
                </a>
                <ul class="dropdown-menu dropdown-menu__text" role="menu">
                  <li>
                    <a style="font-weight: bold;" href="audittrail.jsp">
                      <i class="fas fa-file-alt dropdown-icons--margin"></i> Audit Trail
                    </a>
                  </li>
                  <li class="divider" style="background-color: #000000;"></li>
                  <li>
                    <a style="font-weight: bold;" href="profile.jsp">
                      <i class="fas fa-user-md dropdown-icons--margin"></i> Profile
                    </a>
                  </li>
                  <li class="divider" style="background-color: #000000;"></li>
                  <li>
                    <a style="font-weight: bold;" href="usermanagement.jsp">
                      <i class="fas fa-wrench dropdown-icons--margin"></i> Settings
                    </a>
                  </li>
                  <li class="divider" style="background-color: #000000;"></li>
                  <li>
                    <a style="font-weight: bold;" href="login.jsp">
                      <i class="fas fa-sign-out-alt dropdown-icons--margin"></i> Logout
                    </a>
                  </li>
                </ul>
              </li>
              <!-- End of Dropdown -->

            </ul>
          </div>
          <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
      </nav>

    </div>
    <!-- End of header -->

    <!-- Dashboard -->

    <div id="main">
      <div class="col-md-12">
        <p class="visible-xs">
          <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">
            <i class="glyphicon glyphicon-chevron-left"></i>
          </button>
        </p>
        <!-- End of Sidebar -->

        <!-- Form Container -->
        <div class="row">
          <div class="col-sm-10 offset-sm-2 auditsettings__buttons--position">

            <!-- Table -->
            <div class="col-md-12 col-md-offset-1">

              <!-- General Tab -->
              <ul class="nav nav-tabs">
                <li class="active">
                  <a data-toggle="tab" href="#events">Events</a>
                </li>
                <li>
                  <button class="genrepbtn--style" data-target="#genaudrep" data-toggle="modal">GENERATE AUDIT
                    REPORT</button>
                </li>
              </ul>
              <!-- End of General Tab -->

              <br>

              <table id="auditTable">
                <thead>
                  <tr>
                    <th>ACTION</th>
                    <th>PERFORMED ON</th>
                    <th>PERFORMED BY</th>
                    <th>EVENT DATE</th>
                  </tr>
                </thead>
                <tbody>
                </tbody>
              </table>
            </div>
            <!-- End of Table -->
          </div>
          <!-- End of Inner Form Container -->

          <!-- End of Dashboard -->

          <!-- Generate Audit Report Modal  -->
          <div class="modal fade centered-modal" id="genaudrep" tabindex="-1" role="dialog"
            aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
            <div class="modal-dialog modal-md">
              <div class="modal-content">
                <div class="modal-header">Generate Audit Report</div>
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
                  <button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
                </div>
              </div>
            </div>
          </div>
          <!-- End of Generate Audit Report Modal  -->

        </div>
      </div>
    </div>
  </div>
  <!-- End of main container -->

  <script type="text/javascript" src="DataTables/datatables.min.js"></script>
  <script src="js/audit.js"></script>

</body>
</html>