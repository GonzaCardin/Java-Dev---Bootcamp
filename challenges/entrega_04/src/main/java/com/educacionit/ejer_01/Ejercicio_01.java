package com.educacionit.ejer_01;

import java.util.Scanner;

/*
    Enunciado:
        Crear un programa que lea números enteros (positivos y negativos) del teclado y muestre la
        suma de dichos números ingresados. El programa se detendrá cuando el usuario indique el
        número 0, adicionalmente, debe indicar el número mayor y número menor introducido en el programa.
        Consideraciones
        Utilizar bucle while o do-while.
 */
public class Ejercicio_01{
    
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number(0 finish): " );
        number = scanner.nextInt();

        int max=number, min=number,total=0;
        while(number != 0){
            total += number;
            if(number > max) max=number;
            if(number < min) min=number;
            System.out.print("Enter a number(0 finish): " );
            number = scanner.nextInt();

        }
        System.out.println("The total sum is "+ total);
        System.out.println("The maximum  is "+max);
        System.out.println("The minimum is "+min);
        scanner.close();
    }
    
}