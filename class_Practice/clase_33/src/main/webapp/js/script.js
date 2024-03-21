function guardarEdicion() {
    var legajoAlta = document.getElementById("legajoAlta").value;
    var m_nombre = document.getElementById("nombre").value;
    var m_edad = document.getElementById("edad").value;

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
                    alert("El Alumno fue agregado Correctamente");
                }
                else if (xhr.status == 500) {
                    alert("Se produjo un error. El Alumno no fue agregado");
                }
                break;
            default:
                console.log("guardarEdicion - DEFAULT");
                break;
        }
    }

    ///xhr.open("POST", "http://127.0.0.1:5500/clase_33/src/main/webapp/index.html");
    xhr.open("POST", "clase_33/src/main/java/com/educacionit/servlet/GuardarAlumnoServlet.java");

    /// param1=value1&param2=value2&param3=value3;
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlenc");
    xhr.send("legajo=" + legajoAlta + "&" + "nombre=" + m_nombre + "&" + "edad=" + m_edad);

}
function buscarAlumno(){
    var m_legajo = document.getElementById("legajo").value;

    var xhr = new XMLHttpRequest();
    xhr.open("GET","BuscarAlumnoServlet?legajo="+m_legajo, false);
    xhr.send();
}