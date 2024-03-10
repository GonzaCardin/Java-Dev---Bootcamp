public class ejercicio_4 {
    public static void main(String[] args) {
        int day=9;

        switch (day) {
            case 1:
                System.out.println("El dia de la semana " + day + " es Lunes");
                break;
            case 2:
                System.out.println("El de la semana " + day + " es Martes");
                break;
            case 3: 
                System.out.println("El de la semana " + day + " es Miercoles");
                break;
            case 4:
                System.out.println("El de la semana " + day + " es Jueves");
                break;
            case 5: 
                System.out.println("El de la semana " + day + " es Viernes");
            case 6:
                System.out.println("El de la semana " + day + " es Sabado");
                break;
            case 7:
                System.out.println("El de la semana " + day + " es Domingo");
                break;
            default:
                System.out.println("El dia de la semana ingresado no es valido");
                break;
        }
    }
}
