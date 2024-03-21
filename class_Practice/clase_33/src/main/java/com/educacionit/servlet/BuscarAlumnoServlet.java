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

    @SuppressWarnings("unchecked")
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String m_legajo = req.getParameter("legajo");
            HttpSession session = req.getSession();

            if (m_legajo == null || m_legajo.length() == 0) {
                throw new Exception("El legajo es nulo");
            }

            Map<String, Alumno> alumnos = (Map<String, Alumno>) session.getAttribute("listaAlumnos");
            if (alumnos == null) {
                alumnos = new HashMap<String, Alumno>();
                session.setAttribute("listaAlumnos", alumnos);
            }

            Alumno m_alumno = alumnos.get(m_legajo);
            if (m_alumno != null) {
                resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            } else {

                String respuesta = "{\"Legajo\":\"" + m_alumno.getLegajo() + "\", \"Nombre\":\"" + m_alumno.getNombre()
                        + "\", \"Edad\": \"" + m_alumno.getEdad() + "\"}";
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
