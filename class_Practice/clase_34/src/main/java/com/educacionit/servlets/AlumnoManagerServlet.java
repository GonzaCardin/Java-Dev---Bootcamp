package com.educacionit.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.model.Alumno;
import com.google.gson.Gson;

public class AlumnoManagerServlet extends HttpServlet {

    @Override // Consulta de Alumnos
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String legajo = req.getParameter("legajo");
        Alumno unAlumno = new Alumno(Integer.valueOf(legajo), "Cristian", 42);
        
        Gson gson = new Gson();
        String alumnoJson = gson.toJson(unAlumno);
        
        resp.getWriter().write(alumnoJson);
        resp.setContentType("application/json"); //Very important

    }

    @Override // Alta de Alumnos
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override // Eliminación de Alumnos
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
