package com.educacionit;

import java.util.Scanner;

public class Ejercicio_02 {
    /*
        Realizar un programa que permita al usuario ingresar por consola una oración.
        El programa debe mostrar cada palabra ingresada con su índice como se indica abajo:

        Ingreso: "Esto es una frase"
        Salida:
        1-Esto
        2-es
        3-una
        4-frase
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String ss = scanner.nextLine(); //.nextLine() se utiliza para leer una oración.  .next() se utiliza para leer una sola palabra.

        String [] a = ss.split(" ");

        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + ":" + a[i]);
        }

        scanner.close();
    }
}
