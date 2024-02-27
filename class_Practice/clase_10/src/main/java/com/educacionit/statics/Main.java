package com.educacionit.statics;

public class Main {
    public static void main(String[] args) {
        classVariables firstInstance = new classVariables("Instance 1");
        System.out.println("Instance in memory: " + firstInstance.getVar());

        classVariables secondInstance = new classVariables("Instance 2");
        System.out.println("Instance in memory: " + secondInstance.getVar());

    }
}
