package com.miu.lab8;

import java.util.*;

public class Exercise8_4 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Bob",1000),
                new Employee("Steve", 2500),
                new Employee("John", 3000)
        );

        System.out.println(empsToNames(employeeList));
    }

    static List<String> empsToNames(List<Employee> list){

        List<String> lst = new ArrayList<>();
        list.forEach(emp ->{
            lst.add(emp.getName());
        });

        return lst;
    }
}
class Employee{
    private String name;
    private double salary;
    Employee(){};
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
     protected String getName(){
        return this.name;
    }
}
class Employee1 extends  Employee{
    public String getName(){
        return this.getName()+" E1";
    }
}
