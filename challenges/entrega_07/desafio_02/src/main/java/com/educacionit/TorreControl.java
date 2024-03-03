package com.educacionit;

import java.util.ArrayList;

public class TorreControl {
    private Operario unOperario;
    
    public Operario getUnOperario() {
        return unOperario;
    }

    public void setUnOperario(Operario unOperario) {
        this.unOperario = unOperario;
    }

    public TorreControl(Operario unOperario) {
        this.unOperario = unOperario;
    }

    public void gestionAterrizaje(ArrayList<Volador> listaVoladores) {
        for (Volador unVolador : listaVoladores) {
            if (unVolador.puedeAterrizarEnLaPista1()) {
                System.out.println("El " + ((ObjetoVolador) unVolador).getNombre() + " puede aterrizar en la pista n°1");
            }else{
                System.out.println("El " + ((ObjetoVolador)unVolador).getNombre() + " no tiene permiso para aterrizar en la pista n°1.");
                boolean segundaAutorizacion = unOperario.autorizarAterrizaje();
                if(segundaAutorizacion) System.out.println("El operario autoriza su aterrizaje en la pista n°2");
                else{System.out.println("El operario no autoriza su aterrizaje.");}
            }
        }
    }
}
