package com.miu.lab8.prog3.lab4.prog6;

import java.util.GregorianCalendar;

public class Person {
    private String name;
    private GregorianCalendar dateOfBirth;
    Person(String name, GregorianCalendar dob) {
        this.name = name;
        dateOfBirth = dob;
    }
    public String getName() {
        return name;
    }
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }
//instanceof
// CASE1- strategy for overriding equals
    /*@Override
    public boolean equals(Object person) {
        if(person == null) return false;
        if(!(person instanceof Person)) return false;
        Person p = (Person)person;
        boolean isEqual = getName().equals(p.getName()) && getDateOfBirth().equals(p.getDateOfBirth());
        return isEqual;
    } */

    @Override
    public boolean equals(Object person) {
        if(person == null) return false;
        if(person.getClass() != this.getClass())
            return false;
        Person p = (Person)person;
        boolean isEqual = getName().equals(p.getName()) && getDateOfBirth().equals(p.getDateOfBirth());
        return isEqual;
    }

}
