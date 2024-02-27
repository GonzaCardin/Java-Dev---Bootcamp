package main.java.com.educacionit.excepciones;

import java.sql.SQLException;

public class MainExceptions {
    public static void main(String[] args) {
       /* try {
            int [] array = {10,20};
            array[4000] = 0;
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Se produjo la excepción: ArrayIndexOutOfBoundsException.Error: "+e.getMessage());
        }
        System.out.println("Fin del Programa");
        */
        try {
            divisionPorCero();
            System.out.println("Fin bloque try.");
        } catch (Exception e) { ///(divisionPorCeroException e | SQLException ex)
            e.printStackTrace();
        } /*catch (SQLException e) {  /// este catch esta de más, porque por jeraquía de objetos una SQLException es una Exception
           
            e.printStackTrace();
        }*/finally{
            System.out.println("Este bloque se ejecuta si se produjo o no una exception");
        }
        System.out.println("Fin main");
    }
    public static void divisionPorCero() throws DivisionPorCeroException, SQLException {
        try {
            ///int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Se produjo la excepción: Arithmetic Exception");
            throw new DivisionPorCeroException("En el método divisionPorCero se produjo un error",e);
        }
        
    }
}
