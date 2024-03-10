package com.educacionit.polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<I_Movement> types = new ArrayList<I_Movement> ();
        Bus bus_1 = new Bus();
        Car car_1 = new Car();
        Car car_2 = new Car();
        Taxi taxi_1 = new Taxi();
        Skateboard skate_1 = new Skateboard();


        types.add(bus_1);
        types.add(car_1);
        types.add(car_2);
        types.add(taxi_1);
        types.add(skate_1); 

        for(int i=0; i<types.size(); i++) {
            I_Movement A_Desplacement = types.get(i);
            A_Desplacement.Move();  ///olymorphism

            if(A_Desplacement instanceof Car){
                Car myCar = (Car)A_Desplacement;    ///casteo objeto a tipo Car
                myCar.setName("BMW");
                myCar.getName();
                myCar.UniqueMethod();                
            }
            else if(A_Desplacement instanceof Bus){
                Bus myBus = (Bus)A_Desplacement;
                myBus.setName("Line 22");
                myBus.getName();
            }
        }

    }
}
