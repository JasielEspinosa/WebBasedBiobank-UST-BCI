var response;
$("#profileForm").submit(function(e) {
   e.preventDefault();
	});
	
$('#profileForm').submit(function() {
	var $form = $(this);
	assignValues();
	$.post('ProfileProcessServlet', $form.serialize(), function (response) {
		alert(response);
		if(response == "Success"){
			alert(response);
		}else{
			alert(response);
		}
	}).fail(function(){
		});	
});