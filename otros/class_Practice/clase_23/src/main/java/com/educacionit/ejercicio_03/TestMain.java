package com.educacionit.ejercicio_03;


import java.util.Scanner;

public class TestMain {
    private static String RUTA_ARCHIVO = "C:\\Users\\gonza\\OneDrive\\BootCamp Java Developer\\Repositorios\\class_Practice\\clase_23\\src\\main\\resources\\alumnos.csv";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        ConsultaAlumno alumnos = new ConsultaAlumno(RUTA_ARCHIVO);

        do {
            System.out.println("1- Consultar legajo: ");
            System.out.println("2- Salir");
            opcion = scan.nextInt();
            Integer legajo = scan.nextInt();
            if (opcion == 1) {
                try {
                    
                    Alumno uAlumno = alumnos.consultar(legajo);
                    /// Mostrar alumno
                    System.out.println("El alumno consultado con legajo: " + legajo + " es " + uAlumno);
                } catch (Exception e) {
                    System.out.println("El alumno consultado con legajo: " + legajo + " no existe.");
                }
            }
        } while (opcion != 2);
        scan.close();
    }
}
