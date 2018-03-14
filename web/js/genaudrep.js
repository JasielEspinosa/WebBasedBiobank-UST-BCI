$(document).ready(function() {
  $('#auditTable').on('init.dt',function() {
        $("#auditTable").removeClass('table-loader').show();
      });
  setTimeout(function(){
    $('#auditTable').DataTable();
  }, 3000);
} );