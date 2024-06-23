package com.educacionit.clase_54.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class ApiControllerExample {
    @GetMapping(value = "demo")
    public String helloWorld(){
        return "Hello World";
    }
}
