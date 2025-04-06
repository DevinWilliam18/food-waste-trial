$(document).ready(function() {

    console.log("test masuk")
    // Open sidebar when clicking the icon
    $('#list-menu').click(function(e) {
        console.log("masuk click")
        $(".sidebar").toggleClass("collapsed");
        e.preventDefault(); // Prevent default anchor behavior
        console.log("after sidebar..!!")
        $('.sidebarPopup').addClass('open');
        // $('#overlay').show();
        // Push or reset main content
        if ($(".sidebar").hasClass("collapsed")) {
            console.log("if")
            $("#main").css("margin-left", "0"); // Sidebar closed
        } else {
            console.log("else")
            $("#main").css("margin-left", "264px"); // Sidebar open
        }
    });

    // Close sidebar and reset main content
    $('#closeSidebar').click(function() {
        $("#sidebar").addClass("collapsed");
        $('#sidebarPopup').removeClass('open');
        $('#overlay').hide();
        $("#main").css("margin-left", "0");
    });

    // Close sidebar via overlay and reset main content
    $('#overlay').click(function() {
        $("#sidebar").addClass("collapsed");
        $('#sidebarPopup').removeClass('open');
        $('#overlay').hide();
        $("#main").css("margin-left", "0");
    });

});