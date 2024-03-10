package main.java.com.educacionit.DBManager;

import java.io.IOException;
import java.util.ArrayList;

import main.java.com.educacionit.Execption.DBManagerException;

public class TestDBManager_Part_II {
    public static void main(String[] args) throws IOException {
        /// DBManager dbManager = new DBManager();
        ArrayList<Student> students = null;
        Student S = null;
        try (DBManager dbManager = new DBManager()) {
            dbManager.openConnection();
            S = dbManager.showTheStudent(1998);
            System.out.println(S);
            students = dbManager.showStudents();
        } catch (DBManagerException e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        } 

        /// mostramos coleccion de alumnos
        for (int i = 0; i < students.size(); i++) {
            Student theStudent = students.get(i);
            System.out.println("Student: " + theStudent);
        }
        System.out.println("Fin main");

    }

}
