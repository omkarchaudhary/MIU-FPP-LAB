package com.miu.lab8.prog3.lab4.prog4;

public class Square extends ClosedCurve implements Polygon {
    private static final int NO_OF_SQUARE_SIDE = 4;
    private final double length;
    Square(double length){
        this.length = length;
    }
    public double computeArea(){
        return length*length;
    }

    @Override
    public int getNumberOfSides() {
        return NO_OF_SQUARE_SIDE;
    }

    @Override
    public double computePerimeter() {
        return NO_OF_SQUARE_SIDE*length;
    }
}
