package com.miu.lab12.prog1;

public class IllegalClosedCurveException extends Exception{
    public IllegalClosedCurveException(){
        super();
    }
    public IllegalClosedCurveException(String msg){
        super(msg);
    }
    public IllegalClosedCurveException(Throwable t) {
        super(t);
    }
}
