package com.cursoJava.Course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoJava.Course.entities.Product;
import com.cursoJava.Course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return this.repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> optional = this.repository.findById(id);
		return optional.get();
	}
	
}
