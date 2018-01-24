<!DOCTYPE html>
<html>
<head>

<title>USTH-BCI Biobank - AA, PHS, MDS</title>

<!-- CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">

<!-- JS -->
<script src="js/jquery.min.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/bootstrap.js"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>

</head>

<body>
   <!-- Main container -->
   <div class="container-fluid main-container">

      <!-- Header -->
      <div class="navbar navbar-default navbar-fixed-top">

         <!-- Banner -->
         <div class="row header bg-navyblue">
            <div class="col-sm-1">
               <img src="images/usthlogo.png" width="90%">
            </div>
            <div class="col-sm-10">
               <h4>UST-BCI Section of Clinical Hematology</h4>
               <p>Hematologic Disease Database</p>
            </div>
            <div class="col-sm-1">
               <img src="images/ustlogo.png" width="90%">
            </div>
         </div>
         <!-- End of Banner -->

         <!-- Navbar -->
         <div class="nav-collapse">
            <ul class="nav navbar-nav">

               <li><a href="dashboard.jsp">Dashboard</a></li>
               <li><a href="aaphsmds-baseline.jsp">AA, PHS, MDS</a></li>
               <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
               <li><a href="leukemia-baseline.jsp">Leukemia</a></li>
               <li><a href="lymphoma-baseline.jsp">Lymphoma</a></li>
               <li><a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a></li>
               <li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
               <li><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>

            </ul>
         </div>
         <!-- End of Navbar -->

      </div>
      <!-- End of header -->

      <!-- Main Content -->
      <div class="container-fluid bg-navyblue">

         <!-- Forms Container -->
         <form action="" method="post">

            <!-- Forms Background -->
            <div class="forms bg-navyblue">

               <h1 style="text-align: center; background-color: #ffce00;">User Profile</h1>
               <br />


               <!-- General Tab Content Gray Color -->
               <div class="tab-content">
                  <div id="general" class="tab-pane fade in active">
                     <div class="form-horizontal">

                        <!-- Patient ID Number -->
                        <div class="form-group">
                           <label class="control-label col-sm-5">Username</label>
                           <div class="col-sm-7">
                              <input type="text" class="form-control" name="username">
                           </div>
                        </div>

                        <!-- Password -->
                        <div class="form-group">
                           <label class="control-label col-sm-5">Password</label>
                           <div class="col-sm-7">
                              <input type="password" class="form-control" name="password">
                           </div>
                        </div>

                        <!-- Confirm Password -->
                        <div class="form-group">
                           <label class="control-label col-sm-5">Confirm Password</label>
                           <div class="col-sm-7">
                              <input type="password" class="form-control" name="confirmPassword">
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
                        <!-- 										<div class="form-group">
											<label class="control-label col-sm-5">Gender</label>
											<div class="col-sm-7">
												<div class="radio">
													<label><input type="radio" name="gender" value="1">Male</label>
												</div>
												<div class="radio">
													<label><input type="radio" name="gender" value="2">Female</label>
												</div>
											</div>
										</div> -->

                        <!-- DOB -->
                        <!-- 										<div class="form-group">
											<label class="control-label col-sm-5">Date of Birth</label>
											<div class="col-sm-7">
												<input type="date" class="form-control" name="dateOfBirth">
											</div>
										</div> -->

                        <!-- Address -->
                        <!-- 										<div class="form-group">
											<label class="control-label col-sm-5">Address</label>
											<div class="col-sm-7">
												<input type="text" class="form-control" name="address">
											</div>
										</div> -->

                        <!-- Civil Status -->
                        <!-- 										<div class="form-group">
											<label class="control-label col-sm-5">Civil Status</label>
											<div class="col-sm-7">
												<input type="text" class="form-control" name="civilStatus">
											</div>
										</div> -->

                     </div>
                  </div>
               </div>
               <!-- End of General Tab Content -->
               <input type="submit" class="btn bg-yellow col-sm-4 pull-right">
            </div>
            <!-- End of Forms Background -->

         </form>
         <!-- End of Forms-->

      </div>
      <!-- End of Main Content -->

   </div>
   <!-- End of main container -->

</body>
</html>