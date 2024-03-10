package com.educacionit.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Empleado employee_1 = new Empleado("Gonzalo", 1000d);
        Gerente manager = new Gerente("Eduardo", 10000D, "Administración");
        EmpleadoNormal normalEmployee = new EmpleadoNormal("Carlos", 500d, "CAT_01");

        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(employee_1);
        listaEmpleados.add(manager);
        listaEmpleados.add(normalEmployee);

        ManejadorEmpleados.imprimirDetalleEmpleado(listaEmpleados);

    }
}
