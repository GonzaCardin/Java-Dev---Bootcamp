package com.educacionit.enums;

public class Test {
    // private MisContantes unaConstante = MisContantes.TRES;
    public static void main(String[] args) {
        recibeUnaConstante(MisContantes.UNO);
        recibeUnaConstante(MisContantes.DOS);
        recibeUnaConstante(MisContantes.TRES);

        MisContantes[] values = MisContantes.values();
        for (MisContantes value : values) {
            System.out.println(value);
        }

    }

    private static void recibeUnaConstante(MisContantes unEnum) {
        System.out.println("Nombre Enum: " + unEnum.name());
        System.out.println("Ordinal Enum: " + unEnum.ordinal());
        System.out.println("------------------------------------------------");
        System.out.println("toString: " + unEnum.toString());

        switch (unEnum) {
            case UNO:
                System.out.println("Es un uno. Descripción:" + unEnum.getDescripcion());
                break;
            case DOS:
                System.out.println("Es un dos. Descripción: " + unEnum.getDescripcion());
                break;
            case TRES:
                System.out.println("Es un tres. Descripción: " + unEnum.getDescripcion());
                break;
            default:
                System.out.println("No debería pasar!! El desarollador olvido actualizar este método");
        }

    }

}
