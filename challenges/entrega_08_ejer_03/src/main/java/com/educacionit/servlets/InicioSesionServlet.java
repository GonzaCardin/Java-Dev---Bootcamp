package com.educacionit.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Empleado;
@WebServlet("/InicioSesionServlet")
public class InicioSesionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final Map<String, String> usuarios = new HashMap<>();
    List<Empleado> empleados = new ArrayList<>();


    public InicioSesionServlet() {
        usuarios.put("gonzalocardin@gmail.com", "Hola2612");
        usuarios.put("cristian@educacionit.com.ar", "459873");
        usuarios.put("eduardof1@gmail.com", "Jueves27");
        usuarios.put("bautista29@gmail.com", "buti789");


        empleados.add(new Empleado(1, "Gonzalo", "Gerente de Finanzas"));
        empleados.add(new Empleado(2, "Eduardo", "Administración y Ventas"));
        empleados.add(new Empleado(3, "Carlos", "Recursos Humanos"));
        empleados.add(new Empleado(4, "Pedro", "Atención al público"));

        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("correo");
        String clave = req.getParameter("clave");

        if (usuarios.containsKey(email) && usuarios.get(email).equals(clave)) {
            HttpSession sesion = req.getSession();
            sesion.setAttribute("email", email);
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.sendRedirect("lista_empleados.jsp");
        } else {
            resp.sendRedirect("login.jsp");
        }

    }
}
