package com.miu.lab12.prog1;

public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius) throws IllegalClosedCurveException{
		this(radius.doubleValue());
	}
	public Circle(double radius)throws IllegalClosedCurveException {
		if(radius <= 0) throw new IllegalClosedCurveException("Input value for radius should be greater than 0");
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
