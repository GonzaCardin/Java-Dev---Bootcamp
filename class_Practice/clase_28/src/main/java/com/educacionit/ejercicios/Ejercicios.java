package com.educacionit.ejercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicios {

    private final List<Integer> numbers = Arrays.asList(3, 5, 10, 30, 60, 90, 70);

    public void ejercicio_01() {
        /// 1. Filtrar números pares de una lista de enteros y mostrarlos.

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));
        System.out.println(" ---------------- ");
    }

    public void ejercicio_02() {
        /// 2. Elevar al cuadrado cada elemento de una lista de enteros y mostrarlos.
        numbers.stream()
                .map(number -> number * number)
                .forEach(number -> System.out.println(number));
        System.out.println("-----------------");

    }

    public void ejercicio_03() {
        /// 3. Contar la cantidad de caracteres de cada cadena en una lista de cadenas.
        List<String> cadena = Arrays.asList("Hola", "Mundo");
        System.out.println(cadena);
        cadena.stream()
                .map(String::length).forEach(System.out::println);
        System.out.println("---------------------");

    }

    public void ejercicio_04() {
        /// 4. Encontrar el máximo valor en una lista de enteros.

        int maximo = numbers.stream().max((a, b) -> a.compareTo(b)).orElse(0);
        System.out.println("Valor Máximo: " + maximo);

    }

    public void ejercicio_05() {
        /// 5. Sumar todos los elementos de una lista de enteros.
        int suma = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Suma: " + suma);
    }

    public void ejercicio_06() {
        /// 5. Sumar todos los elementos de una lista de enteros.
        boolean mayores = numbers.stream()
                .allMatch(number -> number > 5);
        System.out.println("Son todos mayores a 5?  " + mayores);
    }

    public void ejercicio_07() {
        /// 7. Eliminar elementos duplicados de una lista de cadenas.
        List<String> cadena = Arrays.asList("Hola", "a", "Todos", "Cristiano", "Hola", "es el número 1", "Todos");

        // Se crea una lista
        cadena.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        // Se crea una mapa
        /*
         * Map<String, String> m = cadena.stream().distinct()
         * .collect(Collectors.toMap(
         * c -> c,
         * c -> (c.length() + " " + c)));
         */

    }

    public void ejercicio_08() {
        /// 8. Calcular el promedio de una lista de números.

        double promedio = numbers.stream().mapToDouble(d -> d.doubleValue()).average().orElse(0);
        System.out.println("Promedio: " + promedio);

    }

    public void ejercicio_09() {
        /// 9. Convertir todas las cadenas de una lista a mayúsculas.
        List<String> cadena = Arrays.asList("hola", "mundo", "hello", "world");

        cadena.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

    public void ejercicio_10() {
        /// 10. Combinar dos listas y eliminar duplicados.
        List<String> cadena_1 = Arrays.asList("1", "2", "3", "4", "5", "6");
        List<String> cadena_2 = Arrays.asList("1", "2", "3", "4", "5", "6", "6", "7", "7", "8", "9", "10", "11");

        cadena_1.stream()
                .flatMap(s -> cadena_2.stream())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::print);
        System.out.println("");
    }

    public void ejercicio_11() {
        /// 11. Filtrar nombres que empiezan con "A" de una lista de cadenas.
        List<String> cadena = Arrays.asList("Alejandro", "Saul", "Agustin", "Ignacio", "Gonzalo", "Alberto");

        cadena.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);

    }

    public void ejercicio_12() {
        /// 12. Contar el número de caracteres de cada cadena en una lista de cadenas y
        /// mostrar el resultado en un mapa.
        List<String> cadena = Arrays.asList("Hola", "Mundo", " Hello", "World");
        Map<Object, Object> m = cadena.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length()));

        m.forEach((s, i) -> System.out.println("Cadena: " + s + ", Número de caracteres: " + i));

    }

    public void ejercicio_13() {
        // 13. Multiplicar todos los elementos de una lista de enteros entre sí.
        int resultado = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Resultado: " + resultado);
    }

    public void ejercicio_14() {
        // 14. Verificar si al menos un elemento de una lista de enteros es divisible
        // por 7.
        boolean resultado = numbers.stream()
                .anyMatch(n -> n % 7 == 0);
        System.out.println("Resultado: " + resultado);
    }

    public void ejercicio_15() {
        // 15. Ordenar una lista de cadenas de texto en orden alfabético inverso.
        List<String> cadena = Arrays.asList("Hola", "Mundo", "Hello", "World", "Zidane", "Alejandro");

        cadena.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("");
    }

    public void ejercicio_16() {
        // 16. Contar el número de elementos en una lista de cadenas que tienen una
        // longitud mayor que 3.

        List<String> cadena = Arrays.asList("Hola", "todos", "Hi", "ola", "Ver", "un", "an");

        cadena.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("");
    }

    public void ejercicio_17() {
        // 17. Calcular la suma de los cuadrados de los números pares en una lista de
        // enteros.

        int resultado = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("Resultado: " + resultado);
    }

    public void ejercicio_18() {
        // 18. Concatenar todas las cadenas de una lista de cadenas.
        List<String> cadena = Arrays.asList("Hola", "a", "todos", "soy", "el número", "1.\n");
        String result = cadena.stream()
                .collect(Collectors.joining(" "));

        System.out.println("Resultado: " + result);

    }

    public void ejercicio_19() {
        // 19. Combinar dos listas ordenadas en una lista ordenada.
        List<Integer> numbers_aux = Arrays.asList(1, 3, 5, 6, 7, 9, 11);
        List<Integer> numbers_aux2 = Arrays.asList(2, 4, 8, 10, 12);

        Stream.concat(numbers_aux.stream(), numbers_aux2.stream())
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void ejercicio_20() {
        // 20. Encontrar el primer número divisible por 5 de una lista de enteros.
        int resultado = numbers.stream()
                .filter(n -> n % 5 == 0)
                .findFirst().orElse(0);
        System.out.println("Resltado: " + resultado);
    }
}
