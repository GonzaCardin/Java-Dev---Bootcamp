package com.educacionit.clase_57.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.clase_57.dto.LoginDTO;
import com.educacionit.clase_57.dto.RegisterDTO;
import com.educacionit.clase_57.model.User;
import com.educacionit.clase_57.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterDTO register){
        authenticationService.register(register);
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody LoginDTO login){
        authenticationService.autenticar(login);
        return null;
    }
}
