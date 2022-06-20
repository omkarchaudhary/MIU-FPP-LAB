package com.miu.lab8.prog3.lab4.prog5;

public class Prog5 {
    public static void main(String[] args) {
    Polygon[] polygons = { new Square(3),
            new Rectangle(3,4),
            new Triangle(4,5,6)};

        for(Polygon polygon: polygons){
            System.out.println("For this "+ polygon.getClass().getSimpleName());
            System.out.println("Perimeter = "+polygon.computePerimeter());
        }
    }
}
