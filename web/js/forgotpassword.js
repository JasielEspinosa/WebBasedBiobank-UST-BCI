var response;

var params = {
	forgotpasswordEmail : '',
	newPassword : '',
	confirmNewPassword : '',
	token : ''
};

var elemPW = document.getElementById("newPassword");
var success = false;


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


$("#sendForgotPassword").click(function() {
	params.forgotpasswordEmail = $("#forgotpasswordEmail").val();
	$.post('ForgotPassword', $.param(params), function(response) {
		if(response == 'Success'){
			alert("Success")
			swal("Success!", "An email has been sent to you with instructions.", "info");
		}
		if(response == 'Fail'){
			swal("Fail!", "The email that you entered does not have an account", "error");
		}
	}).fail(function() {
	});
});

$("#submitPassword").click(function() {
	success = true;
	var swalMessage = '';
	if (!regexPasswordLength.test(elemPW.value)) {
		swalMessage  += 'Password must be at least 8 characters.\n';
		success = false;
	}

	if (!regexPasswordContainsUpperCase.test(elemPW.value)) {
		swalMessage  += 'Password must contain an uppercase character.\n';
		success = false;
	}

	if (!regexPasswordContainsLowerCase.test(elemPW.value)) {
		swalMessage  += 'Password must contain an lowercase character.\n';
		success = false;
	}

	if (!regexPasswordContainsNumber.test(elemPW.value)) {
		swalMessage  += 'Password must contain a number.\n';
		success = false;
	}
	if ($("#confirmNewPassword").val() != $("#newPassword").val()) {
		swalMessage  += 'Passwords do not match.\n';
		success = false;
	}

/*	if (!regexPasswordContainsSpecialChar.test(elemPW.value)) {
		pwdHint.innerHTML = 'Password must contain a special character.';
		pwdHint.style.display = "inline";
		success = false;
	}*/

	if (success) {
		// looks goood

		params.newPassword = $("#newPassword").val();
		
		$.post('ResetPassword', $.param(params), function(response) {
			  swal("Success!", "Password Succesfully Changed", "success");
	          $('.swal-button--confirm').click(function(){
	                window.location = "login.jsp";
	          });
			
		}).fail(function() {
		});
	}else{
		swal("Fail!", swalMessage, "error");
	}
});
