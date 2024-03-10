package com.educacionit.funcproc;

public class Ejercicio_01 {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        int result = maxValueInt(a,b,c);
        System.out.println("The max value is "+ result);
    }
    public static int maxValueInt(int a, int b, int c) {
        int max=0;
        
        if(a > b && a > c) max = a;
        else if (b > a && b > c) max = b;
        else max = c;
        
        return max;
    }
}