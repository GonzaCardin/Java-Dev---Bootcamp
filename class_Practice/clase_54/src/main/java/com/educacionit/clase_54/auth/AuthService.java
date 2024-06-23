package com.educacionit.clase_54.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionit.clase_54.jwt.JwtService;
import com.educacionit.clase_54.user.Role;
import com.educacionit.clase_54.user.User;
import com.educacionit.clase_54.user.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtService jwtService;

    public AuthResponse register(RegisterRequest req) {
        User user = new User();
        
        user.setUserName(req.getUserName());
        user.setFirstName(req.getFirstName());
        user.setLastName(req.getLastName());
        user.setCountry(req.getCountry());
        user.setPassword(req.getPassword());
        user.setRole(Role.ADMIN);

        userRepository.save(user);

        String token = jwtService.getToken(user);

        return new AuthResponse(token);
    }
}
