package com.educacionit.clase_41.singleton;

public class Singleton {
    private static Singleton _instance;
    private String funcionality_2;
    private Singleton() {
    }
    public static Singleton getInstance(){
        if(_instance == null){
            _instance = new Singleton();
        }
        return _instance;
    }

    public void funcionalidad_1(){
        System.out.println("Soy la funcionalidad 1");
    }
    public String funcionalidad_2(){
        funcionality_2 = "Hello World";
        return funcionality_2;
    }
}
