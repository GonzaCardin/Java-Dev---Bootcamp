package com.educacionit.Ejercicio_1;

public class Rectangulo implements Forma {
    private Double longitud;
    private Double ancho;

    @Override
    public String toString() {
        return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + "]";
    }

    public Rectangulo(Double longitud, Double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public Double calcularArea() {
        return longitud * ancho;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * (longitud * ancho);
    }

}
