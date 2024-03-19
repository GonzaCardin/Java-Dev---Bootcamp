var personas = [
    { name: "Juan", age: 17 },
    { name: "Gonzalo", age: 22 },
    { name: "Franco", age: 20 }
];
function getPersona() {
    var listaDePersonas = document.querySelector("#listadoPersonas");
    listaDePersonas.innerHTML = "";
    
    for (var i = 0; i < personas.length; i++) {
        var nombre = personas[i].name;
        var edad = personas[i].age;
        var entradaTabla = "Nombre: " + nombre + "- Edad: " + edad;

        var li = document.createElement("li"); // <li></li>
        li.textContent = entradaTabla;    // <li>Nombre: "xx" - Edad: "xx"</li>

        

        listaDePersonas.appendChild(li);
        console.log("Indice: " + i + " - Nombre: " + nombre + " - Edad: " + edad);
    }
}


function agregarUnaPersonaAlaLista() {
    var nombre = window.prompt("Ingrese su nombre: ");
    var edad = window.prompt("Ingrese su edad: ");

    personas.push({name: nombre, age: edad});
    getPersona();
}
function eliminarUnaPersonaDeLaLista(){
    if(personas.length > 0){
        personas.pop();
        getPersona();
    }
    else{
        alert("La lista se encuentrta vacía.");
    }
}

var btnAgregar = document.querySelector("#agregarPersona");
btnAgregar.onclick = agregarUnaPersonaAlaLista;
getPersona();