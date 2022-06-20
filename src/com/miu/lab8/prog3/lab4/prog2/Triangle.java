package com.miu.lab8.prog3.lab4.prog2;

public final class Triangle extends ClosedCurve {
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
}
