package com.educacionit;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido a la Torre de Control");

        System.out.print("Ingrese el numero de objetos voladores a autorizar: ");
        int cantidadObjetos = scan.nextInt();
        ArrayList<Volador> listaVoladores = new ArrayList<>(cantidadObjetos);

        for (int i = 0; i < cantidadObjetos; i++) {
            System.out.println("Ingrese nombre:");
            String nombre = scan.next();
            System.out.println("Esta autorizado a aterrizar (true / false):");
            boolean aterrizajeAutorizado = scan.nextBoolean();
            Volador unVolador = new ObjetoVolador(nombre, aterrizajeAutorizado);
            listaVoladores.add(unVolador);
        }
        Operario unOperario = new Operario();
        TorreControl torreControl = new TorreControl(unOperario);
        torreControl.gestionAterrizaje(listaVoladores);
        scan.close();
    }
}