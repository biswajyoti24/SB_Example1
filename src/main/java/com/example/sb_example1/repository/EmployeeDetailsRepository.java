package com.example.sb_example1.repository;

import com.example.sb_example1.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Long> , JpaSpecificationExecutor<EmployeeDetails> {

    EmployeeDetails findByEmail(String email);
}
