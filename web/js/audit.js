var params = {
	action : ''
};

$('document').ready(function() {
	loadUsers();
	$.post("UserManagementServlet", $.param(params), function(responseJson) {
		$.each(responseJson, function(index, user) {
			var option = new Option(user.firstName + " " + user.middleName + " " + user.lastName, user.accountId); 
			$('#doctor').append($(option));
		});
	});
	
});

function loadUsers() {
	$("#auditTable").addClass("table-loader");
	$("#auditTable").find("tr:gt(0)").remove();
	params.action = 'load';
	$.post("AuditServlet", $.param(params), function(responseJson) {
		$.each(responseJson, function(index, user) {
			$("<tr>").appendTo('#auditTable').append($("<td>").text(user.action)).append($("<td>").text(user.performedOn)).append(
					$("<td>").text(user.performedBy)).append($("<td>").text(user.date + " " + user.time))
		});
		$('#auditTable').dataTable({});
		$("#auditTable").removeClass("table-loader");
	});
};

