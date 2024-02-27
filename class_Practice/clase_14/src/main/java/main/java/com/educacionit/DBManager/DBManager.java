package main.java.com.educacionit.DBManager;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import main.java.com.educacionit.Execption.DBManagerException;

public class DBManager implements Closeable {
    private Connection conn;

    public void openConnection() throws DBManagerException {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bootcamp", "root", "Jacques");
            System.out.println("Open Connection");
        } catch (SQLException e) {
            throw new DBManagerException(DBManagerException.ERROR_1, "It cannot be connected with database.", e);
        }
    }

    public void showStudent() throws DBManagerException { /// try-catch with resources
        String query = "select legajo, nombre, edad, especialidad from student";
        /// Statement stmt = null;
        /// ResultSet resultSet = null;
        try (Statement stmt = conn.createStatement(); ResultSet resultSet = stmt.executeQuery(query)) {
            /// stmt = conn.createStatement();
            /// resultSet = stmt.executeQuery(query);
            while (resultSet.next()) { /// mientras haya otro registro va a seguir leyendo
                Integer legajo = resultSet.getInt(1);
                String nombre = resultSet.getString(2);
                Integer edad = resultSet.getInt(3);
                String especialidad = resultSet.getString(4);

                System.out.printf("Legajo = [%d] - Nombre = [%s] - Edad = [%d] - Especialidad = [%s]\n", legajo, nombre,
                        edad, especialidad);
            }
        } catch (SQLException e) {
            throw new DBManagerException(DBManagerException.ERROR_2,
                    "No fue posible mostrar a los alumnos por la siguente causa:" + e.getMessage());
        } /*
           * finally {
           * try {
           * resultSet.close();
           * } catch (SQLException e) {
           * System.err.println("No fue posible cerrar el resulSet.");
           * }
           * try {
           * stmt.close();
           * } catch (SQLException e) {
           * System.err.println("No fue posible cerrar el statement.");
           * }
           */
    }

    public ArrayList<Student> showStudents() throws DBManagerException {
        ArrayList<Student> studentList = new ArrayList<Student>();
        String query = "select legajo, nombre, edad, especialidad from student";
        Statement stmt = null;
        ResultSet resultSet = null;

        try {
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(query);

            while (resultSet.next()) {
                Integer legajo = resultSet.getInt(1);
                String nombre = resultSet.getString(2);
                Integer edad = resultSet.getInt(3);
                String especialidad = resultSet.getString(4);

                Student S = new Student(legajo, nombre);
                S.setEdad(edad);
                S.setEspecialidad(especialidad);

                studentList.add(S);
            }
            /// return studentList; -> Si me quedan todos los objetos,variables o etc.
            /// dentro del bloque try es más legible colocar el return en este bloque
        } catch (SQLException e) {
            throw new DBManagerException(DBManagerException.ERROR_3,
                    "No fue posible listar al alumno por: " + e.getMessage(), e);
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                System.err.println("No se puede cerrar el resultset.");
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                System.err.println("No se puede cerrar el statement");
            }
        }
        return studentList;
    }

    public Student showTheStudent(Integer legajo) throws DBManagerException {
        String query = "select nombre,edad,especialidad from student where legajo = ?";
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        try {
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, legajo);

            resultSet = stmt.executeQuery();
            boolean hayRegistro = resultSet.next();

            if (hayRegistro == false) {
                throw new DBManagerException(DBManagerException.ERROR_4,
                        "No se puede encontrar al alumno con legajo " + legajo);
            }
            String nombre = resultSet.getString("nombre");
            Student S = new Student(legajo, nombre);

            Integer edad = resultSet.getInt("edad");
            String especialidad = resultSet.getString("especialidad"); /// String especialidad = resultSet.getString(3);
                                                                       /// ->número de columna según el select

            S.setEdad(edad);
            S.setEspecialidad(especialidad);
            return S;

        } catch (SQLException e) {
            throw new DBManagerException(DBManagerException.ERROR_4,
                    "No fue posible mostrar al alumno con legajo : " + legajo, e);
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                System.err.println("No fue posible cerrar el resultSet");
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                System.err.println("No fue posible cerrar el statement");
            }
        }
    }

    public void addStudent(Student student) throws DBManagerException { // 1,2,3,4
        String query = "insert into Student (legajo, nombre, edad, especialidad) values (?,?,?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, student.getLegajo());
            stmt.setString(2, student.getNombre());
            stmt.setInt(3, student.getEdad());
            stmt.setString(4, student.getEspecialidad());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new DBManagerException(DBManagerException.ERROR_5,
                        "The student " + student + " cannot be registered.");
            }
            System.out.println("The student " + student + "has been registered succesfully.");

        } catch (SQLException e) {
            throw new DBManagerException(DBManagerException.ERROR_5, "No se puede insertar el alumno " + student, e);
        } /*
           * finally {
           * try {
           * stmt.close();
           * } catch (SQLException e) {
           * e.printStackTrace();
           * System.err.println("No se pudo cerrar el statement.");
           * }
           * }
           */
    }

    public void modifyStudent(Student student) throws DBManagerException {
        String query = "update Student set nombre = ?, edad = ?, set especialidad = ? WHERE legajo = ?";

        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(query);

            stmt.setString(1, student.getNombre());
            stmt.setInt(2, student.getEdad());
            stmt.setString(3, student.getEspecialidad());
            stmt.setInt(4, student.getLegajo());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new DBManagerException(DBManagerException.ERROR_6,
                        "No fue posible modificar al alumno: " + student);
            }
            System.out.println("The Student " + student + " has been modified");
        } catch (Exception e) {
            throw new DBManagerException(DBManagerException.ERROR_6, "No fue posible modificar al alumno " + student,
                    e);
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                System.err.println("No se pudo cerrar el statement.Error: " + e.getMessage());
            }
        }
    }

    public void deleteLegajo(Integer legajo) throws DBManagerException {
        String query = "delete from Student WHERE legajo = ?";

        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, legajo);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 0) {
                throw new DBManagerException(DBManagerException.ERROR_7,
                        "No se pudo eliminar al alumno con legajo: " + legajo);
            }
            System.out.println("The student has been deleted");
        } catch (Exception e) {
            throw new DBManagerException(DBManagerException.ERROR_7,
                    "No se pudo eliminar al alumno con legajo: " + legajo, e);
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                System.err.println("No se pudo cerrar el statement.Error: " + e.getMessage());
            }
        }

    }

    private void closeConnection() throws DBManagerException {
        try {
            if (conn != null) {
                conn.close();
            }
            System.out.println("Connection close");
        } catch (SQLException e) {
            throw new DBManagerException(DBManagerException.ERROR_8,
                    "No se pudo cerrar la conexion. Error: " + e.getMessage(), e);
        }
    }

    @Override
    public void close() throws IOException {
        try {
            closeConnection();
        } catch (DBManagerException e) {
            throw new IOException(e);
        }
    }
}
