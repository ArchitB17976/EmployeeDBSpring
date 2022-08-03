package com.main.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.main.module.Employee;
import com.main.service.EmployeeService;


@RestController
public class EmpControl 
{
    @Autowired
    private EmployeeService service;
    
    @PostMapping("/AddEmployee")
    public Employee addEmployee(@RequestBody Employee emp) 
    {
        return service.saveEmployee(emp);
    }

    @PostMapping("/AddEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> list)
    {
        return service.saveEmployees(list);
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees()
    {
        return service.getEmployees();
    }

    @GetMapping("/employee/ID={iden}")
    public Employee findByID(@PathVariable int iden)
    {
        return service.getEmployeeByID(iden);
    }

    @GetMapping("employee/Name={name}")
    public Employee findByName(@PathVariable String name)
    {
        return service.getEmployeeByName(name);
    }
    
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee emp)
    {
        return service.updateEmployee(emp);
    }

    @DeleteMapping("/delete/ID={iden}")
    public String removeEmployee(@PathVariable int iden)
    {
        return service.removeEmployee(iden);
    }
}
