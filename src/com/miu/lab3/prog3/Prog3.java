package com.miu.lab3.prog3;

public class Prog3 {
    public static void main(String[] args) {
        MyStringList list = new MyStringList();
        list.add("Bob");
        System.out.println("The list of size " + list.size() + " is " + list);
        list.add("Steve");
        System.out.println("The list of size " + list.size() + " is " + list);
        list.add("Susan");
        System.out.println("The list of size " + list.size() + " is " + list);
        list.add("Mark");
        System.out.println("The list of size " + list.size() + " is " + list);
        list.add("Dave");
        System.out.println("The list of size " + list.size() + " is " + list);
        list.remove("Mark");
        System.out.println("The list of size " + list.size() + " is " + list);
        list.remove("Bob");
        System.out.println("The list of size " + list.size() + " is " + list);
    }
}
