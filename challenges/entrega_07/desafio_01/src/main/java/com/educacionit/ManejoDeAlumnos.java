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

    public void mostrarNotaAlta() {
        Alumno alumnoNotaAlta = null;
        Alumno aux =null;
        Double notaAlta = 0.0;
        for (int i = 0; i < cantidadAlumnos; i++) {
            aux = listaAlumnos.get(i);
            ArrayList<Double> notas = aux.getNotas();
            for (int j = 0; j < aux.getNroExamen(); j++) {
                if (notaAlta < notas.get(j)) {
                    notaAlta = notas.get(j);
                    alumnoNotaAlta = aux;
                }
            }
        }
        System.out.println("El alumno con la calificación más alta [ " + notaAlta + " ] es : " + alumnoNotaAlta);
    }

    public void mostrarNotaBaja() {
        Alumno alumnoNotaBaja = null;
        Double notaBaja = 10.0;
        for (int i = 0; i<cantidadAlumnos;i++) {
            ArrayList<Double> notas = listaAlumnos.get(i).getNotas();
            for (int j = 0; j< notas.size();j++) {
                if (notaBaja > notas.get(j)) {
                    notaBaja = notas.get(j); 
                    alumnoNotaBaja = listaAlumnos.get(i);  
                }
            }
        }
        System.out.println("El alumno con la calificación más baja [ " + notaBaja + " ] es : " + alumnoNotaBaja);
    }

    public void alumnosPromocionados() {
        ArrayList<Alumno>promocionados = new ArrayList<>();
        for (int i = 0; i < cantidadAlumnos; i++) {
            if(listaAlumnos.get(i).getPromedio() >= 7.0){
                promocionados.add(listaAlumnos.get(i));
            }
        }
        System.out.println("Lista de Alumnos Promocionados: ");
        System.out.println(promocionados);
    }

    public void alumnosParaRecursar() {
        ArrayList<Alumno>recursantes = new ArrayList<>();
        for (int i = 0; i < cantidadAlumnos; i++) {
            if(listaAlumnos.get(i).getPromedio() < 7.0){
                recursantes.add(listaAlumnos.get(i));
            }
        }
        System.out.println("Lista de Alumnos a Recursar: ");
        System.out.println(recursantes);
    }
}
