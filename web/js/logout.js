$('document').ready(function(){
	$( document ).idleTimer(600000);
    $( document ).on( "idle.idleTimer", function(event, elem, obj){
    	$.post('LogoutServlet', function (response) {
    		if(response.redirect){
    			localStorage.setItem("autoLogout", "val");
 		       window.location = response.redirect;
 		       return;
 		}
    	}).fail(function(){
    		});
    });
    
    sessionHandler()
    
});


function logout(){
	$.post('LogoutServlet', function (response) {
		if(response.redirect){
		       window.location = response.redirect;
		       return;
		}
	}).fail(function(){
		});
};


function sessionHandler(){
	$.post('SessionHandler', function (response) {
		if(response.redirect){
		       window.location = response.redirect;
		       return;
		}
	}).fail(function(){
		});
}