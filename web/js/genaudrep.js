/* TABLE LOADER JS*/
	$(document).ready(function() {
		  $('#customers').on('init.dt',function() {
		        $("#customers").removeClass('table-loader').show();
		      });
		  setTimeout(function(){
		    $('#customers').DataTable();
		  }, 3000);
		} );
/* END OF TABLE LOADER JS*/	