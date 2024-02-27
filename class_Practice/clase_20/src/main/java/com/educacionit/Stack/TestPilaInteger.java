package com.educacionit.Stack;

import com.educacionit.Stack.exception.NoExisteElemento;

public class TestPilaInteger {
    public static void main(String[] args) throws NoExisteElemento{
        PilaInteger pilaArrayInteger = new PilaInteger(5);

        /// Agrego elementos.
        pilaArrayInteger.agregar(Integer.valueOf(50));
        pilaArrayInteger.agregar(29);
        pilaArrayInteger.agregar(27);
        pilaArrayInteger.agregar(99);
        pilaArrayInteger.agregar(33);

        System.out.println(pilaArrayInteger);
        System.out.println("Esta Vacía la pila? " + pilaArrayInteger.estaVacia());
        System.out.println("Primer elemento: "+ pilaArrayInteger.primero());
        System.out.println("Valor extraído: "+ pilaArrayInteger.extraer());


    }

}
