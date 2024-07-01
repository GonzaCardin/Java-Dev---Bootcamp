package com.educacionit.clase_56.lombok;



public class BuilderMain {
    public static void main(String[] args) {
        BuilderDTO clase = BuilderDTO.builder()
                .name("Gonzalo")
                .id(99)
                .build();
        System.out.println(clase);
    }
}
