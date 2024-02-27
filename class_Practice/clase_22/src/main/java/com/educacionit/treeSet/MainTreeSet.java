package com.educacionit.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<String>coleccion = new TreeSet<>();

        coleccion.add("B");
        coleccion.add("A");
        coleccion.add("C");
        System.out.println(coleccion);


        /// Set<Alumno> alumnos = new TreeSet<>(new CompardorAlumno());
        Set<Alumno>alumnos = new TreeSet<>();
        alumnos.add(new Alumno("Gonzalo", 22));
        alumnos.add(new Alumno("Bautista", 20));
        alumnos.add(new Alumno("Lucas", 25));
        alumnos.add(new Alumno("Lucas", 29));
        alumnos.add(new Alumno("Lucas", 21));
        System.out.println(alumnos);

    }
}
