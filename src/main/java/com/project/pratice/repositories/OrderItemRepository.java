package com.project.pratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pratice.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
