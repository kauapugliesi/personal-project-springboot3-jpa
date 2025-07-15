package com.project.pratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pratice.entities.OrderItem;
import com.project.pratice.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {

}
