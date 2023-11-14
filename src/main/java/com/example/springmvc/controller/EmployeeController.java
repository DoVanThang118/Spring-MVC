package com.example.springmvc.controller;

import com.example.springmvc.entity.Employee;
import com.example.springmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String findAllEmployees(Model model) {
        List<Employee> employees = employeeService.findAllEmployees();
        model.addAttribute("employees", employees);
        return "employee-list";
    }

    @GetMapping("/new")
    public String createEmployeeForm(Model model) {
        model.addAttribute("employees", new Employee());
        return "employee-form";
    }

    @PostMapping("/new")
    public String createEmployee(@ModelAttribute Employee employee) {
        employeeService.createEmployee(employee);
        return "redirect:/employees";
    }
}
