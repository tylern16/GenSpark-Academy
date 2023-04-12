package com.example.Employee.Controller;

import com.example.Employee.Entities.Employee;
import com.example.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Welcome to Employee App</H1></HTML>";
    }

    @GetMapping("/employees")
    public List<Employee> showAll() {
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeByID(@PathVariable int id) {
        return this.employeeService.getEmployeeByID(id);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeByID(@PathVariable int id) {
        return this.employeeService.deleteEmployeebyID(id);
    }
}
