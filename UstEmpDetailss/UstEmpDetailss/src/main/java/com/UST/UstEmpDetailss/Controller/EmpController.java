package com.UST.UstEmpDetailss.Controller;

import com.UST.UstEmpDetailss.Model.Employee;
import com.UST.UstEmpDetailss.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp/details")
public class EmpController {
    @Autowired
    private EmpService service;
    @PostMapping("/addemps")
    public Employee addEmployee(@RequestBody Employee employee) {

        return service.createEmployee(employee);

    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return service.getEmployees();
    }

    @GetMapping ("/employees/{empId}")
    public Employee getByEmployeeId(@PathVariable String empId){
        return service.getByEmployeeId(empId);
    }



    @DeleteMapping("/deleteemployee/{empId}")
    public String deleteEmployee(@PathVariable String empId) {
        return service.deleteByEmployeeById(empId);
    }






}

