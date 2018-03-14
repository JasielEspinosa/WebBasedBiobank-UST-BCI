<!doctype html>
<html lang="en">
<head>
<title>USTH Biobank</title>
<link rel="icon" href="images/usthlogo.png">

<!-- REQUIRED META TAGS -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="fonts/open-sans.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/bootstrap-login.css">

<!-- JS -->
<script src="js/jquery-ui.js"></script>
<script src="js/jquery.min-2.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/login.js"></script>
<script src="js/jquery-git.js"></script>
<script src="js/sweetalert.min.js"></script>
</head>

<body>
  <!-- MAIN CONTAINER -->
  <section class="login__section">
    <div class="login__lefthalf">
      <img class="login__logo" alt="USTH Logo" src="images/usthlogo.png">
      <h5 class="login__logotext login__logotext--position">
        UST BENAVIDES<br>CANCER<br>INSTITUTE
      </h5>
      <article class="login__articlelefthalf">
        <h1 class="login__welcometext">Welcome</h1>
        <p class="login__description">University of Santo Tomas Benavides Cancer Institute seeks to provide the best
          in cancer care in the Philippines and the Asia Pacific region as well. It is a center capable of much more
          than an ordinary hospital or medical center which only provides cancer treatment services to patients. A
          competent medical staff and the most modern infrastructure available for treatment, research and training are
          exactly what define a medical facility like the Benavides Cancer Institute.</p>
      </article>
    </div>
    <div class="login__righthalf">
      <article class="login__articlerighthalf">
        <h2 class="login__logintext">Login to your account</h2>
        <form action="" id="loginForm" method="post">
          <input class="login__userinput" type="text" name="username" id="username" placeholder="Username" size="38">
          <br>
          <input class="login__userinput" type="password" name="password" id="password" placeholder="Password" size="38">
          <br>
          <input type="submit" id="loginButton" value="LOGIN" class="login__loginbuttonstyle">
          <a class="login__forgotpasswordlink" data-target="#genaudrep" data-toggle="modal">Forgot Password?</a>
        </form>

        <div id="invalid-login" class="alert alert-warning alert-block fade">
          <button type="button" class="close">&times;</button>
          <h4></h4>
          <p>The username or password that you entered is incorrect</p>
        </div>
      </article>
    </div>
  </section>
  <!-- END OF MAIN CONTAINER -->

  <!-- FORGOT PASSWORD MODAL  -->
  <div class="modal fade centered-modal" id="genaudrep" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
    aria-hidden="true" data-backdrop="static">
    <div class="modal-dialog modal-md">
      <div class="modal-content">
        <div class="modal-header">Forgot Password</div>
        <div class="modal-body">
          <div class="login__forpasslabel">We will send you an e-mail that will allow you to reset your password</div>
          <input style="margin: 0 auto;" class="login__forpassemval" type="text" name="forgotpasswordEmail"
            id="forgotpasswordEmail" placeholder="E-mail Address" size="40">
        </div>
        <div class="modal-footer">
          <button type="submit" onclick="sendMail();" class="btn btn-success">Send</button>
          <button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
        </div>
      </div>
    </div>
  </div>
  <!-- END OF PASSWORD MODAL  -->
  
  <script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
  <script src="css/js/popper.min.js"></script>
  <script src="css/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="js/jquery-git.js"></script>
  <script src="js/login.js"></script>
  
</body>
</html>