package com.miu.lab12.prog2;

public class OverdrawnAccountException extends Exception{
    public OverdrawnAccountException(){
        super();
    }
    public OverdrawnAccountException(String msg){
        super(msg);
    }
    public OverdrawnAccountException(Throwable msg){
        super(msg);
    }
}
