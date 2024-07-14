package com.websupercar.supercar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websupercar.supercar.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
