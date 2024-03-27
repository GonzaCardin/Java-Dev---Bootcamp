package com.educacionit.manager;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.educacionit.ejercicio_01.Provincia;
import com.educacionit.exceptions.DBManagerException;

public class DBManager implements Closeable {
    private Connection con;

    public void openConnection() throws DBManagerException { /// Hacer excepcion propia try-catch
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/argentina", "root", "Jacques");
            System.out.println("Open Connection");
        } catch (SQLException sqle) {
            /// ERROR 1 - Conexion
            throw new DBManagerException("No fue posible establecer la conexión.", DBManagerException.ERROR_1);
        }
    }

    public void mostrarProvincias() throws SQLException, DBManagerException {
        String query = "select id_provincia,descripcion from provincias";
        try (Statement stmt = con.createStatement(); ResultSet resultSet = stmt.executeQuery(query)) {
            while (resultSet.next()) {
                Integer id = resultSet.getInt(1);
                String descripcion = resultSet.getString(2);
                System.out.printf("Id = [%d] - Descripcion = [%s]\n", id, descripcion);
            }
        } catch (Exception e) {
            /// ERROR 2 - mostrarProvincias
            throw new DBManagerException("No fue posible mostrar las provincias", DBManagerException.ERROR_2);
        }
    }

    public void buscarProvinciasArgentinas(String str) throws DBManagerException {
        String query = "select id_provincia,descripcion from provincias where descripcion like ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, "%" + str + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_provincia");
                String descripcion = rs.getString("descripcion");
                System.out.printf("id = [%d] - Descripcion = [%s]\n", id, descripcion);
            }
        } catch (SQLException e) {
            /// ERROR 3 - BuscarProvincias
            throw new DBManagerException("No fue posible buscar la provincia.", DBManagerException.ERROR_3);
        }

    }

    public void agregarProvincia(Provincia prov) throws DBManagerException {
        String query = "insert into provincias(id_provincia, descripcion) values (?,?)";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setInt(1, prov.getId());
            stmt.setString(2, prov.getDescripcion());
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new DBManagerException("La provincia " + prov + "no se pudo agregar correctamente.",
                        DBManagerException.ERROR_4);
            }
            System.out.println("La provincia " + prov + " fue agregada con éxito.");
        } catch (Exception e) {
            /// ERROR 4 - Agregar provincia
            throw new DBManagerException("No fue posible agregar la provincia " + prov, DBManagerException.ERROR_4);
        }

    }

    public void modificarProvincia(Provincia prov) throws DBManagerException {
        String query = "update provincias set descripcion = ? where id_provincia = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, prov.getId());
            stmt.setString(2, prov.getDescripcion());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new DBManagerException("No fue posible modificar la provincia " + prov,
                        DBManagerException.ERROR_5);/// ERROR 5 - Modificar Provincia
            }
            System.out.println("La provincia " + prov + " se modificó con éxito.");
        } catch (Exception e) {
            throw new DBManagerException("No fue posible modificar la provincia " + prov, DBManagerException.ERROR_5);
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                System.err.println("No se pudo cerrar el statement. Error: " + e.getMessage());
            }
        }
    }

    public void borrarProvincia(Integer id) throws DBManagerException {
        String query = "delete from provincias where id_provincia = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new DBManagerException("No se pudo eliminar a la provincia " + id, DBManagerException.ERROR_6);
            }
            System.out.println("La provincia fue eliminada.");
        } catch (Exception e) {
            /// ERROR 6 - Borrar provincia
            throw new DBManagerException("No se pudo eliminar a la provincia " + id, DBManagerException.ERROR_6);
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                System.err.println("No se pudo cerrar el statement. Error: " + e.getMessage());
            }
        }
    }

    public void closeConnection() throws DBManagerException {
        try {
            if (con != null) {
                con.close();
                System.out.println("Close Connection");
            }
        } catch (Exception e) {
            throw new DBManagerException("No se pudo cerrar la conexion. Error: " + e.getMessage(), e,
                    DBManagerException.ERROR_7); /// ERORR 7 - Cerrar Conexion
        }
    }

    @Override
    public void close() throws IOException {
        try {
            closeConnection();
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}
