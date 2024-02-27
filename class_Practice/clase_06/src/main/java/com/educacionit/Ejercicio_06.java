package com.educacionit;

public class Ejercicio_06 {
    /*
        Dado dos arrays definidos de la siguiente manera:
        char [] a1 = {'H','o','l','a'};
        int  [] a2 = {' ','M','u','n','d','o'};
        Escribir el programa que genere un tercer array de tipo char llamado arrayResultado con la concatenación
        de los primeros dos. Mostar en pantalla.
     */
    public static void main(String[] args) {
        char [] a1 = {'H','o','l','a'};
        int  [] a2 = {' ','M','u','n','d','o'};

        char [] a3 = new char[a1.length+ a2.length];
        int indexa3 = 0;


        for (int i = 0; i < a1.length; i++) {
            a3[indexa3] = a1[i];
            indexa3++;
        }
        for (int i = 0; i < a2.length; i++) {
            a3[indexa3] = (char)a2[i];
            indexa3++;
        }
        System.out.println(new String(a3));
    }
}
