package com.educacionit.Ejercicio_1;

public class Circulo implements Forma {
    private Double radio;

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
