package com.razan.k8s.crud.controller;

import com.razan.k8s.crud.model.Employee;
import com.razan.k8s.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/save-employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @GetMapping("/get-all-employee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return service.getAllEmployee();
    }
}
