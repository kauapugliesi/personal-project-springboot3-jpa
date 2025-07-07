package com.project.pratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pratice.entities.Category;


public interface CategoryRepositorie extends JpaRepository<Category, Long>  {

}
