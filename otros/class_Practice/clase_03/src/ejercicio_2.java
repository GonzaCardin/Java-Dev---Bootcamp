public class ejercicio_2 {
    public static void main(String[] args) {
        char c  = 'A';
        ///char c1 = 65;   ///Según código ASCII el 65 es el A.

        if(c >= 65 && c <= 90) {
            System.out.println("El caracter " + c + " esta en mayusculas.");
        } else if (c >= 97 && c <= 122) {
            System.out.println("El caracter" + c + "esta en minusculas.");
        } else{
            System.out.println("El caracter " + c + " no es una letra." );;
        }
    }
}
