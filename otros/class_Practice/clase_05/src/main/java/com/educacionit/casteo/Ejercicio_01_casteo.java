package com.educacionit.casteo;

public class Ejercicio_01_casteo {
    public static void main(String[] args) {
        int i = 7;
        
        double d;
        //float f;
        //long l;
        short s;

        /// Casteo Implícito.
        d = i;
        //f = i;
        //l = i;

        /// Casteo Explicito.
        s = (short)i;

        d = 3.14;
        s = (short)d;

        System.out.printf("Double value: %.2f - Short value: %d\n",d,s);

        short ss = 129;
        if(ss>129){
            System.out.println("No deberia Castear");
        }
        byte b = (byte)ss;

        System.out.println("Short value: " + ss + " - Byte value: " + b);

    }
}
