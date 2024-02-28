package com.educacionit;

public class CollectionCustom<T> {
    private T[]array;
    private Integer size;
    @SuppressWarnings("unchecked")
    public CollectionCustom(Integer size) {
        array = (T[]) new Object[size];
        this.size = size;
    }
    public int size(){
        return size();
    }
    public void addFirst(T element){
        System.arraycopy(array, 0, array, 1, size());
        array[0] = element;
        size++;
    }

    public void addLast(T element){
        array[size] = element;
        size++;
    }
    public void add(T element){
        addLast(element);
    }
    public T remove(T element){
        for (int i = 0; i < size; i++) {
            if(array[i].equals(element)){
                T removeElement = array[i];
                System.arraycopy(array, i+1, array, i, size-i-1);
                array[size-1] = null;
                size--;
                return removeElement;
            }
        }
        return null;
    }
    public void removeAll(T element){
        
    }
    public boolean empty(){
       
        return false;
    }
    
}
