function mostrarReloj(){
    var horaActual = new Date();
    var hora = horaActual.getHours();
    var minuto = horaActual.getMinutes();
    var segundo = horaActual.getSeconds();

    var time = hora + ":" + minuto + ":" + segundo;

    document.getElementById("reloj").innerHTML = time;
}
setInterval(mostrarReloj, 1000);