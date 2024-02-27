package com.educacionit.queue;

public class TestQueue {
    public static void main(String[] args) {
        Cola<String> queueStr = new Cola<>(5);

        queueStr.encolar("P1");
        queueStr.encolar("P2");
        queueStr.encolar("P3");

        /*
        String str1 = queueStr.desencolar(); // P1
        String str2 = queueStr.desencolar(); // P2
        String str3 = queueStr.desencolar(); // P3
        System.out.print("\n");
        */

        System.out.println("Primer Elemento:"+queueStr.primero());
        System.out.println("El tamaño de la cola: "+queueStr.tamanio());

        while (!queueStr.estaVacia()) {
            String elemento = queueStr.desencolar();
            System.out.println("Elemento: " + elemento);
        }

    }
}
