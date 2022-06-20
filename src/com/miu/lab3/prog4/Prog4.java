package com.miu.lab3.prog4;

public class Prog4 {
    public static void main(String[] args) {
        ClosedCurve[] closedCurve = {
                new Rectangle(4, 5),
                new Triangle(10, 5),
                new Circle(4),
                new Triangle(6, 5,4),
        };
        for(ClosedCurve cc : closedCurve){
            System.out.println(cc.computeArea());
        }
    }
}
