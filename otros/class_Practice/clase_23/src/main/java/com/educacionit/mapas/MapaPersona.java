package com.educacionit.mapas;

import java.util.HashMap;
import java.util.Set;

import java.util.Map.Entry;

public class MapaPersona {
    public static void main(String[] args) {
        HashMap<Integer, Persona> mapa = new HashMap<>();

        Persona p1 = new Persona("Gonzalo", 22);
        Persona p2 = new Persona("Cristian", 40);

        /// mapa.put(p1.getNombre()+p1.getEdad(), p1);
        /// mapa.put(p2.getNombre()+p2.getEdad(), p2);

        mapa.put(p1.hashCode(), p1);
        mapa.put(p2.hashCode(), p2);

        System.out.println("Persona: " + mapa.get(p1.hashCode()));

        Set<Entry<Integer, Persona>> entrys = mapa.entrySet();
        for (Entry<Integer, Persona> entry : entrys) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

    }
}
