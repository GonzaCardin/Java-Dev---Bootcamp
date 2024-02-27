package com.educacionit.cola;

public class TestCola {
    public static void main(String[] args) {
        Cola<String> cola = new Cola<>();
        cola.encolar("Gonzalo");
        cola.encolar("Bautista");
        cola.encolar("Lucas");


        while (!cola.estaVacia()) {
            System.out.println("Tamaño de la cola: "+ cola.tamanio());
            System.out.println("Primer elemento:"+cola.primero());
            System.out.println("Elemento descolado: "+cola.desencolar()+"\n");
        }

    }
}
