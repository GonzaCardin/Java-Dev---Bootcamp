package com.educacionit.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Alumno;

public class InicioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor
     */
    public InicioServlet() {
        // TODO
    }

    /**
     * @see Httpservlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
         * PrintWriter printWriter = response.getWriter();
         * printWriter.append(
         * "<html>" +
         * "<body>" +
         * "<h2>Inicio Servlet</h2>" +
         * "</body>" +
         * "</html>");
         */

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(1000, "Gonzalo", 22));
        alumnos.add(new Alumno(1001, "Luis", 25));
        alumnos.add(new Alumno(1002, "Cristian", 27));

        /// session.getAttribute("nombre atributo");
        /// session.setAttribute("nombre de atributo", objeto);

        /// Guardo mi lista en la session
        HttpSession session = request.getSession();
        session.setAttribute("listaAlumnos", alumnos);

        /// Forward
        request.getRequestDispatcher("listado_alumnos.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO
        doGet(request, response);
    }
}
