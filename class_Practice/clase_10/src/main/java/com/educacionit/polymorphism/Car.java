package com.educacionit.polymorphism;

public final class Car extends TypeOfVehicule{  /// final -> es una clase final y no se puede seguir extendiendo la herencia. 

    @Override
    public void Move() {
        System.out.println("CAR : RUM RUM RUM");
    }
    
    public void UniqueMethod(){};
}
