$(document).ready(function() {
    // Open sidebar when clicking the icon
    $('#list-menu').click(function(e) {
        console.log("masuk click")
        e.preventDefault(); // Prevent default anchor behavior
        // $('#sidebarPopup').addClass('open');
        // $('#overlay').show();
        $(".sidebar").toggleClass("collapsed");
        // Push or reset main content
        if ($(".sidebar").hasClass("collapsed")) {
            console.log("if")
            $('#sidebarPopup').addClass('open');
            // $('#overlay').show();
            $("#main").css("margin-left", "264px"); // Sidebar open
        } else {
            $("#main").css("margin-left", "0"); // Sidebar closed
            $('#sidebarPopup').removeClass('open');
            // $('#overlay').hide();
            $("#main").css("margin-left", "0");
        }
    });

    // Close sidebar and reset main content
    // $('#closeSidebar').click(function() {
    //     $(".sidebar").toggleClass("collapsed");
    //     $('#sidebarPopup').removeClass('open');
    //     $('#overlay').hide();
    //     $("#main").css("margin-left", "0");
    // }); 

    // Close sidebar via overlay and reset main content
    // $('#overlay').click(function() {
    //     $(".sidebar").toggleClass("collapsed");
    //     $('#sidebarPopup').removeClass('open');
    //     $('#overlay').hide();
    //     $("#main").css("margin-left", "0");
    // });

});