package com.educacionit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
       ///response.getWriter().append("Served at: ").append(request.getContextPath());
       PrintWriter printWriter  = response.getWriter();
       printWriter.append(
       "<html>" +
       "<body>" +
       "<h2>Inicio Servlet</h2>" +
       "</body>" +
       "</html>");


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO
        doGet(request, response);
    }
}
