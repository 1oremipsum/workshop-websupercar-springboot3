package com.websupercar.supercar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websupercar.supercar.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
