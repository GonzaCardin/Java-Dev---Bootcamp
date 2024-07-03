package com.educacionit.clase_59.model;

import java.util.List;

import lombok.Data;

@Data
public class Alumno {
    private String nombre;
    private String apellido;
    // Comprendidos entre 1000 y 3000
    private Integer legajo;

    private Sexo sexo;
    private Pais pais;
    // Númerico y mayor de 18 años
    private Integer edad;

    private List<Materia> materias;

    private String avatar;
}
