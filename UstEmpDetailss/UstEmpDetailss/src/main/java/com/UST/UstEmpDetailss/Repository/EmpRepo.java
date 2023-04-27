package com.UST.UstEmpDetailss.Repository;

import com.UST.UstEmpDetailss.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {




    Employee findByempId(String empId);

    void deleteByEmpId(String empId);

}
