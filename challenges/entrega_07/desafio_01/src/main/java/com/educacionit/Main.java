package com.educacionit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al sistema de control de notas de la escuela primara XYZ");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Por favor, ingrese la cantidad de alumnos a procesar: ");
            Integer cantidadAlumos = scan.nextInt();
            ManejoDeAlumnos sistema = new ManejoDeAlumnos(cantidadAlumos);

            
        }catch(InputMismatchException e){
            System.out.println("No ingreso un valor númerico. Por favor ingrese nuevamente.");
        }
    }
}