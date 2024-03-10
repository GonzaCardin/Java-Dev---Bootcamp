package com.educacionit.whiles;

import java.util.Scanner;

public class Ejercicio_02_while {
    /*
        Realizar un algoritmo que pida números(se piden por teclado). El programa debera informar:
            Cuantos números son mayores que 0.
            Cuantos números son menores que 0.
            Cuantos números son iguales a 0.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        int cont = 0;
        int mayores =0;
        int menores =0;
        int iguales =0;

        while (n != cont){
            System.out.println("Ingrese valor:");
            int valor = scanner.nextInt();

            if(valor > 0){
                mayores++;
            }
            else if(valor < 0){
                menores++;
            }
            else{
                iguales++;
            }
            

            cont++;
        }   

        System.out.println("Cantidad de números mayores a cero: "+mayores);
        System.out.println("Cantidad de números menores a cero: "+ menores);
        System.out.print("Cantidad de numeros iguales a cero:" + iguales);

        scanner.close();
    }
}
