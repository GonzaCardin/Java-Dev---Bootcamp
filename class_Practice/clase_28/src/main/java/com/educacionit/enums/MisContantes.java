package com.educacionit.enums;

public enum MisContantes {
    UNO(1, "Es es el valor de UNO"),
    DOS(2, "Es es el valor de DOS"),
    TRES(3, "Es es el valor de TRES");

    private Integer valor;
    private String descripcion;

    private MisContantes(Integer valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public Integer getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
