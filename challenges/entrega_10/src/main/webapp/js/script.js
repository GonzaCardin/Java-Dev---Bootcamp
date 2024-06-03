function calcularPresupuesto() {
    const ingreso = parseFloat(document.getElementById("ingreso").value);

    const categorias = document.querySelectorAll(".categoria");
    let pocentajeTotal = 0;
    const presupuesto = {};


    categorias.forEach(categoria => {
        const nombre = categoria.children[0].value.trim();
        const porcentaje = parseFloat(categoria.children[1].value);

        if (nombre && !isNaN(porcentaje) && porcentaje > 0) {
            pocentajeTotal = pocentajeTotal + porcentaje;
            presupuesto[nombre] = porcentaje;
        }
    });

    if (pocentajeTotal !== 100) {
        alert("Los porcentajes deben sumar 100%. Actualmente suman: " + pocentajeTotal + "%");
        return;
    }

    const resultadoDiv = document.getElementById("resultado");
    console.log(resultadoDiv);
    resultadoDiv.innerHTML = `<h2>Distribución de Presupuesto</h2><p>Presupuesto Total: $${ingreso.toFixed(2)}</p>`;
    for (const [nombre, porcentaje] of Object.entries(presupuesto)) {
        const total = (ingreso * porcentaje) / 100;
        resultadoDiv.innerHTML += `<p>${nombre}: $${total.toFixed(2)}</p>`;
    }
}
function agregarCategoria() {
    const categorias = document.getElementById("categorias");
    const nuevaCategoria = document.createElement("div");
    nuevaCategoria.className = "categoria"
    nuevaCategoria.innerHTML = `
            <input type="text" placeholder="Ingrese el nombre de la categoría:">
            <input type="number" placeholder="Ingrese el porcentaje:" >
            <button onclick="eliminarCategoria(this)">Eliminar Categoría</button><br/>
    `;
    categorias.appendChild(nuevaCategoria);
}
function eliminarCategoria(button){
    const categoria = button.parentNode;
    categoria.parentNode.removeChild(categoria);
}

