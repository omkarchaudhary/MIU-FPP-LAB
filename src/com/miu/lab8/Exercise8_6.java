package com.miu.lab8;

import java.util.*;

public class Exercise8_6 {
    public static void main(String[] args) {
        List<String> list1 = dataList1();
        List<String> list2 = dataList2();
//sort
        Collections.sort(list1);
        Collections.sort(list2);
        //Sngle colletion
        var all = Arrays.asList(list1,list1);
        //Comparing
    }

    static private List<String> dataList1(){
        return new ArrayList<String>(){
            {
            add("Bob");add("Steve");add("John");
            }
        };
    }
    static private List<String> dataList2(){
        return new ArrayList<String>(){
            {
                add("Name");add("Last");add("First");
            }
        };
    }

    static  class ListComparator implements  Comparator<List<String>>{
        @Override
        public int compare(List<String> o1, List<String> o2) {
            String s1 = o1.get(0);
            String s2 = o2.get(0);
            return s1.compareTo(s2);
        }
    }
}



