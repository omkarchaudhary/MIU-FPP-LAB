package com.miu.lab3.prog1;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    // instance fields
    private String name;
    private String nickName;
    private double salary;
    private Date hireDay;
    // constructor
    public Employee(String aName, String aNickName,
                    double aSalary, int aYear, int aMonth, int aDay) {
        name = aName;
        nickName = aNickName;
        salary = aSalary;
        GregorianCalendar cal =
                new GregorianCalendar(aYear, aMonth - 1, aDay);
        hireDay = cal.getTime();
    }
    // instance methods
    public String getName() {
        return name;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String aNickName) {
        nickName = aNickName;
    }
    public double getSalary() {
        return salary;
    }
    // needs to be improved
    public Date getHireDay() {
        //hireDay is mutable
        return (Date)hireDay.clone(); //clone copy, original cannot be modified.
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    private String format = "name = %s, salary = %.2f, hireDay = %s";
    public String toString() {
        return String.format(format, name, salary, Util.dateAsString(hireDay));
    }

    public static class Util {
        public static String dateAsString(Date d) {
            DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
            return f.format(d);
        }
    }
}
