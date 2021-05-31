package com.dev.worker.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.worker.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
