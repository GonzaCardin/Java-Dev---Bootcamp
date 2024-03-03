package com.educacionit;

public class ObjetoVolador implements Volador {
    private String nombre;
    private boolean puedeAterrizarEnLaPista1;

    public ObjetoVolador(String nombre, boolean puedeAterrizarEnLaPista1) {
        this.nombre = nombre;
        this.puedeAterrizarEnLaPista1 = puedeAterrizarEnLaPista1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean puedeAterrizarEnLaPista1() {
        return puedeAterrizarEnLaPista1;
    }

}
