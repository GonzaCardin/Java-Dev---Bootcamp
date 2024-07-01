package com.educacionit.clase_56.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("personas")
public class PersonaController {
    @GetMapping("/")
    public String index(HttpSession session){
        List<Persona> personas = (List<Persona>) session.getAttribute("personas");
        if(personas == null){
            personas = new ArrayList<>();
            session.setAttribute("personas", personas);
        }

        personas.add(new Persona("Cristian",35));
        personas.add(new Persona("Jose",27));


        return "index";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute("persona")Persona persona,HttpSession session){
        List<Persona> personas = (List<Persona>) session.getAttribute("personas");
        
        personas.add(persona);

        return "index";
    }

    @GetMapping("/delete/{indice}")
    public String delete(@PathVariable("indice") Integer indice, HttpSession session){
        List<Persona> personas = (List<Persona>) session.getAttribute("personas");
        personas.remove(indice);

        return "index";
    }
}
