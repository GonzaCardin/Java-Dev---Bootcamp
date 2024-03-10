package ar.educacionit.string;

public class EjercicioString_02 {
    public static void main(String[] args) {
        String s = "Cardin, Gonzalo, Eduardo";

        String []split_result = s.split(",");       ///-> split_result[0] = "Cardin"; split_result[1] = "Gonzalo"; split_result[2] = "Eduardo";
        
        String lastName = split_result[0];
        /// option 1 ->lastName = lastName.toUpperCase();          ///-> lastName = lastName.toUpperCase(); si no se cambia porque los string son inmutables.
        
        System.out.println("Last name: " + split_result[0].toUpperCase()); /// option 2 
        System.out.println("Last name: " + lastName);

        System.out.println("First name: " + split_result[1].toLowerCase());
       /*  System.out.printf("First name: [%s] - [%s]\n",split_result[1].toLowerCase(),(split_result[1].toLowerCase()).trim());
        System.out.printf("Second name: \"%s\"\n",split_result[2]);
        */

        String secondName = split_result[2];
        secondName = secondName.trim();
        System.out.printf("Second name: \"%s\"",secondName);
    }
}
