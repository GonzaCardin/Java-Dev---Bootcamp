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

/**
 * This servlet is responsible for handling HTTP GET requests to search for a student by their ID.
 * It retrieves the student ID from the request parameters, looks up the student in the session,
 * and returns the student's information in JSON format.
 *
 * @author YourName
 * @version 1.0
 */
public class BuscarAlumnoServlet extends HttpServlet {

    /**
     * Handles HTTP GET requests.
     *
     * @param req  the {@link HttpServletRequest} object that contains client request parameters
     * @param resp the {@link HttpServletResponse} object that contains the response the servlet sends to the client
     * @throws ServletException if the request processing fails for any reason
     * @throws IOException      if an input or output error occurs while the servlet handles the request
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            // Retrieve the student ID from the request parameters
            String unLegajo = req.getParameter("legajo");
            if (unLegajo == null || unLegajo.length() == 0) {
                throw new Exception("El legajo es nulo");
            }

            // Get the session object and retrieve the list of students from the session
            HttpSession session = req.getSession(true);
            @SuppressWarnings("unchecked")
            Map<String, Alumno> alumnos = (Map<String, Alumno>) session.getAttribute("listaAlumnos");

            // If the list of students is not found in the session, create a new one
            if (alumnos == null) {
                alumnos = new HashMap<String, Alumno>();
                session.setAttribute("listaAlumnos", alumnos);
            }

            // Look up the student in the list
            Alumno unAlumno = alumnos.get(unLegajo);

            // If the student is not found, return a 404 Not Found status
            if (unAlumno == null) {
                resp.setStatus(HttpServletResponse.SC_NOT_FOUND); // ->ERROR 404 :)
            } else {
                // If the student is found, create a JSON response and send it back to the client
                String respuesta = "{\"Legajo\": \"" + unAlumno.getLegajo() + "\",\"Nombre\": \"" + unAlumno.getNombre()
                        + "\",\"Edad\": \"" + unAlumno.getEdad() + "\"}";
                PrintWriter w = resp.getWriter();
                w.print(respuesta);
                resp.setStatus(HttpServletResponse.SC_OK);
                w.flush();
                w.close();
            }
        } catch (Exception e) {
            // If any error occurs, return a 500 Internal Server Error status
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}
