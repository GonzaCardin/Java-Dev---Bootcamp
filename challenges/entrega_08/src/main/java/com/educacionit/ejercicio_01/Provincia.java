package com.educacionit.ejercicio_01;

public class Provincia {
    private Integer id;
    private String descripcion;

    public Provincia(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Provincia [id=" + id + ", descripcion=" + descripcion + "]";
    }
}
