package com.educacionit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.educacionit.model.Alumno;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {
    /// http://localhost:8080/alumnos/metodo1
    @RequestMapping(value = "/metodo1", method = RequestMethod.GET)
    public String inicio() {
        return "vista1";
    }

    @GetMapping("/metodo2")
    public ModelAndView metodo2() {
        ModelAndView model = new ModelAndView();


        model.addObject("unAlumno", new Alumno(1000,"Gonzalo"));
        model.setViewName("vista2");

        return model;
    }
    
    /// http://localhost:8080/alumnos/metodo3?legajoAlumno=555&nombre=nombreAlumno
    @GetMapping("/metodo3")
    public ModelAndView metodo3(@RequestParam(name = "legajo") Integer legajoAlumno, @RequestParam(name = "nombre") String nombreAlumno){
        ModelAndView mv = new ModelAndView();
        
        Alumno alumnoCreado = new Alumno(legajoAlumno, nombreAlumno); 
        mv.addObject("unAlumno", alumnoCreado);
        mv.setViewName("vista2");
        
        return null;
    }

}
