package com.educacionit;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al sistema de control de notas de la escuela primara XYZ");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Por favor, ingrese la cantidad de alumnos a procesar: ");
            Integer cantidadAlumnos = scan.nextInt();
            ManejoDeAlumnos sistema = new ManejoDeAlumnos(cantidadAlumnos);
            
            for (int i = 0; i < cantidadAlumnos; i++) {
                System.out.println("Ingrese Nombre del Alumno: ");
                String nombre = scan.next();
                System.out.println("Ingrese Apellido del Alumno: ");
                String apellido = scan.next();
                System.out.println("Ingrese números de Exámen: ");
                Integer nroExamen = scan.nextInt();
                ArrayList<Double>listanotas = new ArrayList<>(nroExamen);
                for (int j = 0; j < nroExamen; j++) {
                    System.out.println("Ingrese nota del Exámen(0-10): ");
                    Double nota = scan.nextDouble();
                    listanotas.add(nota);  
                }

                Alumno a = new Alumno(nombre, apellido, nroExamen, listanotas);
                sistema.agregarAlumno(a);
            }
            System.out.println("Lista de Alumnos: ");
            sistema.mostrarAlumno();
            
            
            sistema.alumnosPromocionados();
            sistema.alumnosParaRecursar();

            sistema.mostrarNotaAlta();
            sistema.mostrarNotaBaja();

        } catch (InputMismatchException e) {
            System.out.println("No ingreso un valor númerico. Por favor ingrese nuevamente.");
        }
    }
}