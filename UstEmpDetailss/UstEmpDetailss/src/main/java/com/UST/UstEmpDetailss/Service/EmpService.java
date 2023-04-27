package com.UST.UstEmpDetailss.Service;

import com.UST.UstEmpDetailss.Model.Employee;
import com.UST.UstEmpDetailss.Repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpRepo repo;


    public Employee createEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public Employee getByEmployeeId(String empId){
        return repo.findByempId(empId);
    }
@Transactional
    public String deleteByEmployeeById(String empId) {
        repo.deleteByEmpId(empId);
        return "the employee information is deleted" ;
    }



}
