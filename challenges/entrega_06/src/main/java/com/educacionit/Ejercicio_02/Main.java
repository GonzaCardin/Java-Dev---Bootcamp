package com.educacionit.Ejercicio_02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*  Enunciado:
    Cree un programa que reciba 3 parámetros y calcule la suma, resta, multiplicación, división, resto de dos números con decimales 
    • Debe crear un método que no retorne, nada que reciba los 3 parámetros, 2 números con decimales y el carácter de operación.
    • Debe crear los métodos de las operaciones que retornar un numero con decimales.
    • Debe mostrar por consola un mensaje que indique el resultado y la operación realizada
 */

public class Main {
    public static void main(String[] args) {
        Double a, b;
        char operador;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número a: ");
            a = scanner.nextDouble();
            System.out.print("Ingrese un número b: ");
            b = scanner.nextDouble();
            System.out.print("Ingrese la operación que desea realizar [+, -, *, /, %]: ");
            operador = scanner.next().charAt(0);

            if (operador != '+' && operador != '-' && operador != '*' && operador != '/' && operador != '%') {
                throw new IllegalAccessException("El operador que ingreso es incorrecto.");
            }

            Operacion o = new Operacion(a, b, operador);
            switch (operador) {
                case '+':
                    System.out.printf("%s%.2f%n", o.toString(), o.suma());
                    break;
                case '-':
                    System.out.printf("%s%.2f%n", o.toString(), o.resta());
                    break;
                case '*':
                    System.out.printf("%s%.2f%n", o.toString(), o.producto());
                    break;
                case '/':
                    System.out.printf("%s%.2f%n", o.toString(), o.division());
                    break;
                case '%':
                    System.out.printf("%s%.2f%n", o.toString(), o.resto());
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida, ingrese nuevamente los números.");
        } catch (IllegalAccessException e) {
            System.out.println("Error: Operador no válido, ingrese nuevamente.");
        } finally {
            scanner.close();
        }
    }
}