function guardarEdicion() {
    var legajo = document.getElementById("legajoAlta").value;
    var nombre = document.getElementById("nombre").value;
    var edad = document.getElementById("edad").value; /// sin el value -> Edad: <input type="text" id="edad"><br>

    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function () {
        switch (xhr.readyState) {
            case 0:
                console.log("guardarEdicion - UNSENT");
                break;
            case 1:
                console.log("guardarEdicion - OPENED");
                break;
            case 2:
                console.log("guardarEdicion - HEADERS_RECEIVED");
                break;
            case 3:
                console.log("guardarEdicion - LOADING");
                break;
            case 4:
                console.log("guardarEdicion - DONE");
                if (xhr.status == 200) {
                    // alert("El alumno fue agregado correctamente.")
                    var tabla = document.getElementById("tablaAlumnos");
                    var fila = tabla.insertRow(-1); // Insert a new row at the end of the table
                    var celdaLegajo = fila.insertCell(0); // Insert a new cell in the first column of the new row
                    var celdaNombre = fila.insertCell(1); // Insert a new cell in the second column of the new row
                    var celdaEdad = fila.insertCell(2); // Insert a new cell in the third column of the new row

                    celdaLegajo.innerHTML = legajo; // Set the content of the cell to the student's legajo
                    celdaNombre.innerHTML = nombre; // Set the content of the cell to the student's name
                    celdaEdad.innerHTML = edad; // Set the content of the cell to the student's age
                } else if (xhr.status == 500) {
                    alert("Se produjo un error. El alumno no fue agregado.")
                }
                break;
        }
    };

    ///Iniicializar el xhr
    xhr.open("POST", "/clase_33/GuardarAlumnoServlet", false);
    // param1=value1&param2=value2&paramX=valueX
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.send("legajo=" + legajo + "&nombre=" + nombre + "&edad=" + edad);

}
function buscarAlumno() {
    var legajo = document.getElementById("legajo").value;
    var xhr = new XMLHttpRequest;
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4) {
            switch (xhr.status) {
                case 200:
                    console.log(xhr.responseText);
                    console.log(xhr.getAllResponseHeaders());
                    var alumno = JSON.parse(xhr.responseText);
                    document.getElementById("legajoAlta").value = alumno.Legajo;
                    document.getElementById("nombre").value = alumno.Nombre;
                    document.getElementById("edad").value = alumno.Edad;
                    break;
                case 404:
                    console.log("ERROR 404");
                    break;
                case 500:
                    console.log("ERROR 500");
                    break;
                default:
                    console.log("El servlet buscar alumnos devolvio un error inersperado");
            }
        }
    };

    xhr.open("GET", "/clase_33/BuscarAlumnoServlet?legajo=" + legajo);
    xhr.send();
}
