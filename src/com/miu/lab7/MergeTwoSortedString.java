package com.miu.lab7;

public class MergeTwoSortedString {

    public static void main(String[] args) {
        String strOne = "abcd";
        String strTwo = "efgh";
        String str = mergeTwoString(strOne,strTwo);
        System.out.println(str);
    }
     static String mergeTwoString(String str1, String str2){

        if(str1.length() == 0) return str2;
        if(str2.length() == 0) return  str1;

        if(str1.charAt(0) <= str2.charAt(0)){
            str1 = mergeTwoString(str1.substring(1),str2);
            return str1;
        }else{
            str2 = mergeTwoString(str1,str2.substring(2));
            return  str2;
        }
     }
}
