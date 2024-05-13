package com.example.sb_example1.business.impl;

import com.example.sb_example1.business.services.EmployeeDetailsService;
import com.example.sb_example1.model.EmployeeDetails;
import com.example.sb_example1.repository.EmployeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

  /*  @Autowired
    private EmployeeDetailsRepository employeeDetailsRepository;*/
    @Override
    public void insertEmployee(EmployeeDetails employee) {

       /* EmployeeDetails emp = new EmployeeDetails();

        emp.setName(employee.getName());
        emp.setEmail(employee.getEmail());
        emp.setStatus("Y");
       employeeDetailsRepository.save(employee);*/

    }
}
