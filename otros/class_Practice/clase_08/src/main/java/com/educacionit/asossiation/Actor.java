package com.educacionit.asossiation;

public class Actor {
    private String name;
    public Actor(String name) {
        //super();
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;   //this.name hace referencia al name de la clase actor y no al name que recibe.
    }
    public void PrintActor(){
        System.out.println("Actor: " + name);    ///this.nombre puede ir también. Se usa de forma obligatorio cuando se recibe un parametro de tipo nombre.
    }
}