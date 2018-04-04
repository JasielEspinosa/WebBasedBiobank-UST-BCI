var params = {
	username : '',
	password : '',
	confirmPassword : '',
	firstName : '',
	lastName : '',
	middleName : '',
	role : '',
	action : '',
	accountID : ''
};

function assignValues() {
	params.username = $("#username").val();
	params.password = $("#password").val();
	params.confirmPassword = $("#confirmPassword").val();
	params.firstName = $("#firstName").val();
	params.lastName = $("#lastName").val();
	params.middleName = $("#middleName").val();
	params.role = $("#role").val();
};

$('document').ready(function() {
	loadUsers();
});

$('#addEncoder').click(function() {
	clearFields();
	params.action = 'add';
	$("#modalHeader").text("Confirm add")
	$("#modalBody").text("Are you sure you want to add user?")
	$("#submitBtn").text("Add")
});

function deleteUser(id) {
	params.action = 'delete';
	params.accountID = id;
	$("#modalHeader").text("Confirm delete")
	$("#modalBody").text("Are you sure you want to delete user?")
};

function editUser(id) {
	params.action = 'editLoad';
	params.accountID = id;
	$("#modalHeader").text("Confirm edit")
	$("#modalBody").text("Are you sure you want to edit user?");
	$("#submitBtn").text("Edit")
	$.post('UserManagementServlet', $.param(params), function(response) {
		alert(response["Username"]);
		$("#username").val(response["Username"])
		$("#lastName").val(response["Lastname"])
		$("#firstName").val(response["Firstname"])
		$("#middleName").val(response["MiddleName"])
		$("#role").val(response["Role"])
		params.action = 'edit';
	}).fail(function() {
	});
}

$('#submitAction').click(function() {
	alert(params.action);
	alert(params.accountID)
	assignValues();
	$.post('UserManagementServlet', $.param(params), function(response) {
		if (response == "Success") {
			alert(response);
			$('#usersTable').DataTable().destroy();
			loadUsers();
			closeModal();
		} else {
			alert(response);
		}
	}).fail(function() {
	});
});

function clearFields() {
	$("#username").val('');
	$("#password").val('');
	$("#confirmPassword").val('');
	$("#firstName").val('');
	$("#lastName").val('');
	$("#middleName").val('');
	$("#role").val('');
};

function closeModal() {
	clearFields();
	$("#confirm-submit").modal('hide');
	$("#usermanagement__popup").modal('hide');
};

function loadUsers() {
	alert("loading data!");
	$("#usersTable").find("tr:gt(0)").remove();
	params.action = 'load';
	alert("test load");
	$.post("UserManagementServlet", $.param(params), function(responseJson) {

		$.each(responseJson, function(index, user) {
			roleVal = ''

			if (user.roleId == 1) {
				roleVal = 'Admin'
			} else {
				roleVal = 'Encoder'
			}

			$("<tr>").appendTo('#usersTable').append(
					"<td><button type='button' value='" + user.accountId + "' onClick=\"editUser(this.value)\""
							+ "data-toggle=\"modal\" data-target=\"#usermanagement__popup\">Edit</button></td>").append(
					"<td><button type='button' value='" + user.accountId + "' onClick=\"deleteUser(this.value)\""
							+ "data-toggle=\"modal\" data-target=\"#confirm-submit\">Delete</button></td>")
			// .append("<td><input type='checkbox' name='deleteUsers[]' value='"+user.accountId +"'/></td>")
			.append($("<td>").text(user.username)).append($("<td>").text(user.firstName + " " + user.middleName + " " + user.lastName))
					.append($("<td>").text(roleVal));
		});
		$('#usersTable').dataTable({});
	});
};

$(document).ready(function() {
	$('#usersTable').on('init.dt', function() {
		$("#usersTable").removeClass('table-loader').show();
	});
	setTimeout(function() {
		$('#usersTable').DataTable();
	}, 3000);
});

// value='"+user.accountId +"' onClick=\"editUser(this.value)\"
