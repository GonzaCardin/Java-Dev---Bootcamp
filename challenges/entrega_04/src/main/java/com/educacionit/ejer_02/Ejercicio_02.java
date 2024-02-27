package com.educacionit.ejer_02;

import java.util.Scanner;

/*  
    Ejercicio 2
        Crear un programa que ingrese una oración y
        muestre cuál es el carácter que más se repite.
        Consideraciones
        ● No debe incluir el espacio en blanco.
        ● La oración a ingresar no debe estar vacía.
 */
public class Ejercicio_02 {
    public static void main(String[] args) {
        String line;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        line = scanner.nextLine();
        while (line.isEmpty()) {
            System.out.print("Enter a non-empty sentence: " );
            line = scanner.nextLine();
        }
        line = line.replaceAll("\\s", ""); ///para reemplzar los espacios en blanco en la oración
        char characters [] = line.toCharArray();

        int frecuency [] = new int[256];    // si es que se usan los caracteres del ASCII en la oración.
        for(char c: characters){    ///calculo la frecuencia de cada caracter
            int value = (int) c;
            frecuency[value]++;
        }
        char repeatead = '\0';
        int maxFrecuency = 0;

        for(int i=0; i<frecuency.length; i++){  ///busco el caracter q mas se repite
            if(frecuency[i] > maxFrecuency){
                maxFrecuency = frecuency[i];
                repeatead = ((char) i);
            }
        }

        if(repeatead != '\0'){
            System.out.println("The most repeated character is "+ repeatead);
            System.out.print("Number of occurences: "+maxFrecuency);
        }
        else{
            System.out.println("There area characters in the sentences.");
        }

        scanner.close();
    }
}
