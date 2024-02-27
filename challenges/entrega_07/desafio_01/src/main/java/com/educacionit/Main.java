package com.educacionit;

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
                System.out.println("Ingrese Número del Exámen: ");
                Integer nroExamen = scan.nextInt();
                System.out.println("Ingrese nota del Exámen: ");
                Double nota = scan.nextDouble();

                Alumno a = new Alumno(nombre, apellido, nroExamen, nota);
                sistema.agregarAlumno(a);
            }
            System.out.println("Lista de Alumnos: ");
            sistema.mostrarAlumno();

            System.out.println("Lista de Alumnos Promocionados: ");
            System.out.println(sistema.alumnosPromocionados());

            System.out.println("Lista de Alumnos Recursantes: ");
            System.out.println(sistema.alumnosParaRecursar());

            System.out.println("Alumnos con nota más alta: " + sistema.mostrarNotaAlta());
            System.out.println("Alumnos con nota más baja: " + sistema.mostrarNotaBaja());


        } catch (InputMismatchException e) {
            System.out.println("No ingreso un valor númerico. Por favor ingrese nuevamente.");
        }
    }
}