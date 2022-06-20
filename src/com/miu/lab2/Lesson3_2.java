package com.miu.lab2;

public class Lesson3_2 {
    public static void main(String[] args) {
        Company e = new Company("Fairfield",new Employee("Omkar",20000),50);
        System.out.println(e.getPresident().getName());
    }
}
class Company{
    private String address;
    private Employee president;
    private int numEmployees;
    public Company(String addr, Employee pres, int num) {
        address = addr;
        president = pres;
        numEmployees = num;
    }
    public String getAddress() {
        return address;
    }
    //plug security hole by returning a copy of president
    public Employee getPresident() {
        Employee temp = new Employee(president.getName(), president.getSalary());
        return temp;
    }
    public int getNumEmployees() {
        return numEmployees;
    }
}
class Employee {
    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int s) {
        salary = s;
    }
}
