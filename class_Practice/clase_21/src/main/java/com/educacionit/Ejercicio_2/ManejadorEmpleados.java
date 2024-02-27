package com.educacionit.Ejercicio_2;

import java.util.List;

public class ManejadorEmpleados {
    public static <T extends Empleado> void imprimirDetalleEmpleado(List<T> listaEmpleados) {
        for (T employee : listaEmpleados) {
            System.out.println("Nombre: " + employee.getNombre());
            System.out.println("Salario: " + employee.getSalario());
            System.out.println("\n");
        }
    }

    public static <T extends Empleado> void imprimirDetalleGerente(List<T> listaEmpleados) {
        for (T employee : listaEmpleados) {
            if (employee instanceof Gerente) { /// Esto no se debe hacer, o se debe plantear de otra manera. Ya que con
                                               /// este método no hay polimorfismo
                Gerente manager = (Gerente) employee;

                manager.getNombre();
                manager.getSalario();
                manager.getDepartamento();
            }
        }
    }
}
