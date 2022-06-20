package com.miu.lab8.prog3.lab4.prog1;

import java.time.LocalDate;
import java.util.Date;

public class DeptEmployee {
    private String name;
    private LocalDate hireDate;
    private double salary;
    DeptEmployee(String name,LocalDate hireDate,double salary){
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public double computeSalary(){
        return this.salary;
    }
}
