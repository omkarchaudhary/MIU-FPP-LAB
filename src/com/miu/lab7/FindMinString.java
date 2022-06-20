package com.miu.lab7;

public class FindMinString {

    public static void main(String[] args) {
        String str = "hello";

        System.out.println(findMinString(str));
    }
    public static Character findMinString(String str) {
        if(str == null || str.length() == 0) {
            return null;
        }
        char ch = str.charAt(0);
        if(str.length() == 1) return ch;
        char c = findMinString(str.substring(1));
        return (ch < c ? ch : c);
    }

}
