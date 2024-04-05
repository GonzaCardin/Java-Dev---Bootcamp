<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Iniciar Sesión</title>
</head>
<body>
    <h2>Inicio de Sesión</h2>
    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;"><%= request.getAttribute("error") %></p>
    <% } %>
    <form action="IniciarSesionServlet" method="post">
        Correo : <input type="email" name="correo" required><br>
        Contraseña: <input type="password" name="clave" required><br>
        <input type="submit" value="Iniciar Sesión">
    </form>
</body>
</html>