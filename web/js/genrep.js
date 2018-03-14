/*function demoFromHTML() {
	
    var pdf = new jsPDF('p', 'pt', 'letter');
    source = $('#customers')[0];

    specialElementHandlers = {
        '#bypassme': function (element, renderer) {
            return true
        }
    };
    
    margins = {
        top: 80,
        bottom: 60,
        left: 40,
        width: 600
    };
    
    pdf.fromHTML(
    source, 
    margins.left, 
    margins.top, { 
        'width': margins.width, 
        'elementHandlers': specialElementHandlers
    },

    function (dispose) {
        pdf.save('Generate Report.pdf');
    }, margins);
    
}*/

/*function openGenRep() {
	$("[name='fromDateGenerateReport']").prop('required', true);
	$("[name='toDateGenerateReport']").prop('required', true);
};

function closeGenRep() {
	$("[name='fromDateGenerateReport']").prop('required', false);
	$("[name='toDateGenerateReport']").prop('required', false);
};*/