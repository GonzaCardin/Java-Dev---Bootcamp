package com.educacionit;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_1 {
    /*
        Ejercicio 1
            Crear un programa que ingrese una oración que 
            realice las siguientes operaciones:
                1. Contar las palabras.
                2. Indicar si hay palabras repetidas.
                3. Ordenar las palabras de forma ascendente 
                y mostrar el resultado.
                4. Ordenar las letras y mostrar el resultado.
            Consideraciones:
                La oración no puede estar vacía.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique la oracion a evaluar(No puede estar vacía): ");
        String sentence = scanner.nextLine();

        while (sentence.trim().isEmpty()) {
            System.out.println("La oración no puede estar vacía. Ingrese una oracón: ");
            sentence = scanner.nextLine();
        }
        String []words = sentence.split(" ");
        int wordsCount = words.length;
        System.out.println("La cantidad de palabras que contiene la oración es: "+wordsCount);
        
        Arrays.sort(words);
        boolean repeat = false;

        for(int i = 0;i<words.length-1;i++){
            if(words[i].equalsIgnoreCase(words[i+1])) repeat = true;
        }

        if(repeat) System.out.println("Hay palbras repetidas.");
        else System.out.println("No hay palabras repetidas.");

        char [] letters = sentence.replaceAll("\\s", " ").toCharArray();
        Arrays.sort(letters);
        ///System.out.print("Letras ordenadas: " +"[ "+new String(letters)+"]");
        System.out.println("Letras ordenadas:   ");
        System.out.println("[ "+new String(letters)+"]");       
          
        scanner.close();
    }
        
}