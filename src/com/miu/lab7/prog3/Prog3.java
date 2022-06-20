package com.miu.lab7.prog3;

import java.util.LinkedList;

public class Prog3 {
    LinkedList<Integer> list3 = new LinkedList<>();
    public LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        //implement
        //base condition
        if(list1.size() == 0 && list2.size() == 0) return  list3;

        if(list1.size() == 0 && list2.size() > 0) {
             list3.addAll(list2);
             return  list3;
        }
        if(list1.size() >0 && list2.size() == 0) {
            list3.addAll(list1);
            return  list3;
        }
        //1,5,6,9,18
        //4,7

        if(list1.get(0) <= list2.get(0)){
            list3.add(list1.get(0));
            list1.remove(0);
            merge(list1,list2);
        }else {
            list3.add(list2.get(0));
            list2.remove(0);
            merge(list1,list2);
        }
        return list3;
    }
    //test your code
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(4);list1.add(5);list1.add(21);list1.add(25);
        list2.add(2);list2.add(9);list2.add(17);
        Prog3 m = new Prog3();
        LinkedList list3 = m.merge(list1, list2);
        if(list3 != null) System.out.println(list3);

    }
}
