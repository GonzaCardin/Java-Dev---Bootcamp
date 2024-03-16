package com.educacionit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Alumno;

public class AgregarAlumnoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AgregarAlumnoServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Server at: ").append(request.getContextPath());
    }

    /// This method is used to add a new alumno to the list of alumnos stored in the
    /// session.
    @SuppressWarnings("unchecked")
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // get the input parameters from the request
            String legajo = request.getParameter("legajo");
            String nombre = request.getParameter("nombre");
            String edad = request.getParameter("edad");

            // create a new alumno object with the input parameters
            Alumno unAlumno = new Alumno(Integer.valueOf(legajo), nombre, Integer.valueOf(edad));
            HttpSession session = request.getSession();

            // get the list of alumnos from the session
            List<Alumno> alumnos = (List<Alumno>) session.getAttribute("listaAlumnos");
            alumnos.add(unAlumno);

            // save the updated list of alumnos in the session
            session.setAttribute("listaAlumnos", alumnos);

            // set a message to be displayed on the next page
            request.setAttribute("mensaje", "El alumno " + unAlumno + " se pudo crear de forma exitosa.");
        } catch (Exception e) {
            // set an error message to be displayed on the next page
            request.setAttribute("mensaje", "Se ha producido un error al agregar un alumno. Error: " + e.getMessage());
        }

        // forward to the alta_alumno.jsp page
        request.getRequestDispatcher("alta_alumno.jsp").forward(request, response);
    }
}
