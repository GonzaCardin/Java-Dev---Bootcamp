package com.educacionit.clase_40.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.educacionit.clase_40.model.Alumno;

@RestController
@RequestMapping("/alumnos")
public class EjemploController {

    @GetMapping("/metodo1")
    public String metodo1() {
        return "vista1";
    }

    @GetMapping("/metodo2")
    public ModelAndView metodo2() {
        ModelAndView mav = new ModelAndView();
        Alumno alumnoCreado = new Alumno(1000, "Gonzalo", 23);
        mav.addObject("unAlumno", alumnoCreado);
        mav.setViewName("vista2");
        return mav;
    }

    // http://localhost:8080/alumnos/metodo3?legajo=555&nombre=Edaurdo&edad=58
    @GetMapping("/metodo3")
    public ModelAndView metodo3(@RequestParam(name = "legajo") Integer unLegajo,
            @RequestParam(name = "nombre") String unNombre, @RequestParam(name = "edad") Integer unaEdad) {
            ModelAndView mav = new ModelAndView();
            
            Alumno alumnoCreado = new Alumno(unLegajo, unNombre, unaEdad);
            mav.addObject("unAlumno", alumnoCreado);

            mav.setViewName("vista3");
        return mav;
    }

}