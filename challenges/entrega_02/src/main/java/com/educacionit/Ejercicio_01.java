package com.educacionit;

import java.util.Scanner;

public class Ejercicio_01 {
    /*
    Ejercicio 1
        Crear un programa en Java que, dado un número entero de horas, muestre el equivalente en semanas, días y horas.
            Ejemplo de salida:
            Cantidad de horas totales: 1500
            Semanas: 8
            Días: 6
            Horas: 12
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas totales: ");
        int total_hours = scanner.nextInt();

        int weeks = total_hours / 168;  // 1 week  = 168 hours -> 24*7 = 168.
        int days_remaining = total_hours % 168;
        int days = days_remaining /24;
        int hours = days_remaining  % 24;

        System.out.println("Cantidad de horas totales: "+ total_hours);
        System.out.println("Semanas: " + weeks);
        System.out.println("Días: " + days );
        System.out.println("Horas: " + hours);

        scanner.close();
    }
}
