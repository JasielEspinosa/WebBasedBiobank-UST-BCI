var response;
$("#profileForm").submit(function(e) {
	e.preventDefault();
});

$('document').ready(function() {
	$.post('LoadProfileServlet', function(response) {
		$("#username").val(response["Username"])
		$("#lastName").val(response["Lastname"])
		$("#firstName").val(response["Firstname"])
		$("#middleInitial").val(response["MiddleName"])
	}).fail(function() {
	});
});

var formPasswordForm = document.forms["profileForm"];
var username = document.getElementById("username");
var elemOPW = document.getElementById("oldPassword");
var elemPW = document.getElementById("password");
var elemCPW = document.getElementById("confirmPassword");
var success = false;

function fnValidatePassword(evt) {

	var emptyPassword;

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
			pwdHint.style.display = "inline";
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
		// looks goood

		usernameHint.innerHTML = "";
		oldPwdHint.innerHTML = "";
		pwdHint.innerHTML = "";
		confPwdHint.innerHTML = "";

		var $form = $(this);
		$.post(
				'ProfileProcessServlet',
				$form.serialize(),
				function(response) {

					if (response == "Success") {
						alert("Profile successfully updated");
						elemOPW.value = "";
						elemPW.value = "";
						elemCPW.value = "";
					} else if (response == "noChange") {
						alert("No changes occured");
						elemOPW.value = "";
						elemCPW.value = "";
					} else if (response == "userExists") {
						// alert("User already existed. Please choose another username");
						usernameHint.innerHTML = "User already existed. Please choose another username";
					} else if (response == "confirmOldPass") {
						oldPwdHint.innerHTML = 'Enter your current/old password to validate changes';
					} else if (response == "incorrectPass") {
						oldPwdHint.innerHTML = "Your current password does not match in the database. Please try again";
						elemCPW.value = '';
					} else if (response == "noPassChange") {
						pwdHint.innerHTML = "Your new and current/old password was not changed. "
								+ "Recheck your input if you wish to change your password "
								+ "or remove the new password to retain your old password.";
					} else {
						alert("Profile update failed. Recheck the fields again or contact administrator");
					}
				}).fail(function() {
		});

	}
	evt.preventDefault();
}

formPasswordForm.addEventListener("submit", fnValidatePassword);

/*$('#profileForm').submit(function() {

});*/
