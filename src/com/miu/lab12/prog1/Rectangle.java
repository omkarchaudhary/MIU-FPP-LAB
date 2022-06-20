package com.miu.lab12.prog1;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException{
		if(width < 0|| length< 0) throw  new IllegalClosedCurveException("Input value should be greater than 0");
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}
