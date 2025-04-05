$(document).ready(function() {

    console.log("test masuk")
    // Open sidebar when clicking the icon
    $('#list-menu').click(function(e) {
        console.log("masuk click")
        e.preventDefault(); // Prevent default anchor behavior
        $('#sidebarPopup').addClass('open');
        $('#overlay').show();
    });

    // Close sidebar when clicking the close button
    $('#closeSidebar').click(function() {
        $('#sidebarPopup').removeClass('open');
        $('#overlay').hide();
    });

    // Close sidebar when clicking the overlay
    $('#overlay').click(function() {
        $('#sidebarPopup').removeClass('open');
        $('#overlay').hide();
    });
});