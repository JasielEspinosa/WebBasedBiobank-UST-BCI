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
var elemPW = document.getElementById("password");
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

	}

	if (success) {
		// looks goood
		pwdHint.innerHTML = '';

		var $form = $(this);
		$.post('ProfileProcessServlet', $form.serialize(), function(response) {
			if (response == "Success") {
				alert(response);
				$("oldPassword").val("");
				$("password").val("");
				$("confirmPassword").val("");
				$("#confirm-submit").modal('hide');
			} else {
				alert(response);
			}
		}).fail(function() {
		});

	}
	evt.preventDefault();
}

formPasswordForm.addEventListener("submit", fnValidatePassword);

/*$('#profileForm').submit(function() {

});*/
