package com.miu.lab3;

public class Exercise3_3 {
    public static void main(String[] args) {
        // it will be share in the class as it is static variable in Excercise class
        for(int i = 0;i<10;++i){
            new Excercise3();
        }
        System.out.println(Excercise3.getCount());
    }
}
class Excercise3{
    private static int count;
    public Excercise3(){
        ++count;
    }
    static int getCount(){
        return count;
    }
}
