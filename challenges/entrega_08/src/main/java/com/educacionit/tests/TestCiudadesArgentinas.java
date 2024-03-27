package com.educacionit.tests;

import java.io.IOException;
import java.sql.SQLException;

import com.educacionit.ejercicio_01.Provincia;
import com.educacionit.exceptions.DBManagerException;
import com.educacionit.manager.DBManager;

public class TestCiudadesArgentinas {

    public static void main(String[] args) throws SQLException, DBManagerException {
        try (DBManager dm = new DBManager()) {
            dm.openConnection();
            dm.mostrarProvincias();
            System.out.println("--------------------------------");
            dm.buscarProvinciasArgentinas("Buenos");
            System.out.println("--------------------------------");
            dm.buscarProvinciasArgentinas("Santa");
            System.out.println("--------------------------------");

            Provincia prov = new Provincia(26, "Star");
            dm.agregarProvincia(prov);
            System.out.println("---------------------------------");

            Provincia provModif = new Provincia(20, "Santa Fe De La Vera Cruz");
            dm.modificarProvincia(provModif);
            System.out.println("--------------------------------");

            dm.borrarProvincia(24);

            dm.closeConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}