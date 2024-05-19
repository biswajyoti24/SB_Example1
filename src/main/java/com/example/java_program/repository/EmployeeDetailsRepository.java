package com.example.java_program.repository;

import com.example.java_program.model.EmployeeDetails;
import com.example.java_program.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {

//    EmployeeDetails findByEmail(String email);
}
