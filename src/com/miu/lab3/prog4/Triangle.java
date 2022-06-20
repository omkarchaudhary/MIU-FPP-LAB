package com.miu.lab3.prog4;

import java.util.Timer;

public final class Triangle extends ClosedCurve{
    private final double base;
    private final double height;
    private  double width;
    public Triangle(double base, double height, double width){
        this.base = base;
        this.height = height;
        this.width = width;
    }
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double computeArea(){
        //return 1.0/2 * base*height ;
        if((base+height)>width && (base+width)>height && (height+width)>base)
        {
            double s=(base+height+width)/2;
            double area=Math.sqrt(s*(s-base)*(s-width)*(s-height));
            return area;
        }
        else
            return ( ( base * height)/2.0);
    }
}
