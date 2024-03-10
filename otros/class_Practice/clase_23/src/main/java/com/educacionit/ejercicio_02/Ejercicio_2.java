package com.educacionit.ejercicio_02;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_2 {
    private static String NOMBRE_ARCHIVO = "C:\\Users\\gonza\\OneDrive\\BootCamp Java Developer\\Repositorios\\class_Practice\\clase_23\\src\\main\\resources\\alumnos.csv";

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        AltaAlumno alumno = new AltaAlumno(NOMBRE_ARCHIVO);
        int opcion;

        do {
            System.out.println("Ingrese la opción deseada: ");
            System.out.println("1- Ingresar un Alumno");
            System.out.println("2- Salir");
            opcion = scan.nextInt();
            
            if (opcion == 1) {
                alumno.agregarAlumno();
            }
            
        } while (opcion == 1);

        alumno.close();
        scan.close();
    }
}
