package com.educacionit.Ejercicio_1;

public class Triangulo implements Forma {
    private Double lado_1;
    private Double lado_2;
    private Double lado_3;

    public Triangulo(Double lado_1, Double lado_2, Double lado_3) {
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
        this.lado_3 = lado_3;
    }

    @Override
    public Double calcularArea() {
        double s = (lado_1 + lado_2 + lado_3) / 2;
        return Math.sqrt(s * (s - lado_1) * (s - lado_2) * (s - lado_3));
    }

    @Override
    public String toString() {
        return "Triangulo [lado_1=" + lado_1 + ", lado_2=" + lado_2 + ", lado_3=" + lado_3 + "]";
    }

    @Override
    public Double calcularPerimetro() {
        return lado_1 + lado_2 + lado_3;
    }

}
