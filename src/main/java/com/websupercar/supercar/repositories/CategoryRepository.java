package com.websupercar.supercar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websupercar.supercar.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
