package com.educacionit.asossiation;

public class Movie {
    private String name;
    private Director director;
    private Actor []actors;
    private int numberOfActors = 0;
    public Movie(String name, Director director) {
        this.name = name;
        this.director = director;
        this.actors = new Actor[3];
        ///this.numberOfActors = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }
    public void addActor(Actor actor) {
        if(numberOfActors < actors.length){
            actors[numberOfActors] = actor;
            numberOfActors++;
        }
        else{
            System.out.println("All allowed actors have already been added.");
        }
    }
    public void printMovie(){
        System.out.println("Movie: " + name);
        director.printDirector();
        for(int i = 0; i < numberOfActors; i++){
            actors[i].PrintActor();
        }
    }
}
