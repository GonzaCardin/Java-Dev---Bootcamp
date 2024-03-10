package com.educacionit.Generics;

public class Alumno<T, S extends Number> { /// extend Number -> recorta el alcance del tipo de dato generico, ya que en
                                           /// este caso el promedio solamente es un número
    private T legajo;
    private S promedio;

    public T getLegajo() {
        return legajo;
    }

    public void setLegajo(T legajo) {
        this.legajo = legajo;
    }

    public S getPromedio() {
        return promedio;
    }

    public void setPromedio(S promedio) {
        this.promedio = promedio;
    }

    public Alumno(T legajo, S promedio) {
        this.legajo = legajo;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno [legajo=" + legajo + ", promedio=" + promedio + "]";
    }

}
