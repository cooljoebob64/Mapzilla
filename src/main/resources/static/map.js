let map;
function initMap() {
  map = new google.maps.Map(document.getElementById("map"), {
    center: coords,
    zoom: 12,
    scrollwheel: false,
  });
  let zilla = "/zilla.png";
  let marker = new google.maps.Marker({
    position: coords,
    map: map,
    icon: {
      url: zilla,
      scaledSize: new google.maps.Size(50, 50),
    },
    animation: google.maps.Animation.BOUNCE,
  });

  let contentString =
    "<h2>" + city + ", " + state + ", where your dreams come true!</h2>";
  let infowindow = new google.maps.InfoWindow({
    content: contentString,
  });

  google.maps.event.addListener(marker, "click", function () {
    infowindow.open(map, marker);
  });
}
