package com.educacionit.servlet;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Alumno;

public class GuardarAlumnoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String legajo = req.getParameter("legajo");
            String nombre = req.getParameter("nombre");
            String edad = req.getParameter("edad");

            HttpSession session = req.getSession();

            Alumno unAlumno = new Alumno(Integer.valueOf(legajo), nombre, Integer.valueOf(edad));

            @SuppressWarnings("unchecked")
            Map<String, Alumno> alumnos = (Map<String, Alumno>) session.getAttribute("listaAlumnos");
            if (alumnos == null) {
                alumnos = new HashMap<String, Alumno>();
                req.setAttribute("listaAlumnos", alumnos);
            }

            alumnos.put(legajo, unAlumno);
            resp.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }

}
