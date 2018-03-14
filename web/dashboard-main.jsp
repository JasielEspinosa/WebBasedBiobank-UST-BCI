<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--   [if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
   [endif]-->
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>USTH | Dashboard</title>
<link rel="icon" href="images/usthlogo.png">
<!-- CSS -->
<link rel="stylesheet" href="fonts/open-sans.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/navbar.css">
<link rel="stylesheet" href="css/sidebar.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/pure-min.css">
<link rel="stylesheet" href="css/dashboard.css">
<link rel="stylesheet" href="css/grids-responsive-min.css">
<link rel="stylesheet" href="vendor/formvalidation/dist/css/formValidation.min.css">
<!-- JS -->
<script src="js/jquery-ui.js"></script>
<script src="js/jquery.min-2.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/Chart.js"></script>
<script src="js/Chart.min.js"></script>
<script src="js/Chart.bundle.js"></script>
<script src="js/Chart.bundle.min.js"></script>
<script src="js/dashboard-modal.js"></script>
<script src="js/graph.js" type="text/javascript"></script>
<script src="js/chart-animation.js"></script>
<script src="vendor/formvalidation/dist/js/formValidation.min.js"></script>
<script defer src="js/fontawesome-all.js"></script>
<!-- <script src="js/jquery.min.js"></script>  -->
<!-- <script src="js/bootstrap.js"></script>  -->
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
                     <li class="active"><a href="dashboard-main.jsp">Dashboard <span class="sr-only">(current)</span></a></li>
                     <li><a href="leukemia-baseline.jsp">Leukemia</a></li>
                     <li><a href="lymphoma-baseline.jsp">Lymphoma</a></li>
                     <li><a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a></li>
                     <li><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
                     <li><a href="aapnhmds-baseline.jsp">AA PNH MDS</a></li>
                     <li><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>
                     <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
                     <!-- Dropdown -->
                     <li class="dropdown pull-right"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                        aria-expanded="false"> <i class="fa fa-cog fa-lg" aria-hidden="true"></i><span class="caret"></span>
                     </a>
                        <ul class="dropdown-menu dropdown-menu__text" role="menu">
                           <li><a style="font-weight: bold;" href="audittrail.jsp"><i
                                 class="fas fa-file-alt dropdown-icons--margin"></i> Audit Trail</a></li>
                           <li class="divider" style="background-color: #000000;"></li>
                           <li><a style="font-weight: bold;" href="profile.jsp"><i class="fas fa-user-md dropdown-icons--margin"></i>
                                 Profile</a></li>
                           <li class="divider" style="background-color: #000000;"></li>
                           <li><a style="font-weight: bold;" href="usermanagement.jsp"><i
                                 class="fas fa-wrench dropdown-icons--margin"></i> Settings</a></li>
                           <li class="divider" style="background-color: #000000;"></li>
                           <li><a style="font-weight: bold;" href="login.jsp"><i class="fas fa-sign-out-alt dropdown-icons--margin"></i>
                                 Logout</a></li>
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
      <!-- Dashboard -->
      <!-- Main Content -->
      <div class="container-fluid bg-navyblue">
         <!-- Forms Container -->
         <form action="" id="#" method="post">
            <!-- Forms Background -->
            <div class="forms__profile bg-navyblue">
               <div class="col-md-10 col-md-offset-1">
                  <div class="row">
                     <div class="col-md-12 dashboard-main-content--position">
                        <h3 style="background-color: #ffce00; font-weight: bold; text-align: center;" class="button-border">
                           <i class="fas fa-search"></i> DISEASE OVERVIEW
                        </h3>
                        <!-- General Tab Content Gray Color -->
                        <div class="tab-content__dashboard tab-content__border">
                           <div id="general" class="tab-pane fade in active">
                              <div class="form-horizontal">
                                 <div class="row">
                                    <div class="col-md-3">
                                       <div class=" morph pic">
                                          <a data-target="#leukemiaModal" data-toggle="modal" id="leukemiaImg"> <img
                                             src="images/leukemiavectoredited.png" alt="leukemia">
                                          </a>
                                       </div>
                                    </div>
                                    <div class="col-md-3 dashboard__framecontainer">
                                       <div class="dashboard__images dashboard__images morph pic">
                                          <a data-target="#lymphomaModal" data-toggle="modal" id="lymphomaImg"> <img
                                             src="images/lymphomavectoredited.png" alt="lymphoma">
                                          </a>
                                          <div class="middle">
                                             <div class="text">LYMHPHOMA</div>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="col-md-3 dashboard__framecontainer">
                                       <div class="dashboard__images morph pic">
                                          <a data-target="#myeloproliferativeModal" data-toggle="modal" id="myeloproliferativeImg"> <img
                                             src="images/myeloproliferativevectoredited.png" alt="myeloproliferative">
                                          </a>
                                          <div class="middle">
                                             <div class="text">MYELOPROLIFERATIVE</div>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="col-md-3 dashboard__framecontainer">
                                       <div class="dashboard__images morph pic">
                                          <a data-target="#plasmaCellModal" data-toggle="modal" id ="plasmaCellImg"> <img
                                             src="images/plasmacellvectoredited.png" alt="plasma">
                                          </a>
                                          <div class="middle">
                                             <div class="text">PLASMA CELL DISORDER</div>
                                          </div>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="row col-md-offset-1">
                                    <div class="col-md-4 dashboard__framecontainer">
                                       <div class="dashboard__images morph pic">
                                          <a data-target="#aapnhmdsModal" data-toggle="modal" id="aapnhmdsImg"> <img
                                             src="images/aplasticanemiavectoredited.png" alt="aapnhmds">
                                          </a>
                                          <div class="middle">
                                             <div class="text">AA PNH MDS</div>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="col-md-4 dashboard__framecontainer">
                                       <div class="dashboard__images morph pic">
                                          <a data-target="#plateletDisorderModal" data-toggle="modal" id ="plateletDisorderImg"> <img
                                             src="images/plateletvectoredited.png" alt="platelet">
                                          </a>
                                          <div class="middle">
                                             <div class="text">PLATELET DISORDER</div>
                                          </div>
                                       </div>
                                    </div>
                                    <div class="col-md-4 dashboard__framecontainer">
                                       <div class="dashboard__images morph pic">
                                          <a data-target="#coagulationDiseaseModal" data-toggle="modal" id="coagulationDiseaseImg"> <img
                                             src="images/coagulationvectoredited.png" alt="coag">
                                          </a>
                                          <div class="middle">
                                             <div class="text">COAGULATION DISEASE</div>
                                          </div>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <!-- End of General Tab Content -->
                     </div>
                  </div>
               </div>
            </div>
            <!-- End of Forms Background -->
         </form>
         <!-- End of Forms-->
         <!-- Leukemia Modal  -->
         <div class="modal fade" id="leukemiaModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
            data-backdrop="static">
            <div class="modal-dialog modal-lg">
               <div class="modal-content">
                  <div class="modal-header">
                     Leukemia
                     <button type="button" class="close" data-dismiss="modal">
                        <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                     </button>
                  </div>
                  <div class="modal-body">
                     <div class="row">
                        <div class="col-md-3 ">
                           <div class="blur pic">
                              <img src="images/leukemiavector.png" alt="Leukemia Picture">
                           </div>
                        </div>
                        <div class="col-md-9">
                           <h3 style="font-weight: bold;">DISEASE NAME: LEUKEMIA</h3>
                           <p style="text-align: justify;">Leukemia is cancer of the blood cells. It starts in the bone marrow, the soft
                              tissue inside most bones. Bone marrow is where blood cells are made. White blood cells help your body fight
                              infection. Red blood cells carry oxygen to all parts of your body. Platelets help your blood clot. When you
                              have leukemia, the bone marrow starts to make a lot of abnormal white blood cells, called leukemia cells. They
                              don't do the work of normal white blood cells. They grow faster than normal cells, and they don't stop growing
                              when they should.</p>
                        </div>
                     </div>
                     <!-- General Statistics Carousel -->
                     <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators" id="carousel-indicator-1">
                           <li data-target="#carousel-example-generic" data-slide-to="0" class="active" data-toggle="tooltip"
                              data-placement="left" title="Age Statistics"></li>
                           <li data-target="#carousel-example-generic" data-slide-to="1" data-toggle="tooltip" data-placement="top"
                              title="Gender Statistics"></li>
                           <li data-target="#carousel-example-generic" data-slide-to="2" data-toggle="tooltip" data-placement="bottom"
                              title="Mode of Treatment Statistics"></li>
                           <li data-target="#carousel-example-generic" data-slide-to="3" data-toggle="tooltip" data-placement="top"
                              title="Baseline Disease Status Statistics"></li>
                           <li data-target="#carousel-example-generic" data-slide-to="4" data-toggle="tooltip" data-placement="bottom"
                              title="Follow-up Disease Status Statistics"></li>
                           <li data-target="#carousel-example-generic" data-slide-to="5" data-toggle="tooltip" data-placement="top"
                              title="Baseline Summarized Statistics"></li>
                           <li data-target="#carousel-example-generic" data-slide-to="6" data-toggle="tooltip" data-placement="right"
                              title="Followup Summarized Statistics"></li>
                        </ol>
                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                           <div class="item active">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Age Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="ageStatisticsFromLeukemia">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="ageStatisticsToLeukemia">
                                    </div>
                                 </div>
                                 <!-- End of To Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="leukemiaChartAge" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Gender Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="genderStatisticsFromLeukemia">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="genderStatisticsToLeukemia">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="leukemiaChartGender" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Mode of Treatment Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="modeOfTreatmentStatisticsFromLeukemia">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="modeOfTreatmentStatisticsToLeukemia">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="leukemiaChartModeOfTreatment" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="baselineStatisticsFromLeukemia">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="baselineStatisticsToLeukemia">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="leukemiaChartBaselineDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-Up Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="followupStatisticsFromLeukemia">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="followupStatisticsToLeukemia">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="leukemiaChartFollowupDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryBaselineStatisticsFromLeukemia">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryBaselineStatisticsToLeukemia">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="leukemiaSummarizedBaselineStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-up Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryFollowupStatisticsFromLeukemia">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryFollowupStatisticsToLeukemia">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="leukemiaSummarizedFollowupStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                        </div>
                        <!-- Controls -->
                        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev"> <span
                           class="glyphicon glyphicon-chevron-left modal__glyphicon--color" aria-hidden="true"></span> <span class="sr-only">Previous</span>
                        </a> <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next"> <span
                           class="glyphicon glyphicon-chevron-right modal__glyphicon--color" aria-hidden="true"></span> <span
                           class="sr-only">Next</span>
                        </a>
                     </div>
                     <!-- End of General Statistics Carousel -->
                  </div>
                  <div class="modal-footer">
                     <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                  </div>
               </div>
            </div>
         </div>
         <!-- End of Leukemia Modal  -->
         <!-- Lymphoma Modal  -->
         <div class="modal fade" id="lymphomaModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
            data-backdrop="static">
            <div class="modal-dialog modal-lg">
               <div class="modal-content">
                  <div class="modal-header">
                     Lymphoma
                     <button type="button" class="close" data-dismiss="modal">
                        <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                     </button>
                  </div>
                  <div class="modal-body">
                     <div class="row">
                        <div class="col-md-3 ">
                           <div class="blur pic">
                              <img src="images/lymphomavector.png" alt="Lymphoma Picture">
                           </div>
                        </div>
                        <div class="col-md-9">
                           <h3 style="font-weight: bold;">DISEASE NAME: LYMPHOMA</h3>
                           <p style="text-align: justify;">Cancer that begins in cells of the immune system. There are two basic
                              categories of lymphomas. One kind is Hodgkin lymphoma, which is marked by the presence of a type of cell
                              called the Reed-Sternberg cell. The other category is non-Hodgkin lymphomas, which includes a large, diverse
                              group of cancers of immune system cells. Non-Hodgkin lymphomas can be further divided into cancers that have
                              an indolent (slow-growing) course and those that have an aggressive (fast-growing) course.</p>
                        </div>
                     </div>
                     <!-- General Statistics Carousel -->
                     <div id="lymphoma-carousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                           <li data-target="#lymphoma-carousel" data-slide-to="0" class="active" data-toggle="tooltip"
                              data-placement="left" title="Age Statistics"></li>
                           <li data-target="#lymphoma-carousel" data-slide-to="1" data-toggle="tooltip" data-placement="top"
                              title="Gender Statistics"></li>
                           <li data-target="#lymphoma-carousel" data-slide-to="2" data-toggle="tooltip" data-placement="bottom"
                              title="Mode of Treatment Statistics"></li>
                           <li data-target="#lymphoma-carousel" data-slide-to="3" data-toggle="tooltip" data-placement="top"
                              title="Baseline Disease Status Statistics"></li>
                           <li data-target="#lymphoma-carousel" data-slide-to="4" data-toggle="tooltip" data-placement="bottom"
                              title="Follow-up Disease Status Statistics"></li>
                           <li data-target="#lymphoma-carousel" data-slide-to="5" data-toggle="tooltip" data-placement="top"
                              title="Baseline Summarized Statistics"></li>
                           <li data-target="#lymphoma-carousel" data-slide-to="6" data-toggle="tooltip" data-placement="right"
                              title="Followup Summarized Statistics"></li>
                        </ol>
                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                           <div class="item active">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Age Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="ageStatisticsFromLymphoma">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="ageStatisticsToLymphoma">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="lymphomaChartAge" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Gender Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="genderStatisticsFromLymphoma">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="genderStatisticsToLymphoma">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="lymphomaChartGender" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Mode of Treatment Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="modeOfTreatmentStatisticsFromLymphoma">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="modeOfTreatmentStatisticsToLymphoma">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="lymphomaModeOfTreatment" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="baselineStatisticsFromLymphoma">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="baselineStatisticsToLymphoma">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="lymphomaChartBaselineDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-Up Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="followupStatisticsFromLymphoma">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="followupStatisticsToLymphoma">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="lymphomaChartFollowupDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryBaselineStatisticsFromLymphoma">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryBaselineStatisticsToLymphoma">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="lymphomaSummarizedBaselineStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-up Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryFollowupStatisticsFromLymphoma">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryFollowupStatisticsToLymphoma">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="lymphomaSummarizedFollowupStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                        </div>
                        <!-- Controls -->
                        <a class="left carousel-control" href="#lymphoma-carousel" role="button" data-slide="prev"> <span
                           class="glyphicon glyphicon-chevron-left modal__glyphicon--color" aria-hidden="true"></span> <span class="sr-only">Previous</span>
                        </a> <a class="right carousel-control" href="#lymphoma-carousel" role="button" data-slide="next"> <span
                           class="glyphicon glyphicon-chevron-right modal__glyphicon--color" aria-hidden="true"></span> <span
                           class="sr-only">Next</span>
                        </a>
                     </div>
                     <!-- End of General Statistics Carousel -->
                  </div>
                  <div class="modal-footer">
                     <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                  </div>
               </div>
            </div>
         </div>
         <!-- End of Lymphoma Modal  -->
         <!-- Myeloproliferative Modal  -->
         <div class="modal fade" id="myeloproliferativeModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
            data-backdrop="static">
            <div class="modal-dialog modal-lg">
               <div class="modal-content">
                  <div class="modal-header">
                     Myeloproliferative Neoplasm
                     <button type="button" class="close" data-dismiss="modal">
                        <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                     </button>
                  </div>
                  <div class="modal-body">
                     <div class="row">
                        <div class="col-md-3 ">
                           <div class="blur pic">
                              <img src="images/myeloproliferativevector.png" alt="Myeloproliferative Neplasm Picture">
                           </div>
                        </div>
                        <div class="col-md-9">
                           <h3 style="font-weight: bold;">DISEASE NAME: MYELOPROLIFERATIVE NEOPLASM</h3>
                           <p style="text-align: justify;">Myeloproliferative neoplasms and myelodysplastic syndromes are diseases of
                              the blood cells. They include chronic myeloproliferative neoplasms, myelodysplastic syndromes, and
                              myelodysplastic/myeloproliferative neoplasms. Chronic myeloproliferative neoplasms are diseases in which the
                              bone marrow makes too many red blood cells, platelets, or certain white blood cells.</p>
                        </div>
                     </div>
                     
                     <!-- General Statistics Carousel -->
                     <div id="myelo-carousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                           <li data-target="#myelo-carousel" data-slide-to="0" class="active" data-toggle="tooltip"
                              data-placement="left" title="Age Statistics"></li>
                           <li data-target="#myelo-carousel" data-slide-to="1" data-toggle="tooltip" data-placement="top"
                              title="Gender Statistics"></li>
                           <li data-target="#myelo-carousel" data-slide-to="2" data-toggle="tooltip" data-placement="bottom"
                              title="Mode of Treatment Statistics"></li>
                           <li data-target="#myelo-carousel" data-slide-to="3" data-toggle="tooltip" data-placement="top"
                              title="Baseline Disease Status Statistics"></li>
                           <li data-target="#myelo-carousel" data-slide-to="4" data-toggle="tooltip" data-placement="bottom"
                              title="Follow-up Disease Status Statistics"></li>
                           <li data-target="#myelo-carousel" data-slide-to="5" data-toggle="tooltip" data-placement="top"
                              title="Baseline Summarized Statistics"></li>
                           <li data-target="#myelo-carousel" data-slide-to="6" data-toggle="tooltip" data-placement="right"
                              title="Followup Summarized Statistics"></li>
                        </ol>
                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                           <div class="item active">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Age Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="ageStatisticsFromMyeloproliferative">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="ageStatisticsToMyeloproliferative">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="myeloChartAge" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Gender Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="genderStatisticsFromMyeloproliferative">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="genderStatisticsToMyeloproliferative">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="myeloChartGender" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Mode of Treatment Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="modeOfTreatmentStatisticsFromMyeloproliferative">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="modeOfTreatmentStatisticsToMyeloproliferative">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="myeloModeOfTreatment" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" d="baselineStatisticsFromMyeloproliferative">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="baselineStatisticsToMyeloproliferative">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="myeloChartBaselineDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-Up Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="followupStatisticsFromMyeloproliferative">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="followupStatisticsToMyeloproliferative">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="myeloChartFollowupDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryBaselineStatisticsFromMyeloproliferative">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryBaselineStatisticsToMyeloproliferative">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="myeloSummarizedBaselineStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-up Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryFollowupStatisticsFromMyeloproliferative">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryFollowupStatisticsToMyeloproliferative">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="myeloSummarizedFollowupStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                        </div>
                        <!-- Controls -->
                        <a class="left carousel-control" href="#myelo-carousel" role="button" data-slide="prev"> <span
                           class="glyphicon glyphicon-chevron-left modal__glyphicon--color" aria-hidden="true"></span> <span class="sr-only">Previous</span>
                        </a> <a class="right carousel-control" href="#myelo-carousel" role="button" data-slide="next"> <span
                           class="glyphicon glyphicon-chevron-right modal__glyphicon--color" aria-hidden="true"></span> <span
                           class="sr-only">Next</span>
                        </a>
                     </div>
                     <!-- End of General Statistics Carousel -->
                  </div>
                  <div class="modal-footer">
                     <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                  </div>
               </div>
            </div>
         </div>
         <!-- End of Myeloproliferative Modal  -->
         <!-- Plasma Cell Modal  -->
         <div class="modal fade" id="plasmaCellModal" tabindex="-1" role="dialog" aria-labelledby="plasmaCellLabel" aria-hidden="true"
            data-backdrop="static">
            <div class="modal-dialog modal-lg">
               <div class="modal-content">
                  <div class="modal-header">
                     Plasma Cell Disorder
                     <button type="button" class="close" data-dismiss="modal">
                        <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                     </button>
                  </div>
                  <div class="modal-body">
                     <div class="row">
                        <div class="col-md-3 ">
                           <div class="blur pic">
                              <img src="images/plasmacellvector.png" alt="Plasma Cell Disorder Picture">
                           </div>
                        </div>
                        <div class="col-md-9">
                           <h3 style="font-weight: bold;">DISEASE NAME: PLASMA CELL DISORDER</h3>
                           <p style="text-align: justify;">Plasma cell dyscrasias (also termed plasma cell disorders and plasma cell
                              proliferative diseases) are a spectrum of progressively more severe monoclonal gammopathies in which a clone
                              or multiple clones of pre-malignant or malignant plasma cells (sometimes in association with
                              lymphoplasmacytoid cells or B lymphocytes) over-produce and secrete into the blood stream a myeloma protein,
                              i.e. an abnormal monoclonal antibody or portion thereof.</p>
                        </div>
                        
                        <!-- General Statistics Carousel -->
                     <div id="plasmacell-carousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                           <li data-target="#plasmacell-carousel" data-slide-to="0" class="active" data-toggle="tooltip"
                              data-placement="left" title="Age Statistics"></li>
                           <li data-target="#plasmacell-carousel" data-slide-to="1" data-toggle="tooltip" data-placement="top"
                              title="Gender Statistics"></li>
                           <li data-target="#plasmacell-carousel" data-slide-to="2" data-toggle="tooltip" data-placement="bottom"
                              title="Mode of Treatment Statistics"></li>
                           <li data-target="#plasmacell-carousel" data-slide-to="3" data-toggle="tooltip" data-placement="top"
                              title="Baseline Disease Status Statistics"></li>
                           <li data-target="#plasmacell-carousel" data-slide-to="4" data-toggle="tooltip" data-placement="bottom"
                              title="Follow-up Disease Status Statistics"></li>
                           <li data-target="#plasmacell-carousel" data-slide-to="5" data-toggle="tooltip" data-placement="top"
                              title="Baseline Summarized Statistics"></li>
                           <li data-target="#plasmacell-carousel" data-slide-to="6" data-toggle="tooltip" data-placement="right"
                              title="Followup Summarized Statistics"></li>
                        </ol>
                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                        
                           <div class="item active">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Age Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="ageStatisticsFromPlasmacell">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="ageStatisticsToPlasmacell">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plasmaCellChartAge" width="600" height="500"></canvas>
                              </div>
                           </div>
                           
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Gender Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="genderStatisticsFromPlasmacell">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="genderStatisticsToPlasmacell">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plasmaCellChartGender" width="600" height="500"></canvas>
                              </div>
                           </div>
                           
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Mode of Treatment Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="modeOfTreatmentStatisticsFromPlasmacell">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="modeOfTreatmentStatisticsToPlasmacell">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plasmaCellModeOfTreatment" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="baselineStatisticsFromPlasmacell">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="baselineStatisticsToPlasmacell">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plasmaCellBaselineDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-Up Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="followupStatisticsFromPlasmacell">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="followupStatisticsToPlasmacell">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plasmaCellFollowupDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryBaselineStatisticsFromPlasmacell">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryBaselineStatisticsToPlasmacell">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plasmaCellSummarizedBaselineStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-up Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryFollowupStatisticsFromPlasmacell">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryFollowupStatisticsToPlasmacell">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plasmaCellSummarizedFollowupStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                        </div>
                        <!-- Controls -->
                        <a class="left carousel-control" href="#plasmacell-carousel" role="button" data-slide="prev"> <span
                           class="glyphicon glyphicon-chevron-left modal__glyphicon--color" aria-hidden="true"></span> <span class="sr-only">Previous</span>
                        </a> <a class="right carousel-control" href="#plasmacell-carousel" role="button" data-slide="next"> <span
                           class="glyphicon glyphicon-chevron-right modal__glyphicon--color" aria-hidden="true"></span> <span
                           class="sr-only">Next</span>
                        </a>
                     </div>
                     <!-- End of General Statistics Carousel -->
                        
                  </div>
               </div>
               <div class="modal-footer">
                  <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
               </div>
            </div>
         </div>
      </div>
      <!-- End of Plasma Cell Modal  -->
      
      <!-- AA PNH MDS Modal  -->
      <div class="modal fade" id="aapnhmdsModal" tabindex="-1" role="dialog" aria-labelledby="plasmaCellLabel" aria-hidden="true"
         data-backdrop="static">
         <div class="modal-dialog modal-lg">
            <div class="modal-content">
               <div class="modal-header">
                  AA PNH MDS
                  <button type="button" class="close" data-dismiss="modal">
                     <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                  </button>
               </div>
               <div class="modal-body">
                  <div class="row">
                     <div class="col-md-3 ">
                        <div class="blur pic">
                           <img src="images/aplasticanemiavector.png" alt="AA PNH MDS Picture">
                        </div>
                     </div>
                     <div class="col-md-9">
                        <h3 style="font-weight: bold;">DISEASE NAME: AA PNH MDS</h3>
                        <p style="text-align: justify;">Aplastic anemia is a rare disease in which the bone marrow and the hematopoietic
                           stem cells that reside there are damaged. This causes a deficiency of all three blood cell types (pancytopenia):
                           red blood cells (anemia), white blood cells (leukopenia), and platelets (thrombocytopenia).</p>
                     </div>
                  </div>
                  
                  <!-- General Statistics Carousel -->
                     <div id="aapnhmds-carousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                           <li data-target="#aapnhmds-carousel" data-slide-to="0" class="active" data-toggle="tooltip"
                              data-placement="left" title="Age Statistics"></li>
                           <li data-target="#aapnhmds-carousel" data-slide-to="1" data-toggle="tooltip" data-placement="top"
                              title="Gender Statistics"></li>
                           <li data-target="#aapnhmds-carousel" data-slide-to="2" data-toggle="tooltip" data-placement="bottom"
                              title="Mode of Treatment Statistics"></li>
                           <li data-target="#aapnhmds-carousel" data-slide-to="3" data-toggle="tooltip" data-placement="top"
                              title="Baseline Disease Status Statistics"></li>
                           <li data-target="#aapnhmds-carousel" data-slide-to="4" data-toggle="tooltip" data-placement="bottom"
                              title="Follow-up Disease Status Statistics"></li>
                           <li data-target="#aapnhmds-carousel" data-slide-to="5" data-toggle="tooltip" data-placement="top"
                              title="Baseline Summarized Statistics"></li>
                           <li data-target="#aapnhmds-carousel" data-slide-to="6" data-toggle="tooltip" data-placement="right"
                              title="Followup Summarized Statistics"></li>
                        </ol>
                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                        
                           <div class="item active">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Age Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="ageStatisticsFromAAPNHMDS">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="aapnhmdsChartAge" width="600" height="500"></canvas>
                              </div>
                           </div>
                           
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Gender Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="genderStatisticsFromAAPNHMDS">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="genderStatisticsToAAPNHMDS">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="aapnhmdsChartGender" width="600" height="500"></canvas>
                              </div>
                           </div>
                           
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Mode of Treatment Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="modeOfTreatmentStatisticsFromAAPNHMDS">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="modeOfTreatmentStatisticsToAAPNHMDS">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="aapnhmdsModeOfTreatment" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="baselineStatisticsFromAAPNHMDS">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="baselineStatisticsToAAPNHMDS">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="aapnhmdsBaselineDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-Up Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="followupStatisticsFromAAPNHMDS">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="followupStatisticsToAAPNHMDS">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="aapnhmdsFollowupDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryBaselineStatisticsFromAAPNHMDS">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryBaselineStatisticsToAAPNHMDS">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="aapnhmdsSummarizedBaselineStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-up Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryFollowupStatisticsFromAAPNHMDS">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryFollowupStatisticsToAAPNHMDS">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="aapnhmdsSummarizedFollowupStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                        </div>
                        <!-- Controls -->
                        <a class="left carousel-control" href="#aapnhmds-carousel" role="button" data-slide="prev"> <span
                           class="glyphicon glyphicon-chevron-left modal__glyphicon--color" aria-hidden="true"></span> <span class="sr-only">Previous</span>
                        </a> <a class="right carousel-control" href="#aapnhmds-carousel" role="button" data-slide="next"> <span
                           class="glyphicon glyphicon-chevron-right modal__glyphicon--color" aria-hidden="true"></span> <span
                           class="sr-only">Next</span>
                        </a>
                     </div>
                     <!-- End of General Statistics Carousel -->
                  
               </div>
               <div class="modal-footer">
                  <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
               </div>
            </div>
         </div>
      </div>
      <!-- End of AA PNH MDS Modal  -->
      <!-- Platelet Disorder Modal  -->
      <div class="modal fade" id="plateletDisorderModal" tabindex="-1" role="dialog" aria-labelledby="plasmaCellLabel" aria-hidden="true"
         data-backdrop="static">
         <div class="modal-dialog modal-lg">
            <div class="modal-content">
               <div class="modal-header">
                  Platelet Disorder
                  <button type="button" class="close" data-dismiss="modal">
                     <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                  </button>
               </div>
               <div class="modal-body">
                  <div class="row">
                     <div class="col-md-3 ">
                        <div class="blur pic">
                           <img src="images/plateletvector.png" alt="Platelet Disorder Picture">
                        </div>
                     </div>
                     <div class="col-md-9">
                        <h3 style="font-weight: bold;">DISEASE NAME: PLATELET DISORDER</h3>
                        <p style="text-align: justify;">Platelets are little pieces of blood cells. Platelets help wounds heal and
                           prevent bleeding by forming blood clots. Problems can result from having too few or too many platelets, or from
                           platelets that do not work properly. If your blood has a low number of platelets, it is called thrombocytopenia.</p>
                     </div>
                  </div>
                  
                  <!-- General Statistics Carousel -->
                     <div id="platelet-carousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                           <li data-target="#platelet-carousel" data-slide-to="0" class="active" data-toggle="tooltip"
                              data-placement="left" title="Age Statistics"></li>
                           <li data-target="#platelet-carousel" data-slide-to="1" data-toggle="tooltip" data-placement="top"
                              title="Gender Statistics"></li>
                           <li data-target="#platelet-carousel" data-slide-to="2" data-toggle="tooltip" data-placement="bottom"
                              title="Mode of Treatment Statistics"></li>
                           <li data-target="#platelet-carousel" data-slide-to="3" data-toggle="tooltip" data-placement="top"
                              title="Baseline Disease Status Statistics"></li>
                           <li data-target="#platelet-carousel" data-slide-to="4" data-toggle="tooltip" data-placement="bottom"
                              title="Follow-up Disease Status Statistics"></li>
                           <li data-target="#platelet-carousel" data-slide-to="5" data-toggle="tooltip" data-placement="top"
                              title="Baseline Summarized Statistics"></li>
                           <li data-target="#platelet-carousel" data-slide-to="6" data-toggle="tooltip" data-placement="right"
                              title="Followup Summarized Statistics"></li>
                        </ol>
                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                        
                           <div class="item active">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Age Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="ageStatisticsFromPlateletDisorder">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="ageStatisticsToPlateletDisorder">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plateletChartAge" width="600" height="500"></canvas>
                              </div>
                           </div>
                           
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Gender Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="genderStatisticsFromPlateletDisorder">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="genderStatisticsToPlateletDisorder">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plateletChartGender" width="600" height="500"></canvas>
                              </div>
                           </div>
                           
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Mode of Treatment Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="modeOfTreatmentStatisticsFromPlateletDisorder">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="modeOfTreatmentStatisticsToPlateletDisorder">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plateletModeOfTreatment" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="baselineStatisticsFromPlateletDisorder">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="baselineStatisticsToPlateletDisorder">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plateletBaselineDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-Up Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="followupStatisticsFromPlateletDisorder">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="followupStatisticsToPlateletDisorder">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plateletFollowupDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryBaselineStatisticsFromPlateletDisorder">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryBaselineStatisticsToPlateletDisorder">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plateletSummarizedBaselineStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-up Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryFollowupStatisticsFromPlateletDisorder">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryFollowupStatisticsToPlateletDisorder">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="plateletSummarizedFollowupStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                        </div>
                        <!-- Controls -->
                        <a class="left carousel-control" href="#platelet-carousel" role="button" data-slide="prev"> <span
                           class="glyphicon glyphicon-chevron-left modal__glyphicon--color" aria-hidden="true"></span> <span class="sr-only">Previous</span>
                        </a> <a class="right carousel-control" href="#platelet-carousel" role="button" data-slide="next"> <span
                           class="glyphicon glyphicon-chevron-right modal__glyphicon--color" aria-hidden="true"></span> <span
                           class="sr-only">Next</span>
                        </a>
                     </div>
                     <!-- End of General Statistics Carousel -->
                  
               </div>
               <div class="modal-footer">
                  <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
               </div>
            </div>
         </div>
      </div>
      <!-- End of Platelet Disorder Modal  -->
      
      <!-- Coagulation Disease Modal  -->
      <div class="modal fade" id="coagulationDiseaseModal" tabindex="-1" role="dialog" aria-labelledby="plasmaCellLabel" aria-hidden="true"
         data-backdrop="static">
         <div class="modal-dialog modal-lg">
            <div class="modal-content">
               <div class="modal-header">
                  Coagulation Disease
                  <button type="button" class="close" data-dismiss="modal">
                     <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                  </button>
               </div>
               <div class="modal-body">
                  <div class="row">
                     <div class="col-md-3 ">
                        <div class="blur pic">
                           <img src="images/coagulationvector.png" alt="Platelet Disorder Picture">
                        </div>
                     </div>
                     <div class="col-md-9">
                        <h3 style="font-weight: bold;">DISEASE NAME: COAGULATION DISEASE</h3>
                        <p style="text-align: justify;">Severe liver disease (eg, cirrhosis, fulminant hepatitis, acute fatty liver of
                           pregnancy) may disturb hemostasis by impairing clotting factor synthesis. Because all coagulation factors are
                           made in the liver, both the PT and PTT are elevated in severe liver disorders. (PT results are typically reported
                           as INR.) Occasionally, decompensated liver disease also causes excessive fibrinolysis and bleeding due to
                           decreased hepatic synthesis of alpha 2-antiplasmin.</p>
                     </div>
                  </div>
                  
                  <!-- General Statistics Carousel -->
                     <div id="coagulation-carousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                           <li data-target="#coagulation-carousel" data-slide-to="0" class="active" data-toggle="tooltip"
                              data-placement="left" title="Age Statistics"></li>
                           <li data-target="#coagulation-carousel" data-slide-to="1" data-toggle="tooltip" data-placement="top"
                              title="Gender Statistics"></li>
                           <li data-target="#coagulation-carousel" data-slide-to="2" data-toggle="tooltip" data-placement="bottom"
                              title="Mode of Treatment Statistics"></li>
                           <li data-target="#coagulation-carousel" data-slide-to="3" data-toggle="tooltip" data-placement="top"
                              title="Baseline Disease Status Statistics"></li>
                           <li data-target="#coagulation-carousel" data-slide-to="4" data-toggle="tooltip" data-placement="bottom"
                              title="Follow-up Disease Status Statistics"></li>
                           <li data-target="#coagulation-carousel" data-slide-to="5" data-toggle="tooltip" data-placement="top"
                              title="Baseline Summarized Statistics"></li>
                           <li data-target="#coagulation-carousel" data-slide-to="6" data-toggle="tooltip" data-placement="right"
                              title="Followup Summarized Statistics"></li>
                        </ol>
                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                        
                           <div class="item active">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Age Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="ageStatisticsFromCoagulation">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="ageStatisticsToCoagulation">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="coagulationChartAge" width="600" height="500"></canvas>
                              </div>
                           </div>
                           
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Gender Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="genderStatisticsFromCoagulation">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="genderStatisticsToCoagulation">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="coagulationChartGender" width="600" height="500"></canvas>
                              </div>
                           </div>
                           
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Mode of Treatment Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="modeOfTreatmentStatisticsFromCoagulation">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="modeOfTreatmentStatisticsToCoagulation">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="coagulationModeOfTreatment" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="baselineStatisticsFromCoagulation">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="baselineStatisticsToCoagulation">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="coagulationBaselineDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-Up Disease Status Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="followupStatisticsFromCoagulation">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="followupStatisticsToCoagulation">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="coagulationFollowupDiseaseStatus" width="600" height="700"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Baseline Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryBaselineStatisticsFromCoagulation">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryBaselineStatisticsToCoagulation">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="coagulationSummarizedBaselineStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                           <div class="item">
                              <div class="carousel-label">
                                 <h3>
                                    <b>Follow-up Summarized Statistics</b>
                                 </h3>
                                 <br>
                                 <!-- To and From Date  -->
                                 <div class="form-group col-md-offset-3">
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">From:</label> <input type="date" class="form-control"
                                          name="fromDateAgeStats" id="summaryFollowupStatisticsFromCoagulation">
                                    </div>
                                    <div class="col-sm-4">
                                       <label for="message-text" class="control-label">To:</label> <input type="date" class="form-control"
                                          name="toDateAgeStats" id="summaryFollowupStatisticsToCoagulation">
                                    </div>
                                 </div>
                                 <!-- End of To and From Date -->
                              </div>
                              <div class="col-md-6 col-md-offset-3">
                                 <canvas id="coagulationSummarizedFollowupStatistics" width="600" height="500"></canvas>
                              </div>
                           </div>
                        </div>
                        <!-- Controls -->
                        <a class="left carousel-control" href="#coagulation-carousel" role="button" data-slide="prev"> <span
                           class="glyphicon glyphicon-chevron-left modal__glyphicon--color" aria-hidden="true"></span> <span class="sr-only">Previous</span>
                        </a> <a class="right carousel-control" href="#coagulation-carousel" role="button" data-slide="next"> <span
                           class="glyphicon glyphicon-chevron-right modal__glyphicon--color" aria-hidden="true"></span> <span
                           class="sr-only">Next</span>
                        </a>
                     </div>
                     <!-- End of General Statistics Carousel -->
                  
               </div>
               <div class="modal-footer">
                  <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
               </div>
            </div>
         </div>
      </div>
      <!-- End of Coagulation Disease Modal  -->
   </div>
   <!-- End of Main Content -->
   <!-- End of Dashboard -->
   </div>
   <!-- End of main container -->
<script src="js/dashboard-data.js"></script>   
</body>
</html>