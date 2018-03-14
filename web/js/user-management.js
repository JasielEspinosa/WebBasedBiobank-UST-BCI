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

var formPasswordForm = document.forms["addUser"];
var elemPW = document.getElementById("password");
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

	if (!regexPasswordLength.test(elemPW.value)) {
		pwdHint.innerHTML = 'Password must be at least 8 characters.';
		pwdHint.style.display = "inline";
		success = false;
	}

	if (!regexPasswordContainsUpperCase.test(elemPW.value)) {
		pwdHint.innerHTML = 'Password must contain an uppercase character.';
		pwdHint.style.display = "inline";
		success = false;
	}

	if (!regexPasswordContainsLowerCase.test(elemPW.value)) {
		pwdHint.innerHTML = 'Password must contain an lowercase character.';
		pwdHint.style.display = "inline";
		success = false;
	}

	if (!regexPasswordContainsNumber.test(elemPW.value)) {
		pwdHint.innerHTML = 'Password must contain a number.';
		pwdHint.style.display = "inline";
		success = false;
	}

/*	if (!regexPasswordContainsSpecialChar.test(elemPW.value)) {
		pwdHint.innerHTML = 'Password must contain a special character.';
		pwdHint.style.display = "inline";
		success = false;
	}*/

	if (success) {
		// looks goood
		pwdHint.innerHTML = '';

		$("#confirm-submit").modal('show');
	}
	evt.preventDefault();
}

formPasswordForm.addEventListener("submit", fnValidatePassword);

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

// value='"+user.accountId +"' onClick=\"editUser(this.value)\"
