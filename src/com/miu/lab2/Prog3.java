package com.miu.lab2;

public class Prog3 {
    public static void main(String[] args) {
        float x = 1.27f, y = 3.881f, z = 9.6f;
        int result1, result2;
        result1 = (int) (x + y + z);
        result2 = Math.round(x + y + z);
        System.out.println("The result of 1 is : " + result1);
        System.out.println("The result of 2 is : " + result2);
    }
}
