package com.educacionit;
import java.util.Scanner;

public class EjercicioScanner {
    public static void main(String[] args) {
        
        double array[] = new double[3];    /// double []array = new double[3]; también es válido.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first value:");
        array[0] = scanner.nextDouble();
        
        System.out.println("Enter the second value:");
        array[1] = scanner.nextDouble();
        
        System.out.println("Enter the third value:");
        array[2] = scanner.nextDouble();
      
       

        System.out.println("First value: "+ array[0]);
        System.out.println("First value: "+ array[1]);
        System.out.println("First value: "+ array[2]);



        scanner.close();
    }
}
