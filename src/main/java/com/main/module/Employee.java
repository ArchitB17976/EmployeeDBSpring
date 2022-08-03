package com.main.module;

import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_roles")

public class Employee 
{
    @Id
    @GeneratedValue
    private int employeeID;

    private String name;
    private String role;
    private int salary;
}
