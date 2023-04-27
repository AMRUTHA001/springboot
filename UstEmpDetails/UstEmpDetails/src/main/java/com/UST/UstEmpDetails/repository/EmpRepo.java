package com.UST.UstEmpDetails.repository;

import com.UST.UstEmpDetails.model.EmpDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<EmpDetails,Integer> {
}
