package com.miu.lab5;

import java.util.Arrays;

public class Excercise {

    public static void main(String[] args) {
        char[] arr = {'a','b','c'};
        System.out.println(reverseString(arr));
    }

    public static char[] reverseString(char[] s) {
        if(s.length == 0)
            return s;
        String str = Arrays.asList(s).toString();
        String newStr = str.substring(1);
        char[] newArr = newStr.toCharArray();
        return reverseString(newArr);

    }
}
