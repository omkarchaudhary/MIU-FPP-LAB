package com.miu.lab8.prog3.lab4.prog5;

public class Square implements Polygon{
    private final double length;
    Square(double length){
        this.length = length;
    }

    @Override
    public double[] getArrayOfSides() {
        return new double[]{length,length,length,length};
    }
}
