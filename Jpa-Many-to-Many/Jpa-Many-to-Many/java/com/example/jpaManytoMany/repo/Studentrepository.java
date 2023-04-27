package com.example.jpaManytoMany.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaManytoMany.controller.Student;

public interface Studentrepository extends JpaRepository<Student,Long> {

	List<Student> findByNameContaining(String name);

}
