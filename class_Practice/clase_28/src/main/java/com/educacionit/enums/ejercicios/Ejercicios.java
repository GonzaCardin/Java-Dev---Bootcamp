package com.educacionit.enums.ejercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicios {
    public void ejercicio_01() {
        // 1. Obtener en un Set los nombres de los días de la semana en mayúsculas.
        Set<String> lista = Arrays.stream(DiaSemana.values())
                .map(nombre -> nombre.name())
                .map(s -> s.toLowerCase())
                .collect(Collectors.toSet());
        // .forEach(System.out::println);

        System.out.println(lista);
    }

    public void ejercicio_02() {
        // 2. Filtrar los días de la semana que empiezan con 'M', y obtener una List.
        Arrays.stream(DiaSemana.values())
                .map(n -> n.name())
                .filter(s -> s.startsWith("M"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void ejercicio_03() {
        // 3. Convertir los días de la semana en un mapa donde la clave es el nombre y
        // el valor es la longitud del nombre.
        Arrays.stream(DiaSemana.values())
                .map(n -> n.name())
                .collect(Collectors.toMap(s -> s, s -> s.length()))
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public void ejercicio_04() {
        // 4. Calcular el promedio de la longitud de los nombres de los días de la
        // semana.
        Arrays.stream(DiaSemana.values())
                .map(n -> n.name())
                .collect(Collectors.toList())
                .stream()
                .mapToInt(s -> s.length())
                .average()
                .ifPresent(System.out::println);
        System.out.println("--------------------------------");
    }

    public void ejercicio_05() {
        // 5. Convertir los nombres de los días de la semana en un Set.
        Arrays.stream(DiaSemana.values())
                .map(n -> n.name())
                .sorted()
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("----------------");
    }

    public void ejercicio_06() {
        // 6. Obtener los días de la semana en orden inverso generando una List.
        Arrays.stream(DiaSemana.values())
                .map(n -> n.name())
                .collect(Collectors.toList())
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("----------------");
    }

    public void ejercicio_07() {
        // 7. Filtrar los días de la semana que tienen una longitud de 6 o 7 caracteres.
        // Devolver una List.
        int min = 6;
        int max = 7;
        List<DiaSemana> lista = Arrays.stream(DiaSemana.values())
                .filter(dia -> {
                    if (dia.name().length() >= min && dia.name().length() <= max) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .collect(Collectors.toList());
        System.out.println(lista);

    }
}
