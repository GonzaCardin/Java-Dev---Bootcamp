///Global variables
var clickCount = 0;
console.log("Valor inicial del contador de clicks: " + clickCount);
function ConteoClicks(){
    clickCount++;
    console.log("Cantidad de clicks: " + clickCount);
    var parrafo = document.getElementById("clicks");
    console.log(parrafo);
    parrafo.innerHTML = "Clicks: " + clickCount;
}