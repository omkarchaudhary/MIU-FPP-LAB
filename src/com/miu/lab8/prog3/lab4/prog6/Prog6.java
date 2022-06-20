package com.miu.lab8.prog3.lab4.prog6;

import java.util.GregorianCalendar;

public class Prog6 {
    public static void main(String[] args) {
        Person joe1 = new Person("Joe", new GregorianCalendar(2020,5,6));
        Person joe2 = new Person("Joe", new GregorianCalendar(2020,5,6));
        PersonWithJob joe3 = new PersonWithJob("Joe", new GregorianCalendar(2020,5,6),3000);
        PersonWithJob joe4 = new PersonWithJob("Joe", new GregorianCalendar(2020,5,6),3000);
        PersonWithJobComposition comp1 = new PersonWithJobComposition(3000, joe1);
        PersonWithJobComposition comp2 = new PersonWithJobComposition(3000, joe2);
        System.out.println(joe1.equals(joe2));
        System.out.println(joe3.equals(joe4));
        System.out.println(comp1.equals(comp2));
    }
}
