package com.educacionit.hashset;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(30);
        System.out.println(hashSet);

        Set<Integer> hash2 = new HashSet<>();
        hash2.add(1);
        hash2.add(30);
        hash2.add(20);

        hashSet.addAll(hash2);
        System.out.println(hashSet);

        if(hashSet.contains(10)){
            System.out.println("Mi colección principal contiene un valor de 10");
        }

        Integer [] array = new Integer[hashSet.size()];
        array = hashSet.toArray(array);
        System.out.println(array.toString());

        for(@SuppressWarnings("rawtypes")
        Iterator i = hash2.iterator();i.hasNext();){
            Integer inte = (Integer)i.next();
            System.out.println(inte);
        }          
        

        
        hashSet.removeAll(hash2);
        System.out.println(hashSet);

    }
}