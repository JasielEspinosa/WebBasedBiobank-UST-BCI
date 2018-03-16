<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<!DOCTYPE html>
<html>
<head>
<title>USTH | Forgot Password</title>
<meta charset="utf-8">
<link rel="icon" href="images/usthlogo.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- CSS -->
<link rel="stylesheet" href="fonts/open-sans.css">
<!-- LOCAL 
<link rel="stylesheet" href="css/bootstrap.min.css">
-->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/navbar.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">

<!-- JS -->
<script src="js/jquery-ui.js"></script>
<script src="js/jquery.min-2.js"></script>
<!-- LOCAL
<script src="js/bootstrap.min.js"></script>
-->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script defer src="js/fontawesome-all.js"></script>
<script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>

</head>
<body>
  <!-- HEADER -->
  <div class="navbar-fixed-top">
    <div class="row header bg-navyblue">
      <div class="col-sm-1">
        <img src="images/usthlogo.png" class="header__logo--size header__logo--position">
      </div>
      <div class="col-sm-11 header__bannertitle--visibility header__bannertitle--position header__bannertitle--spacing">
        <h5>
          USTH BENAVIDES<br>CANCER<br>INSTITUTE
        </h5>
      </div>
    </div>
  </div>
  <!-- END OF HEADER -->

  <!-- MAIN CONTENT -->
  <div class="col-md-8 col-md-offset-2">
    <div class="row">
      <div class="col-md-12" style="margin-top: 150px;">
        <h3 style="background-color: #ffce00; font-weight: bold;" class="button-border">
          <i class="fas fa-unlock-alt"></i> Forgot Password
        </h3>
        <div class="tab-content__forpass tab-content__border">
          <div id="general" class="tab-pane fade in active">
            <div class="form-horizontal">
              <div class="row">
                <div class="col-md-4">
                  <div style="font-weight: bold;">Please enter a new password</div>
                </div>
                <div class="col-md-8">
                  <div class="tab-content__forpassform">
                    <div id="general" class="tab-pane fade in active">
                      <div class="form-horizontal">
                        <!-- NEW PASSWORD-->
                        <div class="form-group">
                          <label class="control-label col-sm-5">New Password</label>
                          <div class="col-sm-7">
                            <input type="text" class="form-control" name="newPassword" id="newPassword">
                          </div>
                        </div>
                        <!-- END OF NEW PASSWORD-->
                        <!--  CONFIRM NEW PASSWORD -->
                        <div class="form-group">
                          <label class="control-label col-sm-5">Confirm New Password</label>
                          <div class="col-sm-7">
                            <input type="password" class="form-control" name="confirmNewPassword" id="confirmNewPassword">
                          </div>
                        </div>
                        <!--  END OF CONFIRM NEW PASSWORD -->
                     </div>
                   </div>     
                  </div>
                  <input type="submit" class="btn bg-yellow col-sm-4 pull-right button-border">
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- END OF MAIN CONTENT -->
</body>
</html>