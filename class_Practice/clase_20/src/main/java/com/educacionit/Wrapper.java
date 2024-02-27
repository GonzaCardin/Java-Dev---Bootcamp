package com.educacionit;

public class Wrapper {
    public static void main(String[] args) {
        /// Integer enteroUno = new Integer(1);
        /// Integer enteroDos = new Integer("1");

        /* Miembros de clase */ //
        // Integer enteroUno = Integer.valueOf(1);
        /// Integer enteroDos = Integer.valueOf("10");

        /* Miembros de instancia */ /// -> objeto ya instanciado y ya esta levantado en memoria
        /// int unEnteroPrimitivo = enteroUno.intValue();

        try {
            // Long longUno = Long.valueOf("hola");
            /// longUno.parseLong("");
        } catch (NumberFormatException exec) {
        }

        /// Boxing
        // Float unFloat = 1.0f;
        // Boolean unBoleano = false;

        /* UnBoxing */
        // float unFloatPrimitivo = unFloat;
        // boolean unBoleanoPrimitivo = unBoleano;
    }
}