var params = {
	token : ''
};

$(window).on('pageshow', function(){
    console.info('Entered the page!');
    checkToken()
});

function checkToken(){
	params.token = $("#token").val();
	$.post('CheckToken', $.param(params), function(response) {
		swal("Fail!", response, "error");
	          $('.swal-button--confirm').click(function(){
	                window.location = "login.jsp";
	          });
	          return;
	}).fail(function() {
	});
}