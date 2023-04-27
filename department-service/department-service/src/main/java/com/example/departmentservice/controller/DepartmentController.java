package com.example.departmentservice.controller;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService service;
    @PostMapping("/")
    public Department saveDepartmentById(@RequestBody Department department) {
        return service.SaveDepartment(department);
    }
    @GetMapping("/{id}")
        public Department saveDepartmentById(@PathVariable("id") Long departmentId){
            return service.findDepartmentById(departmentId);
        }
    }

