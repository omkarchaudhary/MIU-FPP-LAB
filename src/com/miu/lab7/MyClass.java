package com.miu.lab7;

import com.miu.lab2.RandomNumbers;

interface  intf{int x = 0;}
class Second implements intf{
    public static void main(String[] args) {
        System.out.println(intf.x);
        System.out.println(x);
    }
}

