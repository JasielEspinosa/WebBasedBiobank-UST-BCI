var params = {
	username : '',
	password : ''
};

function assignValues(){
	params.username = $("#username").val();
	params.password = $("#password").val();
};

var response;
$("#loginForm").submit(function(e) {
   e.preventDefault();
	});
	
	
	
$('#loginForm').submit(function() {
	assignValues();
	$.post('LoginServlet', $.param(params), function (response) {
		if(response.redirect){
		       window.location = response.redirect;
		       return;
		}
		if(response == "Failed"){
			$('#invalid-login').addClass('in');
		}
	}).fail(function(){
		});	
});

$('.close').click(function () {
    $(this).parent().removeClass('in'); 
});