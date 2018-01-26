//<![CDATA[
$(window).on('load', function() {
    $('#the-thing-that-opens-your-alert').click(function () {
      $('#le-alert').addClass('in'); // shows alert with Bootstrap CSS3 implem
    });
    
    $('.close').click(function () {
      $(this).parent().removeClass('in'); // hides alert with Bootstrap CSS3 implem
    });
});//]]> 

