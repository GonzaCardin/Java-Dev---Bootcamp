package com.educacionit.tests;

import java.sql.SQLException;

import com.educacionit.manager.DBManager;

public class TestCiudadesArgentinas {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws SQLException {
        DBManager dm = new DBManager();
        dm.openConnection();
        dm.mostrarProvincias();
        dm.buscarProvinciasArgentinas("Buenos");
        dm.buscarProvinciasArgentinas("San");
        dm.closeConnection();
    }
}