package com.educacionit.clase_41.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "clave")
public class Configuracion {
    @Value("${config_1.nombre1}")
    private String nombre_1;
    @Value("${config_2.nombre2}")
    private String nombre_2;

    private String propiedad1;
    private String propiedad2;
    public Configuracion() {
    }
    public String getNombre_1() {
        return nombre_1;
    }
    public void setNombre_1(String nombre_1) {
        this.nombre_1 = nombre_1;
    }
    public String getNombre_2() {
        return nombre_2;
    }
    public void setNombre_2(String nombre_2) {
        this.nombre_2 = nombre_2;
    }
    public String getPropiedad1() {
        return propiedad1;
    }
    public void setPropiedad1(String propiedad1) {
        this.propiedad1 = propiedad1;
    }
    public String getPropiedad2() {
        return propiedad2;
    }
    public void setPropiedad2(String propiedad2) {
        this.propiedad2 = propiedad2;
    }


    
}

// config_1.nombre1 = este es el valor
// config_2.nombre2 = este es el valor