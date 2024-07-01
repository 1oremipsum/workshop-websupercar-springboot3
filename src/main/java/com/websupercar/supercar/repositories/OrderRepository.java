package com.websupercar.supercar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websupercar.supercar.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
