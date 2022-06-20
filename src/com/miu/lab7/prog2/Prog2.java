package com.miu.lab7.prog2;

public class Prog2 {
    public static void main(String[] args) {
        String str = "zwxuabfkafutbbbb";
        System.out.println(sort(str));
    }
    static String result="";
    public static String sort(String str){
        if(str.length() == 0 || str== null) return  null;
        char ch = findMinChar(str);
        int minPos = str.indexOf(ch);
        //char c = str.charAt(0);
        char[] chr = str.toCharArray();
        //chr[0] = ch;
        chr[minPos] = str.charAt(0);
        String s= String.valueOf(chr);
        result += ch;
        sort(s.substring(1));
        return result;
    }
    public  static  Character findMinChar(String s){
        if(s == null || s.length() == 0) {
            return null;
        } ;
        char ch = s.charAt(0);
        if(s.length() == 1) return ch;
        char c = findMinChar(s.substring(1));
        return ch>c ? c: ch;
    }
}


