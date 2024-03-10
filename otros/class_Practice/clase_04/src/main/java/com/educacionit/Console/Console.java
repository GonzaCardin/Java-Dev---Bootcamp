package com.educacionit.Console;

public class Console {
    public static void main(String[] args) {
        System.out.println("The number of parameters received are " + args.length);
        if(args.length == 1){
            System.out.println("out - only one parameter " + args[0] );
            System.err.println("err - only one parameter" + args[0] );
        }
        else if(args.length == 0){
            System.out.println("no parameters received");
            System.err.println("no parameters received");
        }
    }
}
