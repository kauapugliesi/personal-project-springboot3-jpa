package com.project.pratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pratice.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>  {

}
