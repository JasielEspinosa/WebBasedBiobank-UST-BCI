	var params = {
	action: '',
	patientID: ''
};
	
function restorePatient(id){
	params.action='restore';
	params.patientID=id;
};
	
$('document').ready(function(){
	loadUsers();
});

$('#submitAction').click(function() {
	$.post('UnarchivePatientServlet', $.param(params), function (response) {
		if(response == "Success"){
			alert(response);
			$('#archivedPatientsTable').DataTable().destroy();
			loadUsers();
			closeModal();
		}else{
			alert(response);
		}
	}).fail(function(){
		});	
});

function closeModal(){
	$("#confirm-submit").modal('hide');
};


function loadUsers(){
    $("#archivedPatientsTable").addClass("table-loader");
	$("#archivedPatientsTable").find("tr:gt(0)").remove();
	params.action='load';
    $.post("UnarchivePatientServlet",$.param(params),function(responseJson) {
        $.each(responseJson, function(index, user) {   	
            $("<tr>").appendTo('#archivedPatientsTable')
            	.append("<td><button type='button' value='"+user.patientID +"' onClick=\"restorePatient(this.value)\"" +
            			"data-toggle=\"modal\" data-target=\"#confirm-submit\">Restore</button></td>")
                .append($("<td>").text(user.patientID))        
                .append($("<td>").text(user.patientName))  
        });
        $('#archivedPatientsTable').dataTable({});
        $("#archivedPatientsTable").removeClass("table-loader");
    });
};

