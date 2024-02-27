package ar.educacionit.string;

import java.util.Scanner;

public class EjercicioString_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first sentence: ");
        String firstChar = scanner.nextLine();

        System.out.println("Enter the second sentence: ");
        String secondChar = scanner.nextLine();

        /// String aux = null; /// no need to return.

        System.out.println("Length of the first sentence: "+ firstChar.length());
        System.out.println("Length of the second: "+ secondChar.length());
        
       /// if(firstChar.isEmpty() || firstChar.isBlank()){
        ///    System.out.println("The first sentence is empty or blank.");
        ///}
        ///if (secondChar.isBlank() || secondChar.isEmpty()){
          //  System.out.println("The second sentence is empty or blank.");
        //}
        
        if(firstChar.equalsIgnoreCase(secondChar)){     /// equals -> compare two strings ||| equals.IgnoreCase() -> ignore Case  
            System.out.println("The sentences are the same.");
        }
        else{
            System.out.println("The sentences are not the same.");
        }

        scanner.close();
    }
}
