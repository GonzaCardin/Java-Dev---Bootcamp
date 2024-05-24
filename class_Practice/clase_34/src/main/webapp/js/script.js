const miPromesa  = new Promise((resolver,rechazar) =>{
    let exito = true;

    if(exito){
        resolver("La operación fue exitosa.");
    }
    else{
        rechazar("La operación fue rechazada.");
    }
});

miPromesa.then((resultado)=> {
    console.log(resultado);
}).catch((err)=>{
    console.log(err);
})
// -------------------------------------------------

const urlEndpoint = "/clase_34/AlumnoManagerServlet";

const consultarAlumno = async () => {
    const miLegajo = document.getElementById("inputLegajo").value;
    //fetch(urlEndpoint + "?legajo=" + miLegajo)
    const response = await fetch( `${urlEndpoint}?legajo=${miLegajo}` ); //String template :)/
    // const data = response.json(); es lo mismo que lo de abajo
    const unAlumno = await response.json();
    document.getElementById("resultadoConsulta").innerHTML = `Legajo:${unAlumno.legajo} - Nombre:${unAlumno.nombre} - Edad:${unAlumno.edad}`;
};