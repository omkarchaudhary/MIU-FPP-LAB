package com.miu.lab8.prog3.lab4.prog6;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person{
    //use final class
    private double salary;
    PersonWithJob(String n, GregorianCalendar dob, double s) {
        super(n, dob);
        this.salary = s;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public boolean equals(Object withJob) {
        if(withJob == null) return false;
        if(withJob.getClass() != this.getClass())
            return false;
        PersonWithJob p = (PersonWithJob)withJob;
        boolean isEqual = getName().equals(p.getName()) && getDateOfBirth().equals(p.getDateOfBirth())&&
                        this.salary == p.salary;
        return isEqual;
    }
}
