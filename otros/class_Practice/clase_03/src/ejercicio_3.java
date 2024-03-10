public class ejercicio_3 {
    public static void main(String[] args) {
        float nota_1 =  2.49F;
        float nota_2 =  7.98f; 
        float nota_3 =  3.4F;
        
        float promedio = (nota_1 + nota_2 + nota_3) / 3;

        if(promedio >= 6.59){
            System.out.println("El promedio supera los 6.59 puntos");
        }
        else{
            System.out.println("El promedio no supera los 6.59 puntos");
        }
        int contador = 0;

        if(nota_1>4) contador++;
        if(nota_2>4) contador++;
        if(nota_3>4) contador++;
        System.out.println("Cantidad de notas mayores a 4 : "+contador);

    }
}
