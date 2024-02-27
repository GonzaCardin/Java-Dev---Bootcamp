package com.educacionit.polymorphism;

public abstract class TypeOfVehicule implements I_Movement{
    private String name;
    public TypeOfVehicule(){
        super();
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
