package com.educacionit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Alumno;

public class BuscarAlumnoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String unLegajo = req.getParameter("legajo");
            if (unLegajo == null || unLegajo.length() == 0) {
                throw new Exception("El legajo es nulo");
            }
            HttpSession session = req.getSession(true);

            @SuppressWarnings("unchecked")
            Map<String, Alumno> alumnos = (Map<String, Alumno>) session.getAttribute("listaAlumnos");

            if (alumnos == null) {
                alumnos = new HashMap<String, Alumno>();
                session.setAttribute("listaAlumnos", alumnos);
            }
            Alumno unAlumno = alumnos.get(unLegajo);

            if (unAlumno == null) {
                resp.setStatus(HttpServletResponse.SC_NOT_FOUND); // ->ERROR 404 :)
            } else {
                // Encontramos al alumno en nuestra sesion
                String respuesta = "{\"Legajo\": \"" + unAlumno.getLegajo() + "\",\"Nombre\": \"" + unAlumno.getNombre()
                        + "\",\"Edad\": \"" + unAlumno.getEdad() + "\"}";
                PrintWriter w = resp.getWriter();
                w.print(respuesta);
                resp.setStatus(HttpServletResponse.SC_OK);
                w.flush();
                w.close();
            }
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }

    }

}
