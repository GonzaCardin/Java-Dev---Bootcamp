package com.educacionit.Stack;

import java.util.Arrays;

import com.educacionit.Stack.exception.NoExisteElemento;

public class PilaInteger {
    private Integer[] pilaArray;
    private int contador;

    public PilaInteger(int tamanio) {
        pilaArray = new Integer[tamanio];
        contador = 0;
    }

    public boolean estaVacia() {
        return (contador == 0);
    }

    public boolean agregar(Integer elemento) {
        if (contador >= pilaArray.length) {
            return false;
        }
        pilaArray[contador] = elemento;
        contador++;
        return true;
    }

    public Integer primero() throws NoExisteElemento {
        if (estaVacia()) {
            throw new NoExisteElemento("La pila esta vacía.");
        }
        return pilaArray[contador - 1];
    }

    public Integer extraer() throws NoExisteElemento {
        if (estaVacia()) {
            throw new NoExisteElemento("La pila esta vacía.");
        }
        Integer elementoRetorno = pilaArray[contador-1];
        contador--;
        return elementoRetorno;
    }

    @Override
    public String toString() {
        return "PilaInteger [pilaArray=" + Arrays.toString(pilaArray) + "]";
    }

}
