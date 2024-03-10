package com.educacionit.funcproc;

public class Ejercicio_02 {
    public static void main(String[] args) {
        int a = 5, b = 3;
        printNumbers(a,b);
    }
    public static void printNumbers(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(b, a);

        for(int i = min;i<=max;i++){
            System.out.print(i +" ");
        }

    }
}
