package com.miu.lab8.prog3.lab4.prog2;

public final class Circle extends ClosedCurve {
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double computeArea(){
        return (Math.PI)*Math.pow(radius,2);
    }
}
