package com.UST.EMP.UST_EMP_REG.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UST.EMP.UST_EMP_REG.model.Employee;





@Repository
public interface employeerepo extends JpaRepository<Employee, String>{

}