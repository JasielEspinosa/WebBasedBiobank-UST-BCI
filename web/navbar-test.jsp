<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">   
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title> 
   
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet"> 
    <link rel="stylesheet" href="css/navbar.css">
 
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <!-- FONT AWESOME ICON -->
   <script defer src="js/fontawesome-all.js"></script>
    
   <!-- FONT -->
   <link rel="stylesheet" href="fonts/open-sans.css">
  </head>
  <body> 

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
        <li><a href="#">Dashboard</a></li>
        <li><a href="leukemia-baseline.jsp">Leukemia</a></li>
        <li><a href="lymphoma-baseline.html">Lymphoma</a></li>
        <li><a href="myelo-baseline.html">Myeloproliferative Neoplasm</a></li>
        <li><a href="plasmacell-baseline.html">Plasma Cell Disorder</a></li>
        <li><a href="aaphsmds-baseline.html">AA DNS MDS</a></li>
        <li><a href="plateletdisorder-baseline.html">Platelet Disorder</a></li>
        <li><a href="coagulationdisease-baseline.html">Coagulation Disease</a></li>
        <li class="dropdown pull-right">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
          <i class="fa fa-cog fa-lg" aria-hidden="true"></i><span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="audittrail.jsp">Audit Trail</a></li>
            <li class="divider"></li>
            <li><a href="profile.jsp">Profile</a></li>
            <li class="divider"></li>
            <li><a href="settings.jsp">Settings</a></li>
            <li class="divider"></li>
            <li><a href="#">Logout</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>