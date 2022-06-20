package com.miu.lab2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
 //       String name = "Robert";
//        System.out.println(name.substring(0,3));
//        System.out.println(name.substring(0,name.length()));
//        System.out.println(name.substring(0,1));
//        System.out.println(name.substring(0,0));
//
//        System.out.println(name.indexOf('t'));
//        System.out.println(name.indexOf("bert"));
//
//        System.out.println(name.startsWith("Rob"));
//        System.out.println(name.startsWith("R"));
//        System.out.println(name.startsWith("bert"));
//
//        String firstName = "Robert";
//        String lastName = "Stevens";
//        System.out.println(firstName+" "+lastName);
//
//        System.out.println(name.equals("Robert"));
//        // String Equals
//        String str1 = "Hello";
//        String str2 ="He"+"llo";
//        String str3 = new String("Hello");
//        String str4 = new String("Hello");
//        String str5 = str4;
//        String str6 = "He";
//        String str7 = str6+"llo";
//        String str8 = str7.intern();
// excercise  2.4
//        System.out.println(str1==str8.intern());
//        Scanner sc = new Scanner((System.in));
//        System.out.println("Please enter your name : ");
//        String name = sc.nextLine();
//        int count = 0;
//        for(int i  =0; i<name.length();i++){
//            if(name.charAt(i) == 'e') count++;
//        }
//        System.out.println("The occurence of e in name is  "+ count);
//        sc.close();
        //Excercise 2.5

        String str = "Hello, strings can be fun. They have many uses.";
        String[] s = str.split(",| |\\. |\\.");
        System.out.println(s.length);
    }
}
