package com.example.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("hello")
    String hello() {
        return "Hello world";
    }

    @PostMapping("save")
    Employee addEmployee(@RequestBody() Employee emp) {
        return employeeService.save(emp);
    }

    @GetMapping("all")
    List<Employee> getAll() {
        return employeeService.findAll();
    }

}
