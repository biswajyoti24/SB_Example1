package com.example.java_program.controller;

import com.example.java_program.business.services.EmployeeDetailsService;
import com.example.java_program.model.EmployeeDetails;
import com.example.java_program.repository.EmployeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/employee")
public class EmployeeDetailsController {
    @Autowired
    private EmployeeDetailsService employeeDetailsService;

    private final EmployeeDetailsRepository employeeDetailsRepository;

    @Autowired
    public EmployeeDetailsController(EmployeeDetailsRepository employeeDetailsRepository) {
        this.employeeDetailsRepository = employeeDetailsRepository;
    }


    @PostMapping(path="/insert")
    public void insertEmployee(@RequestBody EmployeeDetails emp){

        employeeDetailsService.insertEmployee(emp);


    }

    @GetMapping(path="/get-all")
    public List<EmployeeDetails> getEmployee(){
        return employeeDetailsRepository.findAll();

    }
}
