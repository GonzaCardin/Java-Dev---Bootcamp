package com.educacionit.math;

import java.util.Scanner;

public class Ejercicio_01_math {
    /* 
     * Realizar un programa que solicite el ingreso de un valor(r), correspondiente al radio de un circulo. Luego cálcule su área.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);    /// A = pi * radius^2.

        System.out.println("The area of the circle is: " + area);
        System.out.printf("%s %s %.2f is: %.5f\n","The area of the circle "," with radius ",radius,area);
        scanner.close();
    }
}
