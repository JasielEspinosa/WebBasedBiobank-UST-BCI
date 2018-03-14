<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>USTH | User Management</title>
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
<link rel="stylesheet" href="DataTables/datatables.min.css" />
<link rel="stylesheet" href="fontawesome-free-5.0.8/web-fonts-with-css/css/fontawesome-all.min.css">
<link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">
<link rel="stylesheet" type="text/css" href="DataTables/datatables.min.css" />
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<!-- JS -->
<script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/jquery.min-2.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/sidebar.js"></script>
<script src="js/modal.js"></script>
<script src="js/fontawesome-all.js"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>

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
      <div class="navbar__nav-item--hover">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
            data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
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
                <i class="fa fa-cog fa-lg" aria-hidden="true"></i>
                <span class="caret"></span>
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
  <!-- Sidebar -->
  <div class="row-offcanvas row-offcanvas-left">
    <div id="sidebar" class="sidebar-offcanvas">
      <div class="col-md-12">
        <ul class="nav nav-pills nav-stacked nav-stacked__usermngmt sidebar__searchbox--border">
        </ul>
        <!-- Add box -->
        <div class="row">
          <div class="col-sm-12 add-box">
            <button id="addEncoder" type="button" class="btn bg-yellow button-border" data-toggle="modal"
              data-target="#usermanagement__popup" data-whatever="@mdo">Add Encoder</button>
          </div>
        </div>
        <!-- End of Add box -->
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
        <!-- Form Container -->
        <div class="row">
          <div class="col-sm-10 offset-sm-2 settings__buttons--position">
            <!-- Buttons Container -->
            <div class="row button-container">
              <div class="col-sm-8">
                <a href="usermanagement.jsp" type="button"
                  class="btn bg-yellow btn-responsive button-border usrmgmt--text">
                  <span>User Management</span>
                </a>
                <a href="archivedpatients.jsp" type="button"
                  class="btn bg-yellow btn-responsive button-border archpat--text">
                  <span>Archived Patients</span>
                </a>
              </div>
            </div>
            <!-- End of buttons container -->
            <!-- Table -->
            <h3 style="background-color: #ffce00; font-weight: bold;" class="button-border">
              <i class="fas fa-users"></i> User Management
            </h3>
            <form>
              <table id="usersTable">
                <thead>
                  <tr>
                    <th></th>
                    <th></th>
                    <th onclick="sortTable(0)">Username</th>
                    <th onclick="sortTable(1)">Name</th>
                    <th onclick="sortTable(1)">Account Type</th>
                  </tr>
                </thead>
                <tbody>
                </tbody>
              </table>
            </form>
            <!-- End of Table -->
            <!-- User Information Pop-Up -->
            <form role="form" name="addUser" action="" id="addUser" method="post">
              <div id="usermanagement__popup" class="modal fade centered-modal" tabindex="-1" role="dialog"
                aria-labelledby="exampleModalLabel" aria-hidden="true" data-backdrop="static">
                <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal">
                        <span aria-hidden="true">&times;</span>
                        <span class="sr-only">Close</span>
                      </button>
                      <h4 class="modal-title" id="exampleModalLabel">User Information:</h4>
                    </div>
                    <div class="modal-body">
                      <div class="form-group">
                        <label for="recipient-name" class="control-label">Username:</label>
                        <input type="text" class="form-control" id="username">
                      </div>
                      <div class="form-group">
                        <label for="message-text" class="control-label">Password:</label>
                        <input type="password" class="form-control" id="password" required>
                      </div>
                      <div class="form-group">
                        <label for="message-text" class="control-label">Confirm Password:</label>
                        <input type="password" class="form-control" id="confirmPassword" required>
                      </div>
                      <div class="form-group">
                        <label for="message-text" class="control-label">Last Name:</label>
                        <input type="text" class="form-control" id="lastName" required>
                      </div>
                      <div class="form-group">
                        <label for="message-text" class="control-label">First Name:</label>
                        <input type="text" class="form-control" id="firstName" required>
                      </div>
                      <div class="form-group">
                        <label for="message-text" class="control-label">Middle Name:</label>
                        <input type="text" class="form-control" id="middleName">
                      </div>
                      <div class="form-group">
                        <div class="col-sm-1 col-sm-offset-7 form-horizontal" style="text-align: right;">
                          <label for="message-text" class="control-label">Role:</label>
                        </div>
                        <div class="col-sm-4" style="padding-right: 0px !important">
                          <select class="form-control" name="role" id="role" required>
                            <option value="" selected="selected" disabled="disabled">Select</option>
                            <option value="1">Admin</option>
                            <option value="2">Encoder</option>
                          </select>
                        </div>
                      </div>
                      <div class="modal-footer">
                        <button type="submit" class="btn btn-primary" data-toggle="modal" id="submitBtn"></button>
                        <button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
                        <!-- data-target="#confirm-submit"  -->
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </form>
            <!-- End of User Information Pop-Up -->
            <!-- User Information Prompt -->
            <div class="modal fade centered-modal" id="confirm-submit" tabindex="-1" role="dialog"
              aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
              <div class="modal-dialog modal-sm">
                <div class="modal-content">
                  <div class="modal-header" id="modalHeader"></div>
                  <div class="modal-body" id="modalBody"></div>
                  <div class="modal-footer">
                    <a href="#" id="submitAction" class="btn btn-success success">Yes</a>
                    <button type="button" class="btn btn-danger" data-dismiss="modal">No</button>
                  </div>
                </div>
              </div>
            </div>
            <!-- End of User Information Prompt -->
          </div>
          <!--/row-offcanvas -->
        </div>
        <!-- End of main container -->
        <!--<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>-->
        <!--<script src="js/main.js"></script>-->
        <script type="text/javascript" src="DataTables/datatables.min.js"></script>
        <script src="js/user-management.js"></script>
        <!-- Resource jQuery -->
      </div>
    </div>
  </div>
</body>
</html>