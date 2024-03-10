public class ejercicio_5 {
    public static void main(String[] args){
        int x = 3;

        switch (x) {
            case 4:
                System.out.println("Menor igual que cinco, o menor igual que cuatro.");
                break;
            case 5:
                System.out.println("Igual a cinco");
                break;
            case 9:
                System.out.println("El numero es mayor que cinco y menor a diez");
            default:
                System.out.println("El numero es mayor o igual a cinco.");
                break;
        }
    }
}
