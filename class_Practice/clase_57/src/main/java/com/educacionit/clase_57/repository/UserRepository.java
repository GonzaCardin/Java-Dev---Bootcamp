package com.educacionit.clase_57.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacionit.clase_57.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
