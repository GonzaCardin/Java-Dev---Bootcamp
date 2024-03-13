package com.educaionit.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eduacionit.model.Alumno;

public class InicioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor
     */
    public InicioServlet() {
        // TODO
    }

    @SuppressWarnings("unchecked")
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the list of alumnos from the session
        HttpSession session = request.getSession(true);
        List<Alumno> alumnos = (List<Alumno>) session.getAttribute("listaAlumnos");

        // Create a new list of alumnos if the session attribute is null
        if (alumnos == null) {
            alumnos = new ArrayList<>();
            session.setAttribute("listaAlumnos", alumnos);
        }

        // Forward to the list of alumnos page
        request.getRequestDispatcher("listado_alumnos.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO
        doGet(request, response);
    }
}
