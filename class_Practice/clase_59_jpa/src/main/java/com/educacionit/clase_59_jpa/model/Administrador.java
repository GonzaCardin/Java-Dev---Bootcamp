package com.educacionit.clase_59_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 255)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "libreria_id")
    private Libreria libreria;
}
