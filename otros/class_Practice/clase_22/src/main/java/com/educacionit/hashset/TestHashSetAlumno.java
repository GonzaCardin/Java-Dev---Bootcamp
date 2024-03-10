package com.educacionit.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
///import java.util.Iterator;
import java.util.Set;

public class TestHashSetAlumno {
    public static void main(String[] args) {
        Set<Alumno> alumnos = new HashSet<>();

        alumnos.add(new Alumno("Gonzalo", 22));
        alumnos.add(new Alumno("Bautista", 20));
        alumnos.add(new Alumno("Lucas", 25));

        System.out.println(alumnos);
        alumnos.add(new Alumno("Bautista", 20)); /// con el hashCode y el equals no lo agrega.
        boolean contiene = alumnos.contains(new Alumno("Lucas", 25));
        System.out.println(contiene);

        /*
         * for (Iterator i = alumnos.iterator(); i.hasNext()) {
         * Alumno alum = (Alumno) i.next();
         * }
         */



        LinkedHashSet<Alumno> linkedHash = new LinkedHashSet<>();
        linkedHash.add(new Alumno("Gonzalo", 22));
        linkedHash.add(new Alumno("Bautista", 20));
        linkedHash.add(new Alumno("Lucas", 25));
        System.out.println(linkedHash);






    }
}
