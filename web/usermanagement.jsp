<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>User Management</title>
<link rel="icon" href="images/usthlogo.png">

<!-- CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet" href="css/navbar.css">
<link rel="stylesheet" href="css/sidebar.css">
<link href="css/responsive.css" rel="stylesheet">
<link rel="stylesheet"
   href="vendor/formvalidation/dist/css/formValidation.min.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- JS -->

<script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/bootstrap.js"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<script src="js/modal.js"></script>
<!-- FONT AWESOME ICON -->
<script defer src="js/fontawesome-all.js"></script>

<!-- Sidebar Javascript -->
<script src="js/sidebar.js"></script>

<!-- FONT -->
<link rel="stylesheet" href="fonts/open-sans.css">
<link rel="stylesheet" type="text/css" href="DataTables/datatables.min.css"/>
</head>

<body>

   <!-- Main container -->
   <div class="container-fluid main-container">

      <!-- Header -->
      <div class="navbar-fixed-top">

         <!-- Banner -->
         <div class="row header bg-navyblue">
            <div class="col-sm-1">
               <img src="images/usthlogo.png"
                  class="header__logo--size header__logo--position">
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
                  <button type="button" class="navbar-toggle collapsed"
                     data-toggle="collapse"
                     data-target="#bs-example-navbar-collapse-1">
                     <span class="sr-only">Toggle navigation</span> <span
                        class="icon-bar"></span> <span class="icon-bar"></span> <span
                        class="icon-bar"></span>
                  </button>
               </div>

               <!-- Collect the nav links, forms, and other content for toggling -->
               <div class="collapse navbar-collapse"
                  id="bs-example-navbar-collapse-1">
                  <ul class="nav navbar-nav">
                     <li><a href="dashboard-main.jsp">Dashboard</a></li>
                     <li><a href="leukemia-baseline.jsp">Leukemia</a></li>
                     <li><a href="lymphoma-baseline.jsp">Lymphoma</a></li>
                     <li><a href="myelo-baseline.jsp">Myeloproliferative
                           Neoplasm</a></li>
                     <li><a href="plasmacell-baseline.jsp">Plasma Cell
                           Disorder</a></li>
                     <li><a href="aaphsmds-baseline.jsp">AA DNS MDS</a></li>
                     <li><a href="plateletdisorder-baseline.jsp">Platelet
                           Disorder</a></li>
                     <li><a href="coagulationdisease-baseline.jsp">Coagulation
                           Disease</a></li>

                     <!-- Dropdown -->
                     <li class="dropdown pull-right"><a href="#"
                        class="dropdown-toggle" data-toggle="dropdown" role="button"
                        aria-expanded="false"> <i class="fa fa-cog fa-lg"
                           aria-hidden="true"></i><span class="caret"></span>
                     </a>
                        <ul class="dropdown-menu dropdown-menu__text" role="menu">
                           <li><a href="audittrail.jsp">Audit Trail</a></li>
                           <li class="divider"></li>
                           <li><a href="profile.jsp">Profile</a></li>
                           <li class="divider"></li>
                           <li><a href="settings.jsp">Settings</a></li>
                           <li class="divider"></li>
                           <li><a href="#">Logout</a></li>
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
                        <input type="text" placeholder="Search">
                     </div>
                  </div>
               </div>
               <!-- End of Search Box -->
               <ul class="nav nav-pills nav-stacked">
                  <p>asd</p>
                  <p>asd</p>
               </ul>
               <!-- Add box -->
               <div class="row">
                  <div class="col-sm-12 add-box">
                     <button id="addEncoder" type="button" class="btn bg-yellow"
                        data-toggle="modal" data-target="#usermanagement__popup"
                        data-whatever="@mdo">Add Encoder</button>
                  </div>
               </div>
               <!-- End of Add box -->
            </div>
         </div>

         <div id="main">
            <div class="col-md-12">
               <p class="visible-xs">
                  <button type="button" class="btn btn-primary btn-xs"
                     data-toggle="offcanvas">
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
                              class="btn bg-yellow btn-responsive">User Management</a> <a
                              href="archivedpatients.jsp" type="button"
                              class="btn bg-yellow btn-responsive">Archived Patients</a>
                        </div>
                     </div>
                     <!-- End of buttons container -->

                     <!-- Table -->
                     <h4
                        style="background-color: #ffce00; padding: 5px; font-weight: bold;">User
                        Management</h4>
                     <form>
                        <table id="usersTable">
                           <thead>
                           <tr>
                              <th><input type="checkbox" id="select_all" /></th>
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
                     <div id="usermanagement__popup" class="modal fade centered-modal"
                        tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
                        aria-hidden="true" data-backdrop="static">
                        <div class="modal-dialog">
                           <div class="modal-content">
                              <div class="modal-header">
                                 <button type="button" class="close" data-dismiss="modal">
                                    <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                                 </button>
                                 <h4 class="modal-title" id="exampleModalLabel">User
                                    Information:</h4>
                              </div>
                              <div class="modal-body">
                                 <form role="form" id="addUser" method="post">
                                    <div class="form-group">
                                       <label for="recipient-name" class="control-label">Username:</label>
                                       <input type="text" class="form-control" id="username">
                                    </div>
                                    <div class="form-group">
                                       <label for="message-text" class="control-label">Password:</label>
                                       <input type="password" class="form-control" id="password">
                                    </div>
                                    <div class="form-group">
                                       <label for="message-text" class="control-label">Confirm
                                          Password:</label> <input type="password" class="form-control"
                                          id="confirmPassword">
                                    </div>
                                    <div class="form-group">
                                       <label for="message-text" class="control-label">Last
                                          Name:</label> <input type="text" class="form-control"
                                          id="lastName">
                                    </div>
                                    <div class="form-group">
                                       <label for="message-text" class="control-label">First
                                          Name:</label> <input type="text" class="form-control"
                                          id="firstName">
                                    </div>
                                    <div class="form-group">
                                       <label for="message-text" class="control-label">Middle
                                          Name:</label> <input type="text" class="form-control"
                                          id="middleName">
                                    </div>
                                 </form>
                              </div>
                              <div class="modal-footer">
                                 <button type="button" class="btn btn-primary"
                                    data-target="#confirm-submit" data-toggle="modal"
                                    id="submitBtn"></button>
                                    
                                 <button type="button" class="btn btn-danger"
                                    data-dismiss="modal">Cancel</button>
                              </div>
                           </div>
                        </div>
                     </div>
                     <!-- End of User Information Pop-Up -->

                     <!-- User Information Prompt -->
                     <div class="modal fade centered-modal" id="confirm-submit"
                        tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
                        aria-hidden="true" data-backdrop="static">
                        <div class="modal-dialog modal-sm">
                           <div class="modal-content">
                              <div class="modal-header" id="modalHeader"></div>
                              <div class="modal-body" id="modalBody"></div>
                              <div class="modal-footer">
                                 <a href="#" id="submitAction" class="btn btn-success success">Yes</a>
                                 <button type="button" class="btn btn-danger"
                                    data-dismiss="modal">No</button>
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
   </div>

</body>
</html>