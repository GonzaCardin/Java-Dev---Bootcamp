package com.educacionit.ejercicio_01;

import java.io.File;

public class Ejercicio_1 {
    private static String RUTA_BASE = "C:\\Users\\gonza\\OneDrive\\BootCamp Java Developer\\Repositorios\\class_Practice\\clase_23\\src\\main\\resources";

    public static void main(String[] args) {

        File myFile = new File(RUTA_BASE);

        String[] listaDirectorio = myFile.list();
        for (String unaEntrada : listaDirectorio) {
            System.out.println("Procesando la entrada " + unaEntrada);
            mostrarEntrada(unaEntrada);
        }
    }

    public static void mostrarEntrada(String unaEntrada) {
        File unFile = new File(RUTA_BASE + "/" + unaEntrada);
        if (unFile.isFile()) { /// es un archivo
            System.out
                    .println("El archivo " + unaEntrada + ((unFile.canRead()) ? " Se puede leer" : "No se puede leer"));
            System.out.println(
                    "El archivo " + unaEntrada + ((unFile.canWrite()) ? " Se puede escribir" : "No se puede escribir"));
            System.out.println("El archivo " + unaEntrada
                    + ((unFile.canExecute()) ? " Se puede ejecutar" : "No se puede ejecutar"));
            System.out.println("El archivo " + unaEntrada
                    + ((unFile.isHidden()) ? " Es un archivo oculot" : "No es un archivo oculto"));
        } else if (unFile.isDirectory()) {
            String[] lista = unFile.list();
            for (String entradaDirectorio : lista) {
                System.out.println("En el directorio(Perdón por la redundancia...) " + unaEntrada + " Tiene: "
                        + entradaDirectorio);
            }
        } else {
            System.out.println("No es posible determinar que es " + unaEntrada);
        }

    }
}
