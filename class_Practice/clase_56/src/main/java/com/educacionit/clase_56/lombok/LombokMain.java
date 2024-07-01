package com.educacionit.clase_56.lombok;

// import lombok.extern.slf4j.Slf4j;

// @Slf4j
public class LombokMain {
    public static void main(String[] args) {
        LombokClass lombokClass1 = new LombokClass();

        lombokClass1.setName("Gonzalo");
        System.out.println(lombokClass1.getName());
        lombokClass1.setEdad(22);
        System.out.println(lombokClass1.getEdad());

        System.out.println(lombokClass1);

        // log.info("nombre: {} - edad: {} ",lombokClass1.getName(), lombokClass1.getEdad());

        LombokClass lombokClass2 = new LombokClass("Juan",21);

        System.out.println(lombokClass2.hashCode());
    }
}
