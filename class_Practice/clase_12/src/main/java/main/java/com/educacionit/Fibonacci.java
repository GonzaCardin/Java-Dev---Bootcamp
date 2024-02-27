package main.java.com.educacionit;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(3);
    }
    private static void fibonacci(int term){
        int first = 0;
        int second = 1;

        if(term == 1){
            System.out.println(first);
            return; //con el else if se sacaría el return
        }
        /*else*/ if(term == 2){
            System.out.println(first);
            System.out.println(second);
            return;

        }
        System.out.println(first);
        System.out.println(second);

        for(int i = 3; i<= term ; i++){
            int new_element = first + second;
            System.out.println(new_element);
            first = second;
            second = new_element;
        }

    }
}
