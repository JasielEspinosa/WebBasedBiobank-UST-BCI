JsBarcode("#patientBarcode", "C P 0 0 0 1", {
	format : "CODE128"
});

function closeModal() {
	$("#patientBarcode_popup").modal('hide');
};

function printBarcode(barcodeToPrint) {
    var printContent = document.getElementById(barcodeToPrint);
    var WinPrint = window.open('', '');
    //var WinPrint = window.open('', '', 'width=900,height=650');
    WinPrint.document.write(printContent.innerHTML);
    WinPrint.document.close();
    WinPrint.focus();
    WinPrint.print();
    WinPrint.close();
}