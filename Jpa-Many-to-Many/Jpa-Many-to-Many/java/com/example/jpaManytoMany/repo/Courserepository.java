package com.example.jpaManytoMany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaManytoMany.controller.Course;

public interface Courserepository extends JpaRepository<Course,Long> {
	

}
