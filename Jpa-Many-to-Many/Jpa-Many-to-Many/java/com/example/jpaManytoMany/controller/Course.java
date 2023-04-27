package com.example.jpaManytoMany.controller;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="COURSE_TBL")

public class Course {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String abbrevation;
	private int modules;
	private double fee;
	private long studentid;
	
	@ManyToMany()
	@JoinTable (name="STUDENT_COURSE_TABLE",
	joinColumns= {
			
			
			@JoinColumn(name="student_id",referencedColumnName="id")
	},
	inverseJoinColumns= {
			@JoinColumn(name="course_id",referencedColumnName="id")
	}
)
	@JsonManagedReference
	private Set<Course> course;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	public int getModules() {
		return modules;
	}

	public void setModules(int modules) {
		this.modules = modules;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public long getStudentid() {
		return studentid;
	}

	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Course(Long id, String title, String abbrevation, int modules, double fee, long studentid,
			Set<Course> course) {
		
		this.id = id;
		this.title = title;
		this.abbrevation = abbrevation;
		this.modules = modules;
		this.fee = fee;
		this.studentid = studentid;
		this.course = course;
	}

}
