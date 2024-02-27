package com.educacionit;

public class TorreDeControl {
    public void permisoParaAterrizar(ContratoAterrizaje obj){
        if(obj.puedeAterrizar()){
            System.out.println("El objeto volador tiene permiso para aterrizar en la pista 1.");
        }else{
            System.out.println("El objeto volador necesita autorización adicional para conceder permiso de aterrizaje.");
        }
    }
}
