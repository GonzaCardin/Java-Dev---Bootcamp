package com.educacionit.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Person p1 = new Person(001, "Gonzalo");
        Person p2 = new Person(002, "Cristian");
        Person p3 = new Person(003, "Bautista");

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        /// Conversion de datos
        List<Persona> newCollectionPersona = persons.stream().map(person -> {
            Persona unaPersona = new Persona();
            unaPersona.setId(person.getId());
            unaPersona.setNombre(person.getName());
            return unaPersona;
        })
                .collect(Collectors.toList());
        System.out.println(newCollectionPersona);

    }

}
