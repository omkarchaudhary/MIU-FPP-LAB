package com.miu.lab8.prog3.lab4.prog1;

import java.time.LocalDate;

public class Secretary extends  DeptEmployee{
    private  double overtimeHours = 0;

    Secretary(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }
    @Override
    public double computeSalary() {
        return super.computeSalary() + 12*this.overtimeHours;
    }
}
