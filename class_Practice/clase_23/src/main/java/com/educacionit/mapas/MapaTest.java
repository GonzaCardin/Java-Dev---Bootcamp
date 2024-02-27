package com.educacionit.mapas;

import java.util.HashMap;

public class MapaTest {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>(); /// Diccionario de Enteros con clave de tipo entero;

        Integer unEntero = 1000;
        
        mapa.put("Clave 1", unEntero);
        System.out.println("Tamaño del mapa: "+mapa.size());
        System.out.println("Valor:"+mapa.get("Clave 1"));
        System.out.println("Existe la Clave 1: "+mapa.containsKey("Clave 1"));
        System.out.println("Existe el valor 1000: "+ mapa.containsValue(1000));

    }
}