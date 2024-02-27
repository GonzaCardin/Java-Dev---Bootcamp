package com.educacionit;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer nroExamen;
    private Double nota; /// númerico>=0 <=10

    public Alumno(String nombre, String apellido, Integer nroExamen, Double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroExamen = nroExamen;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNroExamen() {
        return nroExamen;
    }

    public void setNroExamen(Integer nroExamen) {
        this.nroExamen = nroExamen;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nroExamen=" + nroExamen + ", nota=" + nota
                + "]";
    }

}
