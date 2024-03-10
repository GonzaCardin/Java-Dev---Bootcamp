package com.educacionit.casteo;

import java.util.Scanner;

/* Solicitar el ingreso por teclado de un numero de tipo doble.
        Determinar si el número ingresado tiene decimales.
     */
public class Ejercicio_2_casteo {
     /* Solicitar el ingreso por teclado de un numero de tipo doble.
        Determinar si el número ingresado tiene decimales.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un valor decimal:");
        double dd = scanner.nextDouble();

        System.out.printf("El valor ingresado es : %.3f\n", dd);

        /// 1.0 --> No tiene decimales.
        /// 1.1 --> Si tiene decimales.

        /// Dado 1.3
        /// 1     1.3 
        int i = (int)dd;
        double decimales = dd - i;

        if(decimales != 0){
            System.out.println("El número ingresado " + dd + " posee decimales.");
        }
        else {
            System.out.println("El número ingresado " + dd + " no posee decimales.");
        }

       
        
        
        
        scanner.close();
    }
}
