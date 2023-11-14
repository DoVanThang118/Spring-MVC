package com.example.springmvc.service.impl;

import com.example.springmvc.entity.Employee;
import com.example.springmvc.repository.EmployeeRepository;
import com.example.springmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
