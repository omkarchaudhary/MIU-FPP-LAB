package com.miu.lab7;

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
        return (GregorianCalendar)dateOfBirth.clone();
    }

    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(!(ob instanceof Person)) return false;
        Person p = (Person)ob;
        return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
    }

    public int hashCode() {
        int seed = 17;
        int result = 31 * seed + name.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Person p1 = new Person("John Doe", new GregorianCalendar(1990, 0, 1));
        Person p2 = new Person("Harry Potter", new GregorianCalendar(1983, 7, 23));
        Person p3 = new Person("John Doe", new GregorianCalendar(1990, 0, 1));
        PersonWithJob pwj1 = new PersonWithJob("John Doe", new GregorianCalendar(1990, 0, 1),1000);
        PersonWithJob pwj2 = new PersonWithJob("John Doe", new GregorianCalendar(1990, 0, 1),1000);

        System.out.println("P1 == P2 " + p1.equals(p2));
        System.out.println("P1 == P3 " + p1.equals(p3));
        System.out.println("P1 == PWJ " + p1.equals(pwj1));
        System.out.println("P1 == PWJ1 " + pwj1.equals(p1));
        System.out.println("PWJ1 == PWJ2 " + pwj1.equals(pwj2));

    }

}

class PersonWithJob extends Person {
    private double salary;
    PersonWithJob(String name, GregorianCalendar dob, double salary) {
        super(name, dob);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        PersonWithJob pwj = (PersonWithJob)obj;
        boolean isEqual = this.getName().equals(pwj.getName()) && this.getDateOfBirth().equals(pwj.getDateOfBirth()) && this.salary == pwj.salary;

        return isEqual;
    }

}