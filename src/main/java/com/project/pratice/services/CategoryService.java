package com.project.pratice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pratice.entities.Category;
import com.project.pratice.repositories.CategoryRepositorie;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepositorie CategoryRepositorie;
	
	public List<Category> findAll(){
		return CategoryRepositorie.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = CategoryRepositorie.findById(id);
		return obj.get();
	}
}
