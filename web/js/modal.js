/* Table Sorting Both for User Management and Archived Patients */
function sortTable(n) {
	var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
	table = document.getElementById("customers");
	switching = true;
	dir = "asc";
	while (switching) {
		switching = false;
		rows = table.getElementsByTagName("tr");
		for (i = 1; i < (rows.length - 1); i++) {
			shouldSwitch = false;
			x = rows[i].getElementsByTagName("td")[n];
			y = rows[i + 1].getElementsByTagName("td")[n];
			if (dir == "asc") {
				if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
					shouldSwitch = true;
					break;
				}
			} else if (dir == "desc") {
				if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
					shouldSwitch = true;
					break;
				}
			}
		}
		if (shouldSwitch) {
			rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
			switching = true;
			switchcount++;
		} else {
			if (switchcount == 0 && dir == "asc") {
				dir = "desc";
				switching = true;
			}
		}
	}
}
/* End of Table Sorting Both for User Management and Archived Patients */

/*
 * Getting User Information Value $('#submitBtn').click(function() {
 * $('#lname').text($('#lastname').val());
 * $('#fname').text($('#firstname').val()); }); End of Add User Confimration
 * Prompt
 */

/*
 * jQuery Selecting ALL and Vice Versa of Checkboxes in User Management and
 * Archived Patients Table
 */
$(function() {
	$('#select_all').change(function() {
		var checkboxes = $(this).closest('form').find(':checkbox');
		if ($(this).prop('checked')) {
			checkboxes.prop('checked', true);
		} else {
			checkboxes.prop('checked', false);
		}
	});
});

/*
 * Baseline - Field Value Checking function baselineFieldsValidation () {
 * 
 * var lastName, firstName, middleInitial, invalidName;
 * 
 * var lastName = docment.getElementById( "lastName" ).value; var firstName =
 * docment.getElementById( "firstName" ).value; var middleInitial =
 * docment.getElementById( "middleInitial" ).value;
 * 
 * if ( lastName[0].toUpperCase() !== lastName[0] || firstName[0].toUpperCase()
 * !== firstName[0] || middleInitial[0].toUpperCase() !== middleInitial[0] || ) {
 * 
 * invalidName = "Invalid name.";
 *  }
 * 
 * document.getElementById("invalidName").innerHTML = invalidName;
 *  } End of Baseline - Field Value Checking
 */
