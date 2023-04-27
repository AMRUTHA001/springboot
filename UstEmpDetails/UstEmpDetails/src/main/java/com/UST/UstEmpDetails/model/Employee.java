package com.UST.UstEmpDetails.model;

import com.UST.UstEmpDetails.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp/details")
public class Employee {
@Autowired
private Empservice employeeService;

    @PostMapping("/addemps")
    public Employee addEmployee(@RequestBody Employee employee) {

        return employeeService.createEmployee(employee);

    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping ("/employees/{id}")
    public Employee getAllEmployees(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }



    @DeleteMapping("/deleteemployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployeeById(id);
    }


}
