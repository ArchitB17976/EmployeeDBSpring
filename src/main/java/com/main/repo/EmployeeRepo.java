package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.module.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
    Employee findByName(String name);    
}
