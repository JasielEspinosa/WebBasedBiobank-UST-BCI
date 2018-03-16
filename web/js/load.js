var intervalID;

function onReady(callback) {
    intervalID = window.setInterval(checkReady, 3000);

    function checkReady() {
        if (document.getElementsByTagName('body')[0] !== undefined) {
            window.clearInterval(intervalID);
            callback.call(this);
        }
    }
}

function show(id, value) {
    document.getElementById(id).style.display = value ? 'block' : 'none';
}

onReady(function () {
    show('page', true);
    show('loading', false);
});

//LEUKEMIA LOAD
function onReadyModal(callback) {
    intervalID = window.setInterval(checkReady, 10000);
    function checkReady() {
        if (document.getElementsByTagName('div')[0] != undefined) {
            window.clearInterval(intervalID);
            callback.call(this);
        	}
   		}
	}

function showModal(id, value) {
    document.getElementById(id).style.display = value ? 'block' : 'none';
}
onReadyModal(function () {
    show('leukemiaChartAge', true);
    show('loadingmodal', false);
});

//LYMPHOMA LOAD
function onReadyModalLymph(callback) {
    intervalID = window.setInterval(checkReady, 10000);
    function checkReady() {
        if (document.getElementsByTagName('div')[0] != undefined) {
            window.clearInterval(intervalID);
            callback.call(this);
        	}
   		}
	}

function showModal(id, value) {
    document.getElementById(id).style.display = value ? 'block' : 'none';
}
onReadyModalLymph(function () {
    show('lymphomaChartAge', true);
    show('loadingmodal', false);
});



