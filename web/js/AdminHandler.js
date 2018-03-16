$('document').ready(function(){   
	adminnHandler()
});

function adminnHandler(){
	$.post('AdminHandler', function (response) {
		if(response.redirect){
			   window.history.back();
		       return;
		}
	}).fail(function(){
		});
}