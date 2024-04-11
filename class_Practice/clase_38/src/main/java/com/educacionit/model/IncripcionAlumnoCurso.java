package com.educacionit.model;

import java.util.Date;

public class IncripcionAlumnoCurso {
    private Alumno alumno;
    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
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
    public IncripcionAlumnoCurso(Alumno alumno, Curso curso, Date fechaAltaIncripcion) {
        this.alumno = alumno;
        this.curso = curso;
        this.fechaAltaIncripcion = fechaAltaIncripcion;
    }
    private Curso curso;
    private Date fechaAltaIncripcion;

    

}
