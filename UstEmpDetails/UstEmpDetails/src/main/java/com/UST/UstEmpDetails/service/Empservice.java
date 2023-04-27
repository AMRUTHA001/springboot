package com.UST.UstEmpDetails.service;

import com.UST.UstEmpDetails.model.Employee;
import com.UST.UstEmpDetails.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpRepo repo;

    public Employee createEmployee(Employee employee) {

        return repo.save(Employee);

    }

    public List<Employee> getEmployees() {
        return EmpRepo.findAll();
    }

    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    public String deleteEmployeeById(int id) {

        repo.deleteById(id);
        return "the employee information is deleted" ;
    }
}
