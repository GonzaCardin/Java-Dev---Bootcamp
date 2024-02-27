package ar.educacionit.string;
public class EjercicioString {
    public static void main(String[] args) {
        String s = "Hello World";
        /// char []array = new char [];

        /// int r = array.length;   /// variable from array
       
        int l = s.length(); /// method from string class

        System.out.println("Length "+" of "+ "the char : " + l);
        System.out.println("Length: " + s.length());
        System.out.println("Position of the char H: " + s.indexOf("H"));
        System.out.println("Position of the string Mundo: " + s.indexOf("Mundo"));
        char pos = s.charAt(1);
        System.err.println("Char in position 2: " + pos);
    }
}
