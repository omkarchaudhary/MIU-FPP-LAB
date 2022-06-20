package com.miu.lab8.prog3.lab4.prog1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
    private int numberOfPublications;

    Professor(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }
}
