package com.educacionit.whiles;

public class Ejercicio_01_whiles {
    public static void main(String[] args){
        int cont = 1;
        int aux = 0;
        while (cont < 5) {
            System.out.println("Goals: " + cont);
            cont++;
            while (aux<4) {
                System.out.println("QUE PARADON DE OBLAK!!!");
                aux++;
            }
        }
       System.out.println("End");
    }
}
