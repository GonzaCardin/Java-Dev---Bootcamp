package com.educacionit.clase_49.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumnos")
public class AlumnoConCursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 255, nullable = false)
    private String nombre;

    @Column(name = "legajo", nullable = false)
    private Integer legajo;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "inscripciones", joinColumns =@JoinColumn(name="id_alumno"), // relación de alumnos con la tabla de inscripciones
    inverseJoinColumns = @JoinColumn(name="id_curso")) // relación de la tabla de inscripciones con cursos
    List<Curso>cursos;

    public AlumnoConCursos() {
        super();
    }

    public AlumnoConCursos(String nombre, Integer legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    

}
