var response;
$("#addUser").submit(function(e) {
	e.preventDefault();
});

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
	$("#modalHeader").text("Confirm archive")
	$("#modalBody").text("Are you sure you want to archive this user?")
};

function restoreUser(id) {
	params.action = 'restore';
	params.accountID = id;
	$("#modalHeader").text("Confirm restore")
	$("#modalBody").text("Are you sure you want to restore this user?")
};

function editUser(id) {
	params.action = 'editLoad';
	params.accountID = id;
	$("#modalHeader").text("Confirm edit")
	$("#modalBody").text("Are you sure you want to edit user?");
	$("#submitBtn").text("Edit")
	$.post('UserManagementServlet', $.param(params), function(response) {
		// alert(response["Username"]);
		$("#username").val(response["Username"])
		$("#password").val(response["Password"])
		$("#confirmPassword").val(response["Password"])
		$("#lastName").val(response["Lastname"])
		$("#firstName").val(response["Firstname"])
		$("#middleName").val(response["MiddleName"])
		$("#role").val(response["Role"])
		params.action = 'edit';
	}).fail(function() {
	});
}

var formPasswordForm = document.forms["addUser"];
var username = document.getElementById("username");
var elemPW = document.getElementById("password");
var elemCPW = document.getElementById("confirmPassword");
var success = false;

function fnValidatePassword(evt) {
	// enter your regular expression to check for at least 8 characters here
	var regexPasswordLength = /.{8,}/; // test for at least 8 characters
	// enter your regular expression to check for an uppercase letter here
	var regexPasswordContainsUpperCase = /[A-Z]/; // test for uppercase letter
	// enter your regular expression to check for a lowercase letter here
	var regexPasswordContainsLowerCase = /[a-z]/; // test for lowercase letter
	// enter your regular expression to check for a number here
	var regexPasswordContainsNumber = /\d/; // test for number
	// enter your regular expression to check for a special character here
	var regexPasswordContainsSpecialChar = /\W/; // test for special character

	success = true;

/*	if (elemUSER.value != "") {
		usernameHint.innerHTML = 'Username must not be empty';
		usernameHint.style.display = "inline";
		success = false;
	} else {
		usernameHint.innerHTML = '';
		usernameHint.style.display = "inline";
	}*/

	if (elemPW.value != "") {

		if (!regexPasswordLength.test(elemPW.value)) {
			pwdHint.innerHTML = "Password must be at least 8 characters.";
			success = false;
		} else if (!regexPasswordContainsUpperCase.test(elemPW.value)) {
			pwdHint.innerHTML = "Password must contain an uppercase character.";
			success = false;
		} else if (!regexPasswordContainsLowerCase.test(elemPW.value)) {
			pwdHint.innerHTML = "Password must contain an lowercase character.";
			success = false;
		} else if (!regexPasswordContainsNumber.test(elemPW.value)) {
			pwdHint.innerHTML = "Password must contain a number.";
			success = false;
		} else {
			pwdHint.innerHTML = "";
		}

		/*	if (!regexPasswordContainsSpecialChar.test(elemPW.value)) {
				pwdHint.innerHTML = "Password must contain a special character.";
				success = false;
			}*/

		if (elemCPW.value != elemPW.value) {
			confPwdHint.innerHTML = "Password does not match the confirm password";
			success = false;
		} else {
			confPwdHint.innerHTML = "";
		}

	} else {
		elemCPW.value = "";
	}

	if (success) {
		$("#confirm-submit").modal('show');
		usernameHint.innerHTML = "";
		pwdHint.innerHTML = "";
		confPwdHint.innerHTML = "";
	}
	evt.preventDefault();
}

formPasswordForm.addEventListener("submit", fnValidatePassword);

$('#submitAction').click(function() {
	// alert(params.action);
	// alert(params.accountID)
	assignValues();

	$.post('UserManagementServlet', $.param(params), function(response) {

		if (params.action == "add") {
			if (response == "Success") {
				// alert(response);
				alert("User added successfully");
				$('#usersTable').DataTable().destroy();
				loadUsers();
				closeModal();
			} else if (response == "userExists") {
				usernameHint.innerHTML = "User already existed. Please choose another username";
				$("#confirm-submit").modal('hide');
			} else {
				alert("User add failed. Recheck the fields again or contact administrator");
				$("#confirm-submit").modal('hide');
			}
		} else if (params.action == "edit") {
			if (response == "Success") {
				// alert(response);
				alert("User edited successfully");
				$('#usersTable').DataTable().destroy();
				loadUsers();
				closeModal();
			} else if (response == "userExists") {
				usernameHint.innerHTML = "User already existed. Please choose another username";
				$("#confirm-submit").modal('hide');
			} else if (response == "noChange") {
				alert("No changes occured");
				$("#confirm-submit").modal('hide');
			} else {
				alert("User edit failed. Recheck the fields again or contact administrator");
			}
		} else if (params.action == "delete") {
			if (response == "Success") {
				alert("User archived successfully");
				$('#usersTable').DataTable().destroy();
				loadUsers();
				closeModal();
			} else {
				alert("User archive failed. Contact administrator");
				$("#confirm-submit").modal('hide');
			}
		} else if (params.action == "restore") {
			if (response == "Success") {
				// alert(response);
				alert("User restored successfully");
				$('#usersTable').DataTable().destroy();
				loadUsers();
				closeModal();
			} else {
				alert("User restore failed. Contact administrator");
				$("#confirm-submit").modal('hide');
			}
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
	// alert("loading data!");
	$("#usersTable").find("tr:gt(0)").remove();
	params.action = 'load';
	// alert("test load");
	$.post("UserManagementServlet", $.param(params), function(responseJson) {

		$.each(responseJson, function(index, user) {
			roleVal = ''
			delOrRes = ''
			if (user.roleId == 1) {
				roleVal = 'Admin'
			} else {
				roleVal = 'Encoder'
			}
			console.log(user.active);
			if (user.active == 0) {
				delOrRes = "<td><button type='button' value='" + user.accountId + "' onClick=\"restoreUser(this.value)\""
						+ "data-toggle=\"modal\" data-target=\"#confirm-submit\">Restore</button></td>"
			}
			if (user.active == 1) {
				delOrRes = "<td><button type='button' value='" + user.accountId + "' onClick=\"deleteUser(this.value)\""
						+ "data-toggle=\"modal\" data-target=\"#confirm-submit\">Archive</button></td>"
			}

			$("<tr>").appendTo('#usersTable').append(
					"<td><button type='button' value='" + user.accountId + "' onClick=\"editUser(this.value)\""
							+ "data-toggle=\"modal\" data-target=\"#usermanagement__popup\">Edit</button></td>").append(delOrRes)
			// .append("<td><input type='checkbox' name='deleteUsers[]' value='"+user.accountId +"'/></td>")
			.append($("<td>").text(user.username)).append(
					$("<td>").text(/*user.active + " " + */user.firstName + " " + user.middleName + " " + user.lastName)).append(
					$("<td>").text(roleVal));
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
