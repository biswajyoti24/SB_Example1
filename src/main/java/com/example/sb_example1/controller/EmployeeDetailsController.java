package com.example.sb_example1.controller;

import com.example.sb_example1.business.services.EmployeeDetailsService;
import com.example.sb_example1.model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/employee")
public class EmployeeDetailsController {
    @Autowired
    private EmployeeDetailsService employeeDetailsService;

    @PostMapping(path="/insert")
    public void insertEmployee(@RequestBody EmployeeDetails emp){

        employeeDetailsService.insertEmployee(emp);


    }
}
