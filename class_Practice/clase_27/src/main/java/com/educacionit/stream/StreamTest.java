package com.educacionit.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Gonzalo");
        names.add("Bautista");
        names.add("Lucas");
        names.add("Sergio");

        // Traditional Programming
        /*
         * for (String name : names) {
         * if (name.contains("s")) {
         * System.out.println(name);
         * }
         * }
         */

        // Funtional Programming
        // Filter - For-Each
        names.stream().filter(name -> name.contains("s")).forEach(name -> System.out.println(name));

        // Sorted
        System.out.println("Método Sorted");
        names.stream().sorted(Comparator.naturalOrder()).forEach(name -> System.out.println(name));
        List<String> newList = names.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(newList);

        // Distinc
        names.stream().distinct().forEach(name -> System.out.println("Uniques Values: " + name));

        //Limit
        names.stream().limit(2).forEach(name -> System.out.println("Limit to 2: " + name));

        //Funciones terminales

        //Count
        long cantidadElementos = names.stream().count();
        System.out.println("Cantidad Elementos: " + cantidadElementos);
        ///Count + Filter
        long cantidadElementosFiletr = names.stream().filter(name->name.contains("a")).count();
        System.out.println("Cantidad de elementos luego de filtrar mediante la subcadena 'a': " + cantidadElementosFiletr);

        //Reduce
        String str = names.stream().reduce("Nombres: ", (a,b)-> a +" "+ b );
        System.out.println(str);
        
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);

        Integer salidaEnteros = listaEnteros.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Reduce Enteros: " + salidaEnteros);

        salidaEnteros = listaEnteros.stream().reduce(100, (a, b) -> a - b);
        System.out.println("Reduce Enteros: " + salidaEnteros);

        
        
    }
}
