function guardarEdicion(){
    var legajo  = document.getElementById("legajoAlta").value;
    var nombre = document.getElementById("nombre").value;
    var edad = document.getElementById("edad").value; /// sin el value -> Edad: <input type="text" id="edad"><br>

    var xhr = new XMLHttpRequest();

    ///Iniicializar el xhr
    xhr.open("POST","/clase_33/GuardarAlumnoServlet");
    // param1=value1&param2=value2&paramX=valueX
    xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    xhr.send("legajo="+legajo+"&nombre="+nombre+"&edad="+edad);

}