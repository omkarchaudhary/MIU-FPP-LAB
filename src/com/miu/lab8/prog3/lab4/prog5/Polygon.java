package com.miu.lab8.prog3.lab4.prog5;

public interface Polygon {
    abstract public double[] getArrayOfSides();
    static double sum(double[] arr){
    double sumOfSide  = 0;
    for(double side : arr){
        sumOfSide += side;
    }
    return  sumOfSide;
    }
    default double computePerimeter(){
        return sum(getArrayOfSides());
    }

}
