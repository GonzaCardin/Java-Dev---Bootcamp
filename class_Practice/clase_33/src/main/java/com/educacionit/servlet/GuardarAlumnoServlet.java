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

/**
 * This servlet is responsible for handling POST requests to save an Alumno object.
 * The Alumno object is obtained from the request parameters and stored in a session attribute.
 * If the "listaAlumnos" attribute does not exist in the session, a new HashMap is created and assigned to it.
 * The Alumno object is then added to the "listaAlumnos" map using the legajo as the key.
 * The servlet responds with a status code of 200 (OK) if the operation is successful,
 * or a status code of 500 (Internal Server Error) if an exception occurs.
 */
public class GuardarAlumnoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            // Obtain the parameters from the request
            String legajo = req.getParameter("legajo");
            String nombre = req.getParameter("nombre");
            String edad = req.getParameter("edad");

            // Get the HttpSession object
            HttpSession session = req.getSession();

            // Create a new Alumno object using the parameters
            Alumno unAlumno = new Alumno(Integer.valueOf(legajo), nombre, Integer.valueOf(edad));

            // Get the "listaAlumnos" attribute from the session
            @SuppressWarnings("unchecked")
            Map<String, Alumno> alumnos = (Map<String, Alumno>) session.getAttribute("listaAlumnos");

            // If the "listaAlumnos" attribute does not exist, create a new HashMap and assign it to the attribute
            if (alumnos == null) {
                alumnos = new HashMap<String, Alumno>();
                req.setAttribute("listaAlumnos", alumnos);
            }

            // Add the Alumno object to the "listaAlumnos" map using the legajo as the key
            alumnos.put(legajo, unAlumno);

            // Set the response status code to 200 (OK)
            resp.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {
            // If an exception occurs, set the response status code to 500 (Internal Server Error)
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}