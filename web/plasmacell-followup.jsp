<!DOCTYPE html>
<html>
<head>

<title>USTH-BCI Biobank - Plasma Cell Disorder</title>

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
<<<<<<< HEAD
               <li><a href="dashboard-main.jsp">Dashboard</a></li>
=======
               <li><a href="dashboard.jsp">Dashboard</a></li>
>>>>>>> branch 'master' of https://github.com/Mnizus/Web-Based-Biobank-for-UST-BCI.git
               <li><a href="aaphsmds-baseline.jsp">AA, PHS, MDS</a></li>
               <li><a href="coagulationdisease-baseline.jsp">Coagulation Disease</a></li>
               <li><a href="leukemia-baseline.jsp">Leukemia</a></li>
               <li><a href="lymphoma-baseline.jsp">Lymphoma</a></li>
               <li><a href="myelo-baseline.jsp">Myeloproliferative Neoplasm</a></li>
               <li class="active"><a href="plasmacell-baseline.jsp">Plasma Cell Disorder</a></li>
               <li><a href="plateletdisorder-baseline.jsp">Platelet Disorder</a></li>
            </ul>
         </div>
         <!-- End of Navbar -->

      </div>
      <!-- End of header -->

      <!-- Main Content -->
      <div class="container-fluid bg-grey">
         <!-- Sidebar -->
         <div class="row affix sidebar-container">
            <div class="col-sm-12 sidebar">

               <!-- Search Box -->
               <div class="row">
                  <div class="col-sm-12 search-box">
                     <div>
                        <input type="text" placeholder="Search..">
                     </div>
                  </div>
               </div>
               <!-- End of Search Box -->

               <!-- Sidenav -->
               <div class="row">
                  <ul id="sidebar" class="nav nav-stacked col-sm-12">
                     <li><a href="#">CD001</a></li>
                     <li><a href="#">CD002</a></li>
                     <li><a href="#">CD003</a></li>
                     <li><a href="#">CD004</a></li>
                     <li><a href="#">CD005</a></li>
                     <li><a href="#">CD006</a></li>
                     <li><a href="#">CD003</a></li>
                     <li><a href="#">CD004</a></li>
                     <li><a href="#">CD005</a></li>
                     <li><a href="#">CD006</a></li>
                     <li><a href="#">CD003</a></li>
                     <li><a href="#">CD004</a></li>
                     <li><a href="#">CD005</a></li>
                     <li><a href="#">CD006</a></li>
                  </ul>
               </div>
               <!-- End of Sidenav -->

               <!-- Add box -->
               <div class="row">
                  <div class="col-sm-12 add-box">
                     <button type="button" class="btn bg-yellow">Add Patient</button>
                  </div>
               </div>
               <!-- End of Add box -->

            </div>
         </div>
         <!-- End of Sidebar -->
         <!-- Forms Container -->
         <div class="row">
            <div class="col-sm-10 offset-sm-2 pull-right forms">

               <!-- Buttons Container -->
               <div class="row button-container">
                  <div class="col-sm-4">
                     <a href="plasmacell-baseline.jsp" type="button" class="btn bg-yellow">Baseline</a> <a
                        href="plasmacell-followup.jsp" type="button" class="btn bg-yellow">Follow Up</a>
                  </div>
               </div>
               <!-- End of Buttons Container -->

               <!-- Forms -->
               <div class="row">

                  <!-- Visit -->
                  <div class="col-sm-3">

                     <!-- Visit Tab -->
                     <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#Visit">Visits</a></li>
                     </ul>
                     <!-- End of Visit Tab -->

                     <!-- Visit Tab Content -->
                     <div class="tab-content">
                        <div class="visit">
                           <ul>
                              <a href="#"><li>02-24-2017</li></a>
                              <a href="#"><li>02-24-2017</li></a>
                              <a href="#"><li>02-24-2017</li></a>
                              <a href="#"><li>02-24-2017</li></a>
                              <a href="#"><li>02-24-2017</li></a>
                           </ul>
                        </div>
                     </div>
                     <!-- End of Visit Tab Content -->
                  </div>
                  <!-- End of Visit -->

                  <!-- Follow Up -->
                  <div class="col-sm-9">

                     <!-- Follow Up Navtabs-->
                     <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#medicalEvents">Medical Events</a></li>
                        <li><a data-toggle="tab" href="#clinical">Clinical</a></li>
                        <li><a data-toggle="tab" href="#laboratory">Laboratory</a></li>
                        <li><a data-toggle="tab" href="#diseaseStatus">Disease Status</a></li>
                     </ul>
                     <!-- End of Follow Up Navtabs -->

                     <!-- Follow Up Tab Content -->
                     <div class="tab-content">

                        <!-- Medical Events -->
                        <div id="medicalEvents" class="tab-pane fade in active">

                           <!-- Form -->
                           <div class="form-horizontal">

                              <!-- Date of Entry -->
                              <div class="form-group">
                                 <label class="control-label col-sm-6">Date of Entry</label>
                                 <div class="col-sm-6">
                                    <input type="date" class="form-control" name="dateOfEntry">
                                 </div>
                              </div>

                              <!-- Date of Visit -->
                              <div class="form-group">
                                 <label class="control-label col-sm-6">Date of Visit</label>
                                 <div class="col-sm-6">
                                    <input type="date" class="form-control" name="dateOfVisit">
                                 </div>
                              </div>

                              <!-- Questions -->
                              <br />
                              <div class="form-group">
                                 <label class="control-label col-sm-6">Did the patient stop or start a new
                                    medication for the hematologic malignancy?</label>
                                 <div class="col-sm-6">
                                    <div class="radio">
                                       <label><input type="radio" name="">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="">No</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-6">Result</label>
                                 <div class="col-sm-6">
                                    <input type="text" class="form-control" name="specify">
                                 </div>
                              </div>

                              <br />
                              <div class="form-group">
                                 <label class="control-label col-sm-6">Did the patient stop or start a new
                                    medication for other diseases?</label>
                                 <div class="col-sm-6">
                                    <div class="radio">
                                       <label><input type="radio" name="">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="">No</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-6">Result</label>
                                 <div class="col-sm-6">
                                    <input type="text" class="form-control" name="specify">
                                 </div>
                              </div>

                              <br />
                              <div class="form-group">
                                 <label class="control-label col-sm-6">Did the patient undergo any procedure or
                                    intervention?</label>
                                 <div class="col-sm-6">
                                    <div class="radio">
                                       <label><input type="radio" name="">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="">No</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-6">Result</label>
                                 <div class="col-sm-6">
                                    <input type="text" class="form-control" name="specify">
                                 </div>
                              </div>

                              <br />
                              <div class="form-group">
                                 <label class="control-label col-sm-6">Were there complications from
                                    chemotherapy?</label>
                                 <div class="col-sm-6">
                                    <div class="radio">
                                       <label><input type="radio" name="">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="">No</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-6">Result</label>
                                 <div class="col-sm-6">
                                    <input type="text" class="form-control" name="specify">
                                 </div>
                              </div>


                           </div>

                        </div>
                        <!-- End of Medical Events -->

                        <!-- Clinical -->
                        <div id="clinical" class="tab-pane fade in">

                           <!-- Form -->
                           <div class="form-horizontal">

                              <!-- Current Symptoms -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Current Symptoms</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="currentSymptoms">
                                 </div>
                              </div>

                              <br />
                              <!-- Physical Exam -->
                              <h3 class="text-center">Current Physical Exam</h3>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Weight</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="weight" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">ECOG</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="ecog" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Pertinent findings</label>
                                 <div class="col-sm-6">
                                    <div class="radio">
                                       <label><input type="radio" name="">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="">No</label>
                                    </div>
                                 </div>
                              </div>

                           </div>

                        </div>
                        <!-- End of Clinical -->

                        <!-- Laboratory -->
                        <div id="laboratory" class="tab-pane fade in">

                           <!-- Form -->
                           <div class="form-horizontal">

                              <!-- Date of Blood Collection -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Date of blood collection</label>
                                 <div class="col-lg-8">
                                    <input type="date" class="form-control" name="dateOfCloodCollection" />
                                 </div>
                              </div>

                              <br />
                              <!-- Hematology -->
                              <h3 class="text-center">Hematology</h3>

                              <!-- Labels -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Laboratory Parameter</label> <label
                                    class="col-sm-4" style="text-align: left;">Result</label>
                                 <div class="col-sm-4">
                                    <input type="checkbox"> <label>Not done</label>
                                 </div>
                              </div>
                              <!-- End of Labels -->

                              <!-- Fields -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Hemoglobin (g/L)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="hemoglobin" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Hematocrit (%)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="hematocrit" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">White blood cells (x10 ^9/L)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="whiteBloodCells" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Neutrophils (%)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="neutrophils" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Lymphocytes (%)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="lymphocytes" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Monocytes (%)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="monocytes" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Eosinophils (%)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="eosiphils" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Basophils (%)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="basophils" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Myelocytes (%)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="myelocytes" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Metamyelocytes (%)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="metamyelocytes" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Blasts (%)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="blasts" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Platelet count (x 10^9/L)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="plateletCount" />
                                 </div>
                              </div>
                              <!-- End of Fields -->

                              <br />
                              <!-- Blood Chemistry -->
                              <h3 class="text-center">Blood Chemistry</h3>

                              <!-- Labels -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Laboratory Parameter</label> <label
                                    class="col-lg-4" style="text-align: left;">Result</label>
                                 <div class="col-lg-4">
                                    <input type="checkbox"> <label>Not done</label>
                                 </div>
                              </div>
                              <!-- End of labels -->

                              <!-- Fields -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Creatinine (mg/dl)</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="reticulocyteCount" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Ionized calcium (mg/dl) </label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="ionizedCalcium" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Total Protein</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="totalProtein" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Albumin</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="albumin" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Globulin</label>
                                 <div class="col-lg-4">
                                    <input type="text" class="form-control" name="globulin" />
                                 </div>
                              </div>
                              <!-- End of fields -->
                              <br />

                              <!-- Imaging Studies -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Imaging Studies</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio" name="imagingStudies">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="imagingStudies">No</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="imagingStudies">Not Applicable</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Result</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="result" />
                                 </div>
                              </div>

                              <!-- Bone Marrow  -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Bone Marrow Aspirate and Biopsy result</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio" name="boneMarrowAspirate">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="boneMarrowAspirate">No</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Date Performed</label>
                                 <div class="col-lg-8">
                                    <input type="date" class="form-control" name="datePerformed" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Description</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="description" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Attach scanned document</label>
                                 <div class="col-sm-8">
                                    <input type="file" class="form-control" name="attachScannedDocument" />
                                 </div>
                              </div>

                              <!-- Serum free light chain assay -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Serum free light chain assay</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio" name="serumFreeLightChainAsssay">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="serumFreeLightChainAsssay">No</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="serumFreeLightChainAsssay">Not
                                          Applicable</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Result</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="result" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Attach scanned document</label>
                                 <div class="col-sm-8">
                                    <input type="file" class="form-control" name="attachScannedDocument" />
                                 </div>
                              </div>

                              <!-- Serum protein electrophoresis -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Serum protein electrophoresis</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio" name="serumProteinElectrophoresis">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="serumProteinElectrophoresis">No</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="serumProteinElectrophoresis">Not
                                          Applicable</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Result</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="result" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Attach scanned document</label>
                                 <div class="col-sm-8">
                                    <input type="file" class="form-control" name="attachScannedDocument" />
                                 </div>
                              </div>

                              <!-- Serum Immunofixation -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Serum Immunofixation</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio" name="serumImmunofixation">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="serumImmunofixation">No</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio" name="serumImmunofixation">Not
                                          Applicable</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Result</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="result" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Attach scanned document</label>
                                 <div class="col-sm-8">
                                    <input type="file" class="form-control" name="attachScannedDocument" />
                                 </div>
                              </div>

                              <!-- Urine protein electrophoresis/Immunofixation -->
                              <div class="form-group">
                                 <label class="control-label col-sm-4">Urine protein
                                    electrophoresis/Immunofixation</label>
                                 <div class="col-sm-8">
                                    <div class="radio">
                                       <label><input type="radio"
                                          name="urineProteinElectrophoresisImmunofixation">Yes</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio"
                                          name="urineProteinElectrophoresisImmunofixation">No</label>
                                    </div>
                                    <div class="radio">
                                       <label><input type="radio"
                                          name="urineProteinElectrophoresisImmunofixation">Not Applicable</label>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Result</label>
                                 <div class="col-sm-8">
                                    <input type="text" class="form-control" name="result" />
                                 </div>
                              </div>
                              <div class="form-group">
                                 <label class="control-label col-lg-4">Attach scanned document</label>
                                 <div class="col-sm-8">
                                    <input type="file" class="form-control" name="attachScannedDocument" />
                                 </div>
                              </div>

                           </div>
                           <!-- End of Form -->

                        </div>
                        <!-- End of Laboratory -->

                        <!-- Disease Status -->
                        <div id="diseaseStatus" class="tab-pane fade in">

                           <!-- Form -->
                           <div class="form-horizontal">

                              <div class="form-group">
                                 <label class="control-label col-lg-5">Disease Status</label>
                                 <div class="col-lg-5">
                                    <select class="form-control" name="diseaseStatus">
                                       <option selected="selected" disabled="disabled">Select</option>
                                       <option value="">CR (Complete Remission): platelet count > 100 x 109/L</option>
                                       <option value="">sCR (stringent complete remission)</option>
                                       <option value="">immunophenotypic CR</option>
                                       <option value="">Molecular CR</option>
                                       <option value="">VGPR (Very Good Partial Response)</option>
                                       <option value="">PR (Partial response)</option>
                                       <option value="">MR (minimal response for relapsed refractory myeloma
                                          only)</option>
                                       <option value="">SD (Stable Disease)</option>
                                       <option value="">PD (Progressive Disease)</option>
                                       <option value="">Relapse</option>
                                       <option value="">Dead</option>
                                       <option value="">Others</option>
                                    </select>
                                 </div>
                              </div>

                              <div class="form-group">
                                 <label class="control-label col-lg-5">For Relapse Disease</label>
                                 <div class="col-lg-5">
                                    <select class="form-control" name="diseaseStatus">
                                       <option selected="selected" disabled="disabled">Select</option>
                                       <option value="">Clinical Relapse</option>
                                       <option value="">Relapse from CR</option>
                                    </select>
                                 </div>
                              </div>

                              <div class="form-group">
                                 <label class="control-label col-lg-5">Others</label>
                                 <div class="col-lg-5">
                                    <input type="text" class="form-control" name="others" />
                                 </div>
                              </div>

                              <div class="form-group">
                                 <label class="control-label col-lg-5">Special Notes</label>
                                 <div class="col-lg-5">
                                    <input type="text" class="form-control" name="notes" />
                                 </div>
                              </div>

                           </div>
                           <!-- End of form -->

                        </div>
                        <!-- End of Disease Status -->

                     </div>
                     <!-- End of Follow Up Tab Content -->

                     <input type="submit" class="btn bg-yellow col-sm-4 pull-right">
                  </div>
                  <!-- End of Follow Up -->
               </div>
            </div>
         </div>
         <!-- End of Forms -->
      </div>
      <!-- End of Main Content -->
   </div>
   <!-- End of main container -->

</body>
</html>