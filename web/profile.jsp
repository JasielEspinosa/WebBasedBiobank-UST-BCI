<!DOCTYPE html>
<html>
<head>
<title>USTH | Profile</title>
<meta charset="utf-8">
<link rel="icon" href="images/usthlogo.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/dashboard.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/navbar.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="fonts/open-sans.css">
<link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">
<!-- JS -->
<script src="js/jquery-ui.js"></script>
<script src="js/bootstrap.js"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>
<script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/modal.js"></script>
<script defer src="js/fontawesome-all.js"></script>
<script src="js/sidebar.js"></script>
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
                     <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
                     <!-- Dropdown -->
                     <li class="dropdown pull-right"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                        aria-expanded="false"> <i class="fa fa-cog fa-lg" aria-hidden="true"></i> <span class="caret"></span>
                     </a>
                        <ul class="dropdown-menu dropdown-menu__text" role="menu">
                           <li><a style="font-weight: bold;" href="audittrail.jsp"> <i
                                 class="fas fa-file-alt dropdown-icons--margin"></i> Audit Trail
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
                           <li><a style="font-weight: bold;" onclick="logout()"> <i
                                 class="fas fa-sign-out-alt dropdown-icons--margin"></i> Logout
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
      <div class="container-fluid bg-navyblue">
         <!-- Forms Container -->
         <form name="profileForm" action="" id="profileForm" method="post">
            <!-- Forms Background -->
            <div class="forms bg-navyblue">
               <div class="col-md-6 col-md-offset-3">
                  <div class="row">
                     <div class="col-md-12" style="margin-top: 120px;">
                        <h3 style="background-color: #ffce00; font-weight: bold;" class="button-border">
                           <i class="fas fa-user"></i> User Profile
                        </h3>
                        <!-- General Tab Content Gray Color -->
                        <div class="tab-content__profile tab-content__border">
                           <div id="general" class="tab-pane fade in active">
                              <div class="form-horizontal">
                                 <!-- Username -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-5">Username</label>
                                    <div class="col-sm-7">
                                       <input type="text" class="form-control" name="username" id="username">
                                    </div>
                                 </div>
                                 <!--  Old Password -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-5">Old Password</label>
                                    <div class="col-sm-7">
                                       <input type="password" class="form-control" name="oldPassword" id="oldPassword">
                                    </div>
                                 </div>
                                 <!-- Password -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-5">New Password</label>
                                    <div class="col-sm-7">
                                       <input type="password" class="form-control" name="password" id="password"> <span class="hint"
                                          id="pwdHint"></span>
                                    </div>
                                 </div>
                                 <!-- Confirm Password -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-5">Confirm Password</label>
                                    <div class="col-sm-7">
                                       <input type="password" class="form-control" name="confirmPassword" id="confirmPassword">
                                    </div>
                                 </div>
                                 <!-- Last Name -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-5">Last Name</label>
                                    <div class="col-sm-7">
                                       <input type="text" class="form-control" name="lastName" id="lastName">
                                    </div>
                                 </div>
                                 <!-- First Name -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-5">First Name</label>
                                    <div class="col-sm-7">
                                       <input type="text" class="form-control" name="firstName" id="firstName">
                                    </div>
                                 </div>
                                 <!-- Middle Initial -->
                                 <div class="form-group">
                                    <label class="control-label col-sm-5">Middle Initial</label>
                                    <div class="col-sm-7">
                                       <input type="text" class="form-control" name="middleInitial" id="middleInitial">
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <!-- End of General Tab Content -->
                        <input type="submit" id="submit" class="btn bg-yellow col-sm-4 pull-right button-border">
                     </div>
                  </div>
               </div>
               <!--                User Information Prompt
               <div class="modal fade centered-modal" id="confirm-submit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
                  aria-hidden="true" data-backdrop="static">
                  <div class="modal-dialog modal-sm">
                     <div class="modal-content">
                        <div class="modal-header" id="modalHeader"></div>
                        <div class="modal-body" id="modalBody"></div>
                        <div class="modal-footer">
                           <a href="#" id="profileForm" class="btn btn-success success">Yes</a>
                           <button type="button" class="btn btn-danger" data-dismiss="modal">No</button>
                        </div>
                     </div>
                  </div>
               </div>
               End of User Information Prompt -->
            </div>
            <!-- End of Forms Background -->
         </form>
         <!-- End of Forms-->
      </div>
      <!-- End of Main Content -->
   </div>
   <!-- End of main container -->
   <script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
   <script src="js/profile.js"></script>
    <script src="js/logout.js"></script>
</body>
</html>