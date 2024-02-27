package com.educacionit;

public class Ejercicio_05 {
    /*
        Defina el siguiente string:
        String cadena = "x87y5z";
        Generar un array de char, con los caracters de la primer cadena que solo sean números.
        Imprimir el contenido del nuevo array y su longitud.
     */
    public static void main(String[] args) {
        String SS = "x87y5z";
        int indexa=0;
        char []a = new char[SS.length()];

        for (int i = 0; i < SS.length(); i++) {
            char c = SS.charAt(i);

            // if(c >= 48 && c <= 57) {
            if(c >= '0' && c <= '9') {
                a[indexa] = c;
                indexa++;
            }
        }
        System.out.println("Cadena orginal: "+ SS + " ----> "+ " Resultado: "+ new String(a));
        System.out.println("La longitud del array es: "+ indexa);
    }
}
