package com.cursoJava.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{	
}
