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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doGet(req, resp);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String legajo = req.getParameter("legajo"); // Get the legajo parameter from the request
            String nombre = req.getParameter("nombre"); // Get the nombre parameter from the request
            String edad = req.getParameter("edad"); // Get the edad parameter from the request

            Alumno m_alumno = new Alumno(
                    Integer.valueOf(legajo), // Convert the legajo parameter to an integer
                    nombre, // Set the nombre parameter as the name of the alumno
                    Integer.valueOf(edad)); // Convert the edad parameter to an integer

            HttpSession session = req.getSession(); // Get the session from the request
            Map<String, Alumno> alumnos = (Map<String, Alumno>) session.getAttribute("listaAlumnos"); // Get the alumnos
                                                                                                      // map from the
                                                                                                      // session

            /// Initalizes and saves the map in the session
            if (alumnos == null) { // If the alumnos map is null
                alumnos = new HashMap<>(); // Initialize the alumnos map as a new HashMap
                req.setAttribute("listAlumnos", alumnos); // Set the alumnos map as an attribute of the request
            }
            alumnos.put(legajo, m_alumno); // Add the alumno to the alumnos map using the legajo as the key
            resp.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR); // Set the response status to
                                                                          // SC_INTERNAL_SERVER_ERROR (500) if an error
                                                                          // occurs

        }
    }

}
