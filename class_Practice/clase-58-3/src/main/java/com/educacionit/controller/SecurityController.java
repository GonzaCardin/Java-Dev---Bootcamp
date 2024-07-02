package com.educacionit.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("security")
public class SecurityController {
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminRole(){
        return "Este endpoint es solo visible para usuarios autenticados con Role Admin";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userRole(){
        return "Este endpoint es solo visible para usuarios autenticados con Role User";
    }

    @PreAuthorize("hasRole('EMPLOYEE')")
    @GetMapping("/employee")
    public String employeeRole(){
        return "Este endpoint es solo visible para usuarios autenticados con Role Employee";
    }

    @PreAuthorize("hasAnyRole('ADMIN','EMPLOYEE','USER')")
    @GetMapping("/all")
    public String allRole(){
        return "Este endpoint es solo visible para usuarios autenticados con cualquier rol";
    }


}
