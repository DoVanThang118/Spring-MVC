package com.example.springmvc.service;

import com.example.springmvc.entity.Customer;
import com.example.springmvc.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    void createEmployee(Employee employee);
    List<Employee> findAllEmployees();
}
