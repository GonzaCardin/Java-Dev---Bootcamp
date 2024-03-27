package com.educacionit.manager;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager implements Closeable {
    private Connection con;

    public void openConnection() throws SQLException { /// Hacer excepcion propia try-catch
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/argentina", "root", "Jacques");
            System.out.println("Open Connection");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public void mostrarProvincias() throws SQLException {
        String query = "select id_provincia,descripcion from provincias";
        try (Statement stmt = con.createStatement(); ResultSet resultSet = stmt.executeQuery(query)) {
            while (resultSet.next()) {
                Integer id = resultSet.getInt(1);
                String descripcion = resultSet.getString(2);
                System.out.printf("Id = [%d] - Descripcion = [%s]\n", id, descripcion);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buscarProvinciasArgentinas(String str) throws SQLException {
        String query = "select id_provincia,descripcion from provincias where descripcion like ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, "%" + str + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id_provincia");
            String descripcion = rs.getString("descripcion");
            System.out.println("ID: " + id + " Descripcion: " + descripcion);
        }

    }

    public void closeConnection() throws SQLException {
        try {
            if (con != null) {
                con.close();
                System.out.println("Close Connection");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws IOException {
        try {
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
