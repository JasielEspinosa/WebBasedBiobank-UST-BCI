<!doctype html>
<html lang="en"> 
 <head>   
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Settings</title>
    <link rel="icon" href="images/usthlogo.png">
      
    <!-- CSS -->  
    <link rel="stylesheet" href="css/bootstrap.min.css"> 
    <link href="css/style.css" rel="stylesheet">
    <link rel="stylesheet" href="css/navbar.css">
    <link rel="stylesheet" href="css/sidebar.css">
    <link href="css/responsive.css" rel="stylesheet"> 
    <link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">
    
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  
    <!-- JS -->
    <!-- <script src="js/jquery.min.js"></script>  -->
    <script src="js/jquery-ui.js"></script>
   <!-- <script src="js/bootstrap.js"></script>  --> 
    <script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
     <script src="js/jquery.min-2.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/sidebar.js"></script>
    
     <!-- FONT -->
    <link rel="stylesheet" href="fonts/open-sans.css">
     
   <!-- FONT AWESOME ICON -->
   <script defer src="js/fontawesome-all.js"></script>
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
        <div class="container-fluid navbar__nav-item--hover">
          <!-- Brand and toggle get grouped for better mobile display -->
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
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
              <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
              
              <!-- Dropdown -->
              <li class="dropdown pull-right">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                <i class="fa fa-cog fa-lg" aria-hidden="true"></i><span class="caret"></span></a>
                <ul class="dropdown-menu dropdown-menu__text" role="menu">
                  <li><a href="audittrail.jsp">Audit Trail</a></li>
                  <li class="divider"></li>
                  <li><a href="profile.jsp">Profile</a></li>
                  <li class="divider"></li>
                  <li><a href="settings.jsp">Settings</a></li>
                  <li class="divider"></li>
                  <li><a href="#">Logout</a></li>
                </ul>
              </li>
              <!-- End of Dropdown -->
              
            </ul>
          </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
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
          <li class="active"><a href="#">Section</a></li>
          <li><a href="#">Section</a></li>
          <li><a href="#">Section</a></li>
          <li><a href="#">Section</a></li>
          <li><a href="#">Section</a></li>
          <li><a href="#">Section</a></li>
          <li><a href="#">Section</a></li>
          <li><a href="#">Section</a></li> 
          <li><a href="#">Section</a></li>
          <li><a href="#">Section</a></li>
        </ul>
      </div>
  </div>
   <div id="main">
      <div class="col-md-12">
       <p class="visible-xs">
            <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas"><i class="glyphicon glyphicon-chevron-left"></i></button>
       </p>
       
        <!-- Form Container -->
         <div class="row">
            <div class="col-sm-10 offset-sm-2 pull-right forms">

               <!-- Buttons Container -->
               <div class="row button-container">  
                  <div class="col-sm-8">
                     <a href="lymphoma-baseline.jsp" type="button" class="btn bg-yellow btn-responsive">user Management</a> <a
                        href="lymphoma-followup.jsp" type="button" class="btn bg-yellow btn-responsive">Archived Patients</a>
                  </div>
               </div>
               <!-- End of buttons container -->

               <!-- Forms -->
               <div class="row container-fluid">

                  <!-- General -->
                  <div class="col-sm-4">

                     <!-- General Tab -->
                     <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#general">General</a></li>
                     </ul>
                     <!-- End of General Tab -->

                     <!-- General Tab Content -->
                     <div class="tab-content">
                        <div id="general" class="tab-pane fade in active">

                           <!-- Form -->
                           <div class="form-horizontal">

                              <!-- Patient ID Number -->
                              <div class="form-group">
                                 <label class="control-label col-sm-5">Patient ID Number</label>
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
                                       <label><input type="radio" name="gender">Male</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="gender">Female</label>
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
                                       <label><input type="radio" name="tissueSpecimenCollected">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="tissueSpecimenCollected">No</label>
                                    </div>
                                 </div>
                              </div>

                              <!-- Specimen Type -->
                              <div class="form-group">
                                 <label class="control-label col-sm-5">Specimen Type</label>
                                 <div class="col-sm-7">
                                    <select class="form-control">
                                       <option value="">BMA</option>
                                       <option value="">BB</option>
                                       <option value="">LN</option>
                                    </select>
                                 </div>
                              </div>

                           </div>
                           <!-- End of form -->
       
    <!-- <h2>Fixed + Fluid Bootstrap Template with Off-canvas Sidebar</h2>
          <div class="row">
              <div class="col-md-12"><div class="well"><p>Shrink the browser width to make the sidebar collapse off canvase.</p></div></div>
          </div>
          <div class="row">
              <div class="col-md-4"><div class="well"><p>4 cols</p></div></div>
              <div class="col-md-4"><div class="well"><p>4 cols</p></div></div>
              <div class="col-md-4"><div class="well"><p>4 cols</p></div></div>
          </div>
          <div class="row">
              <div class="col-lg-6 col-sm-6"><div class="well"><p>6 cols, 6 small cols</p></div></div>
              <div class="col-lg-6 col-sm-6"><div class="well"><p>6 cols, 6 small cols</p></div></div>
          </div>
          <div class="row">
              <div class="col-lg-4 col-sm-6"><div class="well">4 cols, 6 small cols</div></div>
              <div class="col-lg-4 col-sm-6"><div class="well">4 cols, 6 small cols</div></div>
              <div class="col-lg-4 col-sm-12"><div class="well">4 cols, 12 small cols</div></div>
          </div> -->
      </div>
  </div> 
</div><!--/row-offcanvas -->
  
     
   </div>
    <!-- End of main container -->
    
  </body>
</html>