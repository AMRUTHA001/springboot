package com.UST.EMP.UST_EMP_REG.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.EMP.UST_EMP_REG.model.Employee;
import com.UST.EMP.UST_EMP_REG.repository.employeerepo;
@Service
public class employeeservices {

	@Autowired
	private employeerepo repo;
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	

}
