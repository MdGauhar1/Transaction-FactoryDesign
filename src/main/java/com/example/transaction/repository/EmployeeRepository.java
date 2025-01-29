package com.example.transaction.repository;

import com.example.transaction.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {
}
