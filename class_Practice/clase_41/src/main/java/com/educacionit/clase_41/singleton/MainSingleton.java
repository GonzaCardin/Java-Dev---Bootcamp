package com.educacionit.clase_41.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton mSingleton =Singleton.getInstance();
        mSingleton.funcionalidad_1();
        System.out.println(mSingleton.funcionalidad_2());

        Singleton mSingleton2 =Singleton.getInstance();
        mSingleton2.funcionalidad_1();
        System.out.println(mSingleton2.funcionalidad_2());


        if(mSingleton == mSingleton2){
            System.out.println("Son iguales");
        }
    }
}
