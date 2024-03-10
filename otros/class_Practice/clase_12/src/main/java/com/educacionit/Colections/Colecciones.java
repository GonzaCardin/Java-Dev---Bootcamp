package com.educacionit.Colections;

import java.util.Arrays;
///import java.util.Collection;
import java.util.Collections;

public class Colecciones {
    public static void main(String[] args) {
        String initialChain = "this is an initial chain";

        String [] A = initialChain.split(" "); // {"this", "is", "an", "initial", "chain"}

        System.out.println("Words: "+ A.length);
        System.out.println("Array not sorted: ");
        
        ///Print an array
        String Printed_A = Arrays.toString(A);
        System.out.println(Printed_A);  
        
        ///Ordena de formas ascendente        
        Arrays.sort(A);
        Printed_A = Arrays.toString(A);
        System.out.println(Printed_A);

        ///Ordena de forma descendente
        Arrays.sort(A,Collections.reverseOrder());
        System.out.println(Arrays.toString(A)); 

        ///sort or reverse sort con números primitivos no se puede, falla este tipo de procedimiento, por lo tanto se usan los WRAPPER.

        ///int i = 0;
        ///Integer inte = i;
        ///double d = 0;
        ///Double dou = d;

    }
}
