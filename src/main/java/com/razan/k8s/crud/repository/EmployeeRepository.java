package com.razan.k8s.crud.repository;

import com.razan.k8s.crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
