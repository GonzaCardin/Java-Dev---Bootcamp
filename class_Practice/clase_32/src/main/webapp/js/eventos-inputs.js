function edicionDeValor(){
    var nombre = document.getElementById("id_nombre").value;
    var edad = document.getElementById("id_edad").value;
    
    var resultado = document.getElementById("id_resultado");
    resultado.innerHTML = "Nombre: "+nombre + " - Edad: " + edad;
}

function mostrarLeyenda(){
    var resultado = document.getElementById("id_resultado");
    resultado.innerHTML = "Ingrese su nombre y su edad";
}

function presionoUnaTecla(event){
    var resultado = document.getElementById("id_resultado");
    resultado.innerHTML = "Presionaste la tecla: " + event.key();
    if(event.key === "Enter"){
        alert("Presionaste la tecla Enter")
    }
    /*
    if(5 === '5') --> FALSE
    if('5' === '5') --> TRUE
    */
}