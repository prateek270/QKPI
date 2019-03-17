package com.ndh.qkpi.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndh.qkpi.dashboard.entity.Users;

public interface UserRepository extends JpaRepository<Users, String>{
	

}
