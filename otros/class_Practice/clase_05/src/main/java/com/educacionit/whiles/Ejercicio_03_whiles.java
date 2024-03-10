package com.educacionit.whiles;

import java.util.Scanner;

public class Ejercicio_03_whiles {
    /*
        Escribir un progama que solicite la cargar de un número entre 0 y 999, 
        e indique la cantidad de digitos del mimsmo.
        Finalizar el programa cuando se cargue el valor 0;
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor:");
        int valor = scanner.nextInt();

        do {
            System.out.println("Ingrese un valor entre 1 y 999(0 -> finaliza el programa): ");
            valor = scanner.nextInt();

            if(valor < 0 || valor > 999) continue;

            if(valor >= 100){
                System.out.println("El número ingresado tiene 3 digitos.");
            }
            else if(valor >= 10){
                System.out.println("EL número ingresado tiene 2 digitos.");
            }
            else if(valor > 0){
                System.out.println("El número ingresado tiene 1 digito.");
            }

        } while (valor != 0);

        
        scanner.close();
     }
}
