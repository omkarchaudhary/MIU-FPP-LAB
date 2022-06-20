package com.miu.lab8.prog3.lab4.prog2;

public final class Rectangle extends ClosedCurve {
    private final double length;
    private final double breadth;
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double computeArea(){
        return length*breadth;
    }
}
