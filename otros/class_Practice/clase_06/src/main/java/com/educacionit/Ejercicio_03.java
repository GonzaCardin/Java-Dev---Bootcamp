package com.educacionit;

import java.util.Scanner;

public class Ejercicio_03 {
    /*
        Se solicita implementar el metodo toUpperCase de la clase String, es decir que dado un String el programa debe convertir a mayúsculas todas las letera.
        Mostrar el resultado por consola con el siguiente formato:
        Pos[0] -> H --> H
        Pos[1] -> o --> O
        Pos[2] -> l --> L
        Pos[3] -> a --> A
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese la frase:");
       String SS = scanner.nextLine();
       char[] toUpperCase = new char[SS.length()];
       
       for (int i = 0; i < SS.length(); i++) {
        char c = SS.charAt(i);

        if(c >= 'a' && c <= 'z') {      ///Para transformar a minúsculas seria -> (c>= 'A' && c <='Z')
            toUpperCase[i] = (char)(c - 32);   /// "    "       "       "   -> (char)(c+32);
        }
        else{
            toUpperCase[i] = c;
        }
       
       }
       System.out.println(toUpperCase);
       scanner.close();
    }
}
