package com.educacionit.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class TestFormas {
    public static void main(String[] args) {
        List<Forma> listaFormas = new ArrayList<>();

        Circulo circle = new Circulo(Double.valueOf(20));
        Rectangulo rectangle = new Rectangulo(Double.valueOf(1), Double.valueOf(2));
        Triangulo triangle = new Triangulo(1d, 2d, 3d);

        listaFormas.add(circle);
        listaFormas.add(triangle);
        listaFormas.add(rectangle);

        CalculoFormas test = new CalculoFormas();
        test.Calcular(listaFormas);
    }

}
