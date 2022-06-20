package com.miu.lab12.prog1;

public class IllegalTriangleException extends IllegalClosedCurveException {

    public IllegalTriangleException() {
        super();
    }

    public IllegalTriangleException(String msg) {
        super(msg);
    }

    public IllegalTriangleException(Throwable t) {
        super(t);
    }
}
