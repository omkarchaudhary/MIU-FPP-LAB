package com.miu.lab7;

public class Test {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();
        One three = new Two();
        one.print();
        two.print();
        three.print();
    }
}
class One{
    int i =1;
    int getInt(){
        return i;
    }
    public static void print(){
        System.out.println("1");
    }
}
class Two extends One{
    int i =2;
    int getInt(){
        return i;
    }
    public static void print(){
        System.out.println("2");
    }
}
