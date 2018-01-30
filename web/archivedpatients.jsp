<!doctype html>
<html lang="en"> 
 <head>   
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Archived Patients</title>
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
    <script src="js/modal.js"></script>
     
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
            <div class="col-sm-10 offset-sm-2 settings__buttons--position">

               <!-- Buttons Container -->
               <div class="row button-container">  
                  <div class="col-sm-8">
                     <a href="usermanagement.jsp" type="button" class="btn bg-yellow btn-responsive">User Management</a> 
                     <a href="archivedpatients.jsp" type="button" class="btn bg-yellow btn-responsive">Archived Patients</a>
                  </div>
               </div>
               <!-- End of buttons container -->
               
                <!-- Table -->
                <h4 style="background-color: #ffce00; padding: 5px; font-weight: bold;">Archived Patients</h4>
               <table id="customers">
                 <tr>
                   <th onclick="sortTable(0)">Patient No.</th>
                   <th onclick="sortTable(1)">Patient Name</th>
                 </tr>
                 <tr>
                   <td>Carl</td>
                   <td>Martin</td>
                 </tr>
                 <tr>
                   <td>Fritz</td>
                   <td>Fritz</td>
                 </tr>
                 <tr>
                   <td>Martin</td>
                   <td>Carl</td>
                 </tr>
               </table><!-- End of Table -->

               <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                 <div class="modal-dialog">
                   <div class="modal-content">
                     <div class="modal-header">
                       <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                       <h4 class="modal-title" id="exampleModalLabel">User Information:</h4>
                     </div>
                     <div class="modal-body">
                       <form role="form">
                         <div class="form-group">
                           <label for="recipient-name" class="control-label">Username:</label>
                           <input type="text" class="form-control" id="username">
                         </div>
                         <div class="form-group">
                           <label for="message-text" class="control-label">Password:</label>
                           <textarea class="form-control" id="password"></textarea>
                         </div>
                         <div class="form-group">
                           <label for="message-text" class="control-label">Last Name:</label>
                           <textarea class="form-control" id="lastName"></textarea>
                         </div>
                         <div class="form-group">
                           <label for="message-text" class="control-label">First Name:</label>
                           <textarea class="form-control" id="firstName"></textarea>
                         </div>
                         <div class="form-group">
                           <label for="message-text" class="control-label">Middle Name:</label>
                           <textarea class="form-control" id="middleName"></textarea>
                         </div>
                       </form>
                     </div>
                     <div class="modal-footer">
                       <button type="button" class="btn btn-primary" onclick="myFunction()">Add</button>
                       <button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
                     </div>
                   </div>
                 </div>
               </div>
               
            </div>
           </div> 
      </div>
  </div> 
</div><!--/row-offcanvas -->

   </div><!-- End of main container -->
    
  </body>
</html>