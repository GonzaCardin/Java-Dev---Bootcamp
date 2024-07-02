package com.educacionit.clase_57.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.educacionit.clase_57.dto.LoginDTO;
import com.educacionit.clase_57.dto.RegisterDTO;
import com.educacionit.clase_57.model.Role;
import com.educacionit.clase_57.model.User;
import com.educacionit.clase_57.repository.UserRepository;

@Service
public class AuthenticationService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthenticationManager authenticationManager;

    public User register(RegisterDTO register) {
        User aUser = new User();
        aUser.setFullName(register.getFullName());
        aUser.setEmail(register.getEmail());
        aUser.setPassword(passwordEncoder.encode(register.getPassword()));

        Role aRole = new Role();
        aRole.setId(1);
        Set<Role> defaultRol = new HashSet<>();
        defaultRol.add(aRole);

        aUser.setRoles(defaultRol);

        return userRepository.save(aUser);
    }

    public User autenticar(LoginDTO login) {
        authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(login.getEmail(), login.getPassword()));
        
        return userRepository.findByEmail(login.getEmail()).orElse(null);
    }
}
