package com.miu.lab7.prog1;

public class Prog1 {

    public static void main(String[] args) {
    double result;
    result = power(5,4);
        System.out.println(result);
    }

    private static double power(double x, int n){
        //x^n = x * x^(n-1)
        // base case
        if(n == 0 || n < 0) return 1;
        //recursive case
        return x*power(x, n-1);
    }
}
