var player = document.getElementById("player");
var controls = document.getElementById("controls");
var progress = document.getElementById("progress");
var progressBar = document.getElementById("progressBar");
var volume = document.getElementById("volume");
var volumeSlider = document.getElementById("volumeSlider");

var audio = new Audio("https://www.w3schools.com/html/horse.mp3");

audio.addEventListener("play", function() {
  controls.style.display = "none";
  progress.style.display = "block";
});

audio.addEventListener("pause", function() {
  controls.style.display = "block";
  progress.style.display = "none";
});

audio.addEventListener("ended", function() {
  controls.style.display = "block";
  progress.style.display = "none";
});

progressBar.max = audio.duration;

volumeSlider.addEventListener("mousemove", function() {
  audio.volume = volumeSlider.value / 100;
});

controls.addEventListener("click", function(event) {
  switch (event.target.id) {
    case "play":
      audio.play();
      break;
    case "pause":
      audio.pause();
      break;
    case "stop":
      audio.stop();
      break;
  }
});