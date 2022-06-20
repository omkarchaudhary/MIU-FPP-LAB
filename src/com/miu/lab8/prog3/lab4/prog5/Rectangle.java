package com.miu.lab8.prog3.lab4.prog5;

public class Rectangle implements Polygon {
    private final double length;
    private final double breadth;
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double[] getArrayOfSides() {
        return new double[]{length,length,breadth,breadth};
    }
}
