package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.module.Employee;
import com.main.repo.EmployeeRepo;

@Service
public class EmployeeService 
{
    @Autowired
    private EmployeeRepo repo;

    public Employee saveEmployee(Employee emp)
    {
        return repo.save(emp);
    }

    public List<Employee> saveEmployees(List<Employee> list)
    {
        return repo.saveAll(list);
    }

    public List<Employee> getEmployees()
    {
        return repo.findAll();
    }

    public Employee getEmployeeByID(int iden)
    {
        return repo.findById(iden).orElse(null);
    }

    public Employee getEmployeeByName(String name)
    {
        return repo.findByName(name);
    }

    public Employee updateEmployee(Employee emp)
    {
        return repo.save(emp);
    }

    public String removeEmployee(int iden)
    {
        repo.deleteById(iden);
        return "Employee " + iden + "'s detailed have been removed.";
    }
}
