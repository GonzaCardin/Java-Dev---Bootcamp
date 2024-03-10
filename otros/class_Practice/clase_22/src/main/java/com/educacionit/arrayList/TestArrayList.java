package com.educacionit.arrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista);

        lista.add(0, 90);/// desplaza
        System.out.println(lista);

        lista.set(2, 50);
        System.out.println(lista);/// reemplaza

        lista.remove(0);/// elimina
        System.out.println(lista);

        lista.add(50);
        lista.add(50);
        System.out.println(lista);

        int pos = lista.indexOf(50);
        System.out.println("Posición de 50: " + pos);

        int posición = lista.lastIndexOf(50);
        System.out.println("Ultima posición de Integer 50: " + posición);

        /*
         * for (Iterator i = lista.listIterator(); i.hasNext();) {
         * Integer inte = (Integer)i.next();
         * System.out.print(inte);
         * }
         * System.out.println();
         * 
         * for(ListIterator<Integer> iterator = lista.listIterator();
         * iterator.hasPrevious();){
         * Integer entero = iterator.previous();
         * System.out.print(entero);
         * }
         */
        
         List<Integer> subList = lista.subList(2, 4);
        System.out.println(subList);

    }
}
