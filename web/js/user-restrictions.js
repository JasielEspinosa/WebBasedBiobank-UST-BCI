$('document').ready(function() {
	var role = $("#roleSession").data('value');
	//alert(role);
	if (role == "2") {
		$("div.role2").hide();
		$("li.role2").hide();
	}
});
