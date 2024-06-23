package com.educacionit.clase_54.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping(value = "register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest req) {
        return null;
    }

    @PostMapping(value = "/login")
    public String login() {
        return null;
    }

}
