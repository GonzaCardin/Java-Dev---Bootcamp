package com.educacionit.queue;

public class Cola<T> {
    private T[] elementos;
    private int capacidad;
    private int ini;
    private int tam;

    @SuppressWarnings("unchecked")
    public Cola(int capacidad) {
        this.capacidad = capacidad;
        elementos = (T[]) new Object[capacidad];
        ini = 0;
        tam = 0;
    }

    public T desencolar() {
        if (estaVacia()) {
            throw new QueueException("La cola esta vacía.");
        }
        T elemento = elementos[ini];
        ini++;
        tam--;
        return elemento;
    }

    public void encolar(T elemento) throws QueueException {
        if (tam == capacidad) {
            throw new QueueException("La cola esta llena");
        }
        elementos[tam] = elemento;
        tam++;
    }

    public boolean estaVacia() {
        /*
         * if(tam == 0){
         * return true;
         * }
         * return false;
         * }
         */
        return (tam == 0);
    }

    public T primero() {
        if (estaVacia()) {
            throw new QueueException("La cola esta vacía.");
        }
        /*
         * T elemento = elemento[ini];
         * return elementos;
         */
        return elementos[ini];
    }

    public int tamanio() {
        return tam;
    }
}
