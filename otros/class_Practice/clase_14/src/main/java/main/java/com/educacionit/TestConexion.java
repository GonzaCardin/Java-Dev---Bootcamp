package main.java.com.educacionit;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConexion {
    public static void main(String[] args) throws SQLException{
       Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/bootcamp","root","Jacques");

       if(con != null){
        System.out.println("La conexion se establecio correctamente.");
       }

       Statement stmt =  con.createStatement();
       ResultSet resultset = stmt.executeQuery("select * from Student");
       ///ResultSet resultset = stmt.executeQuery("select legajo,nombre,edad,especialidad from Student");       ///select contra la base de datos
       
       
       ///Accedo a la tabla |*| Acceder a un registro en específico
       while (resultset.next()) {
        //Integer legajo = resultSet.getInt(1);
        //String nombre = resultSet.getString(2);
        //Integer edad = resultSet.getInt(3);
        //String especialidad  = resultSet.getString(4);


        Integer legajo = resultset.getInt("legajo");
        String nombre = resultset.getString("nombre");
        Integer edad = resultset.getInt("edad");
        String especialidad = resultset.getString("especialidad");

        System.out.printf("Legajo = [%d] - Nombre = [%s] - Edad = [%d] - Especialidad = [%s]\n",legajo,nombre,edad,especialidad);

       }
       
       ///Para cerrar la conexion, en este orden.
       resultset.close();
       stmt.close();
       con.close();
    }
}
