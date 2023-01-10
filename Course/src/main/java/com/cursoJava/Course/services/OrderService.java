package com.cursoJava.Course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoJava.Course.entities.Order;
import com.cursoJava.Course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return this.repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> optional = this.repository.findById(id);
		return optional.get();
	}
	
}
