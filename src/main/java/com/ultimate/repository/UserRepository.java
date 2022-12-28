package com.ultimate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ultimate.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByEmailAndPassword(String email,String password);
}
