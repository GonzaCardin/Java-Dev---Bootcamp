package com.educacionit;

public class Ejercicio_03 {
    /*
        Ejercicio 3
            1. Resolver los enunciados desarrollando el código.
            2. Dados n1=10, n2=20 y n3=30, informar:
                a) El total.
                b) El promedio.
                c) El resto entre n2 y n1.
     */
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30;

        int total = n1+n2+n3;
        float promedio = (float)(total/3);
        int resto = n2-n1;


        System.out.println("Total: " + total);
        System.out.println("Promedio: " + promedio);
        System.out.println("Resto: " + resto);
        
    }
}
