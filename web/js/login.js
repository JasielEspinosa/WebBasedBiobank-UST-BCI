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
			swal("Failed!", "The username or password that you entered is incorrect", "error");
		}
	}).fail(function(){
		});	
});

$('.close').click(function () {
    $(this).parent().removeClass('in'); 
});

$('document').ready(function() {
	if (localStorage.getItem("autoLogout") != "") {
		// alert(localStorage.getItem("id1"));
		swal("Hey!", "You have been automatically logged out due to exceeding the session time limit", "info");
		localStorage.setItem("autoLogout", "");
	}
});