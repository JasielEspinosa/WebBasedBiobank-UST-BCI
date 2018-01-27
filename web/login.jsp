<!DOCTYPE html>
<html lang="en">
<head>
<!-- <script src="http://code.jquery.com/jquery-latest.min.js"></script>  -->

<!-- Webpage Title -->
<title>USTH Biobank</title>
<link rel="icon" href="bootstrap/images/usthlogo.png">

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->

<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">

<!-- Login CSS -->
<link rel="stylesheet" href="bootstrap/login/login.css">

<!-- Google Font -->
<link rel="stylesheet" href="bootstrap/fonts/open-sans.css">

<!-- Login Effects -->
<link rel="stylesheet" href="css/bootstrap-login.css">

</head>
<body>
   <div>
      <section>
         <div class="left-half">
            <!-- UST Hospital Logo -->
            <img alt="USTH Logo" src="bootstrap/images/usthlogo.png">
            <h5 class="ust-benavides-text-position">
               UST BENAVIDES<br>CANCER<br>INSTITUTE
            </h5>
            <article>
               <h1>Welcome</h1>
               <p>University of Santo Tomas Benavides Cancer Institute seeks to provide the best in cancer care in
                  the Philippines and the Asia Pacific region as well. It is a center capable of much more than an
                  ordinary hospital or medical center which only provides cancer treatment services to patients. A
                  competent medical staff and the most modern infrastructure available for treatment, research and
                  training are exactly what define a medical facility like the Benavides Cancer Institute.</p>
            </article>
         </div>
         <div class="right-half">
            <article>
               <h2>Login to your account</h2>
               <form action="" id="loginForm" method="post">
                  <input type="text" name="username" id="username" class="user-input" placeholder="Username" size="38"><br>
                  <input type="text" name="password" id = "password"class="user-input" placeholder="Password" size="38"><br>
                  <input type="submit" id = "loginButton" value="LOGIN" class="login-button-style"> <a href="#">Forgot
                     Password?</a>
               </form>
    
    		   	<div id="invalid-login" class="alert alert-warning alert-block fade">
      				<button href="#" type="button" class="close">&times;</button>
     				<h4></h4>
      				<p>The username or password that you entered is incorrect</p>
    			</div>
            </article>
         </div>
      </section>
   </div>
   <!-- Optional JavaScript -->
   <!-- jQuery first, then Popper.js, then Bootstrap JS -->
   <script src="bootstrap/jquery/jquery-3.3.1.min.js"></script>
   <script src="bootstrap/popper/popper.min.js"></script>
   <script src="bootstrap/js/bootstrap.min.js"></script>
   <script type="text/javascript" src="js/jquery-git.js"></script>
   <script type="text/javascript" src="js/test-alert.js"></script>
   <script src="js/login.js"></script>
</body>
</html>