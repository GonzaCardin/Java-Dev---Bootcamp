// Listen for the DOMContentLoaded event to ensure the DOM is fully loaded before executing the script.
document.addEventListener("DOMContentLoaded", function () {
    // Get the grid container element by its ID.
    const gridCotainer = document.getElementById("grid-contenedor");
    // Get the refresh button element by its ID.
    const refreshButton = document.getElementById("refresh-btn");

    // Define a function to update the grid with new data.
    function actualizarGrilla(data) {
        // Log the received data to the console for debugging.
        console.log(data);
        // Clear the grid container's inner HTML to remove any existing elements.
        gridCotainer.innerHTML="";
        // Iterate over each item in the data array.
        data.forEach(alumno => {
            // Create a new div element for each item (alumno).
            const gridItem = document.createElement("div");
            // Add a class to the grid container for styling purposes.
            gridCotainer.classList.add("grid-item");
            // Set the inner HTML of the grid item to display alumno details.
            gridItem.innerHTML = `
                <div>Legajo: ${alumno.legajo}</div>
                <div>Nombre: ${alumno.nombre}</div>
                <div>Edad: ${alumno.edad}</div>
            `;
            // Append the newly created grid item to the grid container.
            gridCotainer.appendChild(gridItem);
        });
    }

    // Define a function to fetch data from the server.
    function obtenerDatos() {
        // Use the fetch API to request data from the specified URL.
        fetch("http://localhost:8081/alumnos/")
            .then(response => response.json()) // Parse the JSON response.
            .then(data => actualizarGrilla(data)) // Update the grid with the fetched data.
            .catch(error => console.error("Error obteniendo los datos", error)); // Log any errors to the console.
    }

    // Call the obtenerDatos function to fetch and display the initial set of data.
    obtenerDatos();
});
