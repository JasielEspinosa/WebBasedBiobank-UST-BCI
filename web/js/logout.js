$('document').ready(function(){
	$( document ).idleTimer(600000);
    $( document ).on( "idle.idleTimer", function(event, elem, obj){
    	$.post('LogoutServlet', function (response) {
    		if(response.redirect){
 		       window.location = response.redirect;
 		       return;
 		}
    	}).fail(function(){
    		});
    });
});