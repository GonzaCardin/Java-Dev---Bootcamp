///Global variables
var clickCount = 0;
console.log("Valor inicial del contador de clicks: " + clickCount);
function ConteoClicks() {
    clickCount++;
    console.log("Cantidad de clicks: " + clickCount);
    var parrafo = document.getElementById("clicks");
    console.log(parrafo);
    parrafo.innerHTML = "Clicks: " + clickCount;
}

function Validacion() {
    var nombre = document.getElementById("nombre").value;
    var email = document.getElementById("email").value;

    console.log(nombre);

    if (nombre == "") {
        document.getElementById("resultado").innerHTML = "Debe ingresar el nombre";
        return;
    }
    if (email == "") {
        document.getElementById("resultado").innerHTML = "Debe ingresar el email";
        return;
    }
    document.getElementById("resultado").innerHTML = "La validación fue un exito."
}

function ModificarTexto() {
    var texto = document.getElementById("texto").value;
    if (texto != null && texto.trim() != "") {
        document.getElementById("parrafo").innerText = texto;
    } else {
        document.getElementById("parrafo").innerText = "Debe ingresar un texto";
        ///Puede ser una alert también
    }
}

function Suma() {
    var numero1 = parseInt(document.getElementById("numero_1").value);
    var numero2 = parseInt(document.getElementById("numero_2").value);

    if (numero1 == "" || numero2 == "") {
        document.getElementById("resultado").innerHTML = "Debe ingresar un número";
        return;
    }
    var resultado = parseInt(numero1) + parseInt(numero2);
    document.getElementById("resultado").innerHTML = numero1 + " + " + numero2 + " = " + resultado;
}