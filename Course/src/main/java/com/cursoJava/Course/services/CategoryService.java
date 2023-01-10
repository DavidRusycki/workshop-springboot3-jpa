package com.cursoJava.Course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoJava.Course.entities.Category;
import com.cursoJava.Course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return this.repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> optional = this.repository.findById(id);
		return optional.get();
	}
	
}
