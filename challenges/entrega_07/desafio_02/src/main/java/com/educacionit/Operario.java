package com.educacionit;

import java.util.Scanner;

public class Operario {
    private Scanner scan;

    public Operario() {
        this.scan = new Scanner(System.in);
    }
    public boolean autorizarAterrizaje(){
        System.out.print("Autoriza el aterrizaje en la pista 2(true/false):");
        boolean respuesta = scan.nextBoolean();
        return respuesta;
    }
    
}
