package com.example.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    List<Employee> empList = new ArrayList<>();

    @GetMapping("hello")
    String hello() {
        return "Hello world";
    }

    @PostMapping("save")
    Employee addEmployee(@RequestBody() Employee emp) {
        empList.add(emp);
        return emp;
    }

    @GetMapping("all")
    List<Employee> getAll() {
        return empList;
    }

}
