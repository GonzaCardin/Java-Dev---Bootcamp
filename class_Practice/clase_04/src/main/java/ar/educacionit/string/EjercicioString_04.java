package ar.educacionit.string;

public class EjercicioString_04 {
    public static void main(String[] args) {
        String s = "-[07]-";
        
        int initialIndex = s.indexOf('[');
        int endIndex = s.indexOf("]");

        System.out.println("Initial Index: " + (initialIndex+1));
        System.out.println("End Index: " + (endIndex-1));


        String finalString = s.substring((initialIndex+1), (endIndex));
        System.out.println("Final String: " + finalString);
    }
}
