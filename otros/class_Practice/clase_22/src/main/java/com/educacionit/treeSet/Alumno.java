package com.educacionit.treeSet;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer edad;

    public Alumno(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
    }

    /*
     * public int hashCode(){
     * return Objects.hash(edad,nombre);
     * }
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((edad == null) ? 0 : edad.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad == null) {
            if (other.edad != null)
                return false;
        } else if (!edad.equals(other.edad))
            return false;
        return true;
    }

    @Override
    public int compareTo(Alumno o) {
        int comparacion = this.nombre.compareTo(o.getNombre());

        if (comparacion == 0) {
            /// comparacion = this.edad.compareTo(o.getEdad()); /// orden ascendente
            comparacion = o.getEdad().compareTo(this.edad); /// orden decreciente
        }

        return comparacion;
    }

}
