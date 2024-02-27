package com.educacionit;

import java.util.Scanner;

public class Ejercicio_01 {
    /*
        Ejercicio 1
            Crear un programa que simule un inicio de sesión con dos
            cadenas de caracteres (usuario y contraseña).
            Luego, mostrar dos tipos de mensajes en pantalla:
            “Bienvenido al Sistema” y “Credenciales incorrectas” en
            caso de que el ingreso sea incorrecto. 
     */
    public static void main(String[] args){
        String user, password;

        String [][]users = {                            ///Nota: Decidi usar un arreglo bidimensional, debido a que lo utilice como una "mini base de datos" en la cual se almacenan
            {"GonzaCardin26","pass12345"},              /// los users con sus respectivas passwords. Si bien se podia realizar de una manera mas simple creando un user y password
            {"CrisRonaldo07","Siu7"},                   /// fijos y que después los compare, me lancé a probar de esta manera. Espero que cumpla lo solicitado.
            {"ElonMusk89","Xf59"},
            {"AbrahamLinc65","Freedom18"}
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Username: ");
        user = scanner.nextLine();

        System.out.print("Enter your Password: ");
        password = scanner.nextLine();
        
        boolean result = false;
       
        for(int i = 0; i <users.length; i++){
            if(users[i][0].equals(user) && users[i][1].equals(password)){
                result = true;
                break;
            }
        }
        
        if(result){
            System.out.println("Welcome to the System");
        }
        else{
            System.out.println("Incorrect credentials!!!");
        }
        scanner.close();
    }
}
