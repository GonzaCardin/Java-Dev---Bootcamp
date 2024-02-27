package com.educacionit.cola;

import java.util.ArrayDeque;
import java.util.Queue;

public class Cola<T> {
    private Queue<T> cola = new ArrayDeque<>();

    public Cola() {
    }

    public T desencolar() {
        if (estaVacia()) {
            throw new QueueException("La cola esta vacía.");
        }
        /*
         * T elemento = cola.poll();
         * return elemento;
         */
        return cola.poll();
    }

    public void encolar(T elemento) throws QueueException {
        cola.add(elemento);

    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public T primero() {
        if (estaVacia()) {
            throw new QueueException("La cola esta vacía.");
        }
        /*  
         * T elemento = cola.peek();
         * returb elemento;
         */
        return cola.peek();
    }

    public int tamanio() {
        return cola.size();
    }
}
