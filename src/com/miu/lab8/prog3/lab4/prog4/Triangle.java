package com.miu.lab8.prog3.lab4.prog4;

public final class Triangle extends ClosedCurve implements Polygon {
    private static final int NO_OF_TRIANGLE_SIDE = 3;
    private final double base;
    private final double height;
    private  final double width;
    public Triangle(double base, double height, double width){
        this.base = base;
        this.height = height;
        this.width = width;
    }
    public double computeArea(){
        double s=(base+height+width)/2;
        double area=Math.sqrt(s*(s-base)*(s-width)*(s-height));
        return area;

    }

    @Override
    public int getNumberOfSides() {
        return NO_OF_TRIANGLE_SIDE;
    }

    @Override
    public double computePerimeter() {
        return base+width+height;
    }
}
