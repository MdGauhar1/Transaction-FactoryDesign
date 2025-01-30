package com.example.transaction.controller;

import com.example.transaction.entity.Employee;
import com.example.transaction.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> saveEmployee(@RequestParam String name) throws Exception {
        Employee employeeSavedToDB = employeeService.addEmployee(name);
        return new ResponseEntity<>(employeeSavedToDB, HttpStatus.CREATED);
    }
}
