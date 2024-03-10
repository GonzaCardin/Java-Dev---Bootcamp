package com.educacionit;

import java.util.Scanner;

public class Ejercicio_01 {
    /*
        Realizar un programa interactivo que solicite por teclado dos números, uno de tipo double y el segundo de tipo entero.
        El mismo termina cuando cualquiera de los números ingresados es cero.
        El programa debe calcular la potencia de los números ingresados. Resolver el ejercicio sin usar la clase Math.
     */
    public static void main(String[] args) {
        double base=0;
        int exponent=0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese la base: ");
            base = scanner.nextDouble();

            System.out.println("Ingrese el exponente:");
            exponent = scanner.nextInt();

            double result = base;
            ///double result = 1;   -> forma mas elegante
            for (int i = 0; i < exponent-1; i++) {  /// se puede inicializar i = 1 o el i<exponente-1
                result = result*base;
            }
            System.out.println("El resultado de "+ base + " elevado a "+ exponent + " es: "+result);
       
        } while(base != 0 || exponent !=0);
            
        scanner.close();
    }
}
