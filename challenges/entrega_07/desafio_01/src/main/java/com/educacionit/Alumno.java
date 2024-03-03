package com.educacionit;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer nroExamen;
    private ArrayList<Double> notas = new ArrayList<>(); /// númerico>=0 <=10
    private Double promedio;
    private Double calcularPromedio(){
        if(notas.isEmpty()){
            return 0.0;
        }else{
            Double total = 0.0;
            for (int i = 0; i < notas.size(); i++) {
                total += notas.get(i);
            }   
            return total / notas.size();
        }
    }
    public Alumno(String nombre, String apellido, Integer nroExamen, ArrayList<Double> listanotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroExamen = nroExamen;
        notas = listanotas;
        this.promedio = calcularPromedio();
    }
    
    public ArrayList<Double> getNotas() {
        return notas;
    }

    public Double getPromedio() {
        return promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNroExamen() {
        return nroExamen;
    }

    public void setNroExamen(Integer nroExamen) {
        this.nroExamen = nroExamen;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nroExamen=" + nroExamen + ", promedio="
                + promedio + "]";
    }

}
