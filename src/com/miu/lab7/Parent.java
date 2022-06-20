package com.miu.lab7;

public class Parent {
    int i;
    Parent(){

    }
    Parent(int i){
        System.out.println(i);
    }
    Parent(int i, int j){

    }
}

class Child extends  Parent{
    int i;
}
