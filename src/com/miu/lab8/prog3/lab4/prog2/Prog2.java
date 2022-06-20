package com.miu.lab8.prog3.lab4.prog2;

public class Prog2 {
    public static void main(String[] args) {
        ClosedCurve[] closedCurve = {
                new Rectangle(3, 7),
                new Square(3),
                new Circle(3),
                new Triangle(4, 5,6),
        };
        for(ClosedCurve cc : closedCurve){
            //Implementation of Reflection to get class name
            System.out.println("The area of this "+ cc.getClass().getSimpleName()+" is "+cc.computeArea());

        }
    }
}
