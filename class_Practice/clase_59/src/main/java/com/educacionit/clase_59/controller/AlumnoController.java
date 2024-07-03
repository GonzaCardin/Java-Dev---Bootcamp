package com.educacionit.clase_59.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.educacionit.clase_59.exception.AlumnoNotFoundException;
import com.educacionit.clase_59.model.Alumno;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
    private List<Alumno> alumnos = new ArrayList<>();

    @GetMapping("/")
    public String listAlumnos(Model model){
        model.addAttribute("alumnos",alumnos);
        return "list";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    @PostMapping("/add")
    @ResponseBody
    public String addAlumno(@RequestBody Alumno a) {
        alumnos.add(a);
        return "Alumno agregado";
    }

    @PostMapping("/modify")
    @ResponseBody
    public String modifyAlumno(@RequestBody Alumno a) {
        try {
            Integer index = findAlumnoIndexByLegajo(a.getLegajo());
            alumnos.set(index, a);
            return "Alumno fue modificado";
        } catch (AlumnoNotFoundException e) {
            return "Alumno no encontrado";
        }

    }

    @SuppressWarnings("unlikely-arg-type")
    @PostMapping("/delete")
    @ResponseBody
    public String deleteAlumno(@RequestBody Integer legajo) {
        try {
            Integer index = findAlumnoIndexByLegajo(legajo);
            alumnos.remove(index);
            return "Alumno eliminado";
        } catch (AlumnoNotFoundException e) {
            return "Alumno no encontrado";
        }
    }

    private Integer findAlumnoIndexByLegajo(Integer legajo) throws AlumnoNotFoundException {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a = alumnos.get(i);
            if (a.getLegajo().equals(legajo)) {
                return i;
            }
        }
        throw new AlumnoNotFoundException("No se pudo encontrar el alumno con legajo: " + legajo);
    }
}
