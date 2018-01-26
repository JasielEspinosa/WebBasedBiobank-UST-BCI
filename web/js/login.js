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
	$('#invalid-login').addClass('in');
	$.post('LoginServlet', $.param(params), function (response) {
		alert(response);
		if(response == 'Success'){
			$('#invalid-login').addClass('in');
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