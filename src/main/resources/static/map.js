var map;
var coords = {lat: 39.9612, lng: -82.9988};
function initMap() {
    map = new google.maps.Map(document.getElementById('map'), {
        center: coords,
        zoom: 10,
        scrollwheel: false
    });
    var marker = new google.maps.Marker({
    position: coords,
    map: map
    });
}