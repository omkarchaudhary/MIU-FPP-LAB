package com.miu.lab2;

public class Prog2 {
    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1,9);
        int y = RandomNumbers.getRandomInt(3,14);
        double pi = Math.PI;
        double result1 = Math.pow(pi,x);
        double result2 = Math.pow(y,pi);
        System.out.println("The result of 1 is "+ result1);
        System.out.println("The result of 2 is "+ result2);
    }
}
