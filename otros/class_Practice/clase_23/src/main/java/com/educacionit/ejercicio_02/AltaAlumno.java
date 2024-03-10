package com.educacionit.ejercicio_02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AltaAlumno {
    private FileWriter writer;

    public AltaAlumno(String nombreArchivo) throws IOException {
        super();
        writer = new FileWriter(nombreArchivo);
    }

    public void agregarAlumno() {
        @SuppressWarnings("resource")   ///Anda diez puntos, se puede hacer mejor
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Legajo: ");
        Integer legajo = scanner.nextInt();

        System.out.println("Ingrese Nombre: ");
        String nombre = scanner.next();

        System.out.println("Ingrese Apellido: ");
        String apellido = scanner.next();

        System.out.println("Ingrese Edad: ");
        Integer edad = scanner.nextInt();

        guardarAlumno(legajo, nombre, apellido, edad);

        
    }

    private void guardarAlumno(Integer legajo, String nombre, String apellido, Integer edad) {
        try {
            String registro = legajo + "," + nombre + "," + apellido + "," + edad + "\n";
            writer.write(registro);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() throws IOException {
        writer.close();
    }

}
