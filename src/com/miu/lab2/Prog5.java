package com.miu.lab2;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the String to be Reverses: ");
        String enteredString = sc.nextLine();
        String reveresString = "";
        for (int i = enteredString.length() - 1; i >= 0; i--) {
            reveresString = reveresString + enteredString.charAt(i);
        }
        System.out.println(reveresString);
        sc.close();
    }
}
