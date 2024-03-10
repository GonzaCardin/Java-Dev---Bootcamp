package com.educacionit.treeSet;

import java.util.Comparator;

public class CompardorAlumno implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        /// return o1.getNombre().compareTo(o2.getNombre());
        /// si son iguales devuelve cero
        /// si el primero es mayor al segundo devuelve +1
        /// si el segundo es mayor al primero devuelve -1
        /// si lo quiero comparador de menor a mayor(Z a A)
        /// return o2.getNombre().compareTo(o1.getNombre());

        
        int comparacion = -1;
        comparacion = o1.getNombre().compareTo(o2.getNombre());
        if(comparacion == 0){
            comparacion = o2.getEdad().compareTo(o1.getEdad()); ///ordeno la edad de forma decreciente
        }

        return comparacion;
    }

}
