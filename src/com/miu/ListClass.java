package com.miu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListClass{
    public static void main(String[] args) {
//        List list  = Arrays.asList("A","B","C");
//        List list1 = Arrays.asList("D","E","F");
//        List[] listOfList = {list,list1};
        List<String> list = Arrays.asList("A","B","C");
        List<String> list1 = Arrays.asList("D","E","F");
        ArrayList<List<String>> listOfList =  new ArrayList<>();
        listOfList.add(list);
        listOfList.add(list1);
          System.out.println((listOfList.get(0)));

    }

}
