package com.miu.lab8.prog3.lab4.prog2;

public class Square extends  ClosedCurve{
    private final double length;
    Square(double length){
        this.length = length;
    }
    public double computeArea(){
        return length*length;
    }
}
