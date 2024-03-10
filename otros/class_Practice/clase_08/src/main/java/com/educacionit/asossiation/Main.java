package com.educacionit.asossiation;

public class Main {
    public static void main(String[] args) {
        Movie m = null;
        Director dir = null;
        Actor actor_01 = null;
        Actor actor_02 = null;

        dir = new Director("Robert Zemeckis", 7);
        m = new Movie("Back to the Future", dir);
        /// m.printMovie();

        actor_01 = new Actor("Christopher Lloyd");
        actor_02 = new Actor("Michael J. Fox");
        m.addActor(actor_01);
        m.addActor(actor_02);

        m.printMovie();
        

    }
}
