package com.educacionit.Generics;

public class TestAlumnos {
    public static void main(String[] args) {
        Alumno<String,Double> unAlumno = new Alumno<String,Double>("LG278", 7.5);

        System.out.println(unAlumno);

        Alumno<Integer,Long> otrAlumno = new Alumno<Integer,Long>(Integer.valueOf(20387),Long.valueOf(8));
        System.out.println(otrAlumno);
    }
}
