package com.educacionit;

import java.util.ArrayList;
import java.util.List;

public class ManejoDeAlumnos {
    private List<Alumno> listaAlumnos;
    private Integer cantidadAlumnos;

    public ManejoDeAlumnos(Integer cantidad) {
        cantidadAlumnos = cantidad;
        listaAlumnos = new ArrayList<>();
    }

    public Integer getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(Integer cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public void agregarAlumno(Alumno a) {
        listaAlumnos.add(a);
    }

    public void mostrarAlumno() {
        System.out.println(listaAlumnos);
    }

    /// No funciona nada
    public void mostrarNotaAlta() {
        double nota = 0;
        Alumno aux = null;
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNota() > nota) {
                nota = listaAlumnos.get(i).getNota();
                aux = listaAlumnos.get(i);
            }
        }
        if (aux != null) {
            System.out.println("Alumno con nota más alta: " + aux);
        }
    }

    public void mostrarNotaBaja() {
        double nota = 10.0d;
        Alumno aux = null;
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNota() < nota) {
                nota = listaAlumnos.get(i).getNota();
                aux = listaAlumnos.get(i);
            }
        }
        if (aux != null) {
            System.out.println("Alumno con nota más baja: " + aux);
        }
    }

    public ArrayList<Alumno> alumnosPromocionados() {
        ArrayList<Alumno> promocionados = new ArrayList<>();
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNota() >= 7) {
                promocionados.add(listaAlumnos.get(i));
            }
        }
        return promocionados;
    }

    public ArrayList<Alumno> alumnosParaRecursar() {
        ArrayList<Alumno> recursantes = new ArrayList<>();
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNota() < 7) {
                recursantes.add(listaAlumnos.get(i));
            }
        }
        return recursantes;
    }
}
