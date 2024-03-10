package com.educacionit.Ejercicio_1;

import java.util.List;

public class CalculoFormas {
    public <T extends Forma> void Calcular(List<T> listaFormas) {

        /// Polimorfismo

        /// For each
        for (Forma t : listaFormas) {
            double area = t.calcularArea();
            double perimetro = t.calcularPerimetro();
            System.out.println("Objeto: " + t);
            System.out.println("Área: " + area);
            System.out.println("Perimetro: " + perimetro);
            System.err.println("\n");
        }

        /*
         * Traditional For
         * for (int i = 0; i < listaFormas.size(); i++) {
         * Forma form = listaFormas.get(i);
         * double area = form.calcularArea();
         * double perimetro = form.calcularPerimetro();
         * 
         * System.out.println("Área: " + area);
         * System.out.println("Perimetro: " + perimetro);
         * }
         */

    }
}
