package com.educacionit.model;

import java.util.Date;

public class IncripcionProfesorCurso {
    private Profesor profesor;
    private Curso curso;
    private Date fechaAltaIncripcion;
    public IncripcionProfesorCurso(Profesor profesor, Curso curso, Date fechaAltaIncripcion) {
        this.profesor = profesor;
        this.curso = curso;
        this.fechaAltaIncripcion = fechaAltaIncripcion;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Date getFechaAltaIncripcion() {
        return fechaAltaIncripcion;
    }
    public void setFechaAltaIncripcion(Date fechaAltaIncripcion) {
        this.fechaAltaIncripcion = fechaAltaIncripcion;
    }

    
}
