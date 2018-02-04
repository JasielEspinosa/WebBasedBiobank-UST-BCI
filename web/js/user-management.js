var params = {
	username : '',
	password : '',
	firstName: '',
	lastName: '',
	middleName: '',
	action: '',
	accountID: ''
};

function assignValues(){
	params.username = $("#username").val();
	params.password = $("#password").val();
	params.firstName = $("#firstName").val();
	params.lastName = $("#lastName").val();
	params.middleName = $("#middleName").val();
};

$('document').ready(function(){
	loadUsers();
});

$('#addEncoder').click(function(){
	params.action='add';
	$("#modalHeader").text("Confirm add")
	$("#modalBody").text("Are you sure you want to add user?")
});

function deleteUser(id){
	params.action='delete';
	params.accountID=id;
	$("#modalHeader").text("Confirm delete")
	$("#modalBody").text("Are you sure you want to delete user?")
};

$('#submitAction').click(function() {
	alert(params.action);
	alert(params.accountID)
	assignValues();
	$.post('UserManagementServlet', $.param(params), function (response) {
		if(response == "Success"){
			alert(response);
			loadUsers();
			closeModal();
		}else{
			alert(response);
		}
	}).fail(function(){
		});	
});

function closeModal(){
	$("#username").val('');
	$("#password").val('');
	$("#confirmPassword").val('');
	$("#firstName").val('');
	$("#lastName").val('');
	$("#middleName").val('');
	$("#confirm-submit").modal('hide');
	$("#usermanagement__popup").modal('hide');
};

function editUser(id){
	params.action='edit';
	alert(params.action);
}

function loadUsers(){
	alert("loading data!");
	$("#usersTable").find("tr:gt(0)").remove();
	params.action='load';
	alert("test load");
    $.post("UserManagementServlet",$.param(params),function(responseJson) {         
        $.each(responseJson, function(index, user) {   
            $("<tr>").appendTo('#usersTable')
            	.append("<button type='button' value='"+user.accountId +"' onClick=\"deleteUser(this.value)\"" +
            			"data-toggle=\"modal\" data-target=\"#confirm-submit\">Delete</button>")
            	//.append("<td><input type='checkbox' name='deleteUsers[]' value='"+user.accountId +"'/></td>")
                .append($("<td>").text(user.username))        
                .append($("<td>").text(user.firstName + " " + user.middleName + " " + user.lastName))
                .append($("<td>").text(user.roleId));    
        });
    });
};

//value='"+user.accountId +"' onClick=\"editUser(this.value)\"