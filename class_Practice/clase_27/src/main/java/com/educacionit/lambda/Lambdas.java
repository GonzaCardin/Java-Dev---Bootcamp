package com.educacionit.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambdas {
    public void ejercicio_01() {
        BinaryOperator<Integer> suma = (a, b) -> a + b;
        Integer resultado = suma.apply(10, 20);
        System.out.println(resultado);
    }

    public void ejercicio_02() {
        BinaryOperator<Integer> producto = (a, b) -> a * b;
        Integer resultado = producto.apply(5, 2);
        System.out.println(resultado);
    }

    public void ejercicio_03() {
        Predicate<Integer> esPar = n -> n % 2 == 0;
        boolean x1 = esPar.test(2);
        boolean x2 = esPar.test(3);
        System.out.println("2 es par: " + x1);
        System.out.println("3 es par: " + x2);
    }

    public void ejercicio_04() {
        Function<String, Integer> longitudString = x -> x.length();
        Integer length = longitudString.apply("Cristiano");
        System.out.println("Cristiano -> " + length);
    }

    public void ejercicio_05() {
        Function<String, String> toUpper = x -> x.toUpperCase();
        String resultado = toUpper.apply("hola a todos");
        System.out.println(resultado);
    }

    public void ejercicio_06() {
        Function<Integer, Integer> cuadrado = x -> x * x;
        Integer resultado = cuadrado.apply(2);
        System.out.println(resultado);
    }

    public void ejercicio_07() {
        /// BiFunction<String, String, String> concatenar = (cadena_01, cadena_02) ->
        /// cadena_01 + cadena_02; ->Equivalnte
        BiFunction<String, String, String> concatenar = (cadena_01, cadena_02) -> cadena_01.concat(cadena_02);
        String resultado = concatenar.apply("Hola a ", "todos");
        System.out.println(resultado);
    }

    public void ejercicio_08() {
        Predicate<String> emptyStr = str -> str.isEmpty();
        boolean ex_01 = emptyStr.test("No está vacia");
        boolean ex_02 = emptyStr.test("");
        System.out.println(ex_01);
        System.out.println(ex_02);
    }

    public void ejercicio_09() {
        BinaryOperator<Integer> maximo = (primer, segundo) -> Math.max(primer, segundo);
        System.out.println("Máximo de dos numeros: " + maximo.apply(10, 30));
    }

    public void ejercicio_10() {
        BinaryOperator<Integer> minimo = (primer, segundo) -> Math.min(primer, segundo);
        System.out.println("Mínimo de dos números: " + minimo.apply(50, 10));
    }

    public void ejercicio_11() {
        Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Message printed");
    }

    public void ejercicio_12() {
        Predicate<Integer> esPositivo = x -> x > 0;
        System.out.println("Is -7 a positive number? " + esPositivo.test(-7));
    }

    public void ejercicio_13() {
        Function<Double, Double> areaCirculo = radius -> Math.PI * radius * radius;
        System.out.println("Área del círculo de radio 5 es: " + areaCirculo.apply(5d));
    }

    public void ejercicio_14() {
        BiFunction<Integer, Integer, Double> potencia = (base, exponente) -> Math.pow(base, exponente);
        System.out.println("2^3" + potencia.apply(2, 3));
    }

    public void ejercicio_15() {
        Function<Double, Integer> parteEntera = (unDouble) -> {
            System.out.println("Este es el ejecicio 15");
            return unDouble.intValue();
        };
        System.out.println("Parte entera de 2,5: " + parteEntera.apply(2.5));
    }

    public void ejercicio_17() {
        BiFunction<String, String, Boolean> contieneSubcadenas = (cadena, subCadena) -> cadena.contains(subCadena);
        System.err.println("Contiene subcadena: " + contieneSubcadenas.apply("Hola soy yo", "soy"));
    }

    public void ejercicio_18() {
        BiFunction<Integer, Integer, Integer> modulo = (n1, n2) -> n1 % n2;
        System.out.println("Módulo de dos números: " + modulo.apply(4, 2));
    }
}
