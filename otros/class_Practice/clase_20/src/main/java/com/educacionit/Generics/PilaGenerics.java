package com.educacionit.Generics;

import java.util.Arrays;

import com.educacionit.Stack.exception.NoExisteElemento;

public class PilaGenerics<T> {
    private T[] pilaArray;
    private int contador;

    @SuppressWarnings("unchecked")  ///-> confío en que este código es seguro jijija.
    public PilaGenerics(int tamanio) {
        pilaArray = (T[]) new Object[tamanio];
        contador = 0;
    }

    public boolean estaVacia() {
        return (contador == 0);
    }

    public boolean agregar(T elemento) {
        if (contador >= pilaArray.length) {
            return false;
        }
        pilaArray[contador] = elemento;
        contador++;
        return true;
    }

    public T primero() throws NoExisteElemento {
        if (estaVacia()) {
            throw new NoExisteElemento("La pila esta vacía.");
        }
        return pilaArray[contador - 1];
    }

    public T extraer() throws NoExisteElemento {
        if (estaVacia()) {
            throw new NoExisteElemento("La pila esta vacía.");
        }
        T elementoRetorno = pilaArray[contador - 1];
        contador--;
        return elementoRetorno;
    }

    @Override
    public String toString() {
        return "PilaInteger [pilaArray=" + Arrays.toString(pilaArray) + "]";
    }

}
