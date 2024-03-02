package com.educaionit;



public class CollectionCustom<T> {
    private T[] array;
    private int index;
    private int size;

    @SuppressWarnings("unchecked")
    public CollectionCustom(int size) {
        array = (T[]) new Object[size];
        index = 0;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(T element) {
        if (index >= size) {
            /// no se pude esta llena
        }
        for (int i = index; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = element;
        index++;
    }

    public void addLast(T element) {
        if (index >= size) {
            /// esta llena
        }
        array[index] = element;
        index++;
    }

    public void add(T element) {
        addLast(element);
    }

    public T remove(T element) {
        for (int i = 0; i < index; i++) {
            if (array[i].equals(element)) {
                T removed = array[i];
                for (int j = 0; j < index - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[index - 1] = null;
                index--;
                return removed;
            }
        }
        return null;
    }

    public void removeAll(T element) {
        for (int i = 0; i < index; i++) {
            if (array[i].equals(element)) {
                for (int j = 0; j < index - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[index - 1] = null;
                i--;
            }
        }
    }
    public boolean isEmpty(){
        return index==0;
    }
    public void print(){
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i]);
            if(i < index - 1){
                System.err.print(" - ");
            }
        }
        System.err.print("]");
    }
}
