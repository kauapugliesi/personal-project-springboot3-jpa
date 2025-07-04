package com.project.pratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pratice.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>  {

}
