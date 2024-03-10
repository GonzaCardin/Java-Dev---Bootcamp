package com.educacionit.herencia;

public class Main {
    public static void main(String[] args) {
        SkimYogurt sY = new SkimYogurt();

        System.out.println("SkimYogurt calories: "+sY.getCalories());

        Yogurt y = new Yogurt();
        System.out.println("Yogurt calories: " + y.getCalories());
    }
}
