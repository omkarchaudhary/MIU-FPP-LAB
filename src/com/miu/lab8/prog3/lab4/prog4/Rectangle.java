package com.miu.lab8.prog3.lab4.prog4;

public final class Rectangle extends ClosedCurve implements Polygon{
    private static final int NO_OF_RECTANGLE_SIDE = 4;
    private final double length;
    private final double breadth;
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double computeArea(){
        return length*breadth;
    }

    @Override
    public int getNumberOfSides() {
        return NO_OF_RECTANGLE_SIDE;
    }

    @Override
    public double computePerimeter() {
        return 2*(length+breadth);
    }
}
