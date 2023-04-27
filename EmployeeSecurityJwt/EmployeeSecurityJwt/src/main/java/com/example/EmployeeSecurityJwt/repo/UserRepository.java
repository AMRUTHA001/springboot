package com.example.EmployeeSecurityJwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeSecurityJwt.Entity.User;

public interface UserRepository extends JpaRepository <User,Integer> {

	User findByUsername(String username);

}
