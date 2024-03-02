package com.educaionit;

public class TestCollection {
    public static void main(String[] args) {
        CollectionCustom<Integer> coleccionEnteros = new CollectionCustom<>(7);

        coleccionEnteros.add(Integer.valueOf(1));
        coleccionEnteros.add(Integer.valueOf(2));
        coleccionEnteros.add(Integer.valueOf(3));
        coleccionEnteros.add(Integer.valueOf(4));
        coleccionEnteros.add(Integer.valueOf(5));

        coleccionEnteros.print();

        coleccionEnteros.addFirst(Integer.valueOf(0));
        coleccionEnteros.addLast(Integer.valueOf(3));
        
        coleccionEnteros.print();

        System.out.println("----------");
        System.out.println(coleccionEnteros.remove(Integer.valueOf(4)));
        coleccionEnteros.print();

        System.out.println("--------");
        coleccionEnteros.removeAll(Integer.valueOf(3));
        coleccionEnteros.print();

        
    }
}