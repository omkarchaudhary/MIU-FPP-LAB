package com.miu.lab12.prog1;

public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalClosedCurveException{
		this(side.doubleValue());
	}
	public Square(double side) throws IllegalClosedCurveException {
		if(side <= 0) throw  new IllegalClosedCurveException("Input value of side should be greater than 0");
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}

}
