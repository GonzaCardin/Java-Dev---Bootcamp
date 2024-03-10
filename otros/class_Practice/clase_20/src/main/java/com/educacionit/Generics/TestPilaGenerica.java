package com.educacionit.Generics;

import com.educacionit.Stack.exception.NoExisteElemento;

public class TestPilaGenerica {
    public static void main(String[] args) {
        /// Pila de Strings
        PilaGenerics<String> stackStrs = new PilaGenerics<>(3);

        stackStrs.agregar("Hola a todos");
        stackStrs.agregar("Hoy les voy a enseñar a");
        stackStrs.agregar("como trazar una hipozicloide");

        try {
            String strs = stackStrs.extraer();
            System.out.println(strs);
        } catch (NoExisteElemento e) {
            e.printStackTrace();
        }

        /// Pila de Floats
        PilaGenerics<Float> stackFloats = new PilaGenerics<>(3);

        stackFloats.agregar(Float.valueOf(5));
        stackFloats.agregar(Float.valueOf(52));
        stackFloats.agregar(Float.valueOf(29));
        stackFloats.toString();

        System.out.println("\n");

        /// Pila de Alumnos
        /*
         * Alumno<String,Double> unAlumno = new Alumno("Juan", 7.9);
         * PilaGenerics<Alumno> stackAlumnos = new PilaGenerics<>(2);
         * stackAlumnos.agregar(unAlumno);
         */

    }
}
