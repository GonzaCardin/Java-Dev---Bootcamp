package com.educacionit.clase_51.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacionit.clase_51.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
