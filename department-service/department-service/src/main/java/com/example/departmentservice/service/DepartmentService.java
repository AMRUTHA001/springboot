package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;

    public Department SaveDepartment(Department department) {
        return repo.save(department);

    }

    public Department findDepartmentById(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }



}


