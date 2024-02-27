package com.educacionit.asossiation;

public class Director {
    private String name;
    private int experience;
    public Director(String name, int experience) {
        //super();
        this.name = name;
        this.experience = experience;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void printDirector(){
        System.out.println("Director: " + name + ". Years of experience: " + experience); 
    }
}
