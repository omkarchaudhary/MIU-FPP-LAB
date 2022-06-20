package com.miu.lab3;

public class Excercise3_4 {
    public static void main(String[] args) {

    }
}

class CallByValue{
    EmployeeTest e1 = new EmployeeTest("Tom",100000);


}
class EmployeeTest{
    private int salary;
    private String name;
    EmployeeTest(String name, int salary){
        name= name;
        salary = salary;
    }
    void setSalary(int s){
        salary = s;
    }
    public int getSalary(){
        return this.salary;
    }
}
