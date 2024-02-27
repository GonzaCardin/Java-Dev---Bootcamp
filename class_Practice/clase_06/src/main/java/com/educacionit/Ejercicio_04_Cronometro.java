package com.educacionit;

public class Ejercicio_04_Cronometro {
    /* Realizar un cronometro */

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0;i<24;i++) {
            for (int j = 0;j<60;j++) {
                for (int k = 0;k<60;k++) {
                    System.out.println("Hora: " + i + " Minuto: " + j + " Segundo: " + k);
                    Thread.sleep(50); 
                }
            }
        }
    }
}
