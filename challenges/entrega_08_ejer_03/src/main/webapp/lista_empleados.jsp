<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Empleados</title>
</head>

<body>
    <h2>Bienvenido, <%= session.getAttribute("email")%>
    </h2>
    <h3>Empleados:</h3>
    <table border="2">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Cargo</th>
        </tr>
        <% List<Empleado> empleados = (List<Empleado>) session.getAttribute("empleados");
                if(empleados != null && !empleados.isEmpty()){
                for(Empleados empleado : empleados){
                %>
                <tr>
                    <td>
                        <%= empleado.getId() %>
                    </td>
                    <td>
                        <%= empleado.getNombre() %>
                    </td>
                    <td>
                        <%= empleado.getCargo() %>
                    </td>
                </tr>
                <% } }else{ %>
                    <tr>
                        <td colspan="3">No se encuentran empleados.</td>
                    </tr>
                    <% } %>
    </table>

    <form action="CerrarSesionServlet" method="post">
        <input type="submit" value="Cerrar Sesión">
    </form>
    <p>ID de Sesión: <%= session.getId() %>
    </p>
</body>

</html>