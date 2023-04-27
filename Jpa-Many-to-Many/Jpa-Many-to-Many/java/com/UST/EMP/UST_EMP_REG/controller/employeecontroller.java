package com.UST.EMP.UST_EMP_REG.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UST.EMP.UST_EMP_REG.model.Employee;
import com.UST.EMP.UST_EMP_REG.services.employeeservices;




@RestController
@RequestMapping("/emp/registration")
@CrossOrigin("*")
public class employeecontroller {

	@Autowired
	private employeeservices employeeService; 
	
	@PostMapping("/addemps")
	public Employee addEmployee(@RequestBody Employee employee) {
	
		return employeeService.createEmployee(employee);
    
	}
	
	@GetMapping ("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getEmployees();
	}
	
	
	
}


