package com.example.jpaManytoMany.controller;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="STUDENT_TBL")

public class Student {
	private Long id;
	private String name;
	private int age;
	private String dept;
	
	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JsonManagedReference
	private Set<Student> students;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Student(Long id, String name, int age, String dept, Set<Student> students) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.students = students;
	}

}

