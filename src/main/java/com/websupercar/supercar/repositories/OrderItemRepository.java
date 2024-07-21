package com.websupercar.supercar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websupercar.supercar.entities.OrderItem;
import com.websupercar.supercar.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
   
}
