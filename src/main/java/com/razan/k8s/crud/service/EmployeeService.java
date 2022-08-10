package com.razan.k8s.crud.service;

import com.razan.k8s.crud.model.Employee;
import com.razan.k8s.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public ResponseEntity<Employee> saveEmployee(Employee employee){
        return ResponseEntity.ok(repository.save(employee));
    }

    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.ok(repository.findAll());
    }
}
