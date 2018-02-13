var response;
$("#profileForm").submit(function(e) {
   e.preventDefault();
	});

$('document').ready(function(){
	$.post('LoadProfileServlet', function (response) {
		$("#username").val(response["Username"])
		$("#lastName").val(response["Lastname"])
		$("#firstName").val(response["Firstname"])
		$("#middleInitial").val(response["MiddleName"])
	}).fail(function(){
		});	
	
});
	
$('#profileForm').submit(function() {
	var $form = $(this);
	$.post('ProfileProcessServlet', $form.serialize(), function (response) {
		if(response == "Success"){
			alert(response);
			$("oldPassword").val("");
			$("password").val("");
			$("confirmPassword").val("");
		}else{
			alert(response);
		}
	}).fail(function(){
		});	
});