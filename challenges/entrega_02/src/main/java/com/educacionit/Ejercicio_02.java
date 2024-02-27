package com.educacionit;

public class Ejercicio_02 {
    /*
        Ejercicio 2
            1. Resolver los enunciados desarrollando el código.
            2. Dados n1=5, n2=10 y n3=20, informar:
            a) n1+n2
            b) n3-n1
            c) n1*n3
            d) n3/n2
     */
    public static void main(String[] args) {
        int n1 = 5, n2 = 10, n3 = 20;
              
        int result_A = n1+n2;   /// También pudo hacerse la siguiente declaración: n1+=n2;
        int result_B = n3-n1;   /// También pudo hacerse la siguiente declaración: n3-=n1;
        int result_C = n1*n3;   /// También pudo hacerse la siguiente declaración: n1*=n3;
        int result_D = n3/n2;   /// También pudo hacerse la siguiente declaración: n3/=n2;

        ///Sin embargo, a la hacer dicha declaración se cambiarian los valores de n1,n2 y n3 respectivamente, por lo cual se utilizan las variables auxiliares result.

        System.out.println("n1 + n2 = "+ result_A);
        System.out.println("n3 - n1 = "+ result_B);
        System.out.println("n1 * n3 = "+ result_C);
        System.out.println("n3/n2 = "+ result_D);
        
    }
}
