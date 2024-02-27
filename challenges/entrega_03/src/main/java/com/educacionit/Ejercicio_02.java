package com.educacionit;

import java.util.Scanner;

public class Ejercicio_02 {
    /*
        Ejercicio 2
            Dada la siguiente tabla del tiempo, hacer un
            programa que indique qué puede hacer una
            persona con dicho pronóstico:
            Referencia:
             Temperatura     Tiempo     Sugerencia
            > 25°            Soleado    Caminar y tomar sol
            > 15° y <=25°    Soleado    Caminar
            <=15°            Soleado    Caminar con campera
            <10°             Lluvia     Quedarse en casa o salir con paraguas y campera
            <10°             Nieve      Esquiar
     */
    public static void main(String[] args){
        float temperature;
        String weather;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings!");
        System.out.print("Enter the weather: ");
        weather = scanner.nextLine();
        System.out.print("Enter the temperature(Celsius): ");
        temperature = scanner.nextFloat();

        if(temperature > 25 && weather.equals("Sunny")){
            System.out.println("Temperature: " + temperature +"° Celsius "+"->"+" Weather: " + weather);
            System.out.println("Suggestion: Go for a walk and sunbath.");
        }
        if(temperature <= 25 && temperature > 15 && weather.equals("Sunny")){
            System.out.println("Temperature: " + temperature +"° Celsius "+"->"+" Weather: " + weather);
            System.out.println("Suggestion: Go for a walk.");
        }
        if(temperature <= 15 && weather.equals("Sunny")){
            System.out.println("Temperature: " + temperature +"° Celsius "+"->"+" Weather: " + weather);
            System.out.println("Suggestion: Go for a walk with a jacket.");
        }
        if(temperature < 10 && weather.equals("Rainy")){
            System.out.println("Temperature: " + temperature +"° Celsius "+"->"+" Weather: " + weather);
            System.out.println("Suggestion: Stay at home or go out with an umbrella and a jacket.");
        }
        else if(temperature < 10 && weather.equals("Snowy")){
            System.out.println("Temperature: " + temperature +"° Celsius "+"->"+" Weather: " + weather);
            System.out.println("Suggestion: Go skiing.");
        }
        
        scanner.close();
    }
}
