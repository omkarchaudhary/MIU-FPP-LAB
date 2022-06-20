package com.miu.lab2;

public class Prog4 {
    public static void main(String[] args){
        String stringData = Data.records;
        String[] s = stringData.split(":");
        for(String str1 : s){
            System.out.println(str1.substring(0,str1.indexOf(',')));
        }
    }
}
