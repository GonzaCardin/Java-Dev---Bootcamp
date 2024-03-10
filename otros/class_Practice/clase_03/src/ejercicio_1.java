public class ejercicio_1 {
    public static void main(String[] args) {
        int x = 7;
        
        // if/else secuence 
        /*
        if (x % 2 == 0) {
            System.err.println("El numero " + x + " es Par");
        }
        else {
            System.err.println("El numero " + x + " es Impar");
        }
        */

        System.out.println("El numero " + x + ((x%2 == 0) ? " es par" : " es impar"));  ///inline if
    }
}
