package com.educaionit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eduacionit.model.Alumno;

@WebServlet("/borrar_alumno")
public class BorrarAlumnoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BorrarAlumnoServlet() {
        super();
    }

    @SuppressWarnings("unchecked")
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        List<Alumno> alumnos = (List<Alumno>) session.getAttribute("listaAlumnos");

        session.setAttribute("listAlumnos", alumnos);

        request.getRequestDispatcher("baja_alumno.jsp").forward(request, response);
    }

    // This method is responsible for deleting an alumno from the list of alumnos.
    @SuppressWarnings({ "unchecked" })
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String legajo = null;
        try {
            // Get the list of alumnos from the session
            HttpSession session = request.getSession();
            List<Alumno> alumnos = (List<Alumno>) session.getAttribute("listaAlumnos");

            // Get the legajo from the request parameters
            legajo = request.getParameter("legajo");

            // Convert the legajo to an integer
            Integer unLegajo = Integer.valueOf(legajo);

            // Iterate over the list of alumnos
            for (int i = 0; i < alumnos.size(); i++) {
                // Get the current alumno
                Alumno unAlumno = alumnos.get(i);

                // Check if the current alumno's legajo matches the legajo to be deleted
                if (unAlumno.getLegajo().equals(unLegajo)) {
                    // Remove the alumno from the list
                    alumnos.remove(i);
                    break;
                }
            }
            // Set a message to be displayed to the user
            request.setAttribute("mensaje", "El Alumno con legajo " + legajo + " se borro de forma existosa");
        } catch (Exception e) {
            request.setAttribute("mensaje",
                    "Se produjo un error borrando al alumno con legajo " + legajo + ". Error: " + e.getMessage());
        }
        // Redirect the user to the BorrarAlumnoServlet page
        response.sendRedirect("BorrarAlumnoServlet");
    }
}
