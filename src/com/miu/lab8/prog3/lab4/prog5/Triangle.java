package com.miu.lab8.prog3.lab4.prog5;

public class Triangle implements Polygon {
    private final double base;
    private final double height;
    private  final double width;
    public Triangle(double base, double height, double width){
        this.base = base;
        this.height = height;
        this.width = width;
    }

    @Override
    public double[] getArrayOfSides() {
        return new double[]{base,height,width};
    }
}
