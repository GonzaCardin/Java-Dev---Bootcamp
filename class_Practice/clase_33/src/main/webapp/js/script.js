function guardarEdicion(){
    var legajo  = document.getElementById("legajoAlta").value;
    var nombre = document.getElementById("nombre").value;
    var edad = document.getElementById("edad").value; /// sin el value -> Edad: <input type="text" id="edad"><br>

    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){
        switch(xhr.readyState){
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
                if(xhr.status == 200){
                    alert("El alumno fue agregado correctamente.")
                }else if(xhr.status == 500){
                    alert("Se produjo un error. El alumno no fue agregado.")
                }
                break;
        }
    };

    ///Iniicializar el xhr
    xhr.open("POST","/clase_33/GuardarAlumnoServlet");
    // param1=value1&param2=value2&paramX=valueX
    xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    xhr.send("legajo="+legajo+"&nombre="+nombre+"&edad="+edad);

}